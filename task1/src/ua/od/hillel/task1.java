package ua.od.hillel;

public class task1 {

public static void main(String[] args) {
int speed = 32;   // km/hour
int time = 5;      // hour
System.out.println(distance(speed,time));
}
public static int distance(int speed,int time) {
int result = speed * time;
return result;
}
}