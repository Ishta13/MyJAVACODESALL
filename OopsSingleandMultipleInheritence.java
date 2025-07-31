public class OopsSingleandMultipleInheritence {
    public static void main(String[] args) {
        Bird nw = new Bird();
        nw.wings = 12;
        System.out.println(nw.wings);
        peacock ps = new peacock();
        ps.name("PEACOCK");   // even child class can call parent class 
        System.out.println(ps.birdName); //if single input inside func then use ps.input otherwise if more than one input directly print
        ps.colour("red");                 //sysout(ps.function(a,b,c))
        System.out.println(ps.colorname);
    }       // """"""""""""""""""""if using *this* keyword try to do this format only if parent and child class using and take only one argument in func"""""""""""""""""""""
   
// basically parent child class wale case me ese hi format me likho
    
}
class Bird
{
    int wings;
    String birdName;
    void name(String birdName)
    {
        this.birdName = birdName;
    }
}
class peacock extends Bird{
    String colorname;
    void colour(String colorName)
    {
        this.colorname = colorName;    //ye colourname same as func colorName

    }
}