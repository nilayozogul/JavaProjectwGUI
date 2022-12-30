package com.example.nilay_proje;

public abstract class Calisan extends Personel implements BilgiGoster{
    private String mertebe;
    public Calisan(String id, int maas, int yas, String mertebe) {
        super(id, maas, yas);
        this.mertebe = mertebe;
    }

    @Override
    public void bilgi_goster(){
        System.out.println("Id: "+ this.getId());
        System.out.println("Maaş: "+ this.getMaas());
        System.out.println("Yas: "+ this.getYas());
    }

    public String getMertebe() {
        return mertebe;
    }

    public void setMertebe(String mertebe) {
        this.mertebe = mertebe;
    }
}
