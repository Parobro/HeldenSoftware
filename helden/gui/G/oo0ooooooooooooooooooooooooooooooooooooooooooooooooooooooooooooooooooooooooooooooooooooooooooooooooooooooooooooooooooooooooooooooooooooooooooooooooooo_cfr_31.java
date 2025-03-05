/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.O0OO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.classsuper;
import helden.framework.held.object.a_0;
import helden.gui.G.D;
import helden.gui.G.O0O0;
import helden.gui.G.nullsuper;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.oO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
 */
public class oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0
extends WindowAdapter
implements ActionListener,
ListSelectionListener {
    private O0O0 o00000;
    private nullsuper Object;
    private O0OO \u00d200000;
    private boolean \u00d400000;

    public oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(O0O0 o0O0) {
        this.o00000 = o0O0;
        o0O0.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.\u00d400000()) {
            this.o00000.setCursor(new Cursor(3));
            this.\u00d300000();
        }
        if (actionEvent.getSource() == this.o00000.class()) {
            this.o00000.setCursor(new Cursor(3));
            this.super();
        }
        if (actionEvent.getSource() == this.o00000.super()) {
            String string = "";
            string = this.\u00d400000 ? "Die Eingabe des Helden wirklich beenden?" : "Den Editor wirklich beenden?";
            if (Einstellungen.getInstance().isFehler()) {
                this.\u00d200000 = null;
                this.o00000.dispose();
            } else if (JOptionPane.showConfirmDialog(this.o00000, string, "Abbrechen", 0) == 0) {
                this.\u00d200000 = null;
                this.o00000.dispose();
            }
        }
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO class() {
        if (this.\u00d200000 == null) {
            return null;
        }
        return this.\u00d200000.\u00d800000();
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 == null) {
            this.\u00d200000 = a_0.class().\u00d300000();
            this.\u00d200000.\u00f6O0000();
            this.\u00d200000.\u00d800000().o00000(System.currentTimeMillis());
            this.\u00d200000.\u00d800000().\u00f5\u00d40000().add(classsuper.\u00d800000);
            this.\u00d400000 = true;
        } else {
            this.\u00d200000 = new O0OO((K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            this.\u00d400000 = false;
        }
        this.\u00d200000.\u00d800000().\u00f8\u00d20000();
        this.o00000.class().setEnabled(false);
        this.Object = new nullsuper(this.\u00d200000, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 == null);
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 != null) {
            this.Object.\u00d800000();
        }
        this.\u00d200000();
    }

    public void \u00d400000() {
        this.Object.super(this.o00000.\u00d200000());
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        JList jList;
        if (listSelectionEvent.getSource() == this.o00000.\u00f400000() && (jList = (JList)listSelectionEvent.getSource()).getSelectedValue() != null) {
            this.o00000.setCursor(new Cursor(3));
            if (this.Object.\u00d200000((String)jList.getSelectedValue())) {
                this.\u00d200000();
            } else {
                jList.setSelectedValue(this.Object.\u00f600000(), true);
            }
            this.o00000.setCursor(new Cursor(0));
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        super.windowClosed(windowEvent);
        this.\u00d200000 = null;
    }

    private void \u00d200000() {
        D d2 = this.Object.super();
        if (d2 == null && this.Object.class()) {
            this.o00000.dispose();
            return;
        }
        if (Einstellungen.getInstance().isFehler()) {
            this.o00000.class().setEnabled(false);
            this.o00000.class().setText("Fehler");
            this.o00000.\u00d400000().setText("Fehler");
            this.o00000.\u00d400000().setEnabled(false);
        } else {
            d2 = this.Object.super();
            this.o00000.super(d2.\u00d200000());
            if (d2.super() == null) {
                System.out.println("Panel null");
            }
            this.o00000.super(d2.super());
            if (this.Object.\u00d600000()) {
                this.o00000.\u00d400000().setText("Fertig");
            } else {
                this.o00000.\u00d400000().setText("Weiter");
            }
            if (this.Object.\u00d400000()) {
                this.o00000.class().setEnabled(true);
            } else {
                this.o00000.class().setEnabled(false);
            }
        }
        this.o00000.setCursor(new Cursor(0));
        this.\u00d400000();
    }

    private void \u00d300000() {
        this.Object.\u00d300000();
        this.\u00d200000();
    }

    private void super() {
        this.Object.\u00d200000();
        this.\u00d200000();
    }
}

