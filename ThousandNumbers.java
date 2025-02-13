class ThousandNumbers {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 1000) {
            System.out.print(count + " ");
            if (count % 10 == 0) System.out.println();
            count++;
        }
    }
}