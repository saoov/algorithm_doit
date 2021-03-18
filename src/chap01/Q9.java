package chap01;

public class Q9 {

    static int sumof(int a, int b){
        int sum = 0;
        if(b>a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
    };
    public static void main(String[] args) {

        System.out.println("sumof(1,2) = "+sumof(1,2));
        System.out.println("sumof(2,9) = "+sumof(1,10));
        System.out.println("sumof(3,6) = "+sumof(6,3));


    }

}
