import java.util.Scanner;

public class part2 {
    public void dist() {
        System.out.println("Enter Size of Array : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] dist_arr = new int[a];
        for (int i = 0; i != a; i++) {
            System.out.println("Enter Number" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int j = 0;
        while (j < a - 1) {
            dist_arr[j] = arr[j] - arr[j + 1];
            j++;
        }
        int index = 0;
        for (int x : dist_arr) {

            System.out.println(x);
        }
        for (int i = 0; i < a; i++) {
            if (dist_arr[i] < dist_arr[index])
                index = i;
        }
        System.out.println("index of first number : " + arr[index]);
        sc.close();
    }
}
