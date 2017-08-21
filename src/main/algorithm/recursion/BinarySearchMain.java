package main.algorithm.recursion;

/**
 * Created by hj on 2017. 4. 16..
 */
public class BinarySearchMain {
/**

이진탐색(Binary Search)

- 정렬이 되어있아야 함

*/

    public void binarySearch(int[] arr, int item){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item)
                break;
            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;
        }

    }

    public int binarySearch2(int[] arr, int item){
        int searchCnt = 1;
        int low = 0;
        int height = arr.length-1;

        while (low <= height){
            int mid = (low + height) / 2;
            int guess = arr[mid];

            if (guess == item)
                break;
            if (guess > item)
                height = mid - 1;
            else
                low = mid + 1;
            searchCnt++;
        }
        return searchCnt;
    }


    public static void main(String[] args) {
        BinarySearchMain bin = new BinarySearchMain();

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        bin.binarySearch(arr,13);

        int searchCnt = bin.binarySearch2(arr, 1);
        System.out.println("" + searchCnt + "번 search했습니다.");

    }

}
















