import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {Music_map hash=new Music_map();
    SimpleAudioPlayer simpleAudioPlayer=new SimpleAudioPlayer();
    try
    {
       simpleAudioPlayer.filePath = "Ebi - Ki Ashkato Pak Mikone [128].au";
//        SimpleAudioPlayer audioPlayer =
//                new SimpleAudioPlayer();

        simpleAudioPlayer.play();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < simpleAudioPlayer.namemap.size(); i++) {
            System.out.println(simpleAudioPlayer.namemap.get(i));
        }
        while (true)
        {
            System.out.println( "\u001B[36m"+"0. song list");
            System.out.println("1. pause");
            System.out.println("2. resume");
            System.out.println("3. restart");
            System.out.println("4. Jump to specific time");
            System.out.println("5. change");
            System.out.println("6. adding song");
            System.out.println("7. stop"+"\u001B[0m");

            int c = sc.nextInt();
            simpleAudioPlayer.gotoChoice(c);
            if (c == 7)
                break;
        }
        sc.close();
    }

    catch (Exception ex)
    {
        System.out.println("\\u001B[31m"+"Error with playing sound."+"\u001B[0m");
        ex.printStackTrace();
    }
}