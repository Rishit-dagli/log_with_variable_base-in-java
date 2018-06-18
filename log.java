import java.lang.Math;
import java.util.*;
/**
 * Write a description of class log here.

 * This code is written to perform a log operation without using in built log function using for loop.
 
 * @author (Rishit Dagli) 
 * @version (18-06-2018)
 */
public class log
{
     public static void main() {
        double x,y,a;
        a=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        x=z.nextDouble();
        System.out.println("enter the base");
        y=z.nextDouble();
        for(double j=0;(Math.pow(y,j))!=x;j+=0.1){
           if(Math.pow(y,j)>x){
               a=j;
               break;
            }
        }
        System.out.println(a);
    }
}
