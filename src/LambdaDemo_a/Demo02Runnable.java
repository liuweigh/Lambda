package LambdaDemo_a;

/**
 * @Author: liuwei
 * @Date: 2019/11/7 0007 8:43
 */
public class Demo02Runnable {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("多线程任务执行!")).start();//启动线程
    }
}
