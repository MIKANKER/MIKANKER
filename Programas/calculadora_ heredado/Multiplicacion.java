public class Multiplicacion extends Operacion{
    double multi;
    public Multiplicacion(double op1, double op2){
        super(op1, op2, '*');
        this.multi = op1 * op2;
        this.setRes(this.multi);
    }
}