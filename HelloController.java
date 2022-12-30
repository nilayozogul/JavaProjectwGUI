package com.example.nilay_proje;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable,BilgiGoster{
    String [] liste ={"Yönetici","Hademe","Sekreter"};

    Personel_Islemleri islem = new Personel_Islemleri();
        @FXML
        private TextField idal;
        @FXML
        private Label idtxt;
        @FXML
        private ChoiceBox <String> kademeal;
        @FXML
        private Label kademetxt;
        @FXML
        private TextField maasal;
        @FXML
        private Label maastxt;
        @FXML
        private TextField yasal;
        @FXML
        private Label yastxt;
        @FXML
        private ListView<String> aliste;
    static ArrayList<String> suankicalisan = new ArrayList<>();
        @FXML
        void personeleklemebutonu(ActionEvent event) {
            islem.calisan_ekle(kademeal.getValue(), idal.getText(),Integer.parseInt(maasal.getText()),Integer.parseInt(yasal.getText()));
            kademetxt.setText(kademeal.getValue());
            idtxt.setText(idal.getText());
            for (Calisan calisan:Personel_Islemleri.calisanArrayList) {
                if(calisan.getId().equals(idal.getText())){
                    yastxt.setText(Integer.toString(calisan.getYas()));
                    break;
                }
            }
            maastxt.setText(maasal.getText());
            suankicalisan.add(idal.getText());
            //choicebox.getItems().addAll(suankicalisan);
            suankicalisan.clear();
            aliste.getItems().add(idal.getText());
            bilgi_goster();
        }

        @FXML
        void personelsilmebutonu(ActionEvent event){
            islem.calisan_sil(idal.getText(),kademeal.getValue());
            aliste.getItems().remove(aliste.getSelectionModel().getSelectedIndex());
            bilgi_goster();
        }

        @FXML
        public void guncelle(ActionEvent event){
            try{
                for(Calisan calisan:Personel_Islemleri.calisanArrayList){
                    if (idal.getText().equals(calisan.getId())){
                        kademetxt.setText(kademetxt.getText());
                        yastxt.setText(Integer.toString(calisan.getYas()));
                        maastxt.setText(maasal.getText());
                        calisan.setMertebe(kademetxt.getText());

                        if (Integer.parseInt(yasal.getText())>=65){
                            calisan.setYas(65);
                        }
                        else if(Integer.parseInt(yasal.getText())<=18){
                            calisan.setYas(18);
                        }
                        calisan.setMaas(Integer.parseInt(maasal.getText()));
                    }
                    bilgi_goster();
                }

                aliste.getItems().remove(aliste.getSelectionModel().getSelectedIndex());
                aliste.getItems().add(idal.getText());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }


        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        kademeal.getItems().addAll(liste);

    }

    @Override
    public void bilgi_goster() {
        System.out.println("Arayüzde nesne değişikliği yapıldı.");
    }

    @FXML
    void cikisislemi(ActionEvent event) throws IOException {
            File file = new File("..\\Nilay_Proje\\src\\dosya.txt");
            if(!file.exists()){
                file.createNewFile();
            }

        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("ID\n");
        System.out.println(Personel_Islemleri.calisanArrayList.get(0).getId());
            for (int i = 0; i < Personel_Islemleri.calisanArrayList.size(); i++) {
                bufferedWriter.write(Personel_Islemleri.calisanArrayList.get(i).getId()+"\n");
            }
        bufferedWriter.close();

            System.exit(0);
    }
}