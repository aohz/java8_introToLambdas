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
public class SolutionEx3 {
  
    @FunctionalInterface
    public interface Operation {

        int calculate(int oper1, int oper2);
    }
    
    public static void main(String[] args) {
    	System.out.print("Calculator... (4+6)+(-2*3) =");

        Operation sum = (oper1,  oper2) -> oper1 + oper2;
        Operation subs = (oper1,  oper2) -> oper1 - oper2;
        Operation mult = (oper1,  oper2) -> oper1 * oper2;
        
        int result = sum.calculate(mult.calculate(4, 6),mult.calculate(subs.calculate(0,2), 3));
   
        System.out.println(" "+result);
    }    
  
}
