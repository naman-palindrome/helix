package tech.codingclub.entity;

public class Songs{
    private String songName;
    private String duration;
    private String singers;
    private String musicDirector;
    private String lyricist;

    public Songs(String s, String s1, String s2, String s3, String s4, String s5) {
    }

    public Songs(String songName, String duration, String singers, String musicDirector, String lyricist) {
        this.songName = songName;
        this.duration = duration;
        this.singers = singers;
        this.musicDirector = musicDirector;
        this.lyricist = lyricist;
    }

    public static void main(String[] args) {
        Songs song=new Songs("fd","fsd","sdfs","sdfs","sdfsd");
    }

}
