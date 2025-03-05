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
public final class R
extends AbstractAction
implements PropertyChangeListener {
    private static R super;
    private JCheckBoxMenuItem \u00d200000;

    public static R o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (super == null) {
            super = new R(jCheckBoxMenuItem);
        }
        return super;
    }

    private R(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("G\u00f6ttergeschenke");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.putValue("ShortDescription", "<html><body>Legt fest, ob bei der Heldenerstellung G\u00f6ttergeschenke vergeben werden sollen.<br>siehe Geographica Aventurica S. 197");
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setGoettergeschnkeVergeben(!Einstellungen.getInstance().isGoettergeschnkeVergeben());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().isGoettergeschnkeVergeben());
    }
}

