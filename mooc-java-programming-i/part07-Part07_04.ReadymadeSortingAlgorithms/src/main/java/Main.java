import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] integerArray = { 3, 1, 5, 99, 3, 12 };
        String[] stringArray = { "grecia", "felcia", "michas", "karo" };
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        for (Integer number : integerArray) {
            integerList.add(number);
        }
        for (String string : stringArray) {
            stringList.add(string);
        }
        System.out.println("Arrays before sorting:");
        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerList);

        System.out.println("...and after sorting:");
        sort(integerArray);
        System.out.println(Arrays.toString(integerArray));
        sortIntegers(integerList);
        System.out.println(integerList);

        System.out.println("Lists before sorting:");
        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringList);

        System.out.println("...and after sorting:");
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        sortStrings(stringList);
        System.out.println(stringList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
