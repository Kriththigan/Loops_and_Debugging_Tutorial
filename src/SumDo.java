public class SumDo {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        do {
            sum += (i * i);
            i++;
        } while (i <= 10);
        System.out.println("The sum of squares of integers from 1 to 10 is: " + sum);
    }
}
