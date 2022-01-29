package javax_swing.jtext_filed.model;

public class MiniCalculatorModel {
    private double first_Value, second_Value, answer;

    public MiniCalculatorModel() {

    }

    public double getFirst_Value() {
        return this.first_Value;
    }

    public void setFirst_Value(double first_Value) {
        this.first_Value = first_Value;
    }

    public double getSecond_Value() {
        return second_Value;
    }

    public void setSecond_Value(double second_Value) {
        this.second_Value = second_Value;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus() {
        this.answer = this.first_Value + this.second_Value;
    }

    public void minus() {
        this.answer = this.first_Value - this.second_Value;
    }

    public void multiply() {
        this.answer = this.first_Value * this.second_Value;
    }

    public void devide() {
        this.answer = this.first_Value / this.second_Value;
    }
     public void pow() {
        this.answer = Math.pow(this.first_Value, this.second_Value);
     }

     public void mod() {
        this.answer = this.first_Value % this.second_Value;
     }

}
