## Java Design Pattern




## 어댑터 패턴 (Adapter Pattern)
한 클래스의 인터페이스를 사용하고자 하는 *다른 인터페이스로 변환할 때* 주로 사용하며, 이를 이용하면 인터페이스 호환성이 맞지 않아 같이 쓸 수 없는 클래스를 연관 관계로 연결해서 사용할 수 있게하는 패턴



관계가 없는 인터페이스 간 같이 사용 가능

프로그램 검사 용이

클래스 재활용성 증가





***FormatAdapter.java***

```java
package adapter;

// MediaPlayer 인터페이스를 implements하는 FormatAdapter
public class FormatAdapter implements MediaPlayer {

   private MediaPackage media;
   
   public FormatAdapter(MediaPackage m) {
      media = m;
   }
   
   @Override
   public void play(String filename) {
      System.out.print("Using Adapter --> ");
      media.playFile(filename);
   }

}
```







```
package adapter;

public class Main {
   public static void main(String[] args) {
      
      MediaPlayer player = new MP3();
       player.play("file.mp3");
       
       player = new FormatAdapter(new MP4());
       player.play("file.mp4");
       
       player = new FormatAdapter(new MKV());
       player.play("file.mkv");
      
   }
}
```





```
package adapter;

public interface MediaPackage {
   
   void playFile(String filename);
   
}
```





```
package adapter;

public interface MediaPlayer {
   
   void play(String filename);
   
}
```



```
package adapter;

public class MKV implements MediaPackage{
   
   @Override
   public void playFile(String filename) {
      System.out.println("Playing MKV File " + filename);
   }
}
```



```
package adapter;

public class MP3 implements MediaPlayer{
   
   @Override
   public void play(String filename) {
      System.out.println("Playing MP3 File " + filename);
   }
}
```





```
package adapter;

public class MP4 implements MediaPackage{
   
   @Override
   public void playFile(String filename) {
      System.out.println("Playing MP4 File " + filename);
   }
}
```