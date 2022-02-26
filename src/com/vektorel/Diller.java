package com.vektorel;

import com.vektorel.entity.*;

public class Diller {

    public static String DIL="Tr";

    /**
     * Polimotphism
     * @return
     */
    public static IDil getDil(){
        switch (DIL){
            case "Tr": return new Turkce();
            case "En": return new Ingilizce();
            case "De": return new Almanca();
            case "Fr": return new Fransizca();
            default:return new Turkce();
        }
    }

}
