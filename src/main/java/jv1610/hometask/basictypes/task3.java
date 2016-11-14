/*Задание 3 1. Используя данные задания 2 создать программу, которая рассчитывает:
●	объем цилиндра объем полого цилиндра площадь боковой поверхности цилиндра (не полого)
●	объем шара, площадь поверхности шара
●	объем, площадь поверхности прямоугольного параллелепипеда
●	объем, площадь поверхности тетраедра 
*/
package jv1610.hometask.basictypes;

public class task3 {
    public static void main(String[] args) {
        double h = 5;
        double rad = 100;
        double rad2 = 90;
        double pi = 3.14;
        double a = 10, b = 8, c = 7;
        task31(h, rad, pi, rad2);
        task32(rad, pi);
        task33(a, b, c);        
    }
    
    public static void task31(double h, double r, double p, double r2){
        double sLater;
        sLater = (2*p*r*h)/10000;
        System.out.println("Объем цилиндра  = " + ((p*r*r*h))/10000 + " m3");
        System.out.print("Объем полого цилиндра = " + ((2*p*((r*r)-(r2*r2))))/10000);
        System.out.println(" m3");
        System.out.println("Площадь боковой поверхности цилиндра = " + sLater + " m2");
    }
    
    public static void task32(double r, double p){
        double s;
        double v;
        r = r/100;
        s = 4*p*(r*r);
        v = (4*p*(r*r*r))/3;
        System.out.println("Площадь шара = " + s + " m2");
        System.out.println("Объем шара = " + v + " m3");
    }
    
    public static void task33(double a, double b, double c){
        double s, v;
        a = a/100; 
        b = b/100;
        c = c/100;
        s = 2*a*b+b*c+c*a;
        v = a*b*c;
        System.out.println("Площадь паралелипида = " + s + " m2");
        System.out.println("Объем паралелипида = " + v + " m3");        
    }

}
