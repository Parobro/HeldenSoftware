/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.C.I;
import helden.framework.C.OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.C.public;
import helden.framework.HeldenMath;
import helden.framework.Monat;
import helden.framework.held.A.E;
import helden.framework.held.Object.O0OO;
import helden.framework.held.a.oooo_1;
import helden.gui.G.D;
import helden.gui.g.b_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ifsuper
extends D
implements ChangeListener,
ActionListener {
    private b_0 \u00f4o0000 = new b_0(this, this);

    public ifsuper(O0OO o0OO2) {
        super(o0OO2);
        int n;
        this.\u00f4o0000.\u00d2o0000().setSelected(this.\u00d600000().private());
        this.\u00d4O0000();
        if (this.\u00d600000().\u00d800000().\u00f5o0000() != null) {
            this.\u00f4o0000.\u00f600000().setText(this.\u00d600000().\u00d800000().\u00f5o0000());
        }
        this.\u00f4o0000.\u00f800000().setText("1");
        this.\u00f4o0000.\u00d8O0000().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().o\u00d30000(), 0, Integer.MAX_VALUE, 1));
        this.\u00f4o0000.\u00d300000().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().o\u00d30000() - o0OO2.\u00d800000().\u00d400000(), 0, Integer.MAX_VALUE, 1));
        for (oooo_1 object22 : o0OO2.\u00d800000().o\u00d20000().getHaarfarben()) {
            this.\u00f4o0000.\u00d500000().addItem(object22.String());
        }
        JComboBox jComboBox = this.\u00f4o0000.\u00d500000();
        for (String string : oooo_1.\u00d200000()) {
            boolean bl = false;
            for (n = 0; n < jComboBox.getItemCount(); ++n) {
                if (!string.equals(jComboBox.getItemAt(n))) continue;
                bl = true;
            }
            if (bl) continue;
            jComboBox.addItem(string);
        }
        if (o0OO2.\u00d800000().o\u00d20000().getHaarfarben().isEmpty()) {
            this.\u00f4o0000.\u00d500000().addItem("keine");
        }
        if (o0OO2.\u00d800000().\u00d500000().\u00d400000(I.\u00f40O000)) {
            this.\u00f4o0000.\u00d500000().addItem("wei\u00df");
            this.\u00f4o0000.\u00d500000().setSelectedItem("wei\u00df");
            this.\u00f4o0000.\u00d500000().setEditable(false);
        }
        if (o0OO2.\u00d800000().thissuper().getHaarFarbe() != null) {
            this.\u00f4o0000.\u00d500000().setSelectedItem(o0OO2.\u00d800000().thissuper().getHaarFarbe());
            if (!this.\u00f4o0000.\u00d500000().getSelectedItem().equals(o0OO2.\u00d800000().thissuper().getHaarFarbe())) {
                this.\u00f4o0000.\u00d500000().addItem(o0OO2.\u00d800000().thissuper().getHaarFarbe());
                this.\u00f4o0000.\u00d500000().setSelectedItem(o0OO2.\u00d800000().thissuper().getHaarFarbe());
            }
        }
        for (oooo_1 oooo_12 : o0OO2.\u00d800000().o\u00d20000().getAugenfarben()) {
            this.\u00f4o0000.private().addItem(oooo_12.String());
        }
        JComboBox jComboBox2 = this.\u00f4o0000.private();
        for (String string : oooo_1.\u00d200000()) {
            n = 0;
            for (int i2 = 0; i2 < jComboBox2.getItemCount(); ++i2) {
                if (!string.equals(jComboBox2.getItemAt(i2))) continue;
                n = 1;
            }
            if (n != 0) continue;
            jComboBox2.addItem(string);
        }
        if (o0OO2.\u00d800000().o\u00d20000().getAugenfarben().isEmpty()) {
            this.\u00f4o0000.private().addItem("keine");
        }
        if (o0OO2.\u00d800000().\u00d500000().\u00d400000(I.\u00f40O000)) {
            this.\u00f4o0000.private().addItem("rot");
            this.\u00f4o0000.private().setSelectedItem("rot");
            this.\u00f4o0000.private().setEditable(false);
        }
        if (o0OO2.\u00d800000().thissuper().getAugenFarbe() != null) {
            this.\u00f4o0000.private().setSelectedItem(o0OO2.\u00d800000().thissuper().getAugenFarbe());
            if (!this.\u00f4o0000.private().getSelectedItem().equals(o0OO2.\u00d800000().thissuper().getAugenFarbe())) {
                this.\u00f4o0000.private().addItem(o0OO2.\u00d800000().thissuper().getAugenFarbe());
                this.\u00f4o0000.private().setSelectedItem(o0OO2.\u00d800000().thissuper().getAugenFarbe());
            }
        }
        this.\u00f4o0000.\u00f500000().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().\u00f4O0000().o00000(), 1, 30, 1));
        this.\u00f4o0000.newsuper().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().\u00f4O0000().\u00d200000().getNummer(), 1, 13, 1));
        this.\u00f4o0000.oo0000().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().\u00f4O0000().\u00d400000(), -10000, 10000, 1));
        this.\u00f4o0000.\u00f6O0000().setModel(new SpinnerNumberModel(o0OO2.\u00d800000().thissuper().\u00d200000(), 0, 10000, 1));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    @Override
    public String \u00d200000() {
        return "Gib Namen, Gr\u00f6\u00dfe und Gewicht an";
    }

    @Override
    public JPanel super() {
        return this.\u00f4o0000;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() == this.\u00f4o0000.\u00d8O0000()) {
            int n = (Integer)this.\u00f4o0000.\u00d8O0000().getValue();
            this.\u00f4o0000.\u00f800000().setText("" + HeldenMath.getStufe41(n));
        }
    }

    @Override
    public boolean \u00d400000() {
        int n;
        int n2;
        int n3 = (Integer)this.\u00f4o0000.\u00d300000().getValue();
        if (n3 > (n2 = ((Integer)this.\u00f4o0000.\u00d8O0000().getValue()).intValue())) {
            JOptionPane.showMessageDialog(this.\u00f4o0000, "Die eingesetzten AP m\u00fc\u00dfen kleiner als die AP sein! ", "Flscher Wert", 2);
            return false;
        }
        this.\u00d600000().\u00d600000(n2);
        this.\u00d600000().\u00d800000(n2 - n3);
        String string = this.\u00f4o0000.\u00f600000().getText();
        if (string.equals("")) {
            JOptionPane.showMessageDialog(this.\u00f4o0000, "Es muss ein Name angegeben werden ", "Kein Name angegeben", 2);
            return false;
        }
        this.\u00d600000().o00000(string);
        int n4 = (Integer)this.\u00f4o0000.o00000().getValue();
        int n5 = (Integer)this.\u00f4o0000.\u00f8O0000().getValue();
        this.\u00d600000().\u00d800000().o\u00d20000().setGroesse(n4);
        this.\u00d600000().\u00d800000().thissuper().\u00d300000(n4);
        if (this.\u00d600000().\u00d800000().o00000(I.\u00f8\u00d2o000)) {
            n = (int)((double)n5 / 1.75);
            if ((n > this.\u00d600000().\u00d800000().o\u00d20000().getMaxGewicht() || n < this.\u00d600000().\u00d800000().o\u00d20000().getMinGewicht()) && n5 <= this.\u00d600000().\u00d800000().o\u00d20000().getMaxGewicht() && n5 >= this.\u00d600000().\u00d800000().o\u00d20000().getMinGewicht()) {
                n = n5;
            }
            this.\u00d600000().\u00d800000().thissuper().\u00d200000(n);
        } else {
            n = n5;
            if ((n > this.\u00d600000().\u00d800000().o\u00d20000().getMaxGewicht() || n < this.\u00d600000().\u00d800000().o\u00d20000().getMinGewicht()) && (n5 = (int)((double)n5 * 1.75)) <= this.\u00d600000().\u00d800000().o\u00d20000().getMaxGewicht() && n5 >= this.\u00d600000().\u00d800000().o\u00d20000().getMinGewicht()) {
                n = n5;
            }
            this.\u00d600000().\u00d800000().thissuper().\u00d200000(n);
        }
        this.\u00d600000().\u00d800000().thissuper().super((String)this.\u00f4o0000.\u00d500000().getSelectedItem());
        this.\u00d600000().\u00d800000().thissuper().class((String)this.\u00f4o0000.private().getSelectedItem());
        if ((Integer)this.\u00f4o0000.newsuper().getValue() == 13 && (Integer)this.\u00f4o0000.\u00f500000().getValue() > 5) {
            JOptionPane.showMessageDialog(this.\u00f4o0000, "Es gibt nur 5 Tage ohne Namen ", "Bitte den Tag korrigieren", 2);
            return false;
        }
        E e = this.\u00d600000().\u00d800000().\u00f4O0000();
        E e2 = new E((Integer)this.\u00f4o0000.\u00f500000().getValue(), Monat.get((Integer)this.\u00f4o0000.newsuper().getValue()), (Integer)this.\u00f4o0000.oo0000().getValue(), e.Object());
        this.\u00d600000().\u00d800000().thissuper().super(e2);
        this.\u00d600000().ifsuper();
        if (this.\u00f4o0000.\u00d2o0000().isSelected()) {
            public public_ = this.\u00d600000().\u00d3o0000().\u00d300000(OOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(e2.\u00d200000()));
            this.\u00d600000().o00000(public_);
        }
        if ((Integer)this.\u00f4o0000.\u00f6O0000().getValue() < 0) {
            JOptionPane.showMessageDialog(this.\u00f4o0000, "Hast du schon mal dein Negativen Geburtstag gefeiert ", "Alter < 0", 2);
            return false;
        }
        this.\u00d600000().\u00d800000().thissuper().\u00d400000((Integer)this.\u00f4o0000.\u00f6O0000().getValue());
        return true;
    }

    private void \u00d4O0000() {
        int n = 0;
        int n2 = 220;
        int n3 = 20;
        int n4 = 150;
        if (this.\u00d600000().\u00d800000().o\u00d20000() != null) {
            n = this.\u00d600000().\u00d800000().o\u00d20000().getMinGroesse();
            n2 = this.\u00d600000().\u00d800000().o\u00d20000().getMaxGroesse();
            n3 = this.\u00d600000().\u00d800000().o\u00d20000().getMinGewicht();
            n4 = this.\u00d600000().\u00d800000().o\u00d20000().getMaxGewicht();
        }
        int n5 = this.\u00d600000().\u00d800000().thissuper().getGewicht(false);
        int n6 = this.\u00d600000().\u00d800000().thissuper().getGroesse();
        if (n5 < n3) {
            n5 = n3;
        }
        if (n5 > n4) {
            n5 = n4;
        }
        if (n6 < n) {
            n6 = n;
        }
        if (n6 > n2) {
            n6 = n2;
        }
        this.\u00f4o0000.o00000().setModel(new SpinnerNumberModel(n6, n, n2, 1));
        if (this.\u00d600000().\u00d800000().o00000(I.\u00f8\u00d2o000)) {
            n3 = (int)((double)n3 * 1.75);
            n3 = (int)((double)n5 * 1.75);
            n4 = (int)((double)n4 * 1.75);
        }
        this.\u00f4o0000.\u00f8O0000().setModel(new SpinnerNumberModel(n5, Math.min(n3, n5), Math.max(n4, n5), 1));
    }
}

