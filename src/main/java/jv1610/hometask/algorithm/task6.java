/*
Задание 6.
    Используя циклические конструкции и массивы создать “рваный массив” 
    треугольной формы, реализовать вывод данного массива в виде треугольника в консоль. 
    Реализовать методы, отражающие данный “треугольник”
    ●	по горизонтали
    ●	по вертикали
    ●	по горизонтали и вертикали одновременно

*/
package jv1610.hometask.algorithm;

public class task6 {
    static int array6[][] = new int [5][5];
    public static void main(String[] args) {
        arrayFill(array6);        
    }   
    
    public static void arrayFill(int array6[][]) {
        for (int[] array61 : array6) {
            for (int i = 0; i<array6.length; i++) {
                array61[i] = task4.rand(9);
            }
        }        
        showArrayHorizontal(array6);
        showArrayVertical(array6);
        showArrayHorizontalVertical(array6);
    }
    
    public static void showArrayHorizontal(int array6[][]){
        for (int j=0; j<array6.length; j++) {
            for (int i=0; i<=j; i++) {
                System.out.print(array6[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void showArrayVertical(int array6[][]){
        for (int j=0; j<array6.length; j++) {
            for (int i=0; i<(array6.length-j); i++) {
                System.out.print(array6[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");    
    }
    
    public static void showArrayHorizontalVertical(int array6[][]){
        for (int j=0; j<array6.length; j++) {
            for (int i=0; i<=j; i++) {
                System.out.print(array6[j][i] + " ");
            }
            System.out.println("");
        }        
        for (int j=0; j<array6.length; j++) {
            for (int i=0; i<(array6.length-j); i++) {
                System.out.print(array6[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
