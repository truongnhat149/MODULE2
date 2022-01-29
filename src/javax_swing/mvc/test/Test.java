package javax_swing.mvc.test;

import com.sun.source.tree.CompilationUnitTree;
import javax_swing.mvc.model.CounterModel;
import javax_swing.mvc.view.CounterView;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increament();
        ct.increament();
        ct.increament();
        ct.decrement();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());

        CounterView ctv = new CounterView();
    }
}
