package com.librarygif.data;

import com.librarygif.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepositoy {

    private static final List<Category> categoryList = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );

    public List<Category> getAllCategories() {
        return categoryList;
    }

    public Category findById(int id) {
        for (Category cat : categoryList) {
            if (cat.getId() == id) {
                return cat;
            }
        }
        return null;
    }
}
