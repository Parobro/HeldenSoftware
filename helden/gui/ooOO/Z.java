/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.gui.A;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Z
extends AbstractAction {
    private static Z super;
    private A \u00d200000;

    public static Z o00000(A a2) {
        if (super == null) {
            super = new Z(a2);
        }
        return super;
    }

    private Z(A a2) {
        super("Talent- u. Zauberaktivierungen ...");
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.o00000();
    }

    private void o00000() {
        String string = "" + Einstellungen.getInstance().getAnzahlAktivierbar();
        Object object = JOptionPane.showInputDialog(this.\u00d200000, "Anzahl der Talent/Zauber Aktivierungen setzen.\nF\u00fcr Vollzauberer (Wert * 2) = Zauberaktivierungen\nErlaubte Werte (3 bis 10)", "Talent/Zauber Aktivierungen", 3, null, null, string);
        if (object == null) {
            return;
        }
        try {
            String string2 = (String)object;
            int n = Integer.parseInt(string2);
            if (n < 3 || n > 10) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Wert nicht im Bereich von 3 bs 10!", "Fehlerhafte Eingabe", 2);
            } else {
                Einstellungen.getInstance().setAnzahlAktivierbar(n);
            }
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.\u00d200000, "Ung\u00fcltiger Wert", "Fehlerhafte Eingabe", 2);
        }
    }
}

