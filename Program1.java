class Calculator {

    double a;
    double b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void calculate() {

        if (operation.equals("add")) {
            System.out.println("Result: " + (a + b));
        }
        else if (operation.equals("sub")) {
            System.out.println("Result: " + (a - b));
        }
        else if (operation.equals("mul")) {
            System.out.println("Result: " + (a * b));
        }
        else if (operation.equals("div")) {
            System.out.println("Result: " + (a / b));
        }
        else {
            System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator(10, 5, "add");
        calc.calculate();
    }
}
