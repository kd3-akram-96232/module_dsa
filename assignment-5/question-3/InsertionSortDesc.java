class InsertionSortDesc {

    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSortDesc s = new InsertionSortDesc();

        int[] arr = {5, 2, 9, 1, 3};

        s.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}