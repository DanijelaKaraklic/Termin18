package rs.aleph.android.example12.model;

import java.util.ArrayList;

/**
 * Created by KaraklicDM on 12.10.2017.
 */

public class Jelo {
    private int id;
    private String slika;
    private String naziv;
    private String opisJela;
    private float kalorijskaVrednost;
    private float cena;
    private float ocena;
    private Category category;
    private ArrayList<Sastojak> sastojci;


    public Jelo(int id, String slika, String naziv, String opisJela, float kalorijskaVrednost, float cena, float ocena, Category category, ArrayList<Sastojak> sastojci) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opisJela = opisJela;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.ocena = ocena;
        this.category = category;
        this.sastojci = sastojci;
    }

    public Jelo(int id, String slika, String naziv, String opisJela, float kalorijskaVrednost, float cena, float ocena, Category category) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opisJela = opisJela;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.ocena = ocena;
        this.category = category;
        sastojci = new ArrayList<>();

    }




    public Jelo() {
        sastojci = new ArrayList<>();
    }

    public void addSastojak(Sastojak sastojak){
        sastojci.add(sastojak);
    }

    public void removeSastojak(Sastojak sastojak){
        sastojci.remove(sastojak);
    }

    public Sastojak getSastojak(int position){
        return sastojci.get(position);
    }





    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpisJela() {
        return opisJela;
    }

    public void setOpisJela(String opisJela) {
        this.opisJela = opisJela;
    }





    public float getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(float kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }




    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }


    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }



    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", slika='" + slika + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opisJela='" + opisJela + '\'' +
                ", kalorijskaVrednost=" + kalorijskaVrednost +
                ", cena=" + cena +
                ", ocena=" + ocena +
                ", category=" + category +
                '}';
    }
}
