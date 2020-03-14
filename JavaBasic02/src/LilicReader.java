import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LilicReader {
    public void doJob()  {
        Path path = Paths.get("tes.txt");
        // Scanner이라는 생성자에서 IOException발생하므로
        // 예외 처리를 해야한다.

        // try-exception-resource
        try(Scanner in = new Scanner(path, "UTF-8")) { // 자원을 해제할때 문제가 생기는 try-catch
            in.useDelimiter("\n");
            while (in.hasNext()) {
                System.out.println(in.next());
            }
            // 반드시 in.close()를 해줘야 한다.
            // 그래야 다른 파일에서 파일을 사용할 수 있기 때문이다.
           // in.close();
        } catch (IOException ie) {
            // 정상적으로 종료
//            System.out.println("error occured");
             throw new BizException("파일이 없습니다.", ie);
        }
    }
}
