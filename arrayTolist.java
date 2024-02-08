import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayTolist {
    public void convert() {
        int[] array = new int[5];
        ArrayList<Integer> arraylist = new ArrayList<>();

        System.out.println("Without conversion :");
        System.out.println("Array :" + array.getClass());
        System.out.println("Array List:" + arraylist.getClass());

        List al = Arrays.asList(array);

        int[] arr = arraylist.stream().mapToInt(i -> i).toArray();

        System.out.println("With Conversion : ");

        System.out.println("Array :" + al.getClass());
        System.out.println("Array List:" + arr.getClass());

    }

}
