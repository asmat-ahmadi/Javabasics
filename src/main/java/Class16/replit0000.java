package Class16;

public class replit0000 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5};

        mystery(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mystery(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // If the number is even, divide it by 2
                arr[i] /= 2;
            } else {
                // If it's odd, multiply it by 10
                arr[i] *= 10;
            }
        }
    }
}

