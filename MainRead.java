import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainRead {
    private static final String LINE_SEPARATOR = System.lineSeparator();

      static String readFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder sb =new StringBuilder();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line= br.readLine())!=null) {
                sb.append(line).append(LINE_SEPARATOR);
            }
            return sb.toString();
        } catch (FileNotFoundException e){
            System.err.println(String.format(
            "ファイルが見つかりません:%s",fileName));
            return null;
        } catch (IOException e) {
           System.err.println(String.format(
           "ファイルの読み込みに失敗しました:%s",fileName));
           return null;
        } finally {
           closeSilently(br);
           closeSilently(fr);
        }

    }
    private static void closeSilently(AutoCloseable target) {
        if (target != null) {
            try {
                target.close();

            } catch (Exception e) {}
        }
    }
}

