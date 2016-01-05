public class Sorts {
    private static boolean debug = true;

    public static void printArray(int[] data) {
	System.out.print("[");
	for (int i = 0; i < data.length - 1; i++) {
	    System.out.print(data[i] + ", ");
	}
	if (data.length >= 1) {
	    System.out.print(data[data.length - 1]);
	} else if (data.length == 1) {
	    System.out.print(data[0]);
	}
	System.out.print("]\n");
    }

    // Insertion Sort
    public static void insertionSort(int[] data) {
	for (int i = 0; i < data.length - 1; i++) {
	    if (data[i] > data[i + 1]) {
		int tmp = data[i + 1];
		data[i + 1] = data[i];
		data[i] = tmp;
		swapBackward(data, tmp, i);
	    }
	    if (debug) {
		printArray(data);
	    }
	}
    }

    private static void swapBackward(int[] data, int val, int indexVal) {
	while (indexVal - 1 >= 0 && val < data[indexVal - 1]) {
	    data[indexVal] = data[indexVal - 1];
	    data[indexVal - 1] = val;
	    indexVal--;
	}
    }

    // Selection Sort
    public static void selectionSort(int[] data) {
	int min, ind, tmp;
	for (int i = 1; i < data.length; i++) {
	    String combo = findMin(data, i).replace("\n", "");
	    min = Integer.parseInt(combo.split(":")[0]);
	    if (data[i - 1] > min) {
		// swap first index
		tmp = data[i - 1];
		data[i - 1] = min;
		// swap other element
		ind = Integer.parseInt(combo.split(":")[1]);
		data[ind] = tmp;
	    }
	    if (debug) {
		printArray(data);
	    }
	}
    }

    private static String findMin(int[] data, int index) {
	int min = data[index];
	int minIndex = index;
	for (int i = index; i < data.length; i++) {
	    if (min > data[i]) {
		min = data[i];
		minIndex = i;
	    }
	}
	return Integer.toString(min) + ":" + Integer.toString(minIndex);
    }

}