import java.util.Scanner;

public class Part1 {

    public void Input() {

        int num;
        int i = 0, j = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total Numbers Entering : ");
        int limit = 0;
        limit = scanner.nextInt();

        int[] even = new int[limit];
        int[] odd = new int[limit];

        while (limit != 0) {
            System.out.println("Enter a number : ");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                even[i] = num;
                i++;
            } else {
                odd[j] = num;
                j++;
            }
            limit--;
        }

        scanner.close();

        System.out.println("Even :");
        for (int x : even) {
            if (x == 0)
                break;
            System.out.println(x);
        }

        System.out.println("Odd :");
        for (int x : odd) {
            if (x == 0)
                break;
            System.out.println(x);
        }

    }

}
