package org.example.javahw;

class Lesson_3_1{
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Lesson_3_1(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("ФИО: " + fio + ", ");
        System.out.println("Должность: " + position + ", ");
        System.out.println("Email: " + email + ", ");
        System.out.println("Телефон: " + phone + ", ");
        System.out.println("ЗП: " + salary + ", ");
        System.out.println("Возраст: " + age);
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        //1 Задание
        Lesson_3_1 emp1 = new Lesson_3_1(
                "Иванов Иван Иванович",
                "Инженер",
                "test@test.com",
                "+7(902)770-97-35",
                1000,
                32);
        emp1.printInfo();
    }
}



