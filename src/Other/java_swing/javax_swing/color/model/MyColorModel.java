package javax_swing.color.model;

import java.awt.*;

public class MyColorModel {
    private Color foreground;
    private Color backgound;
    private boolean opaque;

    public MyColorModel() {
        this.foreground = Color.BLACK;
        this.backgound = Color.WHITE;
        this.opaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public Color getBackgound() {
        return backgound;
    }

    public void setBackgound(Color backgound) {
        this.backgound = backgound;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
}
