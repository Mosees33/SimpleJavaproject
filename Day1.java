class Day1
{
    int item=87;
    String name="Banana";
    float price=5.9f;
    public static void main(String[] args)
    {
        Day1 day = new Day1(23,"Mosees",7.9f);
       // Day1 date = new Day1();
        day.meth();
       // System.out.println(this.item);

    }
    Day1()
    { 
       /* this.item=item;
        this.name=name;
        this.price=price;*/

        System.out.println(this.item);
        System.out.println(this.name);
        System.out.println(this.price);
        
    }

    Day1(int id,String name,float price)
    {
        this.item=id;
    System.out.println(id);
    }

    public void meth()
    {
        System.out.println(item);
        System.out.println(name);
    }
}