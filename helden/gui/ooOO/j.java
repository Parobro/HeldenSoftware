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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends AbstractAction
implements PropertyChangeListener {
    private static final long \u00d300000 = -4278644176118407417L;
    private static j super;
    private JCheckBoxMenuItem \u00d200000;

    public static j super(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (super == null) {
            super = new j(jCheckBoxMenuItem);
        }
        return super;
    }

    private j(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Neue Heldenb\u00f6gen");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.super();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setNeueBoegen(!Einstellungen.getInstance().isNeueBoegen());
        if (!Einstellungen.getInstance().isNeueBoegen()) {
            Einstellungen.getInstance().setAlteBoegen(true);
        }
        A.\u00d4O0000().\u00d800000();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.super();
    }

    private void super() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isNeueBoegen());
    }
}

