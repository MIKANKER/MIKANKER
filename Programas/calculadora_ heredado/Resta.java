public class Resta extends Operacion{
    double resta;
    public Resta(double op1, double op2){
        super(op1, op2, '-');
        this.resta = op1 - op2;
        this.setRes(this.resta);
    }
}