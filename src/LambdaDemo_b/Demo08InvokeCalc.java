package LambdaDemo_b;

import java.util.Calendar;

/**
 * @Author: liuwei
 * @Date: 2019/11/7 0007 8:52
 */
public class Demo08InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(120,130,(int a,int b)->{
            return  a+b;
        });
    }
    private static void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println("结果是:"+result);
    }

}
