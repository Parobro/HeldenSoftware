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
public final class y
extends AbstractAction {
    private static y o00000;
    private A new;

    public static y super(A a2) {
        if (o00000 == null) {
            o00000 = new y(a2);
        }
        return o00000;
    }

    private y(A a2) {
        super("GP-Startwert setzen ...");
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.super();
    }

    private void super() {
        String string = "" + Einstellungen.getInstance().getGPStartwert();
        Object object = JOptionPane.showInputDialog(this.new, "Setzen des GP Startwerts:\n\nEntsprechend WdH S.7, h\u00e4ngen die maximal erlaubten\nEigenschaftspunkte und das Eigenschaftsmaxium von\nden Start-GP ab.\n \n", "Start-GP", 3, null, null, string);
        if (object == null) {
            return;
        }
        try {
            String string2 = (String)object;
            int n = Integer.parseInt(string2);
            Einstellungen.getInstance().setGPStartwert(n);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.new, "Ung\u00fcltiger Wert", "Fehlerhafte Eingabe", 2);
        }
    }
}

