package org;

import java.util.Scanner;

public class multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums=new int[3][3];
		//nums[0][0]=100;
		//nums[0][1]=200;
		//nums[0][2]=300;
		//nums[0][3]=400;
		
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				nums[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{System.out.println(nums[i][j]);
		}
	}

	}
	
}
