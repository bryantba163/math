public class Test_1 {
    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        System.out.println(String.format("数字%d的二进制是%s",a,Test.decimalToBinary(a)));
        System.out.println(String.format("数字%s的十进制是%d",b,Test.binaryToDecimal(b)));
    }
}