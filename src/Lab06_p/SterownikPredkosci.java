package Lab06_p;

import java.util.Scanner;

public class SterownikPredkosci {
    Scanner scanner = new Scanner(System.in);
    public int predkosc;
    protected int maxPredkosc;

    public void wybierzPredkosc(int numerTrybu){
        System.out.print("Podaj predkosc wirowania. ");
        if(numerTrybu == 1){
            System.out.println("Dla wybranego trybu: ***Mieszane*** maksymalna predkosc wirowania wynosi 1000 RPM");
        }
        else if(numerTrybu == 2){
            System.out.println("Dla wybranego trybu: ***Biale*** maksymalna predkosc wirowania wynosi 1000 RPM");
        }
        else if(numerTrybu == 3){
            System.out.println("Dla wybranego trybu: ***Bawelniane*** maksymalna predkosc wirowania wynosi 800 RPM");
        }
        else if(numerTrybu == 4){
            System.out.println("Dla wybranego trybu: ***Welniane*** maksymalna predkosc wirowania wynosi 600 RPM");
        }
        else if(numerTrybu == 5){
            System.out.println("Dla wybranego trybu: ***Wlasne*** maksymalna predkosc wirowania wynosi 2000 RPM");
        }
        predkosc = scanner.nextInt();

        switch(numerTrybu){
            case 1, 2:
                maxPredkosc = 1000;
                break;
            case 3:
                maxPredkosc = 800;
                break;
            case 4:
                maxPredkosc = 600;
                break;
            case 5:
                maxPredkosc = 2000;
                break;
            default:
                System.out.println("Nieznany tryb. Sprobuj ponownie.");
        }

        if (predkosc > maxPredkosc){
            System.out.println("Zbyt duza predkosc!");
            wybierzPredkosc(numerTrybu);
        }
        else System.out.println("Nastepuje pranie...");
        int czasOpoznienia = 5000;
        TrybyPrania.opoznienieWiadomosci(czasOpoznienia);
    }
}
