public class OopsConstructors {
    public static void main(String[] args) {
        Pen p = new Pen("classmate");  // this is called user defined constructor  if blank Pen() then java defined constructor
        System.out.println(p.pen_name);
        Pen s = new Pen(12);
        System.out.println(s.tip_size);
        Pen sq = new Pen();        // if blank then can write sysout inside class also

    }
    
}

class Pen 
{
    String pen_name;
    int tip_size;
    float price;
    Pen(String pen_name)              //user-defined constructor
    {
        this.pen_name = pen_name;       //use this in constructor also
    }
    Pen (int tip_size)
    {
        this.tip_size = tip_size;   // this calls the object within func
    }
    Pen ()                             // don't use any parameters here
    {
        System.out.println("123");
    }
}
