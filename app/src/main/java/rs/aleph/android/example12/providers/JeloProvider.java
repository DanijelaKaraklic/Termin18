package rs.aleph.android.example12.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.model.Category;
import rs.aleph.android.example12.model.Jelo;
import rs.aleph.android.example12.model.Sastojak;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class JeloProvider {



    public static List<Jelo> getJela() {

        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "ljuto");

        ArrayList<Sastojak> sastojci0 = new ArrayList<>();
        ArrayList<Sastojak> sastojci1 = new ArrayList<>();
        ArrayList<Sastojak> sastojci2 = new ArrayList<>();


        sastojci0.add(new Sastojak(0,"meso",300));
        sastojci0.add(new Sastojak(1,"paradajz",1000));
        sastojci1.add(new Sastojak(2,"Cokolda",150));
        sastojci1.add(new Sastojak(3,"jaja",15));
        sastojci1.add(new Sastojak(4,"maslac",100));
        sastojci1.add(new Sastojak(5,"secer",200));
        sastojci2.add(new Sastojak(6,"meso",1000));
        sastojci2.add(new Sastojak(7,"jaja",10));
        sastojci2.add(new Sastojak(8,"biber",30));
        sastojci2.add(new Sastojak(9,"kobasice",500));



        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0,"spaghetti.jpg","spaghetti", "Spaghetti with bologneze sauce", 500.0f,250.00f,1.0f,c1,sastojci0));
        jela.add( new Jelo(1,"nuggat_cake.jpg", "Nugat Cake", "Cake with a lot of cream",400.0f, 350.00f,3.0f,c2,sastojci1));
        jela.add(new Jelo(2,"barbecue.png", "Barbecue", "Roasted a few types of meat.", 600.0f,740.35f,4.0f,c3,sastojci2));
        return jela;
    }




    public static List<String> getJeloNames() {

        List<String> names = new ArrayList<>();
        names.add("spaghetti");
        names.add("Nugat Cake");
        names.add("Barbecue");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "slano");

        ArrayList<Sastojak> sastojci0 = new ArrayList<>();
        ArrayList<Sastojak> sastojci1 = new ArrayList<>();
        ArrayList<Sastojak> sastojci2 = new ArrayList<>();

        sastojci0.add(new Sastojak(0,"meso",300));
        sastojci0.add(new Sastojak(1,"paradajz",1000));
        sastojci1.add(new Sastojak(2,"Cokolda",150));
        sastojci1.add(new Sastojak(3,"jaja",15));
        sastojci1.add(new Sastojak(4,"maslac",100));
        sastojci1.add(new Sastojak(5,"secer",200));
        sastojci2.add(new Sastojak(6,"meso",1000));
        sastojci2.add(new Sastojak(7,"jaja",10));
        sastojci2.add(new Sastojak(8,"biber",30));
        sastojci2.add(new Sastojak(9,"kobasice",500));


        switch (id) {
            case 0:
                return new Jelo(0,"spaghetti.jpg","spaghetti", "Spaghetti with bologneze sauce", 500.0f,250.00f,1.0f,c1,sastojci0);
            case 1:
                return new Jelo(1,"nuggat_cake.jpg", "Nugat Cake", "Cake with a lot of cream",400.0f, 350.00f,3.0f,c2,sastojci1);
            case 2:
                return new Jelo(2,"barbecue.png", "Barbecue", "Roasted a few types of meat.", 600.0f,740.35f,4.0f,c3,sastojci2);
            default:
                return null;
        }
    }
}



