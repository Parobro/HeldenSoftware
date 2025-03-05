/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.Oo0O;
import helden.framework.held.Object.private;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.gui.A;
import helden.gui.G.O0O0;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Renamed from helden.gui.ooOO.oOoo
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oooo_0
extends AbstractAction {
    private static oooo_0 o00000;
    private A new;

    public static oooo_0 o00000(A a2) {
        if (o00000 == null) {
            o00000 = new oooo_0(a2);
        }
        return o00000;
    }

    public static Action o00000(A a2, JDialog jDialog) {
        if (o00000 == null) {
            o00000 = new oooo_0(a2);
        }
        return o00000;
    }

    private oooo_0(A a2) {
        super("Einen Helden editieren ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Blank.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        K k2 = (K)this.new.\u00d2O0000();
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(A.\u00d4O0000().\u00d2O0000().\u00f4o0000());
        K k3 = a_0.class().\u00d200000(k2);
        if (k3 == null) {
            JOptionPane.showMessageDialog(this.new, "Duplizieren fehlgeschlagen", "Fehler beim Duplizieren des Helden", 0);
            return;
        }
        O0O0 o0O0 = new O0O0(this.new, k3);
        if (o0O0.int() == null) {
            return;
        }
        k3.ifnew().\u00d300000();
        this.new.super(k3, true, true);
        private.\u00d200000(Oo0O.o00000(k2, k3, true, "Editor"), "sven");
        k2.\u00d500000(k2.\u00f5o0000() + " (Kopie)");
        this.new.super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)k2, k3);
        this.new.int().setSelectedValue(k3, true);
        Einstellungen.getInstance().setSeitenEinstellungen(k3.\u00f4o0000(), (DruckEinstellungen)druckEinstellungen.clone());
    }
}

