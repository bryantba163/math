public class test_3 {
    public static void main(String[] args) {
        int num = 53;
        int m = 1;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d",num,m,test_2.leftShift(num,m)));
        System.out.println(String.format("数字%d的二进制向右移%d位是%d",num,m,test_2.rightShift(num,m)));
        System.out.println();

        m = 3;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d",num,m,test_2.leftShift(num,m)));
        System.out.println(String.format("数字%d的二进制向右移%d位是%d",num,m,test_2.rightShift(num,m)));
        System.out.println();
    }
}
