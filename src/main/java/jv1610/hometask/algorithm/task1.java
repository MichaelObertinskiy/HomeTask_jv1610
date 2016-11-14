/*Задание 1.
    С помощью арифметических операций, операций сравнения и конструкций if­else и циклических операций создать приложение которое:
    ●	в последовательности чисел от 0 до 100 выводит все значения кратные 2, 3, 5, 7
    ●	находит сумму чисел для каждой из этих последовательностей
    ●	вычисляет разность сумм последовательности чисел, кратных 7 и 2
    ●	вычисляет отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3
*/
package jv1610.hometask.algorithm;

public class task1 {
    
    public static void main(String[] args) {
        num(2);
        num(3);
        num(5);
        num(7);
        System.out.println("Сумма всех чисел кратных 2-м = " + showNumRes(2));
        System.out.println("Сумма всех чисел кратных 3-м = " + showNumRes(3));
        System.out.println("Сумма всех чисел кратных 5-м = " + showNumRes(5));
        System.out.println("Сумма всех чисел кратных 7-м = " + showNumRes(7));
        System.out.println("Разность сумм " + (showNumRes(2)-(showNumRes(7))));
    }
    
    static void num(int x){
        for (int i=0; i<=100; i++){
            if (i%x==0){                
                System.out.print(i+ " ");
            }
        }    
        System.out.println(""); 
    } 
    
    static int showNumRes(int x){
        int res=0;
        for (int j=0;j<=100;j++){
            if(j%x==0){
                res = res+j;                
            }
        }
        return res;
    }    
    
}

