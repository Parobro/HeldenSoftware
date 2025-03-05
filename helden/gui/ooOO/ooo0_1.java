/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.object.a_0;
import helden.gui.A;
import helden.gui.oooo_1;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Renamed from helden.gui.ooOO.Ooo0
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ooo0_1
extends AbstractAction {
    private static ooo0_1 super;
    private A \u00d200000;

    public static ooo0_1 o00000(A a2) {
        if (super == null) {
            super = new ooo0_1(a2);
        }
        return super;
    }

    private ooo0_1(A a2) {
        super("Helden duplizieren", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/duplicate.gif"))));
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        K k2 = a_0.class().\u00d200000(this.\u00d200000.\u00d2O0000());
        if (k2 == null) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Duplizieren fehlgeschlagen", "Fehler beim Duplizieren des Helden", 0);
            return;
        }
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(A.\u00d4O0000().\u00d2O0000().\u00f4o0000());
        k2.\u00d500000(k2.\u00f5o0000() + " (Kopie)");
        this.\u00d200000.super(k2, true, true);
        Einstellungen.getInstance().setSeitenEinstellungen(k2.\u00f4o0000(), (DruckEinstellungen)druckEinstellungen.clone());
    }
}

