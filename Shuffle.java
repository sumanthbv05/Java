///1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

////Solution:

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;
        }

        System.out.print("Shuffled Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
