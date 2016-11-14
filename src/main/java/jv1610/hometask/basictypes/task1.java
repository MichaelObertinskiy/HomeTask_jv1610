
package jv1610.hometask.basictypes;
/*Задание 1
1.	Создать программу, которая выводит в консоль текст “Здравствуй мир”.
2.	Создать в программе текстовую переменную (String) с произвольным текстом размещенную на нескольких строках кода. Вывести текст в консоль.
3.	Создать программу, которая выводит в консоль следуюшие данные:
●	ФИО
●	номер группы
●	время занятий в виде:
ФИО: [ваши данные] номер группы: [ваши данные] время занятий: [ваши данные] При выполнении задания использовать числовые типы данных, строки, оперировать выходными данными на уровне сложения строк, сложения строк и числовых данных. 
*/
public class task1 {
    
    public static void main(String[] args){        
        task11();
        task12(); 
        task13();
    }
    
    public static void task11(){
        System.out.println("Здравствуй мир");
    }
    
    public static void task12(){
        String x = "Привет",
               a = "студент",
               b = "JV1610",
               c = "!!!";
        System.out.println(x + " " + a + " " + b + c);        
    }
    
    public static void task13(){
        String name = "Michael";
        String surname = "Obertinskiy";
        String grupp = "JV1610";
        String time = "wen 19.00, sun 9.00";
        System.out.println("ФИО: " + name + " " +  surname);
        System.out.println("Номер группы: " + grupp);
        System.out.println("Время занятий: " +time);
    }
    
}
