import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        task1(); //Задача 1
        task2(); //Задача 2
        task3(); //Задача 3
        task4(); //Задача 4
        task5(); //Задача 5

    }

    private static void task5() {
        int monthNumber = 15;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зимний месяц");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц");
                break;
            case 3:
                System.out.println("Март - весенний месяц");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц");
                break;
            case 5:
                System.out.println("Май - весенний месяц");
                break;
            case 6:
                System.out.println("Июнь - летний месяц");
                break;
            case 7:
                System.out.println("Июль - летний месяц");
                break;
            case 8:
                System.out.println("Август - летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь - осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц");
                break;
            case 12:
                System.out.println("Декабрь - зиминий месяц");
                break;
            default:
                System.out.println("В году 12 месяцев, " + monthNumber + " месяца не существует");
        }
    }

    private static void task4() {
        int deliveryDistance = 70; //Расстояние до клиента
        int deliveryPerFirstDay = 20; //За сутки до 20 км
        int deliveryNextDays = 40; //Каждые следующие до 40 км плюс сутки
        int daysForDelivery = (deliveryDistance - deliveryPerFirstDay) / deliveryNextDays;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день, чтобы доставить карту");
        } else if(deliveryDistance > 20 && (deliveryDistance - deliveryPerFirstDay) % deliveryNextDays ==0) {
            System.out.println("Потребуется " + (daysForDelivery + 1) + " дней, чтобы доставить карту");
        } else {
            System.out.println("Потребуется " + (daysForDelivery + 2) + " дней, чтобы доставить карту");

            }
        }

    private static void task3() {
        int year = 1600;
        if (year %100 == 0 && year %400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");

        }
    }

    private static void task2() {    //Задача 2
        int clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


    private static void task1 () {   //Задача 1
            int clientOS = 1;  //iOS - 0, Android -1
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }
        }

