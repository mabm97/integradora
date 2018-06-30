package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Category;

public interface CategoryService {

    public Category saveOrUpdate(Category category);

    public List<Category> findAllCategory();

    public void delete(Integer id);

    public Category findCategoryById(Integer id);
}
