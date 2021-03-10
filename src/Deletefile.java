import java.io.File;
import java.util.Scanner;

public class Deletefile {
	public void delfile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to be deleted");
		String s=sc.next();
		File file = new File("C:\\Virtual key project"+File.separator+s); 
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file as file did not exist"); 
        } 

	}
}
