package pro.sky;

public class Main {

    public static void main(String[] args) {

        //task1

        int [] arrayOne = new int [3];
        for (int i = 0; i <= 2; i++) {
            arrayOne [i] = i + 1;
        }

        float [] arrayTwo = {1.57f, 7.654f, 9.986f};

        char [] arrayThree = {'C', 'H', 'A', 'R'};

        //task2

        System.out.println();
        System.out.println("Задача 2");

        for (int i = 0; i <= arrayOne.length - 2; i++) {
            System.out.print(arrayOne[i] + ",");}
            System.out.println(arrayOne[arrayOne.length - 1]);

        for (int i = 0; i <= arrayTwo.length - 2; i++) {
            System.out.print(arrayTwo[i] + ",");}
            System.out.println(arrayTwo[arrayTwo.length - 1]);

        for (int i = 0; i <= arrayThree.length - 2 ; i++) {
            System.out.print(arrayThree[i] + ",");}
            System.out.println(arrayThree[arrayThree.length - 1]);


        //task3
        System.out.println();
        System.out.println("Задача 3");

        for (int i = arrayOne.length - 1; i > 0; i--) {
            System.out.print(arrayOne[i] + ",");}
            System.out.print(arrayOne[0]);

        System.out.println();

        for (int i = arrayTwo.length - 1; i > 0; i--) {
            System.out.print(arrayTwo[i] + ",");}
            System.out.print(arrayTwo[0]);

        System.out.println();

        for (int i = arrayThree.length - 1; i > 0; i--) {
            System.out.print(arrayThree[i] + ",");}
            System.out.println(arrayThree[0]);


        //task4
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 0; i < arrayOne.length; i++) {
           if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
           }
        }
        for (int i = 0; i <= arrayOne.length - 2; i++) {
            System.out.print(arrayOne[i] + ",");}
            System.out.println(arrayOne[arrayOne.length - 1]);



    }
}
