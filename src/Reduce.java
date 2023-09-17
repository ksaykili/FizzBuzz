public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int step_count = 0;

        while (number > 0) {
            if (number % 2 == 0){
                number /= 2;
            } else {
                number -= 1;
            }
            step_count += 1;
        }
        System.out.println(step_count);
    }
}
