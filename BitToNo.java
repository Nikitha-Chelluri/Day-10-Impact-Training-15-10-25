import java.util.*;
class BitToNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int result = 0;
        int base = 1;
        while(n!= 0) {
            int r = n % 10;
            result = result + r * base;
            base = 2* base;
            n = n / 10;
        }
        System.out.println(result);
    }
}