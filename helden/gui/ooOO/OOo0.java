/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.comm.updater.UpdateCheck;
import helden.gui.A;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class OOo0
extends AbstractAction {
    private static final long Object = 8127140122332040600L;
    private static OOo0 \u00d200000 = null;
    private A o00000 = null;

    public static OOo0 super(JFrame jFrame) {
        if (\u00d200000 == null) {
            \u00d200000 = new OOo0();
        }
        return \u00d200000;
    }

    private OOo0() {
        super("Jetzt Updaten");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UpdateCheck updateCheck = UpdateCheck.getInstance(this.o00000, true);
        while (updateCheck.isLoading()) {
            try {
                if (!updateCheck.istServerOnline()) {
                    JOptionPane.showMessageDialog(this.o00000, "Server ist leider nicht erreichbar!");
                    return;
                }
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {}
        }
        if (updateCheck.istAusEclipseGestartet()) {
            JOptionPane.showMessageDialog(this.o00000, "<html>Helden wurde nicht aus einem Jarfile gestartet,<br> Update nicht m\u00f6glich!");
        } else {
            updateCheck.zeigeUpdateDialog();
        }
    }
}

