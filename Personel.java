package com.example.nilay_proje;

import java.util.Scanner;

public abstract class Personel{
    Scanner input = new Scanner(System.in);
    private String id;
    private int maas;
    private int yas;

    public Personel(String id, int maas, int yas) {
        this.setId(id);
        this.setMaas(maas);
        this.setYas(yas);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<=18){
            System.out.println("yaş 0'dan büyük olmalı"+"Yaş 18 olarak otomatik eklenmiştir");
            this.yas = 18;
        }
        else if(yas>=65){
            this.yas=65;
        }
        else{
            System.out.println();
            this.yas = yas;
        }
    }
}
