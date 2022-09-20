public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.printf("Задание 1\n");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;

        float[] number2 = {1.57f, 7.654f, 9.986f};

        boolean[] trueFalse = {number1[0]>number2[0],
                number1[1]<number2[2], number1[2]<number2[1]};

        System.out.printf("Задание 2\n");
        for (int i = 0; i < number1.length; i++) {
            System.out.printf("%s ",number1[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < number2.length; i++) {
            System.out.printf("%s ",number2[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < trueFalse.length; i++) {
            System.out.printf("%s ",trueFalse[i]);
        }
        System.out.printf("\n");

        System.out.printf("Задание 3\n");
        for (int i = 2; i < number1.length; i--) {
            System.out.printf("%s ",number1[i]);
            if (i == 0) {
                break;
            }
        }
        System.out.printf("\n");
        for (int i = 2; i < number2.length; i--) {
            System.out.printf("%s ",number2[i]);
            if (i == 0) {
                break;
            }
        }
        System.out.printf("\n");
        for (int i = 2; i < trueFalse.length; i--) {
            System.out.printf("%s ",trueFalse[i]);
            if (i == 0) {
                break;
            }
        }
        }

    }
