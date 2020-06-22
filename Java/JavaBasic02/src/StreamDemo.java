import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "2000"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.map(l -> l)
                .forEach(System.out::println);

        Optional<Integer> intD = Optional.of(1);
        int data = intD.orElse(0);
        System.out.println(data);


//        Path p = Paths.get("/home", "kim", "myapp.properties");

    }
}
