import java.util.*;
class ProductSearch {
    public int linearSearch(Product[] products, int productId){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == productId) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if the product is not found
    }
    public int linearSearchByName(Product[] products, String productName){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().toLowerCase().equals(productName.toLowerCase())) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if the product is not found
    }
    public int linearSearchByCategory(Product[] products, String category){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().toLowerCase().equals(category.toLowerCase())) {
                return i; // Return the index of the found product
            }
        }
        return -1; // Return -1 if the product is not found
    }
    public int binarySearch(Product[] products, int productId){
        Comparator<Product> comparator = Comparator.comparingInt(Product::getId);
        Arrays.sort(products, comparator); // Sort the products by ID before performing binary search
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getId() == productId) {
                return mid; // Return the index of the found product
            } else if (products[mid].getId() < productId) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the product is not found
    }
    public int binarySearch(Product[] products, String productName){
        Comparator<Product> comparator = Comparator.comparing(Product::getName);
        Arrays.sort(products, comparator); // Sort the products by name before performing binary search
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getName().toLowerCase().equals(productName.toLowerCase())) {
                return mid; // Return the index of the found product
            } else if (products[mid].getName().compareTo(productName) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the product is not found
    }
}