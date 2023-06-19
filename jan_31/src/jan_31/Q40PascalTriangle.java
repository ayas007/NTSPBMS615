package jan_31;

import java.util.Scanner;

public class Q40PascalTriangle 
{
	void pascalTriangle(int n)
	{
		int i,j;
		int[][] a=new int[n][2*n-1];
		System.out.println(2*n-1);
		for(i=0;i<n;i++)
		{			
			for(j=0;j<2*n-1;j++)
			{
				if(j==n-1-i||j==n-1+i)
				System.out.print(a[i][j]=1);
			
				else if(j>n-1-i&&j<n-1+i&&((n%2==0&&(i+j)%2!=0)||(n%2!=0&&(i+j)%2==0)))  
				System.out.print(a[i][j]=a[i-1][j-1]+a[i-1][j+1]);
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row number:");
		int n=sc.nextInt();		
		new Q40PascalTriangle().pascalTriangle(n);
	}
}
