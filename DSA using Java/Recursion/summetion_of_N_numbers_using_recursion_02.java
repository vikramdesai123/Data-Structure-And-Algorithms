      // using recursive function

public class summetion_of_N_numbers_using_recursion_02 {

    public int summetionOfNum(int n){
        if (n == 0){
            return 0;
        }
        return n + summetionOfNum(n-1);
    }
    public static void main(String[] args) {
        summetion_of_N_numbers_using_recursion_02 s = new summetion_of_N_numbers_using_recursion_02();

        int num = 5;
        System.out.println(s.summetionOfNum(num));
        
    }
}
