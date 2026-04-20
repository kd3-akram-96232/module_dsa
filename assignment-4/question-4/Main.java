class LastOcc {

    int findLast(int[] arr, int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        LastOcc obj = new LastOcc();

        int[] arr = {1, 2, 3, 2, 4, 2};

        System.out.println(obj.findLast(arr, 2));
    }
}