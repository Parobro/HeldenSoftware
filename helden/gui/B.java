/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import java.awt.Frame;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class B
implements PropertyChangeListener {
    private static B Object;
    private JProgressBar \u00d400000 = new JProgressBar();
    private JDialog \u00d200000;
    private A \u00d500000;
    private boolean o00000 = true;

    public static B \u00d200000() {
        if (Object == null) {
            Object = new B();
        }
        return Object;
    }

    private B() {
    }

    public void \u00d300000() {
        if (this.\u00d500000 != null && this.\u00d200000 != null) {
            this.\u00d200000.dispose();
        }
    }

    public JProgressBar super() {
        return this.\u00d400000;
    }

    public void super(int n, int n2, String string) {
        this.\u00d400000.setMaximum(n2);
        this.\u00d400000.setMinimum(n);
        this.\u00d400000.setValue(n);
        this.o00000 = true;
        if (!Einstellungen.getInstance().isInit()) {
            this.\u00d200000 = new JDialog((Frame)this.\u00d500000, false);
            if (this.\u00d500000 != null) {
                this.\u00d200000.getContentPane().add(this.\u00d400000);
                this.\u00d200000.setSize(200, 50);
                this.\u00d200000.setName(string);
                this.\u00d200000.setTitle(string);
                Utils.zentriere(this.\u00d200000);
                this.\u00d200000.setVisible(true);
            }
            this.\u00d200000.update(this.\u00d200000.getGraphics());
        }
    }

    public void super(int n, int n2) {
        this.\u00d400000.setMinimum(0);
        this.\u00d400000.setMaximum(n);
        this.\u00d400000.setValue(n2);
        if (!Einstellungen.getInstance().isInit()) {
            this.\u00d200000.update(this.\u00d200000.getGraphics());
        }
        this.\u00d400000.revalidate();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("value") && this.o00000) {
            this.super((Integer)propertyChangeEvent.getOldValue(), (Integer)propertyChangeEvent.getNewValue());
        }
    }

    public void super(A a2) {
        this.\u00d500000 = a2;
        this.\u00d200000 = new JDialog((Frame)this.\u00d500000, false);
        this.\u00d200000.update(this.\u00d200000.getGraphics());
    }

    public void super(boolean bl) {
        this.o00000 = bl;
    }
}

