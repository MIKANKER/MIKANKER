public class Suma extends Operacion{
    double suma;
    public Suma(double op1, double op2){
        super(op1, op2, '+');
        this.suma = op1 + op2;
        this.setRes(this.suma);
    }
}