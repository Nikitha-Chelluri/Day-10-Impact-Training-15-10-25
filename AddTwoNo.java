import java.util.*;
class AddTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        int reverse1 = 0;
        for(int k = 0; k < n; k++){
            reverse1 = reverse1 * 10 + arr1[k];
        }
        int reverse2 = 0;
        for(int q = 0; q < m; q++){
            reverse2 = reverse2 * 10 + arr2[q];
        }
        int arr[] = new int[10];
        int Sum = reverse1 + reverse2;
        int r = 0;
        if (Sum == 0) {
            arr[0] = Sum;
            System.out.print(arr[0]);
        }
        while(Sum > 0) {
            arr[r] = Sum % 10;
            Sum /= 10;
            r++;
        }

        for(int s = 0; s < r;s++){
            System.out.print(arr[s]+"\t");
        }
    }
}