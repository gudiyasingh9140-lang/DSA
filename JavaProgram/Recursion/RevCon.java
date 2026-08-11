package JavaProgram.Recursion;


public class RevCon {
    public static void main(String[] args) {
        sum(5, 0);
    }
 static void sum(int n, int result) {
    if (n == 0) {
        System.out.println(result);
        return;
    }

    sum(n - 1, result + n);
}
}