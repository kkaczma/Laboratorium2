package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //WALEC
        Walec pierwszy = new Walec(6, 4); //stworzenie obiketu klas pochodnych za pomocą konstruktorów z parametrami
        pierwszy.opis("Parametry walca: \n");         //przeciążona metoda zwracająca stały opis
        pierwszy.opis();                                   //wyświetlenie danych walca
        System.out.println("\n");
        //PRĘT
        Pret drugi = new Pret(5, 3);
        drugi.opis("Parametry pręta: \n");
        drugi.opis();
        System.out.println("\n");
        //KULA
        Kula trzeci = new Kula(6, 7);
        trzeci.opis("Parametry kuli: \n");
        trzeci.opis();
        System.out.println("\n");

        //Stworzenie listy obiektów róznych klas pochodnych (z wykorzytsanie pętli for)
        ArrayList<PunktMaterialny> Obiekty= new ArrayList<PunktMaterialny>();
        for(int i=1;i<3 ;i++)
            Obiekty.add(new Walec(i*5,i*3)); //dodanie elementów do listy
        for(int i=1;i<3;i++)
            Obiekty.add(new Kula(i*3,i*4));
        for(int i=1;i<3;i++)
            Obiekty.add(new Pret(i*6,i*7));
        PunktMaterialny obiekt = new PunktMaterialny();
        for(int i=0;i<Obiekty.size();i++)               //Wypisanie informacji dla wszystkich obiektów z listy
        {
            obiekt= Obiekty.get(i);  //odczytanie elementu o podanym indeksie
            System.out.println("Obiekt nr."+(i+1));
            obiekt.opis();
            System.out.println("W oparciu o twierdzenie Steinera = " +obiekt.Steinera(9));
            System.out.println("\n");
        }

        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in)); //utworzyenie obiektu BufferedReader do odczytu strumienia wejścia
        int liczba = 0;
        do {
            System.out.println("\n MENU");
            System.out.println("(podaj liczbę z przedziału 0-3)");
            System.out.println("\n1.Obliczenia dla Kuli");
            System.out.println("\n2.Obliczenia dla Walaca");
            System.out.println("\n3.Obliczenia dla Pręta");
            System.out.println("\n0.Wyjście");

            liczba = Integer.parseInt(menu.readLine());   //zmiana z typu String na typ liczbowy, przypisanie wartości zmiennej liczba

            switch (liczba) {
                case 1: {
                    System.out.println("\nWprowadź masę obiektu: ");
                    float masa = Integer.parseInt(menu.readLine());
                    System.out.println("\nWprowadź promień obiektu: ");
                    float promien = Integer.parseInt(menu.readLine());
                    Kula nowyobiekt = new Kula(masa, promien);
                    nowyobiekt.opis();
                    System.out.println("\nWprowdź odległość do nowej równoległej osi: ");
                    float d = Integer.parseInt(menu.readLine());
                    double steiner = (2 * masa * promien * promien) / 5 + masa * d * d;
                    System.out.println("Moment bezwładności z twierdzenia Steinera: " + steiner);
                    System.out.println("Wciśnij enetr aby kontynuować.");
                    String znak =(menu.readLine());
                    break;
                }
                case 2: {
                    System.out.println("\nWprowadź masę obiektu: ");
                    float masa = Integer.parseInt(menu.readLine());
                    System.out.println("\nWprowadź promień obiektu: ");
                    float promien = Integer.parseInt(menu.readLine());
                    Walec nowyobiekt = new Walec(masa, promien);
                    nowyobiekt.opis();
                    System.out.println("\nWprowdź odległość do nowej równoległej osi: ");
                    float d = Integer.parseInt(menu.readLine());
                    double steiner = (2 * masa * promien * promien) / 5 + masa * d * d;
                    System.out.println("Moment bezwładności z twierdzenia Steinera: " + steiner);
                    System.out.println("Wciśnij enetr aby kontynuować.");
                    String znak = (menu.readLine());
                    break;
                }

                case 3: {
                    System.out.println("\nWprowadź masę obiektu: ");
                    float masa = Integer.parseInt(menu.readLine());
                    System.out.println("\nWprowadź długość obiektu: ");
                    float dlugosc = Integer.parseInt(menu.readLine());
                    Pret nowyobiekt = new Pret(masa, dlugosc);
                    nowyobiekt.opis();
                    System.out.println("\nWprowdź odległość do nowej równoległej osi: ");
                    float d = Integer.parseInt(menu.readLine());
                    double steiner = (masa * dlugosc * dlugosc) / 12 + masa * d * d;
                    System.out.println("Moment bezwładności z twierdzenia Steinera: " + steiner);
                    System.out.println("Wciśnij enetr aby kontynuować.");
                    String znak =(menu.readLine());
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór, proszę o właściwy wybór w menu!");
                    System.out.println("Wciśnij enetr aby kontynuować.");
                    String znak =(menu.readLine());
                    break;

            }
        } while (liczba != 0);
    }
}

