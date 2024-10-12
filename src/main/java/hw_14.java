import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw_14 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("White","Tan","Yellow","Orange","Red","Pink","Purple","Blue"));
        System.out.println(colors);
        for (int i=0; i<colors.size();i++){
            if (colors.get(i).indexOf('l')!= -1) {
                colors.remove(i);
            }
        }
        System.out.println(colors);
    }
}
