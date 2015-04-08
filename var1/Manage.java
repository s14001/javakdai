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
import java.io.InputStreamReader;

public class Manage {

    public static List<Item> Read(String filename ) throws Exception{
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
                  rows.add(new Item(ary[0],ary[1],
                          Integer.parseInt(ary[2])));
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

    private static void closeSilentry(AutoCloseable target) {
        if (target !=null) {
            try {
                target.close();

            } catch (Exception e) {}

        }

    }



    static List<Item> Add(List<Item> list) throws Exception{
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);

        System.out.print("商品を追加しますか。yes or no:");
        String read = br.readLine();

        while (read.equals("yes")){

                System.out.print("商品:");
                String item =br.readLine();
                System.out.print("色:");
                String color =br.readLine();
                System.out.print("数量:");
                int stack =stdin.nextInt();

                list.add(new Item(item,color,stack));

                System.out.print("続けて追加しますか。yes or no:");

            }
            System.out.print("");
            return list;
      }


    static List<Item> Remove(List<Item> list)throws Exception {
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);



        System.out.println("どの商品を削除しますか");

        for (int i=1;i<list.size()+1;i++) {
            System.out.println((i+"番")+list.get(i-1).getPants());
        }

        String Line;
        System.out.println("終了する際はenterキーを押して下さい" );
        System.out.print("商品番号:");
        while (!(Line=br.readLine()).equals("")){

            int num =Integer.parseInt(Line);
            list.remove(num-1);
            System.out.print("商品番号");
        }
        System.out.println("");
        return list;
    }


    static List<Item> Rewrite(List<Item> list)throws Exception {
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);

        System.out.println("どの在庫を追加しますか");

        for(int i=0;i<list.size();i++){
            System.out.println((i+1+"番")+list.get(i).getPants()+
                               " 在庫数:"+list.get(i).getStack());
        }

        String Line;
        System.out.println("終了する祭はenterキーをおしてください ");

        System.out.print("在庫番号:");
        while (!(Line=br.readLine()).equals("")){
            int num =Integer.parseInt(Line);
            System.out.print("数量:");

            int stack=stdin.nextInt();
            list.get(num-1).setStack(stack);
            System.out.print("在庫番号:");
        }
           return list;
    }

}

