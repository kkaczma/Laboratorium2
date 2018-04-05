package com.company;

public class Pret extends PunktMaterialny
{
    public float dlugosc;   //definiowanie dlugości

    void kontrola(float dlugosc)  //sprawdzanie wartości długości pręta
    {
        if(dlugosc>0)
        {
            this.dlugosc=dlugosc;
        }

        else
            System.out.println("Wartość długości nie może być ujemna");
    }

     public  Pret()   //Konstruktor domyslny ze stałymi wartościami ( użycie konstruktorów superklasy)
     {
         super();
         this.dlugosc=10;
         glownymoment();
     }
     public Pret(float masa, float dlugosc)  //Konstruktor z parametrem (użycie konstruktorów  superklasy)
    {
        super(masa);
        this.dlugosc=dlugosc;
        kontrola(dlugosc);
        glownymoment();
    }

    public float glownymoment()             //obliczenie głownego momentu bezwładności pręta
    {
        this.moment = this.masa*this.dlugosc*this.dlugosc/12;
        return this.moment;
     }

    void opis(String s)    //przeciążona metoda zwracający stały opis obiektu
    {
        System.out.println(s);
    }
    void opis()   //metoda wyświetlająca dane pręta
    {
        System.out.println("Masa Pręta wynosi = " + this.masa);
        System.out.println("Długość Pręta wynosi = "+this.dlugosc);
        System.out.println("Główny moment bezwładności wynosi = " + this.moment);
    }
}