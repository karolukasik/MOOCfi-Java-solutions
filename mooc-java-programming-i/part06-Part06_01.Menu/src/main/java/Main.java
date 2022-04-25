
public class Main {
        public static void main(String[] args) {
                Menu menu = new Menu();
                menu.addMeal("Tofu ratatouille");
                menu.addMeal("Chilli Coconut Chicken");
                menu.addMeal("Chilli Coconut Chicken");
                menu.addMeal("Meatballs with mustard sauce");

                menu.printMeals();

                // When you have completed the method printMeals()
                // you can remove the comment below

                // exactum.printMeals();

                // When you have completed the method clearMenu()
                // you can remove the comments below
                menu.clearMenu();
                menu.printMeals();
        }
}
