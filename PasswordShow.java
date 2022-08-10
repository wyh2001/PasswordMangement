import java.io.*;
import java.nio.charset.StandardCharsets;

public class PasswordShow {

  public static void show() throws IOException {
    File file = new File("password.csv");
    InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file),
        StandardCharsets.UTF_8);
    System.out.println("Your stored passwords are below:");
    System.out.println("==============SHOW==============");
    System.out.println("Webisite\tUsername\tPassword");
    String content;
    BufferedReader bufferedReader = new BufferedReader(streamReader);
    while ((content = bufferedReader.readLine()) != null) {
      String[] str = content.split(",");
      System.out.println(str[0] + " " + str[1] + " " + str[2]);
    }
  }
}
