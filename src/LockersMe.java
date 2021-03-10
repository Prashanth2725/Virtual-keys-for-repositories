import java.util.Scanner;

public class LockersMe {
	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developer Name: Kodumuri Prashanth");
		Scanner sc=new Scanner(System.in);
		int flag=0,op;
		do
		{
				System.out.println("1. Display the current file names in ascending order");
				System.out.println("2. Display the details of the user iterface");
				System.out.println("3. Exit from the application");
				System.out.println("Choose one:");
				op=sc.nextInt();
				switch(op) 
				{
				case 1:
					Displayfiles ob=new Displayfiles();
					ob.userInput();
					break;
				case 2:
					
					int flag1=0,op1;
					do
					{
						System.out.println("1. Add a file to the directory");
						System.out.println("2. Delete a file in the directory");
						System.out.println("3. Search a file is in the directory");
						System.out.println("4. return to the main menu");
						System.out.println("choose one");
						op1=sc.nextInt();
						switch(op1) 
						{
						case 1:
							Addfile ad=new Addfile();
							ad.addfile();
							break;
						case 2:
							Deletefile df=new Deletefile();
							df.delfile();
							break;
						case 3:
							Searchfile sf=new Searchfile();
							sf.searchfile();
							break;
						case 4:
							System.out.println("Returned to the main menu");
							flag1=1;
							break;
						}
					}while(flag1==0);
					break;
				case 3:
					flag=1;
					System.out.println("Exited the application successfully");
					break;
				}
		}while(flag==0);
	}
}
