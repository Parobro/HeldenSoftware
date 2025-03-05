/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.Einstellungen;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;

/*
 * Renamed from helden.gui.ooOO.oOoOo
 */
public final class ooooo_0
extends AbstractAction
implements PropertyChangeListener {
    private static ooooo_0 o00000;
    private JCheckBoxMenuItem \u00d200000;

    public static ooooo_0 o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new ooooo_0(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private ooooo_0(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Automatisch Updaten");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setAutoUpdate(!Einstellungen.getInstance().isAutoUpdate());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isAutoUpdate());
    }
}

