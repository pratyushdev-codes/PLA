public class ArmsStringNumber {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digits);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
