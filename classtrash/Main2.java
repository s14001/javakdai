import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class Main2 {
    public static void main(String[] args) throws Exception {
        List<String> Elm =new ArrayList<>();
        List<String> Row =new ArrayList<>();
        List<Item> col =new ArrayList<>();


        Scanner stdin =new Scanner(System.in);

        BufferedReader reader = new BufferedReader(
        new FileReader("data"));
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));


        System.out.println(
        "\n"+MainRead.readFromFile( "./data"));

        String Line;
        int i=0;//行数
        while ((Line=reader.readLine())!=null){
     //       Row.add(Line);
     //       System.out.println(Line);
            String[] ary=Line.split(" ");

           for(int index=0;index<ary.length;index++){
              Elm.add(ary[index]);
           }
            i++;
        }






        int count=0;
        int size=Elm.size()/(i);
        String[][]doubleary=new String[i][size];

        for (int out=0; out<i; out++) {
            for(int in=0; in<size; in++) {
                doubleary[out][in] =Elm.get(count);
     //         System.out.println(out+""+in+" "+doubleary[out][in]);
                count++;
            }
        }


         //数量書き換え



        for (int j=1; j<i; j++ ) {

            System.out.print(doubleary[j][0]+"の数量を入力してください");
            int Num = Integer.parseInt(doubleary[j][2]);
            int num = stdin.nextInt();
            if ((Num+num) >= 0) {
                Num+=num;
            }
                doubleary[j][2]=String.valueOf(Num);
            //  System.out.println(doubleary[j][2]);
        }

         //商品削除
         System.out.print("商品を削除しますか:Yes or No");
         String q =br.readLine();
         int gyo=-1;
            if (q.equals("Yes")){
                for (int z=1; z<i; z++){
                   System.out.println((z)+"番"+doubleary[z][0]);
                }
                System.out.print("何番を削除しますか?");
                gyo=stdin.nextInt();
            }


         //商品追加
         System.out.print("商品追加しますか? yes or no:");
         String b=br.readLine();
         while (b.equals("yes")){
             System.out.println("商品追加");
             System.out.print("商品");

             String Item=br.readLine();

             System.out.print("色");
             String color=br.readLine();

             System.out.print("数量");
             String stack=br.readLine();

             Row.add(Item+" "+color+" "+stack);
             System.out.print("続けて追加しますか? yes or no");
             b=br.readLine();
         }


         try {
            FileWriter fw = new FileWriter("data");
            for (int out=0; out<i; out++){
                for (int in=0; in<size; in++) {
                   if (out == (gyo)){
                    continue;
                    }
                    fw.write(doubleary[out][in]+" ");
                }
                if (out == (gyo)) {
                     continue;
                }
                fw.write("\r\n");
            }
            for (int ins=0;ins<Row.size();ins++){
              fw.write(Row.get(ins)+"\r\n");
            }
            fw.close();
         } catch(Exception e) {
               System.out.println("書き込めませんでした");
         }

             reader.close();

        System.out.println(
        "\n"+MainRead.readFromFile( "./data"));
    }

}



    // data dat=new data();
    //   dat.run();

    //        System.out.println(Foods.get(0));
    //      Foods.remove(0);

//   for(int ind=0 ;ind<ary.length;ind++){
  //                 System.out.println(ind+"  "+ary[ind]);
    //      }

/*      for(int index=0 ;index<Elm.size();index++){
                     ary= Elm.get(index).split(" ");
             System.out.println(ary[index]);
        }

     Item goods =new Item("skiny","black",1);


       b= new String[Elm.size()][ary.length];

        for(int index=0;index<Elm.size();++index){
            for(int i=0;i<ary.length;++i){
                b[index][i]=ary[i];
              System.out.println(index +"  "+i+b[index][i]);

              System.out.println("  "+i+"  "+ary[i]);
            }
         }





   for(int in=0;in<b.length;in++){
            Elm.add(b[in]);
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

