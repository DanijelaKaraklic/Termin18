package rs.aleph.android.example12.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.model.Category;
import rs.aleph.android.example12.model.Jelo;
import rs.aleph.android.example12.model.Sastojak;

/**
 * Created by KaraklicDM on 16.10.2017.
 */




public class SastojakProvider {

    public static List<Sastojak> getSastojci(){
        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "ljuto");

        Jelo j1 = new Jelo(0,"spaghetti.jpg","spaghetti","Spaghetti with bologneze sauce",500.0f,250.00f,1.0f,c1);
        Jelo j2 = new Jelo(1,"nuggat_cake.jpg","Nugat Cake","Cake with a lot of cream",400.0f,350.00f,3.0f,c2);
        Jelo j3 = new Jelo(2,"barbecue.png","Barbecue","Roasted a few types of meat.",600.0f,740.35f,4.0f,c3);

        List<Sastojak> sastojci =new ArrayList<>();
        sastojci.add(new Sastojak(0,"meso",300));
        sastojci.add(new Sastojak(1,"paradajz",1000));
        sastojci.add(new Sastojak(2,"Cokolda",150));
        sastojci.add(new Sastojak(3,"jaja",15));
        sastojci.add(new Sastojak(4,"maslac",100));
        sastojci.add(new Sastojak(5,"secer",200));
        sastojci.add(new Sastojak(6,"meso",1000));
        sastojci.add(new Sastojak(7,"jaja",10));
        sastojci.add(new Sastojak(8,"biber",30));
        sastojci.add(new Sastojak(9,"kobasice",500));
        return sastojci;
    }

    public static List<Sastojak>getSastojciByJeloId(int id){
        List<Sastojak> sastojciJela = new ArrayList<>();
        for (Sastojak s:getSastojci()) {
            if (s.getJelo().getId() == id){
                sastojciJela.add(s);
            }
        }
        //List<String> sastojci = new ArrayList<>();

        return sastojciJela;
    }

    public static List<String> getSastojciNaziv(){
        List<String> naziv = new ArrayList<>();
        naziv.add("meso");
        naziv.add("paradajz");
        naziv.add("Cokolada");
        naziv.add("jaja");
        naziv.add("maslac");
        naziv.add("secer");
        naziv.add("biber");
        naziv.add("kobasice");
        return naziv;

    }

    public static Sastojak getSastojciById(int id){
        Category c1 = new Category(0, "slano");
        Category c2 = new Category(1, "slatko");
        Category c3 = new Category(2, "ljuto");

        Jelo j1 = new Jelo(0,"spaghetti.jpg","spaghetti","Spaghetti with bologneze sauce",500.0f,250.00f,1.0f,c1);
        Jelo j2 = new Jelo(1,"nuggat_cake.jpg","Nugat Cake","Cake with a lot of cream",400.0f,350.00f,3.0f,c2);
        Jelo j3 = new Jelo(2,"barbecue.png","Barbecue","Roasted a few types of meat.",600.0f,740.35f,4.0f,c3);

        switch (id){
            case 0:
                return new Sastojak(0,"meso",300);
            case 1:
                return new Sastojak(1,"paradajz",1000);
            case 2:
                return new Sastojak(2,"Cokolda",150);
            case 3:
                return new Sastojak(3,"jaja",15);
            case 4:
                return new Sastojak(4,"maslac",100);
            case 5:
                return new Sastojak(5,"secer",200);
            case 6:
                return new Sastojak(6,"meso",1000);
            case 7:
                return new Sastojak(7,"jaja",10);
            case 8:
                return new Sastojak(8,"biber",30);
            case 9:
                return new Sastojak(9,"kobasice",500);
            default:
                return null;
        }
    }
}


