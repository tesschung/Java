import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        LilicReader reader = new LilicReader();
        try {
            reader.doJob();
        } catch (BizException e) {
            System.out.println(e);
        }
    }
}
