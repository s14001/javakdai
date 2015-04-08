import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {
        List<String> Pants =new ArrayList<>();
        List<String> Row =new ArrayList<>();

        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(
        new FileReader("datasorse"));

          //  String type = br.readLine();
        //   System.out.println("この商品は"+type+"です");


        Item goods =new Item("skiny","black",1);

        String array = br.readLine();

       // for(int d=0 ;d<array.length;d++){
         //   Pants.add(array[d]);
       // }
        String line;
        int i=0;
        while((line=reader.readLine())!=null){
               Row.add(line);
           String a [] =  Row.get(i).split(" ");

                for(int b=0;b<a.length;b++){
                        System.out.println(a[b]);
                }

               ++i;

        }

      // System.out.println(Row.get(1));
      //  reader.close();

    //    System.out.println(Pants);

//        goods.setPants(array[0]);
//        goods.setColor(array[1]);



 //       System.out.println(goods.getPants()+" "+goods.getColor()+" "+goods.getKazu());
        //}


    }
}



    // data dat=new data();
    //   dat.run();

    //        System.out.println(Foods.get(0));
    //      Foods.remove(0);



/*
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

