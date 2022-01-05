package tech.codingclub;

import java.util.Scanner;

public class ThreadExample extends Thread {

    private String threadName;
    public int counter;
    public int waitTimeWhileLoop;
    public ThreadExample(String threadName, int counter, int waitTimeWhileLoop)
    {
        this.threadName=threadName;
        this.counter=counter;
    }
    //we are overiding how run will gonna work!
    public void run(){
        //we will definre what process we want to run parallely
        while(counter<1000) {
            counter++;
            if(threadName.equals("Thread_A")){
                try{
                    Thread.sleep(waitTimeWhileLoop);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        System.out.println(threadName+":"+counter);
        }
    }

    public static void main(String[] args) {
 ThreadExample thread1=new ThreadExample("Thread_A",0,500);
 ThreadExample thread2=new ThreadExample("Thread_B",0,1000);
 ThreadExample thread3=new ThreadExample("Thread_C",0,2000);


        thread1.start();
        thread2.start();
        thread3.start();
         Scanner scanner=new Scanner(System.in);
         int x=scanner.nextInt();



    }

}
