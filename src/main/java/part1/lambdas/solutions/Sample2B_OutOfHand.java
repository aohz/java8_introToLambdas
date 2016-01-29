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
public class Sample2B_OutOfHand {

    @FunctionalInterface
    interface Operation {

        int calculate(int oper1, int oper2);
    }

    @FunctionalInterface
    interface Calculator {

        int calculate(Operation oper, int operand1, int operand2);
    }

    public static void main(String[] args) {

        Operation sum = (int oper1, int oper2) -> oper1 + oper2;
        Operation subs = (int oper1, int oper2) -> oper1 - oper2;
        Operation mult = (int oper1, int oper2) -> oper1 * oper2;
        Calculator computation = (oper, operand1, operdan2) -> oper.calculate(operand1, operdan2);

        System.out.println("Calculator... (4*6)+(-2*3) =");
        
        int result1 = sum.calculate(mult.calculate(4, 6), mult.calculate(subs.calculate(0, 2), 3));
        
        int result2 = calculate(sum, calculate(mult, 4, 6), calculate(mult, calculate(subs, 0, 2), 3));
        
        int result3 = computation.calculate(sum, computation.calculate(mult, 4, 6), computation.calculate(mult, computation.calculate(subs, 0, 2), 3));        
        
        System.out.println(String.format("Result value %d, All equals? %b", result1, result1 == result2 && result2 == result3));
    }

    private static int calculate(Operation operation, int operand1, int operand2) {
        return operation.calculate(operand1, operand2);
    }

}
