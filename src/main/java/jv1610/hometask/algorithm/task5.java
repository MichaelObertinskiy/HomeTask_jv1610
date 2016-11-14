/*
Задание 5
    Создать двумерный массив m на n элементов, заполнить его случайными числами. 
    Реализовать методы, позволяющие:
    ●	распечатать массив в прямом и обратном порядке
    ●	для каждой четной строки вывести все четные элементы массива
    ●	для каждого нечетного столбца вывести все нечетные элементы массива
    ●	сумму всех элементов, кратных 7 в четных строках
    ●	произведение элементов, кратных 3 в нечетных строках
*/
package jv1610.hometask.algorithm;

import java.util.Arrays;


public class task5 {
    int array5[][] = new int [10][10];   
    public static void main (String[] args){
        int array5[][] = new int [10][10];
        System.out.println("Двумерный массив");
        array5(array5);   
        System.out.println("Сортировка двумерного массива по возрастанию");
        sortArrayUp(array5); 
        System.out.println("Сортировка двумерного массива по убыванию");
        sortArrayDown(array5);
        System.out.println("Четные элементы в четных строках");
        elementEven(array5,2,0);
        System.out.println("Нечетные элементы в нечетных столбцах");
        elementOdd(array5,2,0);
        System.out.println("Сумма элементов кратных 7-ми в четных строках");
        elementSumEven(array5,7);
        System.out.println("Произведение элементов кратных 3-м в нечетных строках");
        elementCompositionOdd(array5,3);
    } 
    
    public static void array5(int array5[][]){
        for (int[] array51 : array5) {
            for (int i = 0; i<array5.length; i++) {
                array51[i] = task4.rand(9+1);
            }
        }
        showArray1(array5);
    }
    
    public static void showArray1(int array[][]){
        for (int[] array1 : array) {
            for (int y = 0; y<array.length; y++) {
                System.out.print((array1[y]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void sortArrayUp(int array5[][]){        
        for (int [] array51 : array5){
            for (int[] array52 : array5) {
                Arrays.sort(array51);
            }
        }
        showArray1(array5);
    }
    
    public static void sortArrayDown(int array5[][]){ 
        int temp;
        for (int[] array51 : array5) {
            for (int j = array5.length-1; j>0; j--) {
                for (int n = 0; n<j; n++) {
                    if (array51[n] < array51[n+1]) {
                        temp = array51[n];
                        array51[n] = array51[n+1];
                        array51[n+1] = temp;
                    }
                }
            }
        }
        showArray1(array5);
    }
    
    public static void elementEven(int array5[][],int x, int y){    
        for (int j=0; j<array5.length; j++){
            for (int i=0; i<array5.length;i++){
                if((j!=0) && (j%x!=y) && (array5[j][i]%x==y)){
                    System.out.print(array5[j][i] + " ");
                } 
            }
            System.out.println("");
        }
    }
    
    public static void elementOdd(int array5[][],int x, int y){    
        for (int[] array51 : array5) {
            for (int i = 0; i<array5.length; i++) {
                if ((i%x==y) && (array51[i] % x != y)) {
                    System.out.print(array51[i] + " ");
                } else {
                    System.out.print("0 ");
                }
            }            
            System.out.println("");
        }
    }
    
    public static void elementSumEven(int array5[][],int x){    
        for (int j=0; j<array5.length; j++){
            int res = 0;
            for (int i=0; i<array5.length;i++){
                if((j%2!=0) && (array5[j][i]%x==0)&& (array5[j][i]!=0)){
                    res += array5[j][i];
                    System.out.print(array5[j][i] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("Сумма = " + res);
            System.out.println("");
        }
    }
    
    public static void elementCompositionOdd(int array5[][],int x){    
        for (int j = 0; j<array5.length; j++) {
            int res = 1;
            for (int i = 0; i<array5.length; i++) {
                if ((j%2!=1) && (array5[j][i] % x == 0) && (array5[j][i]!=0)) {
                    res *= array5[j][i];
                    System.out.print(array5[j][i] + " ");                    
                } else {                    
                    System.out.print("  ");
                }
            }
            System.out.print("Произведение = " + res);            
            System.out.println();
        }
    }
    
}
