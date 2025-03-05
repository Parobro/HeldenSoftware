/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.C.I;
import helden.framework.Monat;
import helden.framework.held.A.E;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.a.oooo_2;
import helden.framework.held.object.oooo_1;
import helden.gui.allgemein.AussehenBearbeitenPanel;
import helden.gui.ooOO.Oo00;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AussehenBarbeitenController
implements ActionListener {
    private FontRenderContext \u00d500000 = new FontRenderContext(new AffineTransform(), true, true);
    private Font new = new Font("Serif", 0, 9);
    private AussehenBearbeitenPanel o00000;
    private JDialog \u00d800000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d400000;
    private String return;
    private E \u00d300000;

    public AussehenBarbeitenController(AussehenBearbeitenPanel aussehenBearbeitenPanel, Oo00 oo00, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00d400000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.o00000 = aussehenBearbeitenPanel;
        this.\u00d300000 = new E(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().super().o00000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().super().\u00d200000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().super().\u00d400000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().super().Object());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        if (actionEvent.getSource() == this.o00000.getAuswahlBox()) {
            object = this.o00000.getAuswahlBox();
            if (((AbstractButton)object).isSelected()) {
                this.o00000.addJolinarFarben();
            } else {
                this.o00000.addRassenFarben();
            }
        }
        if (actionEvent.getSource() == this.o00000.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.o00000, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d800000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.getComboBox(2)) {
            if (!this.\u00d300000.Object().super() && (Integer)this.o00000.getGeburtstagSpinner(1).getValue() == 0) {
                JOptionPane.showMessageDialog(this.o00000, "Bei dieser Zeitrechnung gibt es kein Jahr 0\nBitte w\u00e4hlen sie ein anderes Jahr");
                return;
            }
            this.\u00d300000.o00000((Integer)this.o00000.getGeburtstagSpinner(1).getValue());
            this.\u00d300000.\u00d200000(oooo_2.super((String)this.o00000.getComboBox(2).getSelectedItem()));
            this.o00000.getGeburtstagSpinner(1).setValue(new Integer(this.\u00d300000.\u00d400000()));
        }
        if (actionEvent.getSource() == this.o00000.getOkButton()) {
            if (!this.\u00d200000()) {
                return;
            }
            if (!this.super()) {
                JOptionPane.showMessageDialog(this.o00000, "Folgende Eingaben sind zu lang:" + this.return);
                return;
            }
            object = this.\u00d400000.thissuper().super();
            if (!((E)object).Object().super() && (Integer)this.o00000.getGeburtstagSpinner(1).getValue() == 0) {
                JOptionPane.showMessageDialog(this.o00000, "Bei dieser Zeitrechnung gibt es kein Jahr 0\nBitte w\u00e4hlen sie ein anderes Jahr");
                return;
            }
            this.\u00d400000.thissuper().\u00d400000(this.o00000.getTextField(0).getText());
            this.\u00d400000.thissuper().\u00d300000(this.o00000.getTextField(1).getText());
            String[] stringArray = new String[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                stringArray[i2] = this.o00000.getTextField(i2 + 2).getText();
            }
            this.\u00d400000.thissuper().super(stringArray);
            String[] stringArray2 = new String[6];
            for (int i3 = 0; i3 < 6; ++i3) {
                stringArray2[i3] = this.o00000.getTextField(i3 + 6).getText();
            }
            this.\u00d400000.thissuper().\u00d200000(stringArray2);
            this.\u00d400000.thissuper().\u00d200000(this.o00000.getTextField(12).getText());
            this.\u00d400000.thissuper().super((String)this.o00000.getComboBox(0).getSelectedItem());
            this.\u00d400000.thissuper().class((String)this.o00000.getComboBox(1).getSelectedItem());
            this.\u00d400000.thissuper().\u00d300000((Integer)this.o00000.getGroessenSpinner(0).getValue());
            if (this.\u00d400000.o00000(I.\u00f8\u00d2o000)) {
                this.\u00d400000.thissuper().\u00d200000((int)((double)((Integer)this.o00000.getGroessenSpinner(1).getValue()).intValue() / 1.75));
            } else {
                this.\u00d400000.thissuper().\u00d200000((Integer)this.o00000.getGroessenSpinner(1).getValue());
            }
            ((E)object).\u00d200000((Integer)this.o00000.getGeburtstagSpinner(0).getValue());
            ((E)object).o00000(Monat.get(this.o00000.getComboBox(3).getSelectedIndex() + 1));
            ((E)object).\u00d200000(oooo_2.super((String)this.o00000.getComboBox(2).getSelectedItem()));
            ((E)object).o00000((Integer)this.o00000.getGeburtstagSpinner(1).getValue());
            ((K)this.\u00d400000).ifnew().\u00d300000();
            if (this.o00000.getComboBox(3).getSelectedIndex() + 1 == 13 && (Integer)this.o00000.getGeburtstagSpinner(0).getValue() > 5) {
                if (JOptionPane.showConfirmDialog(this.o00000, "Wollen Sie zur Eingabe zur\u00fcck? \n Ansonsten wird der Tag \nauf 5 zur\u00fcck gesetzt", "Es gibt nur 5 Tage ohne Namen", 0) == 0) {
                    ((E)object).\u00d200000(5);
                    this.\u00d800000.setVisible(false);
                }
            } else {
                this.\u00d800000.setVisible(false);
            }
        }
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO getHeld() {
        return this.\u00d400000;
    }

    public void setDialog(JDialog jDialog) {
        this.\u00d800000 = jDialog;
    }

    private boolean \u00d200000() {
        int n;
        int n2 = this.\u00d400000.thissuper().\u00d200000();
        if (n2 == (n = ((Integer)this.o00000.getAlterSpinner().getValue()).intValue())) {
            return true;
        }
        oooo_1 oooo_12 = new oooo_1(this.\u00d400000);
        ArrayList<Integer> arrayList = oooo_12.o00000(n2, n);
        if (arrayList.size() == 0) {
            this.\u00d400000.thissuper().\u00d400000(n);
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Durch die \u00c4nderung des Alters, werden die Auswirkung folgender Altersstufen aktiv:\n");
        for (Integer n3 : arrayList) {
            stringBuffer.append("Stufe " + n3 + ": " + oooo_12.String(n3) + " Jahre\n");
        }
        stringBuffer.append("\n\nFortsetzen?");
        if (JOptionPane.showConfirmDialog(this.o00000, stringBuffer.toString(), "Altersstufen", 0) != 0) {
            return false;
        }
        for (Integer n3 : arrayList) {
            oooo_12.\u00d300000(n3);
        }
        this.\u00d400000.thissuper().\u00d400000(n);
        return true;
    }

    private boolean super() {
        boolean bl = true;
        this.return = "";
        for (int i2 = 0; i2 < 12; ++i2) {
            if (i2 < 2 && this.new.getStringBounds(this.o00000.getTextField(i2).getText(), this.\u00d500000).getWidth() > 100.0) {
                this.return = this.return + "\n" + this.o00000.getTextField(i2).getName();
                bl = false;
            }
            if (i2 == 2 && this.new.getStringBounds(this.o00000.getTextField(i2).getText(), this.\u00d500000).getWidth() > 74.0) {
                this.return = this.return + "\n" + this.o00000.getTextField(i2).getName();
                bl = false;
            }
            if (i2 <= 2 || !(this.new.getStringBounds(this.o00000.getTextField(i2).getText(), this.\u00d500000).getWidth() > 143.0)) continue;
            this.return = this.return + "\n" + this.o00000.getTextField(i2).getName();
            bl = false;
        }
        return bl;
    }
}

