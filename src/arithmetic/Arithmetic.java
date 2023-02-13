/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import arithmetic.ArithmeticBase.Operation;
import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        System.out.println("Enter arithmetic operation:-");
        String Operation = in.next();
        Operation op = Operation.valueof(Operation.toUpperCase());
         double result = op.apply(n, m);
        
        System.out.println("Result: " + result);       
    
    }
}

