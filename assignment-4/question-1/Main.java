class BinaryRec {

    void printBinary(int n) {
        if (n == 0) return;

        printBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        BinaryRec obj = new BinaryRec();

        int num = 10;

        if (num == 0) {
            System.out.print(0);
        } else {
            obj.printBinary(num);
        }
    }
}