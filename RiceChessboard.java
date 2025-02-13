import java.math.BigInteger;

class RiceChessboard {
    public static void main(String[] args) {
        BigInteger total = BigInteger.ZERO;
        BigInteger rice = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            total = total.add(rice);
            if (i < 64) {
                rice = rice.multiply(BigInteger.TWO);
            }
        }
        System.out.println("Rice on 64th square: " + rice);
        System.out.println("Total rice on the board: " + total);
    }
}