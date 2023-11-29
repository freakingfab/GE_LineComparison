package com.bridgelabz.linecomparison;

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
//    @params: com.bridgelabz.linecomparison.LineComparison l1,l2
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
}
