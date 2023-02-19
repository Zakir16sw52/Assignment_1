class ThirdPattern 
{
	public static void main(String[] args) 
	{
		 for(int i=1;i<=14;i++)
		{
			for(int j=1;j<=14;j++)
			{
				if(i==1||i==14)
				{
					System.out.print("*");
				}
				else if(i==2 && j==7){
					System.out.print(" ");
				}
				else if(i==3 && (j==6||j==7||j==8)){
					System.out.print(" ");
				}	
				else if(i==4 && (j==5||j==6||j==7||j==8||j==9))
				{
					System.out.print(" ");
				}
				else if(i==5 && (j==4||j==5||j==6||j==7||j==8||j==9||j==10))
				{
					System.out.print(" ");
				}
				else if(i==6 && (j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11))
				{
					System.out.print(" ");
				}
				else if(i==7 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12))
				{
					System.out.print(" ");
				}
				else if(i==8 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}
				else if(i==9 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}
				else if(i==10 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}
				else if(i==11 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}
				else if(i==12 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}
				else if(i==13 && (j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9||j==10||j==11||j==12||j==13))
				{
					System.out.print(" ");
				}

				else
					System.out.print("*");

			}


			System.out.println();
		 }
	}
}
