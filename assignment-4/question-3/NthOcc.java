class NthOcc {

    int findNth(int[] arr, int key, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        NthOcc obj = new NthOcc();

        int[] arr = {1, 2, 3, 2, 4, 2};

        System.out.println(obj.findNth(arr, 2, 2));
    }
}