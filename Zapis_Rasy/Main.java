import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner skan = new Scanner(System.in);
        PrintWriter zapis = new PrintWriter("Plik.txt");
        Rasa rasa = new Rasa();
        while (true) {
            System.out.print("Wpisz imie:");
            rasa.imie = skan.nextLine();
            if (rasa.imie.isBlank()) {
                System.out.println("Nie podano wartości");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Wpisz Nazwisko:");
            rasa.nazwisko = skan.nextLine();
            if (rasa.nazwisko.isBlank()) {
                System.out.println("Nie podano wartości");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Wpisz wiek:");
            rasa.wiek = skan.nextLine();
            if (rasa.wiek.isBlank()) {
                System.out.println("Nie podano wartości");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Wpisz Rasę:");
            rasa.rasa = skan.nextLine();
            if (rasa.wiek.isBlank()) {
                System.out.println("Nie podano wartości");
            }else {
                break;
            }
        }
        zapis.println("Imie: " + rasa.imie);
        zapis.println("Nazwisko: " + rasa.nazwisko);
        zapis.println("Wiek: " + rasa.wiek);
        if (rasa.rasa.equalsIgnoreCase("Elf")) {
            Elf elf = new Elf();
            zapis.println("Rasa: " + rasa.rasa);
            while (true) {
                System.out.print("Wpisz długość uszu:");
                elf.dlugoscUszu = skan.nextLine();
                if (rasa.wiek.isBlank()) {
                    System.out.println("Nie podano wartości");
                } else {
                    break;
                }
            }
            zapis.println("Długość uszu: " + elf.dlugoscUszu);
            while (true) {
                System.out.print("Wpisz ulubione drzewo:");
                elf.ulubioneDrzewo = skan.nextLine();
                if (rasa.wiek.isBlank()) {
                    System.out.println("Nie podano wartości");
                } else {
                    break;
                }
            }
            zapis.println("Ulubione drzewo: " + elf.ulubioneDrzewo);
            zapis.close();
        } else if (rasa.rasa.equalsIgnoreCase("Ork")) {
            Ork ork = new Ork();
            zapis.println("Rasa: " + rasa.rasa);
            while (true) {
                System.out.print("Wpisz ilość zębów:");
                ork.iloscZebow = skan.nextLine();
                if (rasa.wiek.isBlank()) {
                    System.out.println("Nie podano wartości");
                } else {
                    break;
                }
            }
            zapis.println("Ilość zębów: " + ork.iloscZebow);
            while (true) {
                System.out.print("Wpisz kolor skóry:");
                ork.kolorSkory = skan.nextLine();
                if (rasa.wiek.isBlank()) {
                    System.out.println("Nie podano wartości");
                } else {
                    break;
                }
            }
            zapis.println("Kolor skóry: " + ork.iloscZebow);
            zapis.close();
        } else {
            System.out.println("Wpisz wartość Elf lub Ork");
            System.exit(0);
        }
    }
}

