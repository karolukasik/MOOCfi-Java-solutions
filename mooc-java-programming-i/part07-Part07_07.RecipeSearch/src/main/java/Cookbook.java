import java.util.ArrayList;

public class Cookbook {
    private ArrayList<Recipe> listOfRecipes;

    public Cookbook() {
        this.listOfRecipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.listOfRecipes.add(recipe);
    }

    public ArrayList<Recipe> getListOfRecipes() {
        return this.listOfRecipes;
    }

    public Recipe getRecipe(int ordinalNumber) {
        return this.listOfRecipes.get(ordinalNumber - 1);
    }

    @Override
    public String toString() {
        String output = "";
        for (Recipe recipe : listOfRecipes) {
            output = output + recipe.toString() + "\n";
        }
        return output;
    }
}
