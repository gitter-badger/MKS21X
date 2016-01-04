public class Driver {
    public static void main(String[] args) {
	int[] arrayName = {-16002436, 315351, 135, 340634, 636621, 12};
	Sorts.printArray(arrayName);
	Sorts.selectionSort(arrayName);
	Sorts.printArray(arrayName);
	// tested on 0 elements, 1 element, repeated elements
    }
}
