class EvenorOdd {
    public void checkEvenorOdd(int num) { //It's a Method
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

public class Check {
    public static void main(String[] args) {
        EvenorOdd newnum = new EvenorOdd();
        newnum.checkEvenorOdd(2);
    }
}