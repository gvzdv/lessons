package lesson6.calculator;

public class Plus extends Operation{

    public Plus(int a, int b) {
        super (a, b);
    }
    Operation Plus = new Operation() {
        @Override
        public int execute() {
            System.out.println(this.getA() + this.getB());
        }
    }

    }


