public class MainApp {

    public static void main(String[] args) {
        // Zadanie 1 - 1 sposob  - dodatkowa zmienna

        int[] numbers = {1, 2, 3, 4, 5};
//
//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length-1];
//        numbers[numbers.length-1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //2 sposob - bez zmiennych pomocniczych

        System.out.println("Zadanie 1");

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];

        for (int number : numbers) {
            System.out.println(number);
        }

        // Zadanie 2 - ile jest liczb parzystych w tablicy

        System.out.println("Zadanie 2");

        int[] number1 = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int even = 0;
        int odd = 0;

        for (int number : number1) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste: " + odd);

        //Zadanie 3 - sortowanie tablicy liczb

        System.out.println("Zadanie 3");

        int[] numbers2 = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        int min;

        for (int i = 0; i < numbers2.length - 1; i++) {
            min = numbers2[i];
            for (int j = i + 1; j < numbers2.length - 1; j++) {
                if (numbers2[j] < min) {
                    min = numbers2[j];
                    numbers2[j] = numbers2[i];
                    numbers2[i] = min;
                }
            }
        }
        for (int number : numbers2) {
            System.out.println(number);
        }
    }
}
