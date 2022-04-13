package exercise_james.behavioral_design_pattern.implements_observer;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
