
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("File to read: ");
        String fileName = RecipeSearch.scanner.nextLine();
        Cookbook cookbook = creatingCookbookFromFile(fileName);
        System.out.println("");

        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\n"
                + "find name - searches recipes by name\nfind cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else {
                manageCommand(cookbook, command);
                if (!command.equals("list")) {
                    System.out.println("");
                }
            }
        }

    }

    public static void manageCommand(Cookbook cookbook, String command) {
        if (command.equals("list")) {
            System.out.println("Recipes:");
            System.out.println(cookbook);

        } else if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String searched = RecipeSearch.scanner.nextLine();
            System.out.println("Recipes:");
            for (Recipe recipe : cookbook.getListOfRecipes()) {
                if (recipe.getName().contains(searched)) {
                    System.out.println(recipe);
                }
            }

        } else if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int maxTime = Integer.valueOf(RecipeSearch.scanner.nextLine());
            System.out.println("Recipes:");
            for (Recipe recipe : cookbook.getListOfRecipes()) {
                if (recipe.getCookingTime() <= maxTime) {
                    System.out.println(recipe);
                }
            }
        } else if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String searchedIngredient = RecipeSearch.scanner.nextLine();
            System.out.println("Recipes:");
            for (Recipe recipe : cookbook.getListOfRecipes()) {
                if (recipe.hasIngredient(searchedIngredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public static Cookbook creatingCookbookFromFile(String fileName) {
        Cookbook cookbook = new Cookbook();
        ArrayList<String> partsOfRecipe = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    Recipe newRecipe = createNewRecipe(partsOfRecipe);
                    cookbook.addRecipe(newRecipe);
                    partsOfRecipe.clear();
                    continue;
                }
                partsOfRecipe.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Recipe lastRecipe = createNewRecipe(partsOfRecipe);
        cookbook.addRecipe(lastRecipe);

        return cookbook;
    }

    public static Recipe createNewRecipe(ArrayList<String> partsOfRecipe) {
        String nameOfRecipe = partsOfRecipe.get(0);
        int cookingTime = Integer.valueOf(partsOfRecipe.get(1));
        ArrayList<String> ingredients = new ArrayList<>();

        for (int index = 2; index < partsOfRecipe.size(); index++) {
            ingredients.add(partsOfRecipe.get(index));
        }
        Recipe newRecipe = new Recipe(nameOfRecipe, cookingTime, ingredients);

        return newRecipe;
    }

}
