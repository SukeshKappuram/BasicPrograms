/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples;

import java.util.Scanner;

/**
 *
 * @author iamsu
 */
public class MultiDimensionArrayExample {
    	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter rows of the matrix");
		int r=s.nextInt();

		System.out.println("enter coloums of the matrix");
		int c=s.nextInt();

		int a[][]= new int[r][c],i,j;
		System.out.println("Enter matrix elements");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}		
		}	
		System.out.println("matrix elements are");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}	
	}

}
