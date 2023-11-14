import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[2]);
        String sinc = strings[1];
        int res = 0;
        if (num1 > 10 || num2 > 10 || num1 < 1 || num2 < 1) {
            throw new Exception();
        } else if (sinc.equals("+")) {
            res = num1 + num2;
        } else if (sinc.equals("-")) {
            res = num1 - num2;
        } else if (sinc.equals("*")) {
            res = num1 * num2;
        } else if (sinc.equals("/")) {
            res = num1 / num2;
        } else {
            throw new Exception();
        }
        System.out.println(res);


    }
}