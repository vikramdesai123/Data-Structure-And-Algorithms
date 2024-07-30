
    // using backtracking concepts


public class print_1_to_N_using_backtracking {

    public void printNum(int i, int n){
        if(i<1){
            return;
        }
        printNum(i-1, n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        print_1_to_N_using_backtracking p = new print_1_to_N_using_backtracking();
        p.printNum(5, 5);
    }
}
