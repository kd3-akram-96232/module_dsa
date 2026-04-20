class FindMode {

    int findMode(int[] arr) {
        int maxCount = 0;
        int mode = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        FindMode m = new FindMode();
        int[] arr = {1, 2, 2, 3, 4, 2, 3};

        System.out.println(m.findMode(arr));
    }
}