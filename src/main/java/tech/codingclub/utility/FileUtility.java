package tech.codingclub.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtility {

    public static ArrayList<String>readFileAsList(String filePath)
    {
        Scanner scanner=null;
        ArrayList<String> ans=new ArrayList<>();
        try{
            File file=new File(filePath);
            scanner=new Scanner(file);
            while(scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                ans.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(scanner!=null)
                scanner.close();
        }
        return ans;
    }


}
