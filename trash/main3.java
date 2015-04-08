import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class main2 {
    public static void main(String[] args) throws Exception {
        List<String> Pants =new ArrayList<>();
        List<String> Row =new ArrayList<>();

        BufferedReader reader = new BufferedReader(
        new FileReader("datasorse"));


        Item goods =new Item("skiny","black",1);
         int i=0;
        String Line;
        String[][] b;
        while ((Line=reader.readLine())!=null){
            String[] array=Line.split(" ");
              Row.add(array[i]);

         //  for (int in=0;in<b.length;++in) {
           //   System.out.println(b[in]);}

            }

                    //       String a =Row.get(1);
     // for(int v=0;v<Row.size();v++ ) {
     //   System.out.println(Row.get(v)=2);}
       //     for (int e=0;e<st.length;e++) {
           //       System.out.println(st[e]);
             // }
               String [] sp= Row.get(1).split(" ");
                 for(int c=0;c<sp.length;c++){
                System.out.println(sp[c]);}
              reader.close();

//        System.out.println(Pants);






    }
}



    // data dat=new data();
    //   dat.run();

    //        System.out.println(Foods.get(0));
    //      Foods.remove(0);



/*
    for(int in=0;in<b.length;in++){
            Row.add(b[in]);
         }

  import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

   final String fileName="datasors";
        final String content ="abc";



        if (writeToFile(fileName,content)) {
            System.out.println(String.format(
                        "ファイルの書き込みに成功しました:%s",fileName));
        } else {
            System.out.println(String.format(
                        "ファイルの書き込みに失敗しました:%s",fileName));
        }

    }

    private static boolean writeToFile(String fileName,String context){
        File file = new File(fileName);
        try (
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
            ) {
            pw.println(context);
            return true;

        } catch (IOException e) {
            return false;
        }
    }*/

