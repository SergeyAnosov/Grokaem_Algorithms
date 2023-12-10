public class ReverseCountdown {

    public static int countdown(int i) {
        System.out.print(i + " ");
        if (i <= 1) {
            return i;
        }
        return countdown(i-1);
    }

    public static void main(String[] args) {
        countdown(10);
    }
}
