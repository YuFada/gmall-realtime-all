/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/9/23 14:29
 * @Desc:
 */
public class TestDI {
    public static void main(String[] args) {
        System.out.println("The factorial of 10 is " + factorial(3));
    }

    //    计算阶乘的方法，典型的递归方法
    public static long factorial(long n) {
        if (n >= 1) {
//递归方法特点一：在方法中调用自己
            return n * factorial(n - 1);
        } else {
//递归方法特点二：有至少一个出口条件
            return 1;
        }
    }
}




