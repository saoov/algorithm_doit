package chap01;

public class Median {
    /*
    결정트리를 작성하고 모든 경우의 수에 대해 생각해보기 (모든 경우의 수는 몇 개?)
     */
    static int med3(int a, int b, int c){
      if(a>=b)
          if(b >=c )
              return b;
          else if(a<=c)
              return a;
          else
              return c;
      else if(a>c)
          return a;
      else if(b>c)
          return c;
      else
          return b;
    };
    /*
    med3에 비해 효율이 떨어진다. -> why?
     */
    static int med33(int a, int b, int c){
        if((b>=a && c<= a) || (b<=a && c>= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    };


    public static void main(String[] args) {
        System.out.println("med(1,2,3)의 중앙값은 " + med3(1,2,3)+"입니다.");
        System.out.println("med(3,2,1)의 중앙값은 " + med3(3,2,1)+"입니다.");
        System.out.println("med(3,2,3)의 중앙값은 " + med3(3,2,3)+"입니다.");
        System.out.println("med(3,1,2)의 중앙값은 " + med3(3,1,2)+"입니다.");
        System.out.println("==========================");
        System.out.println("med(1,2,3)의 중앙값은 " + med33(1,2,3)+"입니다.");
        System.out.println("med(3,2,1)의 중앙값은 " + med33(3,2,1)+"입니다.");
        System.out.println("med(3,2,3)의 중앙값은 " + med33(3,2,3)+"입니다.");
        System.out.println("med(3,1,2)의 중앙값은 " + med33(3,1,2)+"입니다.");
    }
}
