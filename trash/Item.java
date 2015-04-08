public class Item {
    private String pants;
    private String color;
    private String stack   ;


    public Item(String Pants,String color,String stack) {
    super();
    this.pants = pants;
    this.color =color;
    this.stack= stack;
    }

    public String getPants() {
       return pants;
    }

    public void setPants(String pants){
        this.pants = pants;

    }

    public String getColor() {
       return color;
    }

    public void setColor(String color){
        this.color = color;

    }


    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;

    }

}
