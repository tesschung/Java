import java.io.*;

public class TextFileTest {
    public TextFileTest() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        // 텍스트 파일에서 파일 읽기
        try(BufferedReader in = new BufferedReader(
                new FileReader("test.txt"))) {
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }}
        catch (FileNotFoundException fe) {
            System.out.println("FileNotFoundException 발생");
            }
//        in.close(); // 자원해지

        // 파일 쓰기
        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt"))) {
            out.write("hello world");
        } catch (FileNotFoundException fe) {
        System.out.println("FileNotFoundException");
    }
//        out.close();
    }
}

