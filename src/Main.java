import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание 1");
        int year = setYear();
        getYear(year);

        // Task 2
        System.out.println("  ");
        System.out.println("Задание 2");
        System.out.print("Введите тип операционной ОС: 0 - iOS, 1 - Android ");
        int typeOperationSystem1 = setTypeOperationSystem();
        System.out.print("Введите год выпуска телефона : ");
        int phoneYear1 = setYearSystem();

        getTypeOperationSystem(typeOperationSystem1, phoneYear1);

        // Task 3
        System.out.println("  ");
        System.out.println("Задание 3");
        System.out.print("Введите рассотояние от офиса до адреса доставки ");
        int distance = getDeliveryDistance();
        getTimeDelivery(distance);

    }


    public static int setYear() {
        Scanner leapYear = new Scanner(System.in);
        System.out.println("Введите год ");
        return leapYear.nextInt();
    }

    public static int getYear(int year) {
        if (year >= 1584 && isLeapYear(year)) {
            System.out.println(year + "  год високосный");
        } else if (year < 1584) {
            System.out.println("Високосный год ввели только в 1584");
        } else {
            System.out.println(year + "  год невисокосный");
        }
        return year;

    }


    public static boolean isLeapYear(int year) {
        if ((year % 4 != 0) && (year % 400 != 0) || (year % 100 == 0)) {
            return false;
        }
        return true;
    }

    public static int setTypeOperationSystem() {
        Scanner typeOperationSystem = new Scanner(System.in);
        return typeOperationSystem.nextInt();
    }

    public static int setYearSystem() {
        Scanner phoneYear = new Scanner(System.in);
        return phoneYear.nextInt();

    }

    public static int getTypeOperationSystem(int client, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (client == 0 & clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client == 0 & clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client == 1 & clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (client == 1 & clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return client & clientDeviceYear;
    }


    public static int getDeliveryDistance() {
        Scanner deliveryDistance = new Scanner(System.in);
        return deliveryDistance.nextInt();
    }

    public static int getTimeDelivery(int deliveryDistance) {
        int time = 1;
        int shortDistance = 20;
        int middleDistance = 60;
        int longDistance = 100;
        if (deliveryDistance <= shortDistance) {
            System.out.println("Ваша карта будет доставлена через " + time + " день");
        } else if (deliveryDistance <= middleDistance) {
            System.out.println("Ваша карта будет доставлена через " + (time + 1) + " дня");
        } else if (deliveryDistance <= longDistance) {
            System.out.println("Ваша карта будет доставлена через " + (time + 2) + " дня");
        } else {
            System.out.println("Доставка не осуществляется ");
        }
        return deliveryDistance;

    }
}




