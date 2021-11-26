package Problem3;

import java.time.temporal.JulianFields;
import java.util.concurrent.locks.LockSupport;

public class MulThre implements Runnable{
    private static Thread t1;
    private static Thread t2;

    public static void main(String[] args) {

        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        function(arr1,arr2);

    }

    public static void function(int[] arr1,int[] arr2){
        t1 = new Thread(() ->{
            for(int num : arr1){
                System.out.print(num + " ");
                LockSupport.unpark(t2);  //唤醒t2线程
                LockSupport.park();  //将本线程阻塞
            }
        });

        t2 = new Thread(() ->{
            for(int let : arr2){
                LockSupport.park();  //防止t2线程先执行从而先输出A
                System.out.print(let + " ");
                LockSupport.unpark(t1);  //唤醒t1线程
            }
        });

        t1.start();
        t2.start();
    }


    @Override
    public void run() {

    }
}
