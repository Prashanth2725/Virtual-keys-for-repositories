import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Displayfiles {
	public void userInput()
    {
        Scanner scanner = new Scanner( System.in );
        File folder = new File("C:\\Virtual key project");
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();
            Arrays.sort(fileList);
            System.out.println("\nTotal number of items present in the directory: " + fileList.length );
            FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };
            fileList = folder.listFiles(fileFilter);
            Arrays.sort(fileList, new Comparator<Object>()
            {
                @Override
                public int compare(Object f1, Object f2) {
                    return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }
            
        }   
    }
}
