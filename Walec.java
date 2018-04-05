package com.company;

public class Walec extends PunktMaterialny
{
    public float promien;  //definiowanie promienia

    void kontrola(float promien)  //sprawdzenie wartosci promienia walca
    {
        if(promien>0)
        {
            this.promien=promien;
        }

        else
            System.out.println("Wartość długości nie może być ujemna");
    }

    public Walec()      //Konstruktor domyslny ze stałymi wartościami ( użycie konstruktorów superklasy)
    {
        super();
        this.promien=10;
        glownymoment();
    }
    public Walec(float masa, float promien)  //Konstruktor z parametrem (użycie konstruktorów  superklasy)
    {
        super(masa);
        this.promien=promien;
        kontrola(promien);
        glownymoment();
    }

    float glownymoment()    //obliczenie głownego momentu bezwładności walca
    {
        this.moment = this.masa*this.promien*this.promien/2;
        return this.moment;
    }

    void opis(String s)   //przeciążona metoda zwracający stały opis obiektu
    {
        System.out.println(s);
    }
    void opis()     //metoda wyświetlająca dane walca
    {
        System.out.println("Masa Walca wynosi = " + this.masa);
        System.out.println("Promień Walca wynosi = "+this.promien);
        System.out.println("Główny moment bezwładności wynosi = " + this.moment);
    }

}