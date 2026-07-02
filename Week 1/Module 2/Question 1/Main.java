public class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", 50000, "Electronics"),
            new Product(102, "Phone", 30000, "Mobile"),
            new Product(103, "Watch", 5000, "Accessories"),
            new Product(104, "Tablet", 25000, "Electronics"),
            new Product(105, "Headphones", 2000, "Accessories")
        };

        ProductSearch search = new ProductSearch();

        // Linear Search Tests
        int index1 = search.linearSearch(products, 103);
        System.out.println("Linear Search (ID): " + index1);

        int index2 = search.linearSearchByName(products, "Phone");
        System.out.println("Linear Search (Name): " + index2);

        int index3 = search.linearSearchByCategory(products, "Electronics");
        System.out.println("Linear Search (Category): " + index3);

        // Binary Search Tests
        int index4 = search.binarySearch(products, 104);
        System.out.println("Binary Search (ID): " + index4);

        int index5 = search.binarySearch(products, "Watch");
        System.out.println("Binary Search (Name): " + index5);
    }
}