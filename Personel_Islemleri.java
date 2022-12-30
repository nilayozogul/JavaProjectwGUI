package com.example.nilay_proje;

import java.util.ArrayList;
import java.util.Scanner;
public class Personel_Islemleri implements BilgiGoster{
    Scanner input = new Scanner(System.in);
    
    public static ArrayList<Calisan> calisanArrayList = new ArrayList<>();
    ArrayList<Sekreter> sekreterArrayList = new ArrayList<>();
    ArrayList<Yonetici> yoneticiArrayList = new ArrayList<>();
    ArrayList<Hademe> hademeArrayList = new ArrayList<>();

    public ArrayList<Hademe> getHademeArrayList() {
        return hademeArrayList;
    }
    public ArrayList<Yonetici> getYoneticiArrayList(){
        return yoneticiArrayList;
    }

    public ArrayList<Sekreter> getSekreterArrayList() {
        return sekreterArrayList;
    }

    public ArrayList<Calisan> getCalisanArrayList() {
        return calisanArrayList;
    }

    public void calisan_ekle(String calisan_kademe, String id, int maas, int yas){
        if(calisan_kademe.equals("Sekreter")){
            sekreterArrayList.add(new Sekreter(id,maas,yas,""));
            calisanArrayList.add(sekreterArrayList.get(sekreterArrayList.size() - 1));
            System.out.println("Personel başarıyla eklenmiştir");
            bilgi_goster();
        }
        else if(calisan_kademe.equals("Yonetici")){
            yoneticiArrayList.add(new Yonetici(id,maas,yas,""));
            calisanArrayList.add(yoneticiArrayList.get(yoneticiArrayList.size() - 1));
            System.out.println("Personel başarıyla eklenmiştir");
            bilgi_goster();
        }
        else if(calisan_kademe.equals("Hademe")){
            hademeArrayList.add(new Hademe(id,maas,yas,""));
            calisanArrayList.add(hademeArrayList.get(hademeArrayList.size() - 1));
            System.out.println("Personel başarıyla eklenmiştir");
            bilgi_goster();
        }
    }
    
    public void calisan_sil (String id, String calisan_kademe){
        for (int i = 0; i < calisanArrayList.size(); i++) {
            if(id.equals(calisanArrayList.get(i).getId())){
                calisanArrayList.remove(i);
                System.out.println("Sildi");
                bilgi_goster();
            }
        }

        if(calisan_kademe.equals("Yonetici")){
            for (int i = 0; i < yoneticiArrayList.size(); i++) {
                if(yoneticiArrayList.get(i).getId().equals(id)){
                    yoneticiArrayList.remove(i);
                    System.out.println("Sildi");
                    bilgi_goster();
                }
            }
        }
        else if(calisan_kademe.equals("Sekreter")){
            for (int i = 0; i < sekreterArrayList.size(); i++) {
                if(sekreterArrayList.get(i).getId().equals(id)){
                    sekreterArrayList.remove(i);
                    System.out.println("Sildi");
                    bilgi_goster();
                }

            }
        }
        else if (calisan_kademe.equals("Hademe")){
            for (int i = 0; i < hademeArrayList.size(); i++) {
                if(hademeArrayList.get(i).getId().equals(id)){
                    hademeArrayList.remove(i);
                    System.out.println("Sildi");
                    bilgi_goster();
                }
            }
        }

        for (int i = 0; i < calisanArrayList.size(); i++) {
            if(id.equals(calisanArrayList.get(i).getId())){
                calisanArrayList.remove(i);
                System.out.println("Sildi");
                bilgi_goster();
            }
        }
    }


    @Override
    public void bilgi_goster() {
        System.out.println("İşlem başarıyla yapıldı.");
    }
}
