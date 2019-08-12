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
}
