package rs.aleph.android.example12.model;

import java.util.ArrayList;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Category {
    private int id;
    private String naziv;
    private ArrayList<Jelo> jela;

    public Category() {
        jela = new ArrayList<>();
    }

    public Category(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        jela = new ArrayList<>();

    }


    public void addJelo(Jelo jelo){
        jela.add(jelo);
    }

    public void removeJelo(Jelo jelo){
        jela.remove( jelo);
    }

    public Jelo getJelo(int position){
        return jela.get(position);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Jelo> getJela() {
        return jela;
    }

    public void setJela(ArrayList<Jelo> jela) {
        this.jela = jela;
    }

    @Override
    public String toString() {
        return "Category{" +
                "naziv='" + naziv + '\'' +
                '}';
    }
}
