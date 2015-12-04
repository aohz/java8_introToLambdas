/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part1.lambdas.exercises;

/**
 *
 * @author DSFO
 */
public class Sample1_WithoutLambda {
    
    public static void main (String[] args) {        
        System.out.println("Main Start...");
        
        MyRunnableTask task = new MyRunnableTask();
        Thread myThread = new Thread(task);
        myThread.start();
        System.out.println("...End Main");
        
    }
    
    
    public static class MyRunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("processing in thread");
        }
    }
    
}
