package JavaProgram.ArrayRecursion;


public class SortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,6,8};
        System.out.println(Check(arr, 0));
    }
    static boolean Check (int[]arr , int index){
        if (index == arr.length-1) {
            return true;
        }
      return (arr[index]<arr[index+1] && Check(arr, index+1));
    }
}
