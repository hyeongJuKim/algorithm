package main.javamaster.chapter5;

/**
 * Created by hj on 2017. 3. 27..
 * 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서
 * 개수만큼 '*'울 찍어서 그래프를 그리는 프로그램.
 */
public class ArraryExample01 {
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for (int i=0; i < answer.length;i++) {
            System.out.print(answer[i]);
            for (int j =0; j < answer[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
//
//        for (int i=0; i < counter.length;i++){
//
//        }
//        System.out.println();


    }

}
