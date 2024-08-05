//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}