import java.util.HashMap;

public class MusicFactory {

    private static final HashMap<String, Music> musicMap = new HashMap();

    public static Music getMusic(String nomeMusic) {
        Music music = (Music) musicMap.get(nomeMusic);

        if(music == null) {
            music = new Music(nomeMusic);
            musicMap.put(nomeMusic, music);
            System.out.println("Adicionando a música cujo título é : " + nomeMusic);
        }
        return music;
    }

}
