class Program3 {
    public static void main(String[] args) {
        int a = 6;

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i + 2 <= limit) {
                System.out.print(", ");
            }
        }
    }
}
