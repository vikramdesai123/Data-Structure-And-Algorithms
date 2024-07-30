
    // using backtracking
    
public class print_N_to_1_using_backtracking {

    public void printNum(int i, int n){
        if(i>n){
            return;
        }
        printNum(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        print_N_to_1_using_backtracking p = new print_N_to_1_using_backtracking();

        p.printNum(1, 5);
    }
}
