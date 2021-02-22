package Tijdelijk;

public class Cirkel {
    //Declaratie van de attributen
    private int radius;
    private int xPositie;
    private int yPositie;

    //De methode Cirkel() die 3 parameters heeft en controleert of de ingevoerde radius groter is dan 0, zo niet geeft deze een foutmelding.

    public Cirkel(int rad,int x,int y){
        if(rad > 0){
            radius = rad;
            xPositie = x;
            yPositie = y;
        }
        else{
            System.out.println("Radius moet groter dan 0 zijn!");
        }
    }
    //Print de string

    @Override
    public String toString() {
        return "cirkel(" + xPositie + ", " + yPositie + ")" + " met radius: " + radius;
    }
}

