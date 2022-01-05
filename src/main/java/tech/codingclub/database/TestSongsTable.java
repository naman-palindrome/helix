package tech.codingclub.database;

import tech.codingclub.entity.Songs;

public class TestSongsTable {

    public static void main(String[] args) {

        Songs coder=new Songs("Naman","fgf","jjgjghj","jgfjg","kjhk");

        new GenericDB<Songs>().addRow(tech.codingclub.tables.Songs.SONGS,coder);
        //Coders spammer=new Coders("SPAMMER",50l);


    }
}
