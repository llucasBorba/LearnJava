package Continents;

public class Continents{
    /* a program that will print out a continent and the largest city in that continent, based on the value of an integer.*/
    int continents;

    public void largestCity(int continents){
        this.continents = continents;
        switch (continents) {
            case 1 -> System.out.println("North America: Mexico City, Mexico.");
            case 2 -> System.out.println("South America: Sao Paulo, Brazil.");
            case 3 -> System.out.println("Europe: Moscow, Russia");
            case 4 -> System.out.println("Africa: Lagos, Nigeria.");
            case 5 -> System.out.println("Asia: Shanghai, China.");
            case 6 -> System.out.println("Australia: Sydney, Australia.");
            case 7 -> System.out.println("Antarctica: McMurdo Station, US");
            default -> System.out.println("Undefined continent!");
        }
    }

    public static void main (String[] args){
        Continents fin = new Continents();
        fin.largestCity(3);

    }
}

