/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class ExtJSpinner
extends JSpinner {
    private Object o00000;

    public Object getPayLoad() {
        return this.o00000;
    }

    public void releaseMouse() {
        for (int i2 = 0; i2 < this.getComponentCount(); ++i2) {
            MouseListener[] mouseListenerArray;
            Component component = this.getComponent(i2);
            if (!(component instanceof JButton)) continue;
            for (MouseListener mouseListener : mouseListenerArray = component.getMouseListeners()) {
                mouseListener.mouseReleased(new MouseEvent(component, 502, System.currentTimeMillis(), 0, 0, 0, 1, false));
            }
        }
    }

    public void setPayLoad(Object object) {
        this.o00000 = object;
    }
}

