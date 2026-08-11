package JavaProgram.Arrays;

public class CheckSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,12};
        System.out.println(Check(arr));
    }
    static boolean Check(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
