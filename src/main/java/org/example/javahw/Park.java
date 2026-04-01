package org.example.javahw;

// Задание 3 об аттракционах, времени их работы и стоимости
class Park {
    private String name;
    private String street;

    public Park(String name, String street){
        this.name = name;
        this.street = street;
    }

    public class Attractions {
        private String nameAtr;
        private String workTime;
        private Double price;

        public Attractions(String nameAtr, String workTime, Double price) {
            this.nameAtr = nameAtr;
            this.workTime = workTime;
            this.price = price;
        }
        public void printInfo() {
            System.out.println("Парк: " + name + ", " + street);
            System.out.println("Название аттракциона: " + nameAtr);
            System.out.println("Рабочее время: " + workTime);
            System.out.println("Цена: " + price);
            System.out.println("-------------");
        }

    }
    public static void main(String[] args) {
        Park centralPark = new Park("Главный", "ул.Центральная д.1");
        Attractions carousel = centralPark.new Attractions("Карусель", "09.00 - 21.00", 150.0);
        Attractions miniCars = centralPark.new Attractions("Мини машинки", "10.00 - 19.30", 320.0);
        Attractions horses = centralPark.new Attractions("Поездка на лошади", "10.00 - 18.00", 300.0);
        horses.printInfo();
        carousel.printInfo();
        miniCars.printInfo();
    }
}
