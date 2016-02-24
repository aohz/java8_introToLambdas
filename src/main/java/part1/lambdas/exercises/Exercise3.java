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
public class Exercise3 {
	
    public interface Operation {

        int calculate(int oper1, int oper2);
    }

    public static void main(String[] args) {
        System.out.print("Calculator... (4+6)+(-2*3) =");

        Operation sum = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 + oper2;
            }

        };

        Operation subs = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 - oper2;
            }

        };

        Operation mult = new Operation() {

            @Override
            public int calculate(int oper1, int oper2) {
                return oper1 * oper2;
            }

        };

        int result = sum.calculate(sum.calculate(4, 6), mult.calculate(subs.calculate(0, 2), 3));

        System.out.println(" " + result);
    }

}
