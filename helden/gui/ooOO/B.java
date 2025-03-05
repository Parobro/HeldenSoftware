/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.gui.A;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;

public final class B
extends AbstractAction
implements PropertyChangeListener {
    private static final long Object = 5211319979718660378L;
    private static B o00000;
    private JCheckBoxMenuItem \u00d200000;

    public static B o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new B(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private B(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Alte Heldenb\u00f6gen");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setAlteBoegen(!Einstellungen.getInstance().isAlteBoegen());
        if (!Einstellungen.getInstance().isAlteBoegen()) {
            Einstellungen.getInstance().setNeueBoegen(true);
        }
        A.\u00d4O0000().\u00d800000();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isAlteBoegen());
    }
}

