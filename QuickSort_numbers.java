import java.util.*;

class QuickSort {
    void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class QuickSort_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        QuickSort v = new QuickSort();
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        int a[] = new int[10];
        System.out.println("Enter the aay elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("BEFORE SORTING");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("AFTER SORTING");
        v.quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
