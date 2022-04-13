package exercise_james.behavioral_design_pattern.implements_observer;

public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.println(" " + Integer.toHexString(subject.getState()));
    }
}
