import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;


public class Manage {
    public static List<Item> fileRead(String filename) throws Exception{
        List<Item> rows=new ArrayList<Item>();

        File file =new File(filename);

        FileReader fr =null;
        BufferedReader br =null;
        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String Line;
//            int i=0;

                  br.readLine();
            while ((Line=br.readLine())!=null) {
                  String[] ary=Line.split(" ");
                  //elm.add(ary);
                  rows.add(new Item(ary[0],ary[1],Integer.parseInt(ary[2])));
                 // i++;
            }

            return rows;

        } catch (FileNotFoundException e){
            return null;
        } catch (IOException e) {
            return null;
        } finally {
            closeSilentry(br);
            closeSilentry(fr);
        }

    }


    public static String firstrow(String file) throws Exception{
        BufferedReader reader = new BufferedReader(
                             new FileReader("data"));
        String Line=reader.readLine();
        String firstlist =Line;
        reader.close();

        return firstlist;
    }


   private static void closeSilentry(AutoCloseable target) {
        if (target !=null) {
            try {
                target.close();

            } catch (Exception e) {}

        }

    }

}

