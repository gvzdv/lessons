package lesson7.anonymous;

public class Calc {
    int a;
    int b;
    public Calc (int a, int b){
        this.a = a;
        this.b = b;
    }
    public double summ(Opertation operation){
        return operation.apply(a, b);
    }

    public double minus(Opertation operation){
        return operation.apply(a, b);
    }
}
