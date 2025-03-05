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
public final class classsuper
extends AbstractAction
implements PropertyChangeListener {
    private static classsuper o00000;
    private JCheckBoxMenuItem new;

    public static classsuper o00000(JCheckBoxMenuItem jCheckBoxMenuItem) {
        if (o00000 == null) {
            o00000 = new classsuper(jCheckBoxMenuItem);
        }
        return o00000;
    }

    private classsuper(JCheckBoxMenuItem jCheckBoxMenuItem) {
        super("zu lange Kommentare erlauben");
        this.new = jCheckBoxMenuItem;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Einstellungen.getInstance().setIgnoriereAlleLaengenChecks(!Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.new.setSelected(Einstellungen.getInstance().isIgnoriereAlleLaengenChecks());
    }
}

