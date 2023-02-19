public class FirstPattern
{
	public static void main(String args[])
	{
		//logic for printing letter I
		for(int i=1 ; i<=10; i++){
			
			for(int j=1 ; j<=10; j++){
				
				if(j==5)
				{
					  System.out.print("*");
				}
				else
				{
					 System.out.print(" ");
				}
				
			}

		//logic for printing letter N
			for(int j=1;j<=10;j++)
			{
				
				
				if(j==1||j==10)
				{	if(j==1)
					{
					 System.out.print("*");
					}
					else
					{
						System.out.print("* ");
					}
				}
				else if(i==j)
				{
						
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			
			//logic for printing letter E
			for(int j=1; j<=10; j++)
			{
				
				if(j==1)
				{
					System.out.print("*");
				}
				else if(i==1||i==5||i==10)
				{
					System.out.print("*");
				}
				else
				{
					
					System.out.print(" ");
				}
			}


			//logic for printing U
			for(int j=1; j<=10; j++){
				
				if(j==1 || j==10){
					if(j==1)
						System.out.print(" *");
					else if(i==10 && j==10)
					    System.out.print("*");
					else
						 System.out.print("* ");
				}
				else if(i==10){
					System.out.print("*");
				}else{
				System.out.print(" ");	

				}
			}
				
				//Printing R logic
			for(int j=1;j<=10; j++){
				
				if(j==1)
				{	if(i==10)
						System.out.print("  *");
				    else
						System.out.print(" *");
				}
				else if(i==1&&(j==1||j==2||j==3||j==3||j==4||j==5||j==6||j==7||j==8||j==9)){
					System.out.print("*");
				}
				else if(i==2&&j==9){
					System.out.print("*");
				}
				else if(i==3&&j==7){
					System.out.print("*");
				}
				else if(i==4&&j==6){
					System.out.print("*");
				}	
				else if(i==5&&j==3){
					System.out.print("*");
				}	

				else if(i>=5 &&i==j){
					System.out.print("*");
				}else{
					
					System.out.print(" ");
				}
			}

			//printing logic for letter O
			for(int j=1; j<=10; j++){
				
				if(j==1 || j==10){
					if(j==1)
						System.out.print(" *");
					else if(i==10 && j==10)
					    System.out.print("*");
					else
						 System.out.print("* ");
				}
				else if(i==1){
					System.out.print("*");
				}
				else if(i==10){
					System.out.print("*");
				}
				else if(j==10){
					System.out.print("*");
				}
				else{
				System.out.print(" ");	

				}
			}
			for(int j=1;j<=10;j++)
			{
				
				
				if(j==1||j==10)
				{	 if(i==10 && j==1)
						System.out.print(" *");
					else if(j==1)
					{
					 System.out.print("*");
					}
					
					else
					{
						System.out.print("* ");
					}
				}
				else if(i==j)
				{
						
						
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}


			if(i<=9)
			System.out.println();
		}


		 
	

	}

}