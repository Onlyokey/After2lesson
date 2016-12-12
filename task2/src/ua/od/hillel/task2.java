package ua.od.hillel;

import java.util.Scanner;
public class task2 {

        public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
double a,b;
System.out.println("input first cathetus");
a = scn.nextDouble();
System.out.println("input second cathetus");
b = scn.nextDouble();
System.out.println("square =" + square(a,b));
System.out.println("perimetr =" + perimeter(a,b));
}
      public static double square(double cathetus1,double cathetus2) {
double result = (cathetus1 * cathetus2)* 0.5 ;
return result;
}
      public static double perimeter(double cathetus1,double cathetus2) {
double cathetus3 = (double) Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2));
double result = cathetus1 + cathetus2 + cathetus3;
return result;
}
}