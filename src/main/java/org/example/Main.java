package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Calculator Begins!!");
        //some changes
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        double num, exp;

        do{
            System.out.println("\nOperation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Percentile function");
            System.out.println("4. Muliply");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice(number):");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // addition
                        System.out.println("\nAdd two numbers!!");
                        System.out.print("Enter nuber 1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number_ 2: \n");
                        exp = reader.nextInt();
                        add(num,exp);
                        break;

                    case 2: //Subtract
                        System.out.println("Subtract two numbers!!");
                        System.out.print("Enter number_ 1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number_ 2: \n");
                        exp = reader.nextInt();
                        subt(num,exp);
                        break;

                    case 3: //Percentile function
                        System.out.println("Power two numbers!!\n");
                        System.out.print("Enter number 1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number 2: \n");
                        exp = reader.nextInt();
                        per(num,exp);
                        break;

                    case 4: //Power
                        System.out.println("Multiply two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        mul(num,exp);
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static double add(double num,double exp){
        double c=num+exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing addition for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }

    public static double subt(double num,double exp){
        double c=num-exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing subtraction for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static double mul(double num,double exp){
        double c = num*exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing multiplication for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static double per(double num,double exp){
        double c = num%exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing percentile operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
}