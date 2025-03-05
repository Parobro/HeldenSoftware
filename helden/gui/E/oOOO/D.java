/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.oOOO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class D {
    private PropertyChangeSupport o00000 = new PropertyChangeSupport(this);

    public void o00000(PropertyChangeListener propertyChangeListener) {
        this.o00000.addPropertyChangeListener(propertyChangeListener);
    }

    public void o00000() {
        this.o00000.firePropertyChange("", null, null);
    }
}

