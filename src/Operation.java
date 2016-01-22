/**
 * Created by phucnguyen on 1/21/16.
 */
public class Operation {
    private static Operation operation;

    public Operation sharedOperation() {
        if  (operation == null) {
            operation = new Operation();
        }

        return operation;
    }

    public Operation() {}


    public void saveRecipe(Recipe recipe) {

    }

    public void uploadRecipe(Recipe recipe) {

    }

    public Recipe download(Recipe recipe) {

    }

    public boolean run() {

    }

    public boolean testDispense() {

    }


}
