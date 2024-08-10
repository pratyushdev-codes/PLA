public class findElementsArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 4, 9, 7};
        int specificIndex = 2;

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Value at index " + specificIndex + ": " + array[specificIndex]);
    }
}
