package JavaProgram.ArrayRecursion;

public class RotatedBS {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        int target = 2;

        int ans = search(arr, target, 0, arr.length - 1);

        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Check if left half is sorted
        if (arr[s] <= arr[m]) {

            // Target lies inside left sorted half
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            }

            // Search in right half
            else {
                return search(arr, target, m + 1, e);
            }
        }

        // right half is sorted
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        // Search in left half
        return search(arr, target, s, m - 1);
    }
}   

