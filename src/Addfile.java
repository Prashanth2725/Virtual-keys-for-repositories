import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addfile {
	public void addfile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the file name");
		String fname=sc.next();
		try {
		      File myObj = new File("C:\\Virtual key project"+File.separator+fname);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
}
