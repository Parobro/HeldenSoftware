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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.ooOO.oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
 */
public final class oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1
extends AbstractAction
implements PropertyChangeListener {
    private static oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 o00000;
    private JCheckBoxMenuItem \u00d200000;

    public static oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 super(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Heldenentwurf nach der Erschaffung speichern");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.super();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setAutoSaveNachErschaffung(!Einstellungen.getInstance().isAutoSaveNachErschaffung());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.super();
    }

    private void super() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isAutoSaveNachErschaffung());
    }
}

