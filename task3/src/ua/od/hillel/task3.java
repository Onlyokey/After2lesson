package ua.od.hillel;

public class task3 {

public static void main(String[] args) {
int boom = 4356;
System.out.println(cymma(boom));
}
public static int cymma(int number){
int a,b,c,d;
a = number/1000;
b = (number -(a*1000))/100;
c = ((number -(a*1000)) -(b*100))/10;
d = (number -(a*1000)) -(b*100) -(c*10);
int cymma = a+b+c+d;
return cymma;
}
}