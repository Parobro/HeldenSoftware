/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.ooOO.OOo0;
import helden.gui.ooOO.S;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Renamed from helden.gui.ooOO.oooo
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oooo_2
extends AbstractAction
implements PropertyChangeListener {
    private static final long \u00d400000 = -7265670122872453439L;
    private static oooo_2 o00000;
    private JCheckBoxMenuItem new;
    private JFrame \u00d300000 = null;

    public static oooo_2 o00000(JCheckBoxMenuItem jCheckBoxMenuItem, JFrame jFrame) {
        if (o00000 == null) {
            o00000 = new oooo_2(jCheckBoxMenuItem, jFrame);
        }
        return o00000;
    }

    private oooo_2(JCheckBoxMenuItem jCheckBoxMenuItem, JFrame jFrame) {
        super("PreRelease");
        this.new = jCheckBoxMenuItem;
        this.\u00d300000 = jFrame;
        Einstellungen.getInstance().addListener(this);
        this.o00000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!Einstellungen.getInstance().isPreRelease()) {
            int n = JOptionPane.showConfirmDialog(this.\u00d300000, "<html>PreRelease aktivieren?<br>Sie erhalten die Updates einige Wochen fr\u00fcher.", "Best\u00e4tigen", 0, 3);
            if (n == 0) {
                Einstellungen.getInstance().setPreRelease(!Einstellungen.getInstance().isPreRelease());
                S.super((A)this.\u00d300000).\u00d300000();
                OOo0.super(this.\u00d300000).actionPerformed(null);
            }
        } else {
            int n = JOptionPane.showConfirmDialog(this.\u00d300000, "<html>PreRelease deaktivieren?<br>Wird nicht empfohlen, da m\u00f6glicherweise Helden nicht mehr geladen werden k\u00f6nnen.", "Best\u00e4tigen", 0, 3);
            if (n == 0) {
                Einstellungen.getInstance().setPreRelease(!Einstellungen.getInstance().isPreRelease());
                S.super((A)this.\u00d300000).\u00d300000();
                OOo0.super(this.\u00d300000).actionPerformed(null);
            }
        }
        this.o00000();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.o00000();
    }

    private void o00000() {
        this.new.setSelected(Einstellungen.getInstance().isPreRelease());
    }
}

