
public class Xpattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				//if(i==j && i< (n-1)/2||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 && i< (n-1)/2||j==(n)/2 && i>= (n-1)/2)
				//if(i==j ||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				//if(i==j || i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				if(i==0||j==0||i==n-1/*|| i+j==(n-1)/2*/|| i+j<=(n-1)/2|| i-j>=(n-1)/2 )

					//if(i==j || i+j==n-1 )//d1 d2
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) 
			{
				//if(i==j && i< (n-1)/2||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 && i< (n-1)/2||j==(n)/2 && i>= (n-1)/2)
				//if(i==j ||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				//if(i==j || i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				if(i==0||j==0||i==n-1||j==n-1/*|| i+j==(n-1)/2*/|| i+j<=(n-1)/2|| j-i>=(n-1)/2 )

					//if(i==j || i+j==n-1 )//d1 d2
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) 
			{
				//if(i==j && i< (n-1)/2||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 && i< (n-1)/2||j==(n)/2 && i>= (n-1)/2)
				//if(i==j ||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				//if(i==j || i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				if(i==0||j==0||i==n-1||j==n-1/*|| i+j==(n-1)/2*/|| i+j<=(n-1)/2|| j-i>=(n-1)/2 || i-j>=(n-1)/2 || i+j >=n/2+(n-1))

					//if(i==j || i+j==n-1 )//d1 d2
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) 
			{
				//if(i==j && i< (n-1)/2||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 && i< (n-1)/2||j==(n)/2 && i>= (n-1)/2)
				//if(i==j ||i==0||j==0||i==n-1||j==n-1|| i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				//if(i==j || i+j==n-1 || i+j==(n-1)/2 || j-i== (n-1)/2||i-j==(n-1)/2||i+j==n+(n)/2)
				if(j==0 && i>=(n-1)/2 ||i==n-1||j==n-1&& i>=(n-1)/2/*|| i+j==(n-1)/2*/ || i-j>=(n-1)/2 || i+j >=n/2+(n-1))

					//if(i==j || i+j==n-1 )//d1 d2
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("");
				for(int j=0; j<n; j++)
				{
					System.out.print(i);
				}
			System.out.println();
		}

	}

}
