        // using recursion

public class print_1_to_N_numbers {

    public void print(int i, int n){
        if(i> n){
            return;
        }
        System.out.print(i + " ");
        i++;
        print(i, n);
    }
    public static void main(String[] args) {
        print_1_to_N_numbers p = new print_1_to_N_numbers();

        p.print(1,20);

    }
}
