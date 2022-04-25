import java.beans.IntrospectionException;

public class Program {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.add(1, "one");
        hashMap.add(2, "two");
        hashMap.add(3, "three");
        hashMap.add(4, "four");
        hashMap.add(5, "five");

        System.out.println(hashMap.get(3));
        hashMap.add(3, "trzy");
        System.out.println(hashMap.get(3));
        hashMap.remove(3);
        System.out.println("---");
        for (int i = 1; i < 6; i++) {
            System.out.println(hashMap.get(i));
        }
    }

}
