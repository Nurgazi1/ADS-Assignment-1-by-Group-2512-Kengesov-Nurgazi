import java.util.Scanner;
public class Main {

    public static int task1(int x) {
        // The program is linear O(n) as recursion calls the function one time per call

        if (x <= 1) return 1;
        return task1(x - 1) + x * x;
    }

    public static int task2(int[] array, int y) {
        // same as task1, its O(n) doing constant calls and rising linearly
        if (y == 0) return 0;
        return array[y - 1] + task2(array, y - 1);
    }

    //Both in task 3 are O(n), they rise linearly.

    public static int task3(int base, int p) {
        if (p == 0) return 0;
        return power(base, p) + task3(base, p - 1);
    }
    public static int power(int base, int p) {
        if (p == 0) return 1;
        return base * power(base, p - 1);

    }

    public static void task4(int numb, Scanner sc) {

        //Once again just rest of them, the function is called once per call and stcuked on top of each other, so return can be done in reverse. Its O(n).


        if (numb == 0) return;

        int numb2 = sc.nextInt();
        task4(numb - 1, sc);
        System.out.print(numb2 + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int result1 = task1(x);
        System.out.println(result1);

        int y = sc.nextInt();
        int[] array = new int[y];

        for (int i = 0; i < y; i++) {
            array[i] = sc.nextInt();
        }

        int result2 = task2(array, y);
        System.out.println(result2);

        int base = sc.nextInt();
        int p = sc.nextInt();

        int result3 = task3(base, p);
        System.out.println(result3);

        int numb = sc.nextInt();
        task4(numb, sc);
        System.out.println();
    }

}
