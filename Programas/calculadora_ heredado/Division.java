public class Division extends Operacion {
    double div;

    public Division(double op1, double op2) {
        super(op1, op2, '/');
        if (op2 == 0) {
            throw new ArithmeticException("No se puede dividir un número entre 0");
        } else {
            this.div = op1 / op2;
            this.setRes(this.div);
        }
    }
}
