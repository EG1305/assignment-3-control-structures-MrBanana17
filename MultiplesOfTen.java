class MultiplesOfTen {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000; i += 10) {
            System.out.print(i + " ");
            if (i % 100 == 0) System.out.println();
        }
    }
}