public class Item {
    private final String pants;
    private final String color;
    private int stack;


    public  Item(String pants,String color,int stack) {
    super();
    this.pants = pants;
    this.color = color;
    this.stack = stack;
    }

    public   String getPants() {
      //  if(!checknum(pants)) {
       // return "Error数字を入力ないでください";
       // }else if(pants.length()>10){
         //   return "10文字以内にしてください";
        //}else{
        return pants;
        //}
    }

    public String getColor() {
       return color;
    }


    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        int sum =stack+getStack();
        if (sum >= 0 && sum <= 1000) {
        this.stack = stack+getStack();
        } else {
            System.out.println("在庫数は０以上にするようにして下さい");
            return;
        }
    }


 public static boolean checkstr(String string){
        try{
                    Integer.parseInt(string);
                    return false;
        } catch (NumberFormatException nfex){
                             return  true;

                          }

      }

}








/*
    public void setPants(String pants){
        this.pants = pants;

    }

    public void setColor(String color){
        this.color = color;

    }



*/
