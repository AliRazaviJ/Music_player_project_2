import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Music_File {

    private RandomAccessFile rfile;
    private String path;
    public static final int size=50;
    public static final int record_size=504;
    Music music=new Music();
    Music_map map=new Music_map();

    public Music_File(String path) {
        this.path = path;
    }

    public Music_File() {
    }

    public RandomAccessFile getRfile() {
        return rfile;
    }

    public void setRfile(RandomAccessFile rfile) {
        this.rfile = rfile;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    public void open(){
        try {
            rfile=new RandomAccessFile(path,"rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void  write(Music mus,String ads) throws IOException {
        rfile.seek(rfile.length());
        rfile.writeChars(fixw(mus.getName()));
        rfile.writeChars(fixw(mus.getSinger()));
        rfile.writeChars(fixw(mus.getAlbum()));
        rfile.writeChars(fixw(mus.getJanner()));
        rfile.writeInt((int) ((rfile.length()/record_size)+1));
        rfile.writeChars(fixw(ads));

    }
    public String fixw(String somthing){
        String temp=somthing;
        while (temp.length()<size){
            temp+=" ";
        }
        return temp.substring(0,size);
    }
    public Music read() throws IOException {
        long s=rfile.length();
//            rfile.seek(0);
        return new Music(fixr(rfile),fixr(rfile),fixr(rfile),fixr(rfile),rfile.readInt());

    }
    public void read_all() throws IOException {
        rfile.seek(0);
        System.out.println("\u001B[35myou have "+rfile.length()/record_size+" song\u001B[0m");
        for (int i = 0; i <rfile.length()/(record_size) ; i++) {
            rfile.seek(i*record_size);
            System.out.println(read());
        }
    }
    public  String fixr(RandomAccessFile file){
        String temp="";

        for (int i = 0; i <size ; i++) {
            try {
                temp+=file.readChar();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return temp.trim();
    }
    public String chosing(int id) throws IOException {
        String path="";
        for (int i = 0; i < rfile.length()/record_size; i++) {
            rfile.seek(i*record_size+400);
            if(rfile.readInt()==id){
                rfile.seek(i*record_size+404);
                path=fixr(rfile);
                break;
            }
        }

        return path;
    }


}
