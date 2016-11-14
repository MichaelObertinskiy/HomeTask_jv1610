/*
Задание 3 
    Реализовать приложение, выполняющее функцию “генератора казенных речей” 
    (http://alamor.kvintone.ru/work/ii/speech.htm).Для реализации использовать 
    циклические конструкции, массивы. На основании набора фраз приложение должно 
    генерировать речь, состоящую из указанного кол­ва предложений, но не менее 10, 
    каждое предложение компонуется из набора строк, взятого последовательно 
    из 1, 2, 3, 4 массива строк случайным образом.
*/
package jv1610.hometask.algorithm;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        program();
    }
    
    static String phrases(int x){
        String [] phrases = {"Дорогие друзья! ",
                            "с другой стороны ", 
                            "равным образом ",
                            "Не следует, однако, забывать о том, что ",
                            "Таким образом, ",
                            "Повседневная практика показывает, что ",
                            "Значимость этих проблем настолько очевидна, что ",
                            "Разнообразный и богатый опыт ",
                            "Задача организации, в особенности же ",
                            "Соображения высшего порядка, а также "
        }; 
        return phrases[x];
    }
    
    static String phrases2(int x){
        String [] phrases2 = {"реализация намеченных плановых заданий ",
            "рамки и место обучения кадров ",
            "постоянный количественный рост и сфера нашей активности ",
            "сложившаяся структура организации ",
            "новая модель ",
            "организационной деятельности ", 
            "дальнейшее развитие различных форм деятельности ",
            "постоянное информационно-пропагандистское обеспечение нашей деятельности ",
            "укрепления и развития структуры ",
            "консультация с широким активом ",
            "начало повседневной работы по формированию позиции "
        };
        return phrases2[x];
    }
    
    static String phrases3(int x){
        String [] phrases3 = {"играет важную роль в формировании ",
            "требуют от нас анализа ",
            "требуют определения и уточнения ",
            "способствует подготовке и реализации ", 
            "обеспечивает широкому кругу специалистов участие в формировании ",
            "позволяет выполнить ",
            "важнейшие задания по разработке ",
            "в значительной степени обуславливает создание ",
            "позволяет оценить значение ",
            "представляет собой интересный эксперимент проверки ",
            "влечет за собой процесс внедрения и модернизации "
        };
        return phrases3[x];
    }
    
    static String phrases4(int x){
        String [] phrases4 = {"существующих финансовых и административных условий ",
            "дальнейших направлений развитая ",
            "системы массового участия ",
            "позиций, занимаемых участниками в отношении поставленных задач ",
            "новых предложений ",
            "направлений прогрессивного развития ",
            "системы обучения кадров ",
            "соответствующей насущным потребностям ",
            "соответствующих условий активизации ",
            "модели развития ",
            "форм воздействия "
        }; 
        return phrases4[x];
    }
    
    static void program(){        
        for (int j=0;j<50;j++){
            int x;
            if(j==0){
                System.out.print(phrases(0));
            }else{
                x = j%4;
                switch(x){
                    case 0:
                        System.out.print(phrases(rand(10)));
                        break;
                    case 1:
                        System.out.print(phrases2(rand(10)));
                        break;
                    case 2:
                        System.out.print(phrases3(rand(10)));
                        break;
                    case 3:
                        System.out.print(phrases4(rand(10)) + "\n");
                        break;
                }
            }            
        }
    }
    
    static int rand(int x){
        Random rand = new Random();        
        x = rand.nextInt(x);
        return x;          
    }
    
}
