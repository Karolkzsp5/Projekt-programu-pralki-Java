package Lab06_p;

import java.util.Random;
import java.util.Scanner;

public class PojemnikNaDetergenty {

    protected int iloscProszku, iloscPlynu, maksPojemnoscProszek, maksPojemnoscPlyn;

    String odpowiedz;

    public void stanPojemnikaNaDetergenty(int numerTrybu) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        iloscProszku = random.nextInt(200);
        iloscPlynu = random.nextInt(100);

        System.out.println("Aktualna ilosc proszku to " + iloscProszku + "g" + " i aktualna ilosc plynu to " + iloscPlynu + "ml.");
        if (iloscProszku < 40){
            System.out.println("Wymagane jest dosypanie proszku do pojemnika.");
        }
        else if (iloscPlynu < 20){
            System.out.println("Wymagane jest dolanie plynu do pojemnika.");
        }
        else{
            System.out.println("Czy chcesz dolac plynu?");
        }
    }
}


/*
    Program losuje ilość proszku i płynu do prania a następnie wyświetla ich ilość w gramach/mililitrach.
    Następnie Wyświetla te wartości i pyta użytkownika czy chce dolać płynu albo dosypać proszku.

 */