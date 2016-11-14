/*
Задание 7.
    Реализовать приложение, которое производит операции циклического сдвига 
    над прямоугольным массивом (матрицей). Организовать методы, которые позволяют произвести сдвиг:
    ●	на n позиций влево
    ●	на n позиций вправо
    ●	на n позиций вверх
    ●	на n позиций вниз
*/
package jv1610.hometask.algorithm;

public class task7 {
    public static int array7[][] = new int [5][5];
    public static void main(String[] args) {
        initializationArray7(array7);
        shiftRight(array7,3);        
        shiftLeft(array7,3);
        shiftUp(array7,3);
        shiftDown(array7,2);
    }
    
    public static void initializationArray7(int array7[][]){
        for (int[] array71 : array7) {
            for (int i = 0; i<array71.length; i++) {
                array71[i] = task4.rand(99);
                System.out.print(array71[i] + " ");
            }
            System.out.println();
        } 
        System.out.println();
    }
    
    public static void showArray7(int array7[][]){
        for (int[] array71 : array7) {
            for (int i = 0; i<array7.length; i++) {                
                System.out.print(array71[i] + " ");
            }
            System.out.println();
        }         
    }
    
    public static void shiftRight(int array7[][],int y){
        System.out.println("Сдвиг в право на " + y + " элемента");
        int size = array7.length;
        int temp;
        for (int[] array71 : array7) {
            for(int x=0; x<y; x++ ){
                for (int i=size-1; i>0; i--) {
                    temp = array71[i];
                    array71[i] = array71[i-1];
                    array71[i-1] = temp;
                }
            }
        }
        showArray7(array7);
        System.out.println("");
    }   
    
    public static void shiftLeft(int array7[][],int y){
        System.out.println("Сдвиг в лево на " + y + " элемента");
        int size = array7.length;
        int temp;
        for (int[] array71 : array7) {
            for(int x=0; x<y; x++ ){
                for (int i=0; i<size-1; i++) {
                    temp = array71[i];
                    array71[i] = array71[i+1];
                    array71[i+1] = temp;
                }
            }
        }        
        showArray7(array7);
        System.out.println("");
    }
    
    public static void shiftUp(int array7[][],int y){
        System.out.println("Сдвига в верх на " + y + " стр.");
        int size = array7.length;
        int temp;
        for (int x=0; x<y; x++){
            for (int j=0; j<size-1; j++){            
                for (int i=0; i<size-1; i++){
                    temp = array7[j][i];
                    array7[j][i] = array7[j+1][i];
                    array7[j+1][i] = temp;
                }
            }
        }        
        showArray7(array7);
        System.out.println("");
    }
    
    public static void shiftDown(int array7[][],int y){
        System.out.println("Сдвига в вниз на " + y + " стр.");
        int size = array7.length;
        int temp;
        for (int x=0; x<y; x++){
            for (int j=size-1; j>0; j--){            
                for (int i=0; i<size-1; i++){
                    temp = array7[j][i];
                    array7[j][i] = array7[j-1][i];
                    array7[j-1][i] = temp;
                }
            }
        }        
        showArray7(array7);
        System.out.println("");
    }
    
}
