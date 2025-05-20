package Lab06_p;

public class Czujniki {

    protected int temperatura = 0;

    private int dolnyZakresTemperatury;
    private int gornyZakresTemperatury;

    public boolean czujnikWagi(double wagaPrania, int tryb) {
        double maksWaga;
        switch (tryb) {
            case 1: // Mieszane
                maksWaga = 8;
                break;
            case 2: // Białe
                maksWaga = 6;
                break;
            case 3: // Bawełniane
                maksWaga = 4;
                break;
            case 4: // Wełniane
                maksWaga = 2;
                break;
            case 5: // Własne
                System.out.println("Pranie wlasne nie ma ograniczenia wagowego.");
                return true;
            default:
                System.out.println("Nieprawidlowy tryb prania.");
                return false;
        }

        if (wagaPrania > maksWaga) {
            System.out.printf("Waga prania: " + wagaPrania + "kg przekracza maksymalny limit: " + maksWaga + "kg dla tego trybu.\n");
            return false;
        }

        System.out.println("Waga prania jest w normie.");
        return true;
    }

    public void czujnikTemperatury(int numerTrybu){
        if(numerTrybu == 1){
            dolnyZakresTemperatury = 20;
            gornyZakresTemperatury = 40;
        }
        else if(numerTrybu == 2){
            dolnyZakresTemperatury = 20;
            gornyZakresTemperatury = 60;
        }
        else if(numerTrybu == 3){
            dolnyZakresTemperatury = 20;
            gornyZakresTemperatury = 60;
        }
        else if(numerTrybu == 4){
            dolnyZakresTemperatury = 20;
            gornyZakresTemperatury = 60;
        }
        else if(numerTrybu == 5){

        }
    }

    public void czujnikWody(){

    }

}
