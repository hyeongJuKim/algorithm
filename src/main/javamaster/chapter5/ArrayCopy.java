package main.javamaster.chapter5;

/**
 * Created by hj on 2017. 3. 24..
 */
public class ArrayCopy {

    public static void main(String[] args) {
        ArrayCopy arr = new ArrayCopy();
        arr.arrayCopy(new int[] {1,2,3,4,5});



    }

    /** 배열을 복사.
     */
    public void arrayCopy(int[] numbers){
        int[] newNumbers  = new int[10];
        for(int i = 0; i < numbers.length; i++){
            newNumbers[i] = numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }





}
