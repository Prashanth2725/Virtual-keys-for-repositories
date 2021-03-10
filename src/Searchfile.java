import java.io.File;
import java.util.Scanner;

public class Searchfile {
	public void searchfile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to be searched");
		String s=sc.next();
		File f = new File("C:\\Virtual key project"+File.separator+s);
        if (f.exists()) 
            System.out.println("Given input file exists in the directory"); 
        else
            System.out.println("File does not Exists");
	}
}
