import java.util.*;
class NoToBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int bit  = 0;
        while (n > 0) {
            bit = n % 2;
            System.out.print(bit);
            n = n/2;
        }
    }
}