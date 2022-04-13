package javax_swing.mvc.controler;

import javax_swing.mvc.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
private CounterView ctv;

public CounterListener(CounterView ctv) {
    this.ctv = ctv;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String scr = e.getActionCommand();
        System.out.println("Bạn đã nhấn nút " + scr);

        if(scr.equals("UP")) {
            this.ctv.increament();
        } else if (scr.equals("DOWN")) {
            this.ctv.decrement();
        }
    }
}
