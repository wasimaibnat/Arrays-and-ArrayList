public class ArrayRandom {

    public static void main(String[] args) {
        int s = 0;
        int arr[] = new int[10];
        System.out.println("Array elements with index value: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "(" + i + ")   ");
        }
        System.out.println();
        System.out.println("Every element at an even index: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Every even element: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("All elements in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Only the first and last elements: ");
        System.out.print(arr[0] + " " + arr[9]);

        System.out.println();

    }

}