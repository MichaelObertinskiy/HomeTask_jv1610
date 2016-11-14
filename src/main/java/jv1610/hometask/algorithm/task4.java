/*
Задание 4
    Создать одномерный массив на n элементов, заполнить его случайными числами. 
    Реализовать методы, позволяющие:
    ●	вывести все элементы массива в прямом и обратном порядке
    ●	вывести все четные элементы массива
    ●	вывести все нечетные элементы массива
    ●	сумму элементов, кратных 7
    ●	произведение элементов, кратных 3
*/
package jv1610.hometask.algorithm;

import java.util.Random;

public class task4 {
    public static void main(String[] args){
        int array[] = new int[30];        
        array(array);
        System.out.println("Массив: ");
        showArray(array);
        sortArrayUp(array);
        System.out.println("Массив по нарастающей: ");
        showArray(array);
        sortArrayDown(array);
        System.out.println("Массив по убыванию: ");
        showArray(array);
        System.out.println("Четные элементы массива: ");
        foldArray(array,2);
        System.out.println("Нечетные элементы массива: ");
        oddArray(array);
        System.out.println("Элементы массива кратные 7-ми: ");
        foldArray(array,7);
        System.out.println("Элементы массива кратные 3-ем: ");
        foldArray(array,3);        
    }   
    
    public static void sortArrayUp(int array[]){
        int y;
        for (int j=array.length-1; j>0; j--){
            for (int i=0; i<j; i++){
                if (array[i] > array[i+1]){               
                    y = array[i];
                    array[i] = array[i+1];
                    array[i+1] = y;                    
                }              
            }            
        }
    }  
    
    public static void sortArrayDown(int array[]){
        int y;
        for (int j=array.length-1; j>0; j--){
            for (int i=0; i<j; i++){
                if (array[i] < array[i+1]){               
                    y = array[i];
                    array[i] = array[i+1];
                    array[i+1] = y;                    
                }              
            }            
        }
    }  
    
    static int rand (int x){
        Random rand = new Random();
        x = rand.nextInt((x)+1);
        return x;
    }  
    
    public static void array(int array[]){        
        for (int j=0; j<array.length; j++){
            array[j] = rand(99+1);         
        }        
    }
    
    public static void showArray(int array[]){
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }
    
    public static void foldArray(int array[],int x){
        for (int j=0; j<array.length; j++){
            if(array[j]%x==0){
                System.out.print(array[j] + " ");
            }
        }
        System.out.println("");
    }
    
    public static void oddArray(int array[]){
        for (int j=0; j<array.length; j++){
            if(array[j]%2!=0){
                System.out.print(array[j] + " ");
            }
        }
        System.out.println("");
    }
    
}
