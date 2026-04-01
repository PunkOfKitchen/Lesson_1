package org.example.javahw;

class Employees {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employees(String fio, String position, String email,
                    String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("---------------");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employees[] employees = new Employees[5];

        employees[0] = new Employees("Иванов Иван Иванович",
                "Инженер",
                "ivanov@mail.com",
                "+7(902)111-11-11",
                50000,
                45);

        employees[1] = new Employees("Петров Петр Петрович",
                "Менеджер",
                "petrov@mail.com",
                "+7(902)222-22-22",
                60000,
                38);

        employees[2] = new Employees("Сидорова Анна Сергеевна",
                "Бухгалтер",
                "sidorova@mail.com",
                "+7(902)333-33-33",
                55000,
                52);

        employees[3] = new Employees("Козлов Дмитрий Алексеевич",
                "Разработчик",
                "kozlov@mail.com",
                "+7(902)444-44-44",
                70000,
                35);

        employees[4] = new Employees("Николаева Елена Владимировна",
                "HR-менеджер",
                "nikolaeva@mail.com",
                "+7(902)555-55-55",
                45000,
                41);

        System.out.println("Сотрудники старше 40 лет:\n");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}