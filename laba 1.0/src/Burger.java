
public class Burger extends Food
{
    private String size = null;
    public Burger()
    {
        super("Burger");
    }
    public Burger(String size)
    {
        super("Burger");
        this.size = size;
    }

    public String getSize()  //Getter
    {
        return size;
    }
    public void setColor(String size)  //Setter
    {
        this.size = size;
    }

    @Override
    public void consume()
    {
        System.out.println(this + " eaten");
    }

    public String toString() {
        return super.toString() + " размера '" + size + "'";
    }
}
