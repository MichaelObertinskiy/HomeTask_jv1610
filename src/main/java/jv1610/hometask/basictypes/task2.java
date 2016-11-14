/*Задание 2 1. Используя числовые типы данных создать программу, которая рассчитывает:
●	длину окружности, площадь окружности, площадь кольца
●	периметр треугольника, площадь треугольника
●	периметр, площадь прямоугольника
*/
package jv1610.hometask.basictypes;

import static java.lang.Math.sqrt;

public class task2 {
    
    public static void main(String[] args) {
        double rad = 5.16;
        double rad2 = 2.3;
        double pi = 3.14;
        double h = 5;
        double a = 5, b = 6, c = 4;
        task21(rad, pi, rad2, h); 
        task22(a, b, c);
        task23(a, b);
    }
    
    public static void task21(double r, double p, double r2, double h){        
        double lenCir, s, s2;
        lenCir = (r * p) * 2;
        r = r/100;
        s = (r*r)*p;
        s2= p*((r*r)-(r2*r2));         
        System.out.println("Длинна окружности = " + lenCir + " см");
        System.out.println("Площадь круга = " + r + " m2");
        System.out.println("Площадь кольца = " + s2 + " m2");        
    }
    
    public static void task22(double a, double b, double c){
        double s , p;
        p = a+b+c;
        s = (sqrt(p*(p-a)*(p-b)*(p-c)))/10000;
        System.out.println("Периметр треугольника = " + p + " cm");
        System.out.println("Площадь треугольника = " + s + " m2");
                
    }
    
    public static void task23(double a, double b){
        double p, s;
        p = 2*(a+b);
        s = a*b;
        System.out.println("Периметр прямоугольника = " + p + "cm");
        System.out.println("Площадь прямоугольника = " + s/10000 + "m2");
        
    }    
}
