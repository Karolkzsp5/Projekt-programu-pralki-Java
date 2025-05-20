package Lab06_p;

public class TrybyPrania extends SterownikPredkosci{

    public static void opoznienieWiadomosci(int czas) {
        int czasMiedzyKropkami = czas / 3;

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(czasMiedzyKropkami);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    int czasOpoznienia = 1000;
    public void Mieszane(int numerTrybu){
        System.out.println("Wybrano pranie mieszane.");
        opoznienieWiadomosci(czasOpoznienia);
        wybierzPredkosc(numerTrybu);
    }
    public void biale(int numerTrybu) {
        System.out.println("Wybrano pranie biale.");
        opoznienieWiadomosci(czasOpoznienia);
        wybierzPredkosc(numerTrybu);
    }
    public void bawelniane(int numerTrybu) {
        System.out.println("Wybrano pranie bawelniane.");
        opoznienieWiadomosci(czasOpoznienia);
        wybierzPredkosc(numerTrybu);
    }
    public void welniane(int numerTrybu) {
        System.out.println("Wybrano pranie welniane.");
        opoznienieWiadomosci(czasOpoznienia);
        wybierzPredkosc(numerTrybu);
    }
    public void pranieWlasne(int numerTrybu) {
        System.out.println("Wybrano pranie wlasne.");
        opoznienieWiadomosci(czasOpoznienia);
        wybierzPredkosc(numerTrybu);
    }
}

