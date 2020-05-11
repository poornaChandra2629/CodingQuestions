package pass;

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0)
		{T--;
		int count=0;
		int x=sc.nextInt();
		int y=sc.nextInt();
		int n=sc.nextInt();
		int[] N =new int[n];
		for(int i=0;i<n;i++)
		{
		    N[i]=sc.nextInt();
		}
		int index=0;
		while(index!=n)
		{
		    while(N[index]>0)
		    {
		        N[index]=N[index]-x;
		        count++;
		        if(N[index]<=0)
		        {
		            break;
		        }
		        N[index]=N[index]+y;
		    }
		    index++;
		}
		System.out.println(count);
		}
		
	}
}
