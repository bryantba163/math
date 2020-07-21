import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        boolean flag = false;

        for (int i = 31;i >= 0;i--){
            int temp = value & (1 << i);
            if (temp > 0){
                flag = true;
            }
            if (flag){
                if (temp > 0){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }
        }
    }
}