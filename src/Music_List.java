import java.security.PublicKey;
import java.util.ArrayList;

public class Music_List {
    private Music music;
    public ArrayList<Music>music_list;

    public Music_List() {
        music=new Music();
        music_list=new ArrayList<>();
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public ArrayList<Music> getMusic_list() {
        return music_list;
    }

    public void setMusic_list(ArrayList<Music> music_list) {
        this.music_list = music_list;
    }

    @Override
    public String toString() {
        return "Music_List{" +
                "music=" + music +
                ", music_list=" + music_list +
                '}';
    }

    public void adding(Music mus){
        music_list.add(mus);
    }
    public void remove(int id){
        for (int i = 0; i <music_list.size() ; i++) {
            if(music_list.get(i).getId()==id){
                music_list.remove(music_list.get(i));
                break;
            }
        }
    }
    public void search(String somthing){
        for (int i = 0; i <music_list.size() ; i++) {
            if(music_list.get(i).getEverting().equals(somthing)){
                System.out.println(music_list.get(i));
            }
        }
    }
    public void print(){
        for (int i = 0; i <music_list.size() ; i++) {
            System.out.println(music_list.get(i));
        }
    }
    public void adding_to_dic(Music music,String ads){

    }
}
