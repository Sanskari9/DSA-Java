public class SwapAlternate {
    public static void swapAlternate(int input[]) {
        for (int i = 0; i < input.length-1; i++) {
            int temp = input[i];
            input[i] = input[i + 1];
            input[i + 1] = temp;
            i++;

        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6};
        swapAlternate(arr);
        print(arr);
    }
}
