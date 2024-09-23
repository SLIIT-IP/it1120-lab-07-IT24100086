public class IT24100086Lab7Q2C {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); 
            }
            System.out.println(); 
        }
    }
}