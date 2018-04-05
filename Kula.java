package com.company;

public class Kula extends PunktMaterialny
{
    public float promien; //definiowanie  promien

    void kontrola(float promien)   //sprawdzenie wartosci promienia kuli
    {
        if(promien>0)
        {
            this.promien=promien;
        }

        else
            System.out.println("Wartość długości nie może być ujemna");
    }

    public Kula()     //Konstruktor domyslny ze stałymi wartościami ( użycie konstruktorów superklasy)
    {
        super();
        this.promien=10;
        glownymoment();
    }
    public Kula(float masa, float promien)  //Konstruktor z parametrem (użycie konstruktorów  superklasy)
    {
        super(masa);
        this.promien=promien;
        kontrola(promien);
        glownymoment();
    }

    float glownymoment()            //obliczenie głownego momentu bezwładności kuli
    {
        this.moment = 2*this.masa*this.promien*this.promien/5;
        return this.moment;
    }

    void opis(String s) //przeciążona metoda zwracający stały opis obiektu
    {
        System.out.println(s);
    }
    void opis()         //metoda wyświetlająca dane kuli
    {
        System.out.println("Masa Kuli wynosi = " + this.masa);
        System.out.println("Promień Kuli wynosi = "+this.promien);
        System.out.println("Główny moment bezwładności wynosi = " + this.moment);
    }

}