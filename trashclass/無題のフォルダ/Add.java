import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Add{
    static List<Item> listAdd(List<Item> listadd)throws Exception {
        BufferedReader br =new BufferedReader(
        new InputStreamReader(System.in));
        Scanner stdin =new Scanner(System.in);
        List<Item> listNoadd =listadd;

        System.out.print("商品を追加しますか。yes or no:");
        String read = br.readLine();
        if (read.equals("yes")){
            while (read.equals("yes")){

                System.out.print("商品:");
                String item =br.readLine();
                System.out.print("色:");
                String color =br.readLine();
                System.out.print("数量:");
                int stack =stdin.nextInt();
                listadd.add(new Item(item,color,stack));

                System.out.print("続けて追加しますか。yes or no:");


                read =br.readLine();
                if(read.equals("no")){
                  return listadd;
                }
            }
            return listadd;
        } else {
            return listNoadd;
        }


    }


}
