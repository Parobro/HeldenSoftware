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
 * Renamed from helden.gui.ooOO.b
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b_0
extends AbstractAction
implements PropertyChangeListener {
    private static b_0 o00000;
    private JCheckBoxMenuItem new;

    public static b_0 o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new b_0(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private b_0(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("Zauberquelle drucken");
        this.new = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setZauberQuelledrucken(!Einstellungen.getInstance().isZauberQuelledrucken());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.new.setSelected(Einstellungen.getInstance().isZauberQuelledrucken());
    }
}

