package Lab06_p;

import java.util.Scanner;

import static Lab06_p.Drzwiczki.*;
import static Lab06_p.Beben.wkladaniePrania;

public class Pralka {
    protected int numerTrybu;

    public static void main(String[] args) {
        Pralka pralka = new Pralka();
        pralka.wybierzTryb();
        System.out.println("Pranie zakonczone :)");
    }

    public void wybierzTryb() {
        Scanner scanner = new Scanner(System.in);
        otwieranieDrzwiczek();

        boolean poprawnaWaga = false;
        while (!poprawnaWaga) {
            wkladaniePrania();
            zamykanieDrzwiczek();
            System.out.println("========== MENU PRALKI ==========");
            System.out.println("*   1. 🧺 Mieszane              *");
            System.out.println("*   2. 👔 Biale                 *");
            System.out.println("*   3. 🩳 Bawelniane            *");
            System.out.println("*   4. 🧦 Welniane              *");
            System.out.println("*   5. ⚙️ Pranie wlasne         *");
            System.out.println("=================================");
            System.out.print("Wybierz opcje: ");
            numerTrybu = scanner.nextInt();

            double wagaPrania = Beben.wylosujWage();
            System.out.print("Waga prania wynosi: " + wagaPrania + " kg. ");
            Czujniki czujniki = new Czujniki();
            poprawnaWaga = czujniki.czujnikWagi(wagaPrania, numerTrybu);

            if (!poprawnaWaga) {
                System.out.println("Waga prania jest nieprawidlowa dla wybranego trybu. Prosze zaladowac pranie ponownie. \n");
            } else {
                TrybyPrania trybyPrania = new TrybyPrania();
                switch (numerTrybu) {
                    case 1 -> trybyPrania.Mieszane(numerTrybu);
                    case 2 -> trybyPrania.biale(numerTrybu);
                    case 3 -> trybyPrania.bawelniane(numerTrybu);
                    case 4 -> trybyPrania.welniane(numerTrybu);
                    case 5 -> trybyPrania.pranieWlasne(numerTrybu);
                }
            }
        }
    }
}