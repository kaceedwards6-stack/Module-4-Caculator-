import java.util.ArrayList;

// Jace Edwards
public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> characters = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        characters.add("Natsu");
        characters.add("Gray");
        characters.add("Erza");
        characters.add("Lucy");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original characters:");
        for (String character : characters) {
            System.out.println(character);
        }

        System.out.println("\nOriginal numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // set() replaces the item at an index. Indexes start at 0.
        characters.set(1, "Laxus");
        numbers.set(1, 25);

        // remove() deletes the item at an index.
        characters.remove(3);
        numbers.remove(3);

        System.out.println("\nCharacters after set() and remove():");
        for (String character : characters) {
            System.out.println(character);
        }

        System.out.println("\nNumbers after set() and remove():");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
