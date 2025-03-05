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
public final class d
extends AbstractAction
implements PropertyChangeListener {
    private static d super;
    private JCheckBoxMenuItem \u00d200000;

    public static d o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (super == null) {
            super = new d(jCheckBoxMenuItem);
        }
        return super;
    }

    private d(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("im Vollbildmodus starten");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setFrameMaximize(!Einstellungen.getInstance().isFrameMaximize());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isFrameMaximize());
    }
}

