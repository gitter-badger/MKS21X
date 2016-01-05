public class Driver {
    public static void main(String[] args) {
	int[] arrayName = {-16002436, 315351, 135, 340634, 636621, 12};
	Sorts.printArray(arrayName);
	System.out.println("Begin sort.");
	Sorts.insertionSort(arrayName);
	System.out.println("Finished!");
	Sorts.printArray(arrayName);
	// tested on 0 elements, 1 element, repeated elements
    }
}
