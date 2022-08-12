
public class MakingC 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(i==0 && j!=0 || j==0 && i!=n-1 && i!=0|| i==n-1 && j!=0) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for D--------------
			for(int j=0; j<n; j++) 
			{
				if(i==0 && j!=n-1 ||  j==1 || i==n-1 && j!=n-1|| j==n-1 && i!=0 && i!=n-1 ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for E--------------
			for(int j=0; j<n; j++) 
			{
				if(i==0  || j==0 || i==n-1|| i==n/2 && j!=n-1  ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for F--------------
			for(int j=0; j<n; j++) 
			{
				if(i==0  || j==0 ||  i==n/2 && j!=n-1  ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for G--------------
			for(int j=0; j<n; j++) 
			{ 
				if(i==0 && j!=0 || j==0 && i!=0 && i!= n-1 || i==n-1 && j!=0 || i==n/2+1 && j!=1|| j==n-1 && i>n/2) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for H--------------
			for(int j=0; j<n; j++) 
			{ 
				if(i==n/2||j==0||j==n-1 ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for I--------------
			for(int j=0; j<n; j++) 
			{ 
				if(j==n/2||i==0||i==n-1 ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//---------------------for J--------------
			for(int j=0; j<n; j++) 
			{ 
				
				if(i==0 || j==n/2 && i!= n-1||i>n/2 && j==0 && i!=n-1|| i==n-1 && j<n/2&& j!=0)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
