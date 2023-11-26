import java.util.Scanner;
public class LineComparison {
    private int x1,y1;
    private int x2,y2;

//    @desc: Constructor for the class
//    @params: int x1,y1,x2,y2
    public LineComparison(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

//    @desc: It will calculate length of line
//    @return: double
    public double lengthLine(){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

//    @desc: it provides comparison between two lines
//    @params: LineComparison l1,l2
//    @return: int
    public int compareTo(LineComparison line2){
        double len1= this.lengthLine();
        double len2= line2.lengthLine();
        if(len1==len2){
            return 0;
        }
        else if(len1>len2){
            return 1;
        }
        else{
            return 2;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input for Line 1");
        System.out.print("Enter x1, y1: ");
        int x1l1 = input.nextInt(), y1l1= input.nextInt();

        System.out.println("Input for Line 1");
        System.out.print("Enter x2, y2: ");
        int x2l1 = input.nextInt(), y2l1= input.nextInt();

        LineComparison line1= new LineComparison(x1l1,y1l1,x2l1, y2l1);

        System.out.println("Input for Line 2");
        System.out.print("Enter x1, y1: ");
        int x1l2 = input.nextInt(), y1l2= input.nextInt();

        System.out.println("Input for Line 2");
        System.out.print("Enter x2, y2: ");
        int x2l2 = input.nextInt(), y2l2= input.nextInt();

        LineComparison line2= new LineComparison(x1l2,y1l2,x2l2, y2l2);

        int val= line1.compareTo(line2);

        if(val==0){
            System.out.println("Both Lines are equal");
        }
        else if(val==1){
            System.out.println("Line 1 is greater");
        }
        else{
            System.out.print("Line 2 is greater");
        }
    }
}
