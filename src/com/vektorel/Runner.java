package com.vektorel;

import com.vektorel.entity.Turkce;

public class Runner {
    public static void main(String[] args) {
        /**
         *
         */
        Turkce tr = new Turkce();
        String merhabadunya = tr.mrb;
        Diller.DIL = "Fr";
        System.out.println(Diller.getDil().mrb);
    }
}
