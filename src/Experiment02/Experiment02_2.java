//package Experiment02;
//
//import java.util.Scanner;
//public class Experiment02_2
//{
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        double m,x1,x2,a,b,c;
//        System.out.println("Please input a,b,c:");
//        int []u={1,2,5};
//        String jj="pp";
//        jj.
//            a = scan.nextInt();
//            b = scan.nextInt();
//            c = scan.nextInt();
//            m = (double)b * b - 4 * a * c;
//        if(a == 0)
//        {
//            if(b == 0)
//            {
//                if(c == 0)
//                    System.out.println("Infinite");
//                else
//                    System.out.println("No solution");
//            }
//            else
//            {
//                x1 = - c /(double)b+0;
//                x2=1;
//                System.out.printf("%.2f %.2f",x1+0,x2+0);
//             
//            }
//        }
//        else if(m < 0)
//            System.out.println("No solution");
//        else if(m == 0)
//        {
//            x1 = -b / (double)(2 * a)+0;
//            System.out.println(String.format("The answer is\n%.2f",x1));
//        }
//        else if(m>0){
//            x1 = (-b + Math.sqrt(m)) / (2 * a)+0;
//            x2 = (-b - Math.sqrt(m)) / (2 * a)+0;
//            if(x1 > x2)    
//                System.out.println(String.format("The answer is\n%.2f",x2) +" " + String.format("%.2f",x1));
//            else
//                System.out.println(String.format("The answer is\n%.2f",x1) +" " + String.format("%.2f",x2));
//        }
//         
//        
//    }
// 
//}