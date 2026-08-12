package JavaProgram.ArrayRecursion;

public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {3,2,1,18,9};
       //int target = 18;
       System.err.println(find(arr, 19, 0)); 
    }
    static boolean find(int[]arr,int target,int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
}
