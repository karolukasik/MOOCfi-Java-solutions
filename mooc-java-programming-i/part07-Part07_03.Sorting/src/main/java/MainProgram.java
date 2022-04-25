import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestInRange = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestInRange);
            System.out.println(Arrays.toString(array));
        }

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int position : array) {
            if (position < smallest) {
                smallest = position;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int positionOfSmallest = 0;
        for (int position = 0; position < array.length; position++) {
            if (array[position] == smallest) {
                positionOfSmallest = position;
            }
        }
        return positionOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] newArray = new int[table.length - startIndex];
        int j = 0;
        for (int i = startIndex; i < table.length; i++) {
            newArray[j] = table[i];
            j++;
        }
        int indexOfSmallestInNewRange = indexOfSmallest(newArray);
        return indexOfSmallestInNewRange + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int valueContainer = array[index1];
        array[index1] = array[index2];
        array[index2] = valueContainer;
    }

}
