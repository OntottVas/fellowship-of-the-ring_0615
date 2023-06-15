import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FellowShipOfTheRing {
    public static void main(String[] args) {
       // TODO
        Set<String> dwarves = new HashSet<>(List.of("Gimli"));

        Set<String> elves = new HashSet<>(List.of("Legolas"));

        Set<String> humans = new HashSet<>(Arrays.asList("Aragorn", "Boromir"));

        Set<String> hobbits = new HashSet<>(List.of("Frodo", "Sam", "Merry", "Pippin"));

    }
}
