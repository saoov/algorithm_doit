package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();
        int sum = 0;
        int i = 1;
        //사전 판단 반복구조
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("계산 결과 : "+sum);
        System.out.println("변수 i의 값" + i);
    }
}
