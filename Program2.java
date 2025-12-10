class Program2 {
    public static void main(String[] args) {
        int a = 4;
        int count = 0;
        int num = 1;

        while (count < a) {
            System.out.print(num);
            count++;
            num += 2;

            if (count < a) {
                System.out.print(", ");
            }
        }
    }
}
