package Learning.Week_1.DSA.Ex2_Ecommerceplatform;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Fashion"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Camera", "Electronics")
        };
        String target = "Phone";
        long startLinear = System.nanoTime();
        Product foundLinear = ProductSearch.linearSearch(products, target);
        long endLinear = System.nanoTime();
        System.out.println("Linear Search Result:");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        long startBinary = System.nanoTime();
        Product foundBinary = ProductSearch.binarySearch(products, target);
        long endBinary = System.nanoTime();
        System.out.println("\nBinary Search Result:");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
    }
}
