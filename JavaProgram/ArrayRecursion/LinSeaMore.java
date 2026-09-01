package JavaProgram.ArrayRecursion;
import java.util.*;
public class LinSeaMore {
    public static void main(String[] args) {
        
                int[] arr = {2, 3, 1, 4, 4, 5};
        
                int target = 4;
        
                ArrayList<Integer> ans = findAll(arr, target);
        
                System.out.println(ans);
            }
        
            static ArrayList<Integer> findAll(int[] arr, int target) {
        
                ArrayList<Integer> list = new ArrayList<>();
        
                for (int i = 0; i < arr.length; i++) {
        
                    if (arr[i] == target) {
                        list.add(i);
                    }
                }
        
                return list;
            }
        }

