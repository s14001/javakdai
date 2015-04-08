import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

//簡素化
//クラスが多すぎる　read remove  add  rewriteを　メソッドにして クラスを一つに
//Listを一つ使う
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("data"));
        String Line=reader.readLine();
        String firstcol =Line;
        reader.close();

        System.out.println("\n"+MainRead.readFromFile( "./data"));

        List<Item> list = new ArrayList<>();
        list = Manage.Read("./data");
        list = Manage.Add(list);
        list = Manage.Remove(list);
        list = Manage.Rewrite(list);

        try {
            FileWriter fw = new FileWriter("database");
            fw.write(firstcol+"\r\n");

            for (int i=0;i<list.size(); i++){
                fw.write(list.get(i).getPants()+" "+
                         list.get(i).getColor()+" "+
                         list.get(i).getStack()+"\r\n");
            }
                  fw.close();
         } catch (Exception e) {
               System.out.println("書き込めませんでした");
         }

         System.out.println( "\n"+MainRead.readFromFile( "./database"));

    }

}


