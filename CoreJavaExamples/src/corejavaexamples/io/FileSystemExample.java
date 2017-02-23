/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
/**
 *
 * @author iamsu
 */
public class FileSystemExample {
    public static void main(String[] args) throws IOException {
    FileSystem fs = FileSystems.getDefault();
    Path path = Paths.get("D:\\Dump\\qwerty1.txt");
    
    System.out.println("Read-only file system: " + fs.isReadOnly());
    System.out.println("File name separator: " + fs.getSeparator());

    for (FileStore store : fs.getFileStores()) {
      printDetails(store);
    }
    for (Path root : fs.getRootDirectories()) {
      System.out.println(root);
    }
    
    // It adds DATA_READ and DATA_ WRITE permissions for the user Brice
    
     AclFileAttributeView aclView = Files.getFileAttributeView(path,
        AclFileAttributeView.class);
    if (aclView == null) {
      System.out.format("ACL view  is not  supported.%n");
      return;
    }
    UserPrincipal bRiceUser = FileSystems.getDefault()
        .getUserPrincipalLookupService().lookupPrincipalByName("iamsu");

        Set<AclEntryPermission> permissions = EnumSet.of(AclEntryPermission.READ_DATA, AclEntryPermission.WRITE_DATA);

    AclEntry.Builder builder = AclEntry.newBuilder();
    builder.setPrincipal(bRiceUser);
    builder.setType(AclEntryType.ALLOW);
    builder.setPermissions(permissions);
    AclEntry newEntry = builder.build();

    List<AclEntry> aclEntries = aclView.getAcl();

    aclEntries.add(newEntry);

    aclView.setAcl(aclEntries);
  }

  public static void printDetails(FileStore store) {
    try {
      String desc = store.toString();
      String type = store.type();
      long totalSpace = store.getTotalSpace();
      long unallocatedSpace = store.getUnallocatedSpace();
      long availableSpace = store.getUsableSpace();
      System.out.println(desc + ", Total: " + totalSpace + ",  Unallocated: "
          + unallocatedSpace + ",  Available: " + availableSpace);
    } catch (IOException e) {
      e.printStackTrace();
    }
  Path path = Paths.get("C:");

    try {
      FileStore fs = Files.getFileStore(path);
      printDetails(fs, AclFileAttributeView.class);
      printDetails(fs, BasicFileAttributeView.class);
      printDetails(fs, DosFileAttributeView.class);
      printDetails(fs, FileOwnerAttributeView.class);
      printDetails(fs, PosixFileAttributeView.class);
      printDetails(fs, UserDefinedFileAttributeView.class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void printDetails(FileStore fs,
      Class<? extends FileAttributeView> attribClass) {
    boolean supported = fs.supportsFileAttributeView(attribClass);
    System.out.format("%s is  supported: %s%n", attribClass.getSimpleName(),
        supported);
  }
}
