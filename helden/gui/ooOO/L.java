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
public final class L
extends AbstractAction
implements PropertyChangeListener {
    private static L super;
    private JCheckBoxMenuItem \u00d200000;

    public static L o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (super == null) {
            super = new L(jCheckBoxMenuItem);
        }
        return super;
    }

    private L(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Tierfeld drucken");
        this.\u00d200000 = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setTiereDrucken(!Einstellungen.getInstance().getTiereDrucken());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.\u00d200000.setSelected(Einstellungen.getInstance().getTiereDrucken());
    }
}

