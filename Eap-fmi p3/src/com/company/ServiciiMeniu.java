package com.company;


import com.company.clase.BD.Amfiteatre_BD;

public interface ServiciiMeniu {
    void afisare_specializare() ;
    void afisare_serii();
    void afisare_grupe() ;
    void afisare_materii() ;
    void afisare_studenti();
    void afisare_profesori();
    void afisare_locatie();
    void afisare_laboratoare();
    void afisare_amfiteatre();

    public default void meniu()
    {

    }

    }
