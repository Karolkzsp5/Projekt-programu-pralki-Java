package Lab06_p;

import java.util.Scanner;

import static Lab06_p.TrybyPrania.opoznienieWiadomosci;

public class Drzwiczki {

    public static void otwieranieDrzwiczek() {
        Scanner scanner = new Scanner(System.in);
        String komenda;

        while (true) {
            System.out.print("W celu otwarcia drzwiczek napisz [otworz]: ");
            komenda = scanner.nextLine().trim().toLowerCase();

            if (komenda.equals("otworz")) {
                System.out.print("Drzwiczki otwarte. ");
                break;
            } else {
                System.out.println("Nieznane polecenie, sprobuj ponownie");
            }
        }
    }
    public static void zamykanieDrzwiczek(){
        Scanner scanner = new Scanner(System.in);
        String komenda;
        int czasOpoznienia = 4000;
        while (true) {
            System.out.print("W celu zamkniecia drzwiczek napisz [zamknij]: ");
            komenda = scanner.nextLine().trim().toLowerCase();

            if (komenda.equals("zamknij")) {
                System.out.println("Drzwiczki zamkniete");
                opoznienieWiadomosci(czasOpoznienia);
                System.out.println(" ");
                break;
            } else {
                System.out.println("Nieznane polecenie, sprobuj ponownie");
            }
        }
    }
}
