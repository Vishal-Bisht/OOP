import java.util.Scanner;;

class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int i = num % 10;
            num /= 10;
            rev = (rev * 10) + i;
        }
        System.out.println("The reverse is: " + rev);
    }
}
