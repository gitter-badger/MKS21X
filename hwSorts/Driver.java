public class Driver {
    public static void main(String[] args) {
	//int[] arrayName = {-16002436, 315351, 135, 340634, 636621, 12};
	int[] arrayName = {1, 2, 9, 5, 0, 3};
	//Sorts.printArray(arrayName);
	//System.out.println("Begin sort.");
	Sorts.bubbleSort(arrayName);
	//System.out.println("Finished!");
	Sorts.printArray(arrayName);
	// tested on 0 elements, 1 element, repeated elements
    }
}
