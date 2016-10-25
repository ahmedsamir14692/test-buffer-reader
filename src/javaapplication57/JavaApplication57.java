
package javaapplication57;
import java.io.*;

public class JavaApplication57 {

    public static void main(String[] args) {
        File file = new File ("D:/films/New Folder/Dallas Buyers Club 2013 Blue ray.ass");
        System.out.println(file.isFile());
        try{
           FileReader reader = new FileReader (file) ;
            BufferedReader re = new BufferedReader (reader);
            while (re.ready())
            {
                System.out.println(re.readLine());
            }
            
        }
        catch (IOException f){
            
            
        }
    }
    
}
