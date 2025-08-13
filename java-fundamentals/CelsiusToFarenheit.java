package BridgeLabz;

import java.util.*;
public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cels = sc.nextInt();
        int farenheit = (cels * 9 / 5) + 32;
        System.out.println("Temperature in Farenheit :" + farenheit);
    }
}
