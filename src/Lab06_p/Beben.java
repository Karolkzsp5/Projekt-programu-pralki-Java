package Lab06_p;

import java.util.Random;
import java.util.Scanner;

public class Beben {

    public static void wkladaniePrania(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Prosze wlozyc pranie do bebna i wcisnac przycisk [enter] ");
        String wcisniecieEnter = scanner.nextLine();

        if (wcisniecieEnter.isEmpty()) System.out.println("Pranie wlozone. Prosze zamknac drzwiczki.");
         else {
            System.out.println("Prosze wlozyc pranie do bebna i wcisnac przycisk [enter].");
            for (int i = 0; i < 5; i++) {
                wcisniecieEnter = scanner.nextLine();
                if (wcisniecieEnter.isEmpty()) {
                    break;
                }
            }
        }
    }

    public static int wylosujWage() {
        Random random = new Random();
        int waga = random.nextInt(10) + 1;
        return waga;
        
    }
}
