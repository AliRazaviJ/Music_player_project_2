import java.util.HashMap;

public  class  Music_map {
    private Music_List musicList;
    private HashMap<Music,String> music_mamp;

    public Music_map() {
        music_mamp=new HashMap<>();
        musicList=new Music_List();
    }

    public Music_List getMusicList() {
        return musicList;
    }

    public void setMusicList(Music_List musicList) {
        this.musicList = musicList;
    }

    public HashMap getMusic_mamp() {
        return music_mamp;
    }

    public void setMusic_mamp(HashMap music_mamp) {
        this.music_mamp = music_mamp;
    }
    public void adding_to_dic(Music music,String ads){
        music_mamp.put(music,ads);
    }
    public void adding_list(Music mus,String ads){
        musicList.music_list.add(mus);
        adding_to_dic(mus, ads);
    }
    public void seach(String name){
        musicList.search(name);
    }
    public void list_print(){
        musicList.print();
    }

}
