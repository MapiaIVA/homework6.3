import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] texts = {"apple banana cherry", "dog elephant", "zebra tiger lion", "Snake", "apple fruit"};

        System.out.println("Исходные строки:");
        printArrayContent(texts);

        reverseSort(texts);
        System.out.println("\nОтсортированный массив в обратном порядке:");
        printArrayContent(texts);

        sortByWordCount(texts);
        System.out.println("\nОтсортированный массив по количеству слов в строке:");
        printArrayContent(texts);
    }

    public static void printArrayContent(String[] array) {
        for (String value : array) {
            System.out.print(value + " ");
        }
    }

    public static void reverseSort(String[] array) {
        Arrays.sort(array, (a, b) -> b.toLowerCase().compareTo(a.toLowerCase()));
    }

    public static void sortByWordCount(String[] array) {
        Arrays.sort(array, (a, b) -> Integer.compare(a.split(" ").length, b.split(" ").length));
    }
}