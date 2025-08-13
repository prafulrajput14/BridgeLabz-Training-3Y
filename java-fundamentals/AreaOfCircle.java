package BridgeLabz;

import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle :" + area);
    }
}
