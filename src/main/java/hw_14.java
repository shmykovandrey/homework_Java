import java.util.ArrayList;
import java.util.List;

public class hw_14 {
    public static void main(String[] args) {

        List<Integer> myIntList = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            myIntList.add(i);
        }

        System.out.println(myIntList);

        for (Integer i = 100; i <=1000 ; i+=2) {
            myIntList.remove(i);
        }
        System.out.println(myIntList);
    }
}
