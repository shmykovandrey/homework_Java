import java.util.*;

public class hw_14 {
    public static void main(String[] args) {
        String text = "Lorem ipsum odor amet, consectetuer adipiscing elit. Viverra cursus nec volutpat luctus torquent. Purus rutrum cursus hac tempus ornare. Arcu hendrerit posuere sit interdum non. Neque tortor feugiat fusce libero quam fames eu lacinia. Non scelerisque porta auctor ipsum eu sem? Taciti nascetur posuere natoque; dolor tincidunt at. Magnis tincidunt litora natoque per himenaeos velit. Consequat quis vestibulum ornare tortor quam pharetra. Proin ante ex habitasse consequat habitant a consequat.\n" +
                "\n" +
                "Suscipit quis scelerisque elementum morbi massa auctor magnis, massa habitasse. Quis libero pellentesque aenean; dolor nec potenti porttitor sem. Sagittis litora per tristique cubilia ultricies ridiculus. Urna sagittis hendrerit integer suspendisse potenti euismod suscipit phasellus lectus. Id tellus mollis id nostra nisi condimentum adipiscing nibh. Aptent efficitur laoreet dolor ornare sagittis sapien. Feugiat fusce scelerisque metus cursus aenean ornare venenatis sagittis. Aliquam integer risus tincidunt hendrerit fames eleifend varius ligula.";
        text = text.replaceAll("[\\.,\\n]+","");
        List<String> textStrings = new ArrayList<>(List.of(text.split(" ")));
        System.out.println(textStrings);

        Map<String,Integer> myMap = new HashMap<>();

        for(String word :textStrings){
            if(myMap.containsKey(word)){
                myMap.put(word, myMap.get(word) + 1);
            }else {
                myMap.put(word,1);
            }
        }

        System.out.println(myMap);

    }
}
