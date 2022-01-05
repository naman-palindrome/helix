package tech.codingclub.utility;

import com.google.gson.Gson;

import java.util.*;

public class TopKeywordAnalyser implements Runnable{

    String filePath;
    public TopKeywordAnalyser(String filePath)
    {
        this.filePath=filePath ;
    }



    public void run() {
        ArrayList<String> data= FileUtility.readFileAsList(filePath);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(String row:data)
        {
            String[] words=row.split(" ");

            for(String word:words)
            {
                String str=word.toLowerCase();
                if(!map.containsKey(str))
                    map.put(str,1);
                else
                {
                    Integer value=map.get(str);
                    map.put(str,value+1);
                }
            }

        }
        ArrayList<WordCount> wordCounts=new ArrayList<WordCount>();
          for(String word:map.keySet())
          { WordCount wordCount=new WordCount(word,map.get(word));
              wordCounts.add(wordCount);
          }
        Collections.sort(wordCounts, new Comparator<WordCount>() {

                    public int compare(WordCount o1, WordCount o2) {
                      return o2.number-o1.number;
                    }
                }
        );
          Integer count=0;
          //for(WordCount wordCount:wordCounts)
          //{
              //System.out.println(wordCount.word+":"+wordCount.number);
              //count++;
              //if(count==9)break;
          String json=new Gson().toJson(wordCounts);
          System.out.println(json);
               String covertJson="{\"word\":\"jaya\",\"number\":10}";
               WordCount tempcount=new Gson().fromJson(covertJson,WordCount.class );
               System.out.println("Coverted to object "+tempcount.word+":"+tempcount.number);
          //}

    }

    public static void main(String[] args) {
        TopKeywordAnalyser runnable1=new TopKeywordAnalyser("C:\\Users\\91931\\Desktop\\anthem.txt");
       Thread thread=new Thread(runnable1);
       thread.start();
    }
}
