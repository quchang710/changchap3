public class MyPolynomial {
    private double coefficient;
    public MyPolynomial(double coefficient) {
    }
    public int getDegree;
    @Override
    public String toString() {
        return "Cnx^n + Cn-1x^(n-1)+...+C1x+C0";
    }
    public double evaluate (double x) {
        return coefficient * Math.pow(x, getDegree);
    }
    public double getCoefficient () {
        return coefficient;
    }
    public void setCoefficient (double coefficient) {
        this.coefficient = coefficient;
    }
}
