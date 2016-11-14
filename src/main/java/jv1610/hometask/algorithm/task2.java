/*Задание 2
Используя конструкцию switch, простейшие арифметические операции и операции 
сравнения реализовать приложение, которое выводит в консоль текстовое 
представление случайного целого числа в диапазоне от 0 до 99 включительно.
*/
package jv1610.hometask.algorithm;


public class task2 {
    
    public static void main(String[] args) {
        for(int j=-1; j<=100; j++){
        OfSelection(j);
        }
    }
    
    public static void OfSelection(int z){
        int a;
        int b;
        if (z>=0 && z<=9){
            NumberToStringUnit(z);
        }else{
            if (z>10 && z<20){
                NumberToStringOneDesimal(z);
            }else{
                if (z > 9 && z < 100){
                a = z/10; 
                NumberToStringDesimal(a);
                b = z%10;
                NumberToStringUnit(b);
                }else{
                    System.out.println("Число введено не верно!!!!");
                }
            }
        }                
    } 
    
    static void NumberToStringDesimal(int x){
        switch(x){           
            case 0:{
                System.out.print("");
            }
            break;
            case 1:{
                System.out.print("Десять ");
            }
            break;
            case 2:{
                System.out.print("Двадцать ");
            }
            break;
            case 3:{
                System.out.print("Тридцать ");
            }
            break;
            case 4:{
                System.out.print("Сорок ");
            }
            break;
            case 5:{
                System.out.print("Пятьдесят ");
            }
            break;
            case 6:{
                System.out.print("Шестьдесят ");
            }
            break;
            case 7:{
                System.out.print("Семдесят ");
            }
            break;
            case 8:{
                System.out.print("Восемдесят ");
            }
            break;
            case 9:{
                System.out.print("Девяносто ");
            }break;
        }
    }
    
    static void NumberToStringUnit(int y){
        switch(y){            
            case 0:{
                System.out.println("");
            }
            break;
            case 1:{
                System.out.println("один ");
            }
            break;
            case 2:{
                System.out.println("два ");
            }
            break;
            case 3:{
                System.out.println("три ");
            }
            break;
            case 4:{
                System.out.println("четыри ");
            }
            break;
            case 5:{
                System.out.println("пять ");
            }
            break;
            case 6:{
                System.out.println("шесть ");
            }
            break;
            case 7:{
                System.out.println("семь ");
            }
            break;
            case 8:{
                System.out.println("восемь ");
            }
            break;
            case 9:{
                System.out.println("девять ");
            }break;
        }
    }
    
    static void NumberToStringOneDesimal(int y){
        switch(y){           
            case 11:{
                System.out.println("одиннадцать ");
            }
            break;
            case 12:{
                System.out.println("двенадцать ");
            }
            break;
            case 13:{
                System.out.println("тринадцать ");
            }
            break;
            case 14:{
                System.out.println("четырнадцать ");
            }
            break;
            case 15:{
                System.out.println("пятнадцать ");
            }
            break;
            case 16:{
                System.out.println("шестнадцать ");
            }
            break;
            case 17:{
                System.out.println("семнадцать ");
            }
            break;
            case 18:{
                System.out.println("восемнадцать ");
            }
            break;
            case 19:{
                System.out.println("девятнадцать ");
            }break;
        }        
    } 
    
}
