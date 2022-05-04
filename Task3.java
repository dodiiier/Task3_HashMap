import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Product> toy = new HashMap<>();
        toy.put("Misha", new Product("Misha", 2000));
        toy.put("Track", new Product("Track", 2500));
        toy.put("Tech", new Product("Tech", 3000));
        toy.put("Bike", new Product("Bike", 3500));
        Task3.sortAndPrintEntrySet(toy);
        Task3.sortAndPrintKeySet(toy);
        Task3.sortAndPrintValuesSet(toy);
    }

    public static void sortAndPrintEntrySet(Map<String, Product> toy) {
        for (Map.Entry<String, Product> entry : toy.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: " + entry.getValue());
        }
    }

    public static void sortAndPrintKeySet(Map<String, Product> toy) {
        for (String keys : toy.keySet()) {
            System.out.println("Ключи: " + keys);
        }
    }

    public static void sortAndPrintValuesSet(Map<String, Product> toy) {
        for (Product value : toy.values()) {
            System.out.println("Значение: " + value);
        }

    }
}
