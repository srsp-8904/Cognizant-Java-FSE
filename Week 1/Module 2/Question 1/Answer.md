# Theory Notes - E-commerce Platform Search Function

## Big O Notation

Big O Notation is used to measure the time complexity of an algorithm as the input size grows. It helps analyze the performance and scalability of algorithms, especially for large datasets. It usually represents the worst-case time complexity.

## Search Operation Scenarios

### Best Case

The required product is found at the first position.

### Average Case

The required product is found somewhere in the middle of the collection.

### Worst Case

The required product is found at the last position or is not present in the collection.

## Time Complexity Analysis

### Linear Search

* Best Case: O(1)
* Average Case: O(n)
* Worst Case: O(n)

Linear Search checks elements one by one until the target is found.

### Binary Search

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

Binary Search repeatedly divides the sorted array into halves until the target element is found.

## Comparison

| Algorithm     | Time Complexity |
| ------------- | --------------- |
| Linear Search | O(n)            |
| Binary Search | O(log n)        |

## Conclusion

Binary Search is more suitable for an e-commerce platform because it provides faster search performance for large datasets. However, the data must be sorted before Binary Search can be applied.
