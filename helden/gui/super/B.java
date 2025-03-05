/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.A.A;
import helden.framework.OoOO.U;
import helden.framework.held.C;
import helden.framework.held.object.oooo_1;
import helden.framework.held.oooo_0;
import helden.framework.oooo.b_0;
import helden.gui.super.null;
import helden.gui.super.super;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
implements ActionListener,
FocusListener,
ChangeListener {
    private null o00000;
    private oooo_1 \u00d300000;
    private super new;

    public B(null nullVal, super super_) {
        this.o00000 = nullVal;
        this.new = super_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            String string = "";
            if (actionEvent.getSource() == this.o00000.\u00d5\u00d40000()) {
                this.o00000();
            } else if (actionEvent.getSource() == this.o00000.\u00d6\u00d40000()) {
                if (this.o00000.\u00d6\u00d40000().getSelectedItem() != null) {
                    this.\u00d300000.\u00d200000(this.o00000.\u00d6\u00d40000().getSelectedItem().toString());
                }
            } else if (((JButton)actionEvent.getSource()).getName().endsWith("-permanent")) {
                string = ((JButton)actionEvent.getSource()).getName();
                string = string.substring(0, string.length() - 10);
                b_0 b_02 = b_0.\u00f400000(string);
                this.\u00d300000.o00000(b_02);
                this.o00000.o00000(b_02, this.\u00d300000);
                this.\u00d200000();
            } else {
                string = ((JButton)actionEvent.getSource()).getName();
                b_0 b_03 = null;
                b_03 = b_0.\u00f400000(string);
                this.\u00d300000.\u00d300000(b_03);
                this.o00000.o00000(b_03, this.\u00d300000);
                this.\u00d200000();
            }
        }
        catch (oooo_0 oooo_02) {
            JOptionPane.showMessageDialog(this.o00000, "Nicht gen\u00fcgend AP verf\u00fcgbar");
        }
        catch (C c) {
            JOptionPane.showMessageDialog(this.o00000, c.getMessage());
            ((JButton)actionEvent.getSource()).setEnabled(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("Steigern nicht vorhandener Eigenschaft " + exception);
        }
        this.new.public();
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        if (focusEvent.getSource() == this.o00000.\u00d5\u00d40000()) {
            this.o00000();
        }
    }

    public void o00000(oooo_1 oooo_12) {
        this.\u00d300000 = oooo_12;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JCheckBox jCheckBox = (JCheckBox)changeEvent.getSource();
        String string = jCheckBox.getName();
        b_0 b_02 = null;
        try {
            b_02 = b_0.\u00f400000(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException("Steigern nicht vorhandener Eigenschaft " + string);
        }
        this.\u00d300000.o00000((U)b_02, new Boolean(jCheckBox.isSelected()));
        this.o00000.o00000(b_02, this.\u00d300000);
        this.\u00d200000();
    }

    private void \u00d200000() {
        this.o00000.o00000(b_0.\u00f8\u00d8\u00d2000, this.\u00d300000);
        this.o00000.o00000(b_0.ifwhilesuper, this.\u00d300000);
        this.o00000.o00000(b_0.\u00f5\u00f4\u00d2000, this.\u00d300000);
        this.o00000.o00000(b_0.\u00f4\u00d8\u00d2000, this.\u00d300000);
        this.o00000.o00000(b_0.thispublicsuper, this.\u00d300000);
        this.o00000.o00000(b_0.\u00d8\u00f5\u00d2000, this.\u00d300000);
        this.o00000.o00000(b_0.\u00d3\u00f4\u00d2000, this.\u00d300000);
        if (this.\u00d300000.\u00d800000().oo0000()) {
            this.o00000.o00000(b_0.\u00f4\u00f5\u00d2000, this.\u00d300000);
        }
        if (this.\u00d300000.\u00d800000().\u00d8\u00d20000()) {
            this.o00000.o00000(b_0.\u00d4\u00f5\u00d2000, this.\u00d300000);
        }
    }

    private void o00000() {
        try {
            int n = this.\u00d300000.\u00d800000().o00000(b_0.\u00f5\u00f5\u00d2000);
            int n2 = Integer.parseInt(this.o00000.\u00d5\u00d40000().getText());
            if (n2 < 0) {
                this.\u00d300000();
                JOptionPane.showMessageDialog(this.o00000, "Der Sozialstatus darf nicht negativ sein.");
            }
            this.\u00d300000.\u00d500000(n2);
            if (n != n2) {
                A a2 = new A("Eigenschaft steigern", (Object)b_0.\u00f5\u00f5\u00d2000.toString(), "", (Integer)0, (Integer)0, (Integer)0, (Integer)0, "" + n, "" + n2);
                this.\u00d300000.\u00d800000().o00000(a2);
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.\u00d300000();
        }
        catch (C c) {
            this.\u00d300000();
            JOptionPane.showMessageDialog(this.o00000, "Der maximale Sozialstatus f\u00fcr Helden\nbetr\u00e4gt 21");
        }
    }

    private void \u00d300000() {
        this.o00000.\u00d5\u00d40000().setText("" + this.\u00d300000.\u00d800000().o00000(b_0.\u00f5\u00f5\u00d2000));
    }
}

