public class rect_pattern5x4 {
    public static void main(String args[]) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next row after 5 stars
        }
    }
}
