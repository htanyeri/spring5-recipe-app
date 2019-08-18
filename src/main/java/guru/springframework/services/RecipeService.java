package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by htanyeri on 8/18/2019.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
