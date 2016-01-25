import javafx.beans.property.IntegerProperty;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by phucnguyen on 1/21/16.
 */
public class Operation {
    private static Operation operation;
    private static HashMap<Integer, Recipe> list;

    public static Operation sharedOperation() {
        if  (operation == null) {
            operation = new Operation();
        }

        return operation;
    }



    public Operation() {
        list = new HashMap<>();
    }


    public void saveRecipe(Recipe recipe) {
        // save recipe into the list at index i (i = the recipe number)
        if (recipe != null) {
            list.put(recipe.getRecipeNumber(), recipe);
        }
    }

    public Recipe uploadRecipe() {
        return null;
    }

    public Recipe download(Recipe recipe) {
        return null;
    }

    public void run() {

    }

    public void testDispense() {

    }

    public String getSystemMessage() {
        String message = "";
        return message;
    }

    public String getPumpStatusMessage() {
        String message = "";
        return message;
    }

}
