package Practica;

public class Voetbalclub{

    private String club;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int punten;

    public Voetbalclub(String nm){
        club = nm;
    }

    public Voetbalclub(){
        club = "FC";
    }

    public String getClub(){
        return club;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w'){
            aantalGewonnen = aantalGewonnen + 1;
            aantalGespeeld += 1;
        }
        if (ch == 'g'){
            aantalGelijk = aantalGelijk + 1;
            aantalGespeeld += 1;
        }
        if (ch == 'v'){
            aantalVerloren = aantalVerloren + 1;
            aantalGespeeld += 1;
        }
    }

    public int aantalPunten(){
        punten = (aantalGewonnen * 3 ) + (aantalGelijk);
        return punten;

    }

    public int aantalGespeeld(){
        return aantalGespeeld;
    }

    @Override
    public String toString() {
        return
                club + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + punten;

    }


}
