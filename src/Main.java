import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> originalList = List.of(1, 2, 3);
        double percentToKeep = 0.1;
       originalList.stream().map(x->x*percentToKeep).forEach(System.out::println);

    }
}