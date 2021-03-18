package chap01;

public class Q7 {

    public static void main(String[] args) {

        int n = 7;
        int sum = 0;
        for(int i = 1; i < n; i++) {
            System.out.print(i+"+");
            sum += i;
        }
        sum = sum + n;
        System.out.println(n + "= " + sum);
    }
}
