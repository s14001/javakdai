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
       return pants;
    }

    public String getColor() {
       return color;
    }


    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        int sum =stack+getStack();
        if(sum>=0||sum<=1000){
        this.stack = stack+getStack();
        } else {
            return;
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
