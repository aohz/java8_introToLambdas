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
public class Sample2A_WithLambda {
  
    @FunctionalInterface
    public interface Operation {

        int calculate(int oper1, int oper2);
    }
    
    public static void main(String[] args) {
        System.out.print("Calculator... (4*6)+(-2*3) =");        

        Operation sum = (int oper1, int oper2) -> oper1 + oper2;
        Operation subs = (int oper1, int oper2) -> oper1 - oper2;
        Operation mult = (int oper1, int oper2) -> oper1 * oper2;
        
        int result = sum.calculate(mult.calculate(4, 6),mult.calculate(subs.calculate(0,2), 3));
        
        //int result = calculate(sum, calculate(mult, 4, 6), calculate(mult, calculate(subs, 0, 2),3));
        
        System.out.println(" "+result);
    }    
//
//    public static int calculate(Operation operation, int operand1, int operand2) {
//        return operation.calculate(operand1, operand2);
//    }
//    
}
