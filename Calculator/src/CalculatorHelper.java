import java.util.Scanner;

class CalculatorHelper{

    public static void main(String args[]){
        Calculator obj = new Calculator();
        CalculatorHelper obj2 = new CalculatorHelper();

        int result = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        String choice = "";

        while(repeat){

            System.out.println("Please enter a number.");
            num1 = in.nextInt();

            System.out.println("Please enter a second number.");
            num2 = in.nextInt();
        
            System.out.println("Finally, enter in a mathematical operation (+, -, *, /):");
            String op = in.next();

            switch(op){
                case "+":
                    result = obj.addNumber(num1, num2);
                    break;
                case "-":
                    result = obj.subtractNumber(num1, num2);
                    break;
                case "*":
                    result = obj.multiplyNumber(num1, num2);
                    break;
                case "/":
                    result = obj.divideNumber(num1, num2);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid operator. Can't compute value.");
                    break;
            }

            if((num2 != 0) && (op != "/")){
                System.out.println();
                System.out.println(num1 + " " + op + " " + num2 + " = " + result);
            }
            
            System.out.println();
            System.out.println("Would you like to compute another value?");
            choice = in.next();

            repeat = obj2.Repeat(choice, repeat);

        }

    } 

    public boolean Repeat(String response, boolean b){
        if(response.equalsIgnoreCase("No")){
            b = false;
        }

        return b;
    }
    
}