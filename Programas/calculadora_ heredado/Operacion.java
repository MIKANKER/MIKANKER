public class Operacion {
    double op1;
    double op2;
    double res;
    char operacion;

    public Operacion(double op1, double op2, char operacion) {
        this.op1 = op1;
        this.op2 = op2;
        this.operacion = operacion;
    }

    public void mostrarResultado() {
        System.out.println(this.op1 + " " + this.operacion + " " + this.op2 + " = " + this.res);
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getRes() {
        return res;
    }
}
