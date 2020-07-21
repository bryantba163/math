public class test9 {
    public static void main(String[] args) {
        int number = 20;
        double squareRoot = test8.getSqureRoot(number,0.000001,10000);
        if (squareRoot == -1.0) {
            System.out.println("请输入大于1的整数");
        } else if (squareRoot == -2.0) {
            System.out.println("未能找到解");
        } else {
            System.out.println(String.format("%d的平方根是%f",number,squareRoot));
        }
    }
}