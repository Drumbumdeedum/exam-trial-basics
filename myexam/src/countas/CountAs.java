package countas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {

  public static void main(String[] args) {

    System.out.println("Occurrences of \"a\" in afile.txt: " + countA("afile.txt"));
    System.out.println("Occurrences of \"a\" in not-a-file.txt: " + countA("not-a-file.txt"));
  }

  public static int countA(String inputFilename) {
    int numberOfAs = 0;

    Path listPath = Paths.get("assets/" + inputFilename);
    try {
      List<String> lines = Files.readAllLines(listPath);

      for (String line: lines) {
        for (int i=0; i < line.length(); i++) {
          if (line.substring(i, i+1).equals("a") || line.substring(i, i+1).equals("A")) {
            numberOfAs ++;
          }
        }
      }
    } catch(Exception e) {
      return 0;
    }
    return numberOfAs;
  }
}
