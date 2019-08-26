package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by htanyeri on 8/25/2019.
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
