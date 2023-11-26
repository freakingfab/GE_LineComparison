import java.util.Scanner
public class LineComparison {
    private int x1,y1;
    private int x2,y2;

//    @desc: It will calculate length of line
//    @return: double
    public double lengthLine(){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

}
