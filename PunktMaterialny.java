package com.company;

public class PunktMaterialny
{

    public float masa;              //definiowanie masy
    public float moment;            //definiowanie momentu

    public PunktMaterialny()        //konstruktor domyślny ze stałymi wartościami
    {
        this.masa=2;
        glownymoment();
    }
    public PunktMaterialny(float m)  //konstruktor z parametrami
    {
        zmianaMasy(m);
        glownymoment();
    }
     void zmianaMasy(float m)       //sprawdzanie warości masy punktu
    {
        if(m>0)
        {
            this.masa=m;
        }
        else
        {
            System.out.println("Masa nie może być mniejsza od 0");
            this.masa=0;
        }
    }
    float glownymoment()     //metoda zwracająca stałą wartość momentu bezwładności równą 0
    {
        this.moment=0;
        return this.moment;
    }

    float Steinera(float d)   //metoda zwracająca moment w oparciu o twierdzenie Steinera
    {
        return this.moment +this.masa *d *d;
    }

    void opis()              // wyświetlenie danych punktu
    {
        System.out.println("Masa obiektu wynosi = " +this.masa);
        System.out.println("Główny moment bezwładności wynosi = " +this.moment);
        System.out.println("W oparciu o twierdzenie Steinera = "+Steinera(9));
    }
}