public class Main {
    public static void main(String[] args) {
    //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    //Задание 2
        int clientDeviceOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    //Задание 3
        int year = 2021;
         if (year % 4 == 0 && year % 100 == year % 400) {
                System.out.println(year + " год является високосным");
        }
         else {
             System.out.println(year + " год не является високосным");
         }
    //Задание 4
        int deliveryDistance = 95;
         if (deliveryDistance <= 20) {
             System.out.println("Потребуется дней: " + 1);
         }
         else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             System.out.println("Потребуется дней: " + 2);
         }
         else if (deliveryDistance > 60 && deliveryDistance <= 100) {
             System.out.println("Потребуется дней: " + 3);
         }
    //Задание 5
        int monthNumber = 12;
         switch (monthNumber) {
             case 1:
             case 2:
             case 12:
                 System.out.println(monthNumber + " месяц принадлежит к сезону зима");
             break;
             case 3:
             case 4:
             case 5:
                 System.out.println(monthNumber + " месяц принадлежит к сезону весна");
             break;
             case 6:
             case 7:
             case 8:
                 System.out.println(monthNumber + " месяц принадлежит к сезону лето");
             break;
             case 9:
             case 10:
             case 11:
                 System.out.println(monthNumber + " месяц принадлежит к сезону осень");
             break;
             default:
                 System.out.println("Такого месяца не существует");

         }
    }
}