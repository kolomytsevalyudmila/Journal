
package journal;


public class exam {
    private double ball;
    private double coefficient;

    public exam(double ball, double coefficient) {
        this.ball = ball;
        this.coefficient = coefficient;
    }

    public double getBall() {
        return ball;
    }

    public void setBall(double ball) {
        this.ball = ball;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "exam{" + "ball=" + ball + ", coefficient=" + coefficient + '}';
    }
    
    
}
