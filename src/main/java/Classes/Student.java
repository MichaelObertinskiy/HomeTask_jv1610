/*
 Создать классы, спецификации которых приведены ниже. Определить конструкторы и
методы setТип(), getТип(), toString().Определить дополнительно методы в классе, создающем
массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом
классе, обладающем информацией, должно быть объявлено несколько конструкторов.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
 */
package Classes;

/**
 *
 * @author Marishka
 */
public class Student {
    
    private String surname;
    private String name;
    private String patronymic;
    private String dateBirth;
    
    public String getSurname(){
        return surname;
    }    
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    
    public String getName(){
        return name;
    }    
    public void setName(String newName){
        name = newName;
    }
    
    public String getPatronymic(){
        return patronymic;
    }    
    public void setPatronymic(String newPatronymic){
        patronymic = newPatronymic;
    }
    
    
    
}
