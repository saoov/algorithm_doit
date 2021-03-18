package chap01;

import java.util.Scanner;

public class JudgeSign {
    /*
    이 프로그램은 두 가지가 동시에 실행되거나 하나도 실행되지 않거나 하는 경우는 없다. -> 프로그램 흐름이 3가지로 분기하기 때문
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = stdIn.nextInt();

        if(n>0){
            System.out.println("정수입니다.");}
        else if(n<0){
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }

    }
}
