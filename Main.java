package com.example.nilay_proje;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("Bir şirketteki üç mertebeden birer çalışanın bilgileri girilmiştir...");

        Personel_Islemleri islemci = new Personel_Islemleri();

        Scanner input = new Scanner(System.in);


        /*System.out.println("Yeni yönetici listesi : ");
        for (int i = 0; i < YoneticiListesi.size(); i++) {
            System.out.println((i+1)+". "+YoneticiListesi.get(i).getIsim());
        }

        System.out.println("Yeni hademe listesi : ");
        for (int i = 0; i < HademeListesi.size(); i++){
            System.out.println((i+1)+". "+ HademeListesi.get(i).getIsim());
        }
        System.out.println("Yeni sekreter listesi : ");
        for (int i = 0; i < SekreterListesi.size(); i++) {
            System.out.println((i+1)+". "+ SekreterListesi.get(i).getIsim());
        }*/

        /*System.out.println("Personellere zam yapmak isterseniz 7'yi tuşlayınız : ");
        int zam_istegi = input.nextInt();

        if (zam_istegi==7){
            System.out.println("Hangi personele zam yapmak istediğinizi seçiniz : "+"1-Yönetici " + "2-Hademe " + "3-Sekreter ");
            int zamlı_personel = input.nextInt();

            if(zamlı_personel==1){
                try {
                    System.out.println("Yöneticinin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Yöneticinin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalı giriş yaptınız yeniden giriniz");
                }
            }
            else if(zamlı_personel==2){
                try {
                    System.out.println("Hademenin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Hademenin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalı giriş yaptınız yeniden giriniz");
                }
            }
            else{
                try {
                    System.out.println("Sekreterin maaşına yapılacak zam miktarını giriniz : ");
                    int yeniMaas= input.nextInt()+ h1.getMaas();
                    System.out.println("Sekreterin yeni maaşı : " + yeniMaas);
                }
                catch (Exception e){
                    System.out.println("Hatalı giriş yaptınız yeniden giriniz");
                }
            }

        }

    }
*/
}
}