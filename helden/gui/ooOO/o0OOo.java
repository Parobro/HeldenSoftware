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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o0OOo
extends AbstractAction
implements PropertyChangeListener {
    private static o0OOo super;
    private JCheckBoxMenuItem \u00d200000;

    public static o0OOo o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (super == null) {
            super = new o0OOo(jCheckBoxMenuItem);
        }
        return super;
    }

    private o0OOo(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Hilfetext anzeigen");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setHilfeAnzeigen(!Einstellungen.getInstance().isHilfeAnzeigen());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isHilfeAnzeigen());
    }
}

