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
public final class OooO
extends AbstractAction
implements PropertyChangeListener {
    private static OooO o00000;
    private JCheckBoxMenuItem new;

    public static OooO o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new OooO(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private OooO(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Seiten mit Heldennamen signieren");
        this.new = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setNameAufSeiteDrucken(!Einstellungen.getInstance().isNamenAufSeiteDrucken());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.new.setSelected(Einstellungen.getInstance().isNamenAufSeiteDrucken());
    }
}

