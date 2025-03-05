/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.e;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.Stringsuper;
import helden.framework.held.object.oooo_1;
import helden.gui.super.E.G;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.super.E.ooOO
 */
public class oooo_0
implements ActionListener,
WindowListener {
    private JDialog \u00d400000;
    private G o00000;
    private oooo_1 \u00d500000;
    private int \u00d300000;
    private HashMap<voidsuper, Integer> new;

    public oooo_0(JDialog jDialog, G g2, oooo_1 oooo_12) {
        this.\u00d400000 = jDialog;
        this.\u00d400000.addWindowListener(this);
        this.o00000 = g2;
        this.\u00d500000 = oooo_12;
        this.\u00d300000 = oooo_12.\u00d800000().\u00d400000();
        this.new = new HashMap();
        this.new();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.\u00d400000()) {
            this.o00000.\u00d2O0000().clear();
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.\u00d200000() && JOptionPane.showConfirmDialog(this.o00000, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d300000();
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.float()) {
            this.o00000();
            this.new();
        }
        if (actionEvent.getSource() instanceof JComboBox) {
            if (actionEvent.getSource() == this.o00000.o00000()) {
                this.o00000.\u00f600000().o00000((String)this.o00000.o00000().getSelectedItem());
                this.o00000.\u00f600000().fireTableDataChanged();
            }
        } else if (((JButton)actionEvent.getSource()).getText().equals("+")) {
            voidsuper voidsuper2 = this.o00000.\u00f600000().new();
            boolean bl = this.o00000.\u00f600000().o00000(voidsuper2);
            int n = Integer.MAX_VALUE;
            try {
                n = Math.round(this.\u00d500000.\u00d800000().\u00f8O0000().super(voidsuper2, this.\u00d500000.\u00d800000(), bl, false));
            }
            catch (Stringsuper stringsuper) {
                // empty catch block
            }
            if (n == Integer.MAX_VALUE) {
                JOptionPane.showMessageDialog(this.o00000, "Fehler beim Aktivieren des Zaubers", "Fehler", 0);
                return;
            }
            if (n > this.\u00d500000.\u00d800000().\u00d400000()) {
                JOptionPane.showMessageDialog(this.o00000, "Nicht gen\u00fcgend freie Abenteuerpunkte");
                return;
            }
            this.o00000(voidsuper2, bl);
            this.new();
        }
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.\u00d300000();
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    private void o00000(voidsuper voidsuper2, boolean bl) {
        int n = Integer.MAX_VALUE;
        try {
            n = Math.round(this.\u00d500000.\u00d800000().\u00f8O0000().super(voidsuper2, this.\u00d500000.\u00d800000(), bl, false));
        }
        catch (Stringsuper stringsuper) {
            stringsuper.printStackTrace();
        }
        this.o00000.\u00f600000().new(voidsuper2);
        try {
            this.\u00d500000.o00000(voidsuper2, null, null, bl);
        }
        catch (helden.framework.held.oooo_0 oooo_02) {
            oooo_02.printStackTrace();
        }
        this.new.put(voidsuper2, new Integer(n));
        this.o00000.\u00d2O0000().add(0, voidsuper2);
        this.o00000.\u00f600000().\u00d500000();
        this.new();
    }

    private void new() {
        this.o00000.\u00d500000().setText(this.\u00d500000.\u00d800000().\u00d400000() + " AP");
        this.o00000.\u00d600000().setText(this.\u00d300000 - this.\u00d500000.\u00d800000().\u00d400000() + " AP");
    }

    private void \u00d300000() {
        while (this.o00000.\u00d2O0000().size() > 0) {
            this.o00000();
        }
    }

    private void o00000() {
        if (this.o00000.\u00d2O0000().size() < 1) {
            return;
        }
        voidsuper voidsuper2 = (voidsuper)this.o00000.\u00d2O0000().getElementAt(0);
        this.o00000.\u00d2O0000().remove(0);
        this.\u00d500000.\u00d800000().\u00f8O0000().super(voidsuper2);
        this.o00000.\u00f600000().\u00d300000(voidsuper2);
        int n = this.new.get(voidsuper2);
        this.\u00d500000.\u00d800000().new(n + this.\u00d500000.\u00d800000().\u00d400000());
        this.o00000.\u00f600000().\u00d500000();
        int n2 = this.\u00d500000.\u00d800000().\u00d8O0000().size() - 1;
        this.\u00d500000.\u00d800000().\u00d8O0000().remove(n2);
    }
}

