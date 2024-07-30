        // Rucursive way to add numbers using parameters

public class summetion_of_N_numbers_using_recursion {
    
    public void summetion(int i, int sum){
        
        if(i<1){
            System.out.println("total sum:"+ sum );
            return;            
        }
        summetion(i-1, sum+i);
    }
    
    public static void main(String[] args) {
        int n = 5;

        summetion_of_N_numbers_using_recursion s = new summetion_of_N_numbers_using_recursion();
        s.summetion(n, 0);
    }
}
