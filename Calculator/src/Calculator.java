class Calculator{
    private int number1;
    private int number2;

    public Calculator(int num1, int num2){
        this.number1 = num1;
        this.number2 = num2;

    }

    public Calculator() {
	}

	public int getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }

    public void setNumber1(int num1){
        this.number1 = num1;
    }

    public void setNumber2(int num2){
        this.number2 = num2;
    }

    public int addNumber(int num1, int num2){
        return num1 + num2;
    }

    public int subtractNumber(int num1, int num2){
        return num1 - num2;
    }

    public int multiplyNumber(int num1, int num2){
        return num1 * num2;
    }

    public int divideNumber(int num1, int num2){
        int value = 0;
        try{
            value = num1 / num2;
        } 
        catch(ArithmeticException e){
            System.out.println();
            System.out.println("Error: Cannot divide by zero.");
        }

        return value;
        
    }
}
