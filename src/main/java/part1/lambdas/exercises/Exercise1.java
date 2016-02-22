/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part1.lambdas.exercises;

/**
 * Transform code to use lambda expresiones
 * 
 * @author aohz
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("Main Start...");

		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("processing in thread");
			}
		};

		Thread myThread = new Thread(task);
		myThread.start();
		
		System.out.println("...End Main");
	}

}
