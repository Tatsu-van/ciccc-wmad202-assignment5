package ca.ciccc.wmad202.assignment5.problem2_5;

public class FormulaElement {
    public static int firstOperand;
    public static int secondOperand;
    public static char operator;

    public FormulaElement(int num1, int num2, char operator){
        this.firstOperand = num1;
        this.secondOperand = num2;
        this.operator = operator;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public static void calculator(){
        int result = 0;

        if(operator == '+'){
            result = firstOperand + secondOperand;
        }
        else if (operator == '-'){
            result = firstOperand - secondOperand;
        }

        else if(operator == '*'){
            result = firstOperand * secondOperand;
        }
        else if(operator == '/'){
            result = firstOperand / secondOperand;
        }
        else {
            System.out.println("invalid operator!!");
            return;
        }

        System.out.println(firstOperand + " " + String.valueOf(operator) + " " +  secondOperand + " = " + result);
    }
}
