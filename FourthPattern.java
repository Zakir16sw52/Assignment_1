class FourthPattern 
{
	public static void main(String[] args) 
	{
		 for(int i=1;i<=14;i++)
		{
			for(int j=1;j<=14;j++)
			{
				if(i==13||i==14)
				{
					System.out.print("*");
				}
				else if(i>=7&& (j==1||j==14))
					System.out.print("*");
				else if(i==8 &&(j==2||j==13))
				 System.out.print("*");
				else if(i==9 &&(j==2||j==3||j==12||j==13))
				 System.out.print("*");
				else if(i==10 &&(j==2||j==3||j==4||j==11||j==12||j==13))
				 System.out.print("*");
				else if(i==11 &&(j==2||j==3||j==4||j==5||j==10||j==11||j==12||j==13))
				 System.out.print("*");
				else if(i==12 &&(j==2||j==3||j==4||j==5||j==6||j==9||j==10||j==11||j==12||j==13))
				 System.out.print("*");
				else
					System.out.print(" ");

			}


			System.out.println();
		 }
	}
}
