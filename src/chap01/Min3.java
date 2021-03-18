package chap01;

public class Min3 {


    static int min3(int a, int b, int c){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        return min;
    };

    public static void main(String[] args) {
        System.out.println("min3(1,2,3)의 최솟값은 " + min3(1,2,3) + "입니다.");
        System.out.println("min3(3,1,2)의 최솟값은 " + min3(3,1,2) + "입니다.");
        System.out.println("min3(2,1,3)의 최솟값은 " + min3(2,1,3) + "입니다.");
        System.out.println("min3(3,2,1)의 최솟값은 " + min3(3,2,1) + "입니다.");

    }
}

