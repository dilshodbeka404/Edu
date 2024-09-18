package algoritms;

// https://www.geeksforgeeks.org/shellsort/
public class ShellAlgorithm {
    private static int[] massiveArray = new int[]{1, 8, 3, 6, 7, 2, 4, 9, 10, 5};

    public static void main(String[] args) {
        int[] sortArray = sortAlgorithmShell(massiveArray);
        for (int i : sortArray) {
            System.out.println("i = " + i);
        }
    }

    private static int[] sortAlgorithmShell(int[] arr) {
        boolean replay = false;
        for (int i = 0; i < massiveArray.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int val = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = val;
                replay = true;
            }
        }
        if (replay) sortAlgorithmShell(arr);
        return arr;
    }
}

// Java implementation of ShellSort
class ShellSort {

    /* function to sort arr using shellSort */
    int sort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return 0;
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }

    /* A utility function to print array of size n*/
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println(n);
    }
}

