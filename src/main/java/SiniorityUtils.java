import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SiniorityUtils {
    public static void main(String[] args) {
        List<Developer> developers = asList(new Developer("Igor", 10000), new Developer("Itay", 20000),
                new Developer("Anna", 30000));
        Map<Integer, List<Developer>> collect = developers.stream().collect(Collectors.groupingBy(Developer::getSalary));
        Map<Siniority, List<Developer>> collect1 = collect.entrySet()
                .stream()
                .collect(Collectors.toMap(k -> Siniority.findBySalary(k.getKey()), v -> v.getValue()));

        System.out.println(collect1);
    }
}
