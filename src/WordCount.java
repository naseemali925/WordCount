/**
 * Created by Ojasvi on 27-01-2018.
 */

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[]args)throws Exception{
        File file=new File("pg30127.txt");
        Scanner scanner=new Scanner(file);
        int words=0;
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            words+=countWordsUsingSplit(line);
        }

      System.out.println("The file contains: "+words+" words.");
    }
    
     public static int countWordsUsingSplit(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    String[] words = input.split("\\s+");
    return words.length;
  }

}
