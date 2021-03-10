package ie.gmit;

public class App {
    private int firstNum;
    private int secondNum;

    public App() {
        this.firstNum = 0;
        this.secondNum = 0;
    }


    public App(int firstNum, int secondNum)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;

    }

    public int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
}