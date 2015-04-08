import java.util.*;
import java.io.*;

//簡素化
//クラスが多すぎる　read remove  add  rewriteを　メソッドにして クラスを一つに
//Listを一つ使う
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(
                           new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new FileReader("./data"));
        String firstLine=reader.readLine();
        String firstcol =firstLine;

        System.out.println("\n"+MainRead.readFromFile( "./data"));

        //読み込み
        List<Item> list = new ArrayList<>();
        list =Read("./data");


        //削除
        System.out.println("どの商品を削除しますか(複数選択可)");

        for (int i=1;i<list.size()+1;i++) {
            System.out.println((i+"番")+list.get(i-1).getPants());
        }
        System.out.println("");

        System.out.println("終了する際はEnterキーを押して下さい" );
        String Line;

        int count=0;
        System.out.print("商品番号");
        while (!(Line=br.readLine()).equals("")) {
            int num =Integer.parseInt(Line);

            if (count==0&& list.size()==num){  //降順
                list.remove(num-(count+1) );
                count=0;
            } else if ((num-(count+1)<0)) {   //順不動
                list.remove(num-(count));
                count++;
            } else {
                list.remove(num-(count+1));  //昇順
                count++;
            }
            System.out.print("商品番号");
        }
        System.out.println("");

        //追加
        System.out.print("商品を追加しますか。yes or enter:");
        String read = br.readLine();
        while  (read.equals("yes")) {

             System.out.print("商品:");
             String pants=br.readLine();
             if(!checkstr(pants)){
               System.out.println("数字を入力しないで下さい");
                 continue;

             }

             System.out.print("色:");
             String color=br.readLine();
             if(!checkstr(color)){
               System.out.println("数字を入力しないで下さい");
                 continue;
             }
             System.out.print("数量:");
             int stack =stdin.nextInt();

             list.add(new Item(pants,color,stack));

             System.out.print("続けて追加しますか。yes or no:");
             read =br.readLine();

             if (read.equals("")||read.equals("no")){
                break;
             }
        }
        System.out.println("");


       //在庫増減
        System.out.println("どの商品の在庫数を増減しますか");
        for (int i=0;i<list.size();i++) {
            System.out.println((i+1+"番")+list.get(i).getPants()+
                               " 在庫数:"+list.get(i).getStack());
        }
        System.out.println("");

        System.out.println("終了する祭はenterキーをおしてください ");

        System.out.print("商品番号:");
        while (!(Line=br.readLine()).equals("")){
            int num =Integer.parseInt(Line);

            System.out.print("数量:");
            int stack=stdin.nextInt();
            list.get(num-1).setStack(stack);

            System.out.print("商品番号:");
        }

        //書き込み
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

    //読み込みのメソッド
    public static List<Item> Read(String filename ) throws Exception{
        List<Item> list=new ArrayList<Item>();

        File file =new File(filename);

        FileReader fr =null;
        BufferedReader br =null;
        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String Line;

            br.readLine();                              //最初の行の読み込み
            while ((Line=br.readLine())!=null) {
                  String[] ary=Line.split(" ");
                  list.add(new Item(ary[0],ary[1],
                           Integer.parseInt(ary[2])));
            }
            return list;

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

    private static boolean checkstr(String string){
       try{
                          Integer.parseInt(string);
                          return false;
              } catch (NumberFormatException nfex){
                                          return  true;

                                       }

     }


}


/*

  } else if(pants.length()>10){
             System.out.println("１０文字以内にしてください");
                 continue;
*/
