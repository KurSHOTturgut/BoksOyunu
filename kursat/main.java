package BoksOyunu;

import BoksOyunu.savas;

public class main {
    public static void main(String[] args) {

        savas f1 = new savas("Savaş" , 15 , 100, 90, 45);
        savas f2 = new savas("Barış" , 10 , 95, 95, 50);
        Match match = new Match(f1,f2 , 85 , 100,37);
        match.run();
    }
}