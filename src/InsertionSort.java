public class InsertionSort {

    public static void main(String[] args) {

    }

    public static void sort(int[] a) {
        int j, n;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                j = i;
                n = a[i + 1];
                while (j >= 1 && n < a[j]) {
                    a[j + 1] = a[j];
                    a[j] = n;
                    j--;
                }
            }
        }
    }

}
