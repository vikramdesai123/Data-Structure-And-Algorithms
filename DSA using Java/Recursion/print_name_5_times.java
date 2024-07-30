

    // using recursion

class print_name_5_times {
    
    public void printName(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(i + ":" + "vikram");
        i++;
        printName(i, n);
    }
    public static void main(String[] args) {
        print_name_5_times p = new print_name_5_times();

        p.printName(1,5);
    }
    
}