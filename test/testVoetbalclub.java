import Practica.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testVoetbalclub {



    @Test
    void VoetbalClubTest(){

        //Here the test case checks if the returned String equals "FC" if the input == null or an empty String: ""
        Voetbalclub RS = new Voetbalclub();

        assertEquals("FC", RS.getClub());


        //Herer the test case checks if the verwerkResultaat() method works in accordance to my expectations, so if a game has been won ('w') +3, ('g') +1 and ('v') + 0
        Voetbalclub R = new Voetbalclub();

        R.verwerkResultaat('g');
        assertEquals(1, R.aantalGespeeld());
        assertEquals(1, R.aantalPunten());
        System.out.println("Resultaat 'g' verwerkt");

        R.verwerkResultaat('w');
        assertEquals(4, R.aantalPunten());
        assertEquals(2, R.aantalGespeeld());
        System.out.println("Resultaat 'w' verwerkt");

        R.verwerkResultaat('v');
        assertEquals(4, R.aantalPunten());
        assertEquals(3, R.aantalGespeeld());
        System.out.println("Resultaat 'v' verwerkt");

        //Here the test checks if win's and played games is changed after a wrong input: f Total played games and points should not be affected.
        Voetbalclub nieuwpoort = new Voetbalclub();

        nieuwpoort.verwerkResultaat('f');
        assertEquals(0, nieuwpoort.aantalGespeeld());
        assertEquals(0, nieuwpoort.aantalPunten());

        //Here the test checks if the toString() method returns the expected string after playing a few games.
        Voetbalclub schoonhoven = new Voetbalclub("Schoonhoven");
        String expected = "Schoonhoven 2 1 1 0 0";

        schoonhoven.verwerkResultaat('g');
        schoonhoven.verwerkResultaat('w');
        assertEquals(expected, schoonhoven.toString());

        //Here the test case checks if the object has the correct amount of points after calling the verwerkResultaat() method multiple times after each other.
        Voetbalclub grootAmmers = new Voetbalclub();

        grootAmmers.verwerkResultaat('w');
        grootAmmers.verwerkResultaat('g');
        grootAmmers.verwerkResultaat('v');
        grootAmmers.verwerkResultaat('g');
        grootAmmers.verwerkResultaat('w');
        grootAmmers.verwerkResultaat('v');


        assertEquals(8, grootAmmers.aantalPunten());
        assertEquals(6, grootAmmers.aantalGespeeld());

    }



}
