/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.Object;
import helden.framework.held.O;
import helden.framework.held.object.oooo_0;
import helden.framework.held.object.oooo_1;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.gui.allgemein.Utils;
import helden.gui.components.JComboCheckBox;
import helden.gui.super.B.E;
import helden.gui.super.B.OO0O;
import helden.gui.super.B.P;
import helden.gui.super.B.null;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class K
implements ActionListener,
ListSelectionListener,
KeyListener {
    private JDialog \u00d200000;
    private E super;
    private oooo_1 \u00d400000;
    private ArrayList<F> \u00d300000;

    public K(E e, int n, oooo_1 oooo_12) {
        this.super = e;
        this.\u00d400000 = oooo_12;
        this.\u00d300000 = new ArrayList();
        this.\u00d300000.addAll(O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().Object());
        Collections.sort(this.\u00d300000);
        this.\u00d200000();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        java.lang.Object object;
        if (actionEvent.getSource().equals(this.super.o\u00d80000())) {
            object = (F)this.super.\u00d6\u00d60000().getSelectedValue();
            if (object == null) {
                JOptionPane.showMessageDialog(this.super, "Es wurde kein Gegenstand aus der Liste gew\u00e4hlt.\nBitte einen Gegenstand w\u00e4hlen!", "Gegenstand w\u00e4hlen", 0);
                return;
            }
            try {
                this.\u00d200000((F)object);
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                oooo_0.o00000(cloneNotSupportedException);
            }
        }
        if (actionEvent.getSource().equals(this.super.superclass())) {
            this.super.o00000(this.\u00d400000.\u00d800000());
            this.\u00d200000.setVisible(false);
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.\u00d2\u00d60000())) {
            if (this.super.\u00f5\u00d60000().getSelectedRow() >= 0) {
                object = (F)this.super.\u00f5\u00d60000().getValueAt(this.super.\u00f5\u00d60000().getSelectedRow(), 4);
                this.o00000((F)object);
                this.super.o00000();
                this.o00000();
            } else {
                JOptionPane.showMessageDialog(this.super, "Es wurde kein Gegenstand aus der Liste gew\u00e4hlt.\nBitte einen Gegenstand w\u00e4hlen!", "Gegenstand w\u00e4hlen", 0);
            }
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.\u00f4\u00d60000())) {
            object = new null(this.\u00d400000.\u00d800000().\u00d8o0000(), (F)this.super.\u00f5\u00d60000().getValueAt(this.super.\u00f5\u00d60000().getSelectedRow(), 4));
            JDialog jDialog = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde teilen", true);
            object.String().o00000(jDialog);
            jDialog.getContentPane().add((Component)object);
            jDialog.setSize(230, 180);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
            this.super.o00000();
        }
        if (((JButton)actionEvent.getSource()).equals(this.super.\u00f6\u00d50000())) {
            object = this.super.\u00f5\u00d60000().getSelectedRows();
            int n = 0;
            for (F f2 : object) {
                F f3 = (F)this.super.\u00f5\u00d60000().getValueAt((int)f2, 4);
                if (!this.\u00d400000.\u00d800000().o00000(0).\u00d200000(f3) && !this.\u00d400000.\u00d800000().o00000(1).\u00d200000(f3) && !this.\u00d400000.\u00d800000().o00000(2).\u00d200000(f3)) continue;
                ++n;
            }
            if (n > 1) {
                JOptionPane.showMessageDialog(this.super, "Man kann nicht mehrere ausger\u00fcstete Gegenst\u00e4nde verschmelzen.\nBitte Auswahl dem entsprechend anpassen!", "Gegenstand w\u00e4hlen", 0);
                return;
            }
            F[] fArray = new F[((java.lang.Object)object).length];
            for (int i2 = 0; i2 < ((F[])object).length; ++i2) {
                fArray[i2] = (F)this.super.\u00f5\u00d60000().getValueAt((int)object[i2], 4);
            }
            P p2 = new P(this.\u00d400000.\u00d800000().\u00d8o0000(), this.\u00d400000.\u00d800000(), fArray);
            JDialog jDialog = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde verbinden", true);
            p2.\u00d200000().o00000(jDialog);
            jDialog.getContentPane().add(p2);
            jDialog.setSize(400, 300);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
            this.super.o00000();
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        this.String();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    public void o00000(JDialog jDialog) {
        this.\u00d200000 = jDialog;
    }

    public void String() {
        this.o00000(this.\u00d300000);
    }

    public void \u00d300000() {
        java.lang.Object[] objectArray = this.super.\u00d4\u00d60000().getSelectedValues();
        ArrayList<F> arrayList = new ArrayList<F>();
        for (java.lang.Object object : objectArray) {
            arrayList.addAll(O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000((Object)((java.lang.Object)object)));
        }
        Collections.sort(arrayList);
        this.\u00d300000 = arrayList;
        this.o00000(arrayList);
        this.o00000();
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        java.lang.Object object;
        O o = this.\u00d400000.\u00d800000().\u00d8o0000();
        if (listSelectionEvent.getSource().equals(this.super.\u00d4\u00d60000())) {
            this.\u00d300000();
        }
        if (listSelectionEvent.getSource().equals(this.super.\u00d6\u00d60000())) {
            object = (F)this.super.\u00d6\u00d60000().getSelectedValue();
            if (object == null) {
                this.super.\u00f5\u00d60000().getSelectionModel().clearSelection();
            } else {
                this.o00000();
            }
        }
        if (listSelectionEvent.getSource().equals(this.super.\u00f5\u00d60000().getSelectionModel())) {
            object = this.super.\u00f5\u00d60000().getSelectedRows();
            if (((java.lang.Object)object).length > 0) {
                this.super.\u00f6\u00d50000().setEnabled(false);
                F f2 = (F)this.super.\u00f5\u00d60000().getValueAt(this.super.\u00f5\u00d60000().getSelectedRow(), 4);
                if (f2.\u00f500000() > 1) {
                    if (o.o00000(f2)) {
                        this.super.\u00f4\u00d60000().setEnabled(true);
                    } else {
                        this.super.\u00f4\u00d60000().setEnabled(false);
                    }
                } else {
                    this.super.\u00f4\u00d60000().setEnabled(false);
                }
                if (((java.lang.Object)object).length > 1) {
                    String string = f2.toString();
                    boolean bl = true;
                    for (java.lang.Object object2 : object) {
                        f2 = (F)this.super.\u00f5\u00d60000().getValueAt((int)object2, 4);
                        if (f2.toString().equals(string)) continue;
                        bl = false;
                    }
                    if (bl && !f2.\u00d200000()) {
                        this.super.\u00f6\u00d50000().setEnabled(true);
                    } else {
                        this.super.\u00f6\u00d50000().setEnabled(false);
                    }
                }
            } else {
                this.super.\u00f4\u00d60000().setEnabled(false);
                this.super.\u00f6\u00d50000().setEnabled(false);
            }
        }
    }

    private void \u00d200000() {
        DefaultComboBoxModel<java.lang.Object> defaultComboBoxModel = new DefaultComboBoxModel<java.lang.Object>();
        for (Settings settings : Settings.getSettings()) {
            boolean bl = false;
            if (this.\u00d400000.\u00d800000().oO0000().getName().equals(settings.getName())) {
                bl = true;
            } else {
                for (Setting setting : this.\u00d400000.\u00d800000().oO0000().getOptionaleSettings()) {
                    if (!setting.getName().equals(settings.getName())) continue;
                    bl = true;
                    break;
                }
            }
            JCheckBox jCheckBox = new JCheckBox(settings.getName(), bl);
            jCheckBox.setToolTipText(settings.getBeschreibung());
            defaultComboBoxModel.addElement(jCheckBox);
        }
        JComboCheckBox jComboCheckBox = new JComboCheckBox(defaultComboBoxModel, this);
        this.super.o00000(jComboCheckBox);
    }

    private void o00000(ArrayList<F> arrayList) {
        java.lang.Object object;
        ArrayList<Settings> arrayList2 = new ArrayList<Settings>();
        block0: for (int i2 = 0; i2 < this.super.classclass().getModel().getSize(); ++i2) {
            object = (JCheckBox)this.super.classclass().getModel().getElementAt(i2);
            if (!((AbstractButton)object).isSelected()) continue;
            for (Settings settings : Settings.getSettings()) {
                if (!settings.getName().equals(((AbstractButton)object).getText())) continue;
                arrayList2.add(settings);
                continue block0;
            }
        }
        DefaultListModel<F> defaultListModel = new DefaultListModel<F>();
        object = this.super.\u00f6\u00d60000().getText();
        for (int i3 = 0; i3 < arrayList.size(); ++i3) {
            if (!this.o00000(arrayList.get(i3), arrayList2)) continue;
            if (((String)object).length() > 0) {
                if (!arrayList.get(i3).toString().toLowerCase().contains(((String)object).toLowerCase())) continue;
                defaultListModel.addElement(arrayList.get(i3));
                continue;
            }
            defaultListModel.addElement(arrayList.get(i3));
        }
        this.super.\u00d6\u00d60000().setModel(defaultListModel);
    }

    private void \u00d200000(F f2) throws CloneNotSupportedException {
        boolean bl;
        if (f2.public()) {
            f2 = f2.\u00f400000();
            f2.o00000("");
            this.o00000(f2);
            if (f2.OO0000().isEmpty()) {
                return;
            }
        }
        if (bl = this.\u00d400000.\u00d800000().\u00d8o0000().new(f2)) {
            this.super.o00000();
            this.o00000();
        } else {
            JOptionPane.showMessageDialog(this.super, "es wurde die maximale Anzahl gleicher Objekte erreicht.\nBitte erst eines L\u00f6schen oder Zusammenf\u00fcgen!\nmaximum: " + this.\u00d400000.\u00d800000().\u00d8o0000().\u00d300000(), "Maximum erreicht", 0);
        }
    }

    private boolean o00000(F f2, ArrayList<Settings> arrayList) {
        for (Settings settings : arrayList) {
            if (!settings.contains(f2)) continue;
            return true;
        }
        return false;
    }

    private void o00000() {
        F f2 = (F)this.super.\u00d6\u00d60000().getSelectedValue();
        if (f2 != null) {
            this.super.\u00f5\u00d60000().getSelectionModel().clearSelection();
            int n = this.super.\u00f5\u00d60000().getRowCount();
            for (int i2 = 0; i2 < n; ++i2) {
                F f3 = (F)this.super.\u00f5\u00d60000().getValueAt(i2, 4);
                if (!f3.toString().equals(f2.toString())) continue;
                this.super.\u00f5\u00d60000().getSelectionModel().addSelectionInterval(i2, i2);
            }
        }
    }

    private void o00000(F f2) {
        OO0O oO0O2 = new OO0O(f2, this.\u00d400000);
        JDialog jDialog = new JDialog(Utils.getFrame(this.super), "Gegenst\u00e4nde des Inventars bearbeiten", true);
        oO0O2.\u00d800000().o00000(jDialog);
        jDialog.getContentPane().add(oO0O2);
        jDialog.setSize(800, 500);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
    }
}

