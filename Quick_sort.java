import java.util.*;

class Sort {
    void qsort(String a[], int first, int last) {
        int i, j;
        String pivot, temp;
        if (first < last) {
            pivot = a[first];
            i = first;
            j = last;
            while (i < j) {
                while ((a[i].compareTo(pivot) <= 0) && i < last)
                    i++;
                while ((a[j].compareTo(pivot) >= 0) && j > first)
                    j--;
                if (i < j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            temp = a[j];
            a[j] = a[first];
            a[first] = temp;
            this.qsort(a, first, j - 1);
            this.qsort(a, j + 1, last);
        }
    }
}

class Quick_sort {
    public static void main(String args[]) {
        int n, i;
        String s[] = new String[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        n = sc.nextInt();
        System.out.println("Enter the elements");
        for (i = 0; i <= n; i++)
            s[i] = sc.nextLine();
        System.out.println("BEFORE SORTING");
        for (i = 1; i <= n; i++)
            System.out.println(s[i]);
        Sort q = new Sort();
        q.qsort(s, 1, n);
        System.out.println("\nAFTER SORTING");
        for (i = 1; i <= n; i++)
            System.out.println(s[i]);
    }
}