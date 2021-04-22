public class ForLoop {
    public static void main(String [] args) {
        //for loop
        for (int i = 2; i <= 25; i++) {
            if (i == 5) {
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i++);
        }
    }
}

