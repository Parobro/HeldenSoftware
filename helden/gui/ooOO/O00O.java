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
public final class O00O
extends AbstractAction
implements PropertyChangeListener {
    private static O00O o00000;
    private JCheckBoxMenuItem new;

    public static O00O o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new O00O(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private O00O(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("neue Helden in Gruppe [Neu]");
        this.new = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setNeueHeldenInTree(!Einstellungen.getInstance().isNeueHeldenInTree());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        boolean bl = Einstellungen.getInstance().isNeueHeldenInTree();
        this.new.setSelected(bl);
    }
}

