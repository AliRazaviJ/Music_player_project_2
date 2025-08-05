public class Music {
    private String name;
    private String singer;
    private String album;
    private String janner;
    private String everting;
    private int id;

    public Music(String name, String singer, String album, String janner, int id) {
        this.name = name;
        this.singer = singer;
        this.album = album;
        this.janner = janner;
        this.id = id;
        this.everting = name+" "+singer+" "+album+" "+janner+" "+id;
    }

    public Music(String name, String singer, String album, String janner) {
        this.name = name;
        this.singer = singer;
        this.album = album;
        this.janner = janner;
        this.everting = name+" "+singer+" "+album+" "+janner+" "+id;
        this.id=id;
    }

    public Music() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getJanner() {
        return janner;
    }

    public void setJanner(String janner) {
        this.janner = janner;
    }

    public String getEverting() {
        return everting;
    }

    public void setEverting(String everting) {
        this.everting = everting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", album='" + album + '\'' +
                ", janner='" + janner + '\'' +
                ", everting='" + everting + '\'' +
                ", id=" + id +
                '}';
    }
}
