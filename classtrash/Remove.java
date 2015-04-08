import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Remove{
    static List<Item> rowremove(List<Item> listarray)throws Exception {
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);

        List<Integer> intArray=new ArrayList<>();

        List<Item> noRemoveList =listarray;


        System.out.println("商品を削除しますか:yes or no");
        String answer =br.readLine();

        if (answer.equals("yes")){
            System.out.println("どの商品を削除しますか");

            for(int i=0;i<listarray.size();i++){
                System.out.println((i+1)+listarray.get(i).getPants());

            }

            String Line;
            int i=0;
            while (!(Line=br.readLine()).equals("q")){
                System.out.println("終了する際はキーボードの q を押して下　　　　　　　　　さい" );

                if(Line.equals("")){
                    System.out.print(
                    "空の文字を入れないで下さい:");
                    Line =br.readLine();
                }


                int num =Integer.parseInt(Line);
                intArray.add(num);

                listarray.remove(intArray.get(i)-1);
                i++;

            }
                   return listarray;
            } else {
                   return  noRemoveList;
        }

    }

}



