    import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>(); //Declaração e implementação

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("------------------------");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("------------------------");
        System.out.println("Index of Bob: "+ list.indexOf("Bob"));
        System.out.println("Index of Marco: "+ list.indexOf("Marco"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String string : result) {
            System.out.println(string);
        }

        System.out.println("------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
