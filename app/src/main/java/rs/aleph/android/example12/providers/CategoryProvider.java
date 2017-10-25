package rs.aleph.android.example12.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.model.Category;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class CategoryProvider {
    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "slano"));
        categories.add(new Category(1, "slatko"));
        categories.add(new Category(2, "ljuto"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("slano");
        names.add("slatko");
        names.add("ljuto");
        return names;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "slano");
            case 1:
                return new Category(1, "slatko");
            case 2:
                return new Category(2, "ljuto");
            default:
                return null;
        }
    }
}
