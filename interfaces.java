public class interfaces {
    public static void main(String[] args) {
        King k = new King();
        k.walks();
        Queen q = new Queen();
        q.walks();
    }
}
interface Chessplayers
{
    void walks();     //blueprint for classes
}
class Queen implements Chessplayers
{
  public  void walks()        //imp to write public under interface otherwise error
    {
        System.out.println("moves left,right,dia,up,down");

    }
}
class King implements Chessplayers
{
    public void walks()
    {
    System.out.println("moves left,right,up,front,dia(1 step)");
    }
}
class Rook implements Chessplayers
{
    public void walks()
    {
        System.out.println("moves upr,neeche");
    }
}
