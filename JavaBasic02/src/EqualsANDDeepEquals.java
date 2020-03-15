import java.util.Arrays;
import java.util.Objects;

import static java.lang.System.gc;
import static java.lang.System.setOut;

public class EqualsANDDeepEquals {
    public static void main(String[] args) {

        long start = System.nanoTime();

        Integer[] a = {1, 2};
        Integer[] b = {1, 2};
        Integer[] c = null;

        System.out.println(Arrays.deepEquals(a, b)); // true
        System.out.println(Objects.deepEquals(a, b)); // true

        System.out.println(Objects.isNull(a)); // false
        System.out.println(Objects.isNull(b)); // false
        System.out.println(Objects.isNull(c)); // true

        System.out.println(Objects.nonNull(c)); // false
        System.out.println(Objects.nonNull(a)); // true

        System.out.println(Objects.toString(a));
        System.out.println(Objects.toString(a, "null 입니다."));
        System.out.println(Objects.toString(c, "null 입니다."));

        System.out.println(c);

        long end = System.nanoTime();

        System.out.println((end-start)+ " 소요됨");

        System.out.println(System.getProperty("os.name"));
    }
}
