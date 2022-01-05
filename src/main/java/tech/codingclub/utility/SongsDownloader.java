package tech.codingclub.utility;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub.database.GenericDB;
import tech.codingclub.entity.Songs;

public class SongsDownloader implements Runnable {
 private String parentUrl;

    public SongsDownloader(String keyword) {
        this.parentUrl = keyword;
    }

    @Override
    public void run() {
        if(this.parentUrl==null||this.parentUrl.length()==0)
            return ;

        try {
            String parentHtml=HttpURLConnectionExample.sendGet(this.parentUrl);

            Document parentDocument= Jsoup.parse(parentHtml,"https://songspk.mobi");
             Elements parentLinks=parentDocument.body().select(".archive-body .thumb-image a");
             for(Element parentLink:parentLinks)
             {
                 String childUrl=(parentLink.attr("href"));
                 childUrl="https://songspk.mobi"+childUrl;
                 String childHtml=HttpURLConnectionExample.sendGet(childUrl);
                 Document  childDocument=Jsoup.parse(childHtml,".https://songspkmobi");

                 String[] temp=new String[5];
                 Elements childLinks=childDocument.body().select(".row .col-md-9 .list-group-item .text-left");
                 int num=0;
                 for(Element childLink:childLinks)
                 {       temp[num]=childLink.text();
                         num++;
                         if(num==5)
                             break;
                 }
                 while(num<5)
                 {
                     temp[num]="-";
                     num++;
                 }

                 Songs song=new Songs(temp[0],temp[1],temp[2],temp[3],temp[4]);
                 new GenericDB<Songs>().addRow(tech.codingclub.tables.Songs.SONGS,song);
       }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
            TaskManager taskManager=new TaskManager(20);
            String temp="https://songspk.mobi/browse/bollywood-singles/";

            for(int i=0;i<26;i++)
            {   char val='a';
                String keyword=temp+(char)(val+i);
               SongsDownloader songsDownloader=new SongsDownloader(keyword);
               taskManager.waitTillQueueIsFreeAndAddTask(songsDownloader);
            }

    }

}
