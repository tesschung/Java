import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A", 11));
        list.add(new Student("B", 12));

        Stream<Student> studentParallelStream = list.parallelStream();
        studentParallelStream.forEach(myPerson -> {
            System.out.println(myPerson.getName() + ' ' +Thread.currentThread().getName());
        });



        Stream<Student> studentStream = list.stream();
        studentStream.forEach(myStudent ->
        {
            String name = myStudent.getName();
            int age = myStudent.getAge();
            System.out.println(name +"모씨는 "+ age+"살입니다.");
            LambdaExpressionExample.print(name);
        });

        double avg = list.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println(avg);


    }

    private static void print(String name) {
        System.out.println(name);
    }
}
