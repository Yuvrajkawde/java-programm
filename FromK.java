
public class FromK 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0; i<n; i++) 
		{	
			//----------------for K------------
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 || i+j==(n-1)/2|| i-j==(n-1)/2)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			//----------for L--------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 || i==n-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			
			//-----------------M-----------------------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 || i+j==n-1 && i<n/2||i==j && i<=n/2|| j==n-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			
			//---------------for N-------------------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			
			//------------for O-----------------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || j==n-1&& i!=0 && i!=n-1||i==n-1 && j!=0 &&j!=n-1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			
			//--------------for P---------------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 || i==0 && j!=n-1||i==n/2 && j!=n-1|| j==n-1 && i!=0 && i< n/2)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			//------------for Q-----------------
			System.out.print("  ");
			for(int j=0; j<n; j++)  
			{
				
				if(j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-2&& j!=n-1 || j==n-2&& i!=0 && i!=n-1||i==n-1 && j!=0 &&j!=n-1&& j!=n-2||i==j && i>n/2)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			
			
			// ------------------------for R------------------------
			System.out.print(" ");
			for(int j=0; j<n; j++) 
			{
				if(j==0 || i==0 && j<n-3||i==n/2 && j<n-3||i-j== n/2|| j==n-3 && i>0 && i<n/2)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			// ------------------------for s------------------------
						
						for(int j=0; j<n; j++) 
						{
							if(j==0 && i!=0&& i<n/2||i==0&& j!=0 ||i==n/2&& j!=0 &&j!=n-1 || j==n-1 && i>n/2 && i!=n-1||i==n-1  &&j!=n-1)
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						//----------for T--------
						System.out.print("  ");
						for(int j=0; j<n; j++)  
						{
							
							if(j==n/2 ||i==0)
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
							
						}
						
						
						
						//------------for U------------
						System.out.print("  ");
						for(int j=0; j<n;j++) 
						{
							if(j==0 && i!=n-1||i==n-1&& j!=0 && j!=n-1 || j==n-1&& i!=n-1 ) 
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						
						//-------for V-----------
						System.out.print("  ");
						for(int j=0; j<n;j++) 
						{
							if(i-j==(n-1)/2&& i<n-1|| i+j==(n-1)+(n-1)/2&& i<n-1 || j==0 && i<(n-1)/2|| j==n-1 && i<n/2||j==n/2 && i==n-1) 
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						
						
						
						//-----------------W-----------------------
						System.out.print("  ");
						for(int j=0; j<n; j++)  
						{
							
							if(j==0 || i+j==n-1 && i>n/2||i==j && i>=n/2|| j==n-1)
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
							
						}
					
						
						
						//-----------------X-----------------------
						System.out.print("  ");
						for(int j=0; j<n; j++)  
						{
							
							if(j==i || i+j==n-1)
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
							
						}
						
						
						
						//------------------------Y---------------
						System.out.print("  ");
						for(int j=0; j<n;j++) 
						{
							if(i==j && i< n/2||i+j==n-1 &&i< n/2 || j==n/2 && i>=(n-1)/2) 
							{
								System.out.print("* ");
							}
							else 
							{
								System.out.print("  ");
							}
						}
						
						//------------------------Z---------------
						System.out.print("  ");
						for(int j=0; j<n;j++) 
						{
							if(i+j==n-1 ||i==0||i==n-1) 
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
