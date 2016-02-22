/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part1.lambdas.solutions;

/**
 *
 * @author DSFO
 */
public class SolutionEx1 {
    
    public static void main (String[] args) {        
        System.out.println("Main Start...");

        //Changed this to instance a Runnable using a Lambda
        Runnable task = () -> System.out.println("processing in thread 1");        
        Thread myThread = new Thread(task);
        
        //Inline instance of the type paramenter isntead of a instance variable
        //We are actually passing logic as an argument
        Thread myThread2 = new Thread(() -> System.out.println("processing in thread 2"));
                
        myThread.start();
        myThread2.start();
        System.out.println("...End Main");
        
    }
    
}
