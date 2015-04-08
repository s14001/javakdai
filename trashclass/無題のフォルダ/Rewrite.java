import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;

public class Rewrite {
    static List<Item> stack(List<Item> listarray)throws Exception {
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);
        List<Integer> intArray=new ArrayList<>();

        List<Item> noChangeStack =listarray;

        System.out.println("商品の在庫数を変えますか?:yes or no");
        String answer =br.readLine();
        if (answer.equals("yes")){
            System.out.println("どの商品をですか");

            for(int i=0;i<listarray.size();i++){
                System.out.println((i+1)+listarray.get(i).getPants()+
                                   " 在庫数:"+listarray.get(i).getStack());

            }

            String Line;
            int i=0;
            System.out.print("もし終了する祭はキーボードの qをおしてください ");
            while (!(Line=br.readLine()).equals("q")){
                 while(Line.equals("")){
                System.out.print("空の文字を入れないで下さい");
                   Line =br.readLine();
                }

                int num =Integer.parseInt(Line);
                System.out.print("数量:");
                int stack=stdin.nextInt();

                intArray.add(num);
                listarray.get(intArray.get(i)-1).setStack(stack);
                i++;
            }
               return listarray;
        } else {
               return  noChangeStack;
        }

    }

}





