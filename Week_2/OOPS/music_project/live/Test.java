package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

         
        System.out.println("Veena");
        Veena veena = new Veena();
        veena.play();

        
        System.out.println("Saxophone");
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        System.out.println("polymorphism");
        Playable playable;

        playable = new Veena();
        playable.play();

        playable = new Saxophone();
        playable.play();
    }
}
