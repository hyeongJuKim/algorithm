package main.javamaster.chapter2;

/**
 * Created by hj on 2017. 3. 19..
 */
public class Variable {

    public static void main(String[] args) {

        Variable var = new Variable();


        double d = 100.0;
        int i = 100;
        int result = i + (int)d;
//        System.out.println(result);

        long personalId = 8805271449415l;
//        System.out.println(personalId);

        // 조심해햐할것들!
//        System.out.println(true + "");
//        System.out.println(null + "");


        byte b = 10;
//        System.out.println(b);
//        System.out.println(~b);

        int num = 10;
//        System.out.println(~num);

//        var.oper();
//        var.beatOperator(); // 비트연산자
//        var.ternaryOperator(); // 삼항연산자


//        final int MAX = 3;
//        MAX = 10;
//        System.out.println(MAX);
//        var.switchCase();

//        var.oneToTweintiny();

//        var.saveOneToSix();
        var.strSum("12345");
    }


    /**
     * 나머지 연산자
     */
    public void oper(){
        int share = 10 / 8;
        int remain = 10 % 8;
        System.out.println("10 / 8  " + share);
        System.out.println("10 % 8  " + remain);


    }

    /**
     * 비트 연산자 연습
     * | 한 쪽 값이 1 이면 1을 출력
     * & 양쪽이 모두 1이면 1을 출력
     * ^ 서로 다를 때만 1을 출력
     */
    public void beatOperator(){
        System.out.println("1 | 0   " + (1 | 0));
        System.out.println(0 & 0);
        System.out.println(1 ^ 0);
        System.out.println(true & false);
    }

    /**
     * 삼항 연산자
     */
    public void ternaryOperator(){
        String result = 3 + 4 == 7 ? "Yes" : "No";
        System.out.println(result);
    }

    /**
     * 스위치문
     */
    public void switchCase(){
        int num = 90;

        switch (num){
            case 10 :case 20 : case 30 :
                System.out.println("10점");
                break;
            case 50 :
                System.out.println("50점");
                break;
            case 90 :
                System.out.println("90점");
                break;
            default :
                System.out.println("해당하는 점수가 없음");
        }
    }

    public int oneToTweintiny(){
        int result = 1;
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println("2의 배수 입니다 --> " + i);
            } else if (i % 3 == 0){
                System.out.println("3의 배수 입니다 --> " + i);
            } else {
                System.out.println("2의 배수 또는 3의 배수가 아닙니다 --> " + i);
            }

        }
        return result;
    }

    /**
     * Math.random()을 이용해서 1부터 6사이의 임의의 정수를 출력하는 함수.
     * 4-7 연습문제
     */
    public void saveOneToSix(){
            int value = (int) (Math.random() * 5) + 1;
            System.out.println(value);
    }

    /**
     * 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 Return 하는 함수를 완성.
     *  ex. "12345"         ->    "1+2+3+4+5"의 결과인 15를 출력
     */
    public void strSum(String strNumber) {
        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            System.out.println(sum =+strNumber.charAt(i));
        }
        System.out.println("sum = " + sum);
    }

    /**
     *  배열 복사
     */
    public void arrayCopy(){
        char[] abc = {'A','B','C','D'};
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(new String(abc));
        System.out.println(new String(number));

    }


}
