package tech.codingclub.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionExample {
    public static String sendGet(String urlname)throws Exception{

        StringBuilder ans=new StringBuilder();
        URL url = new URL(urlname);
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("User-Agent","Chrome");
        try(
                BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()))
        )
        {
            String line;
            while((line=in.readLine())!=null)

                ans.append(line);
        }
        return ans.toString();
    }
    public static void main(String[] args)  {
        try{String ans=sendGet("https://www.instagram.com/");
            System.out.println(ans);
        }catch(Exception e)
        {
            e.printStackTrace();}
    }
}
