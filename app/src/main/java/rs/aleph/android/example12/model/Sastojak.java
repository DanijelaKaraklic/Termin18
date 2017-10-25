package rs.aleph.android.example12.model;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class Sastojak {
    private int id;
    private String naziv;
    private float kolicina;
    private Jelo jelo;

    public Sastojak() {
    }
    public Sastojak(int id, String naziv, float kolicina) {
        this.id = id;
        this.naziv = naziv;
        this.kolicina = kolicina;

    }

   /* public Sastojak(int id, String naziv, float kolicina) {
        this.id = id;
        this.naziv = naziv;
        this.kolicina = kolicina;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    public float getKolicina() {
        return kolicina;
    }

    public void setKolicina(float kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return  naziv;
    }
}
