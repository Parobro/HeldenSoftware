/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;

public final class oo0o
extends AbstractAction
implements PropertyChangeListener {
    private static oo0o o00000;
    private JCheckBoxMenuItem \u00d200000;

    public static oo0o o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new oo0o(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private oo0o(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Geldkreise ein");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setGeldKreiseDrucken(!Einstellungen.getInstance().isGeldKreiseDrucken());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isGeldKreiseDrucken());
    }
}

