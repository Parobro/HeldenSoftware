/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.allgemein.SeitenAuswahlTabel2;
import helden.gui.components.JScrollPaneFast;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DruckeinstellungenPanel
extends JPanel {
    private DruckEinstellungen \u00f400000;
    private JCheckBox \u00d500000;
    private JCheckBox \u00f500000;
    private SeitenAuswahlTabel2 \u00d400000;
    private JCheckBox float;
    private JCheckBox \u00d200000;
    private JCheckBox void;
    private JCheckBox \u00d600000;
    private JCheckBox \u00f600000;
    private JCheckBox o00000;
    private JComboBox Object;

    public DruckeinstellungenPanel(A a2) {
        this.\u00f400000 = Einstellungen.getInstance().getSeitenEinstellungen(a2.\u00d2O0000().\u00f4o0000());
        this.\u00d400000 = new SeitenAuswahlTabel2(a2);
        this.o00000();
    }

    public void uebernehmeEinstellungen() {
    }

    private JComboBox \u00d200000() {
        if (this.Object == null) {
            this.Object = new JComboBox();
            DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.Object.getModel();
            defaultComboBoxModel.addElement("20");
            defaultComboBoxModel.addElement("15");
        }
        return this.Object;
    }

    private void o00000() {
        this.\u00d600000 = new JCheckBox("Tierfeld drucken");
        this.\u00d600000.setSelected(this.\u00f400000.isTierfeld());
        this.\u00f600000 = new JCheckBox("Geldkreise drucken");
        this.\u00f600000.setSelected(this.\u00f400000.isGeldkreise());
        this.o00000 = new JCheckBox("Seiten mit Namen signieren");
        this.o00000.setSelected(this.\u00f400000.isSignieren());
        this.float = new JCheckBox("als Buch drucken");
        this.float.setSelected(this.\u00f400000.isBuchdruck());
        this.\u00d200000 = new JCheckBox("Zonenr\u00fcstung benutzen");
        this.\u00d200000.setSelected(this.\u00f400000.isZonenRuestung());
        this.void = new JCheckBox("Stufenberechnung nach DSA4.0");
        this.void.setSelected(this.\u00f400000.isDsa40stufe());
        this.\u00d500000 = new JCheckBox("Metatalente drucken");
        this.\u00d500000.setSelected(this.\u00f400000.isMetatalentedrucken());
        this.\u00f500000 = new JCheckBox("Kommentarzeile bei Zauber");
        this.\u00f500000.setSelected(this.\u00f400000.isZauberkommentar());
        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel)this.\u00d200000().getModel();
        for (int i2 = 0; i2 < defaultComboBoxModel.getSize(); ++i2) {
            if (!defaultComboBoxModel.getElementAt(i2).equals(this.\u00f400000.getZonenRSTeiler() + "")) continue;
            this.\u00d200000().setSelectedIndex(i2);
            break;
        }
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d400000);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = 1;
        gridBagConstraints.anchor = 10;
        gridBagConstraints.insets.top = 5;
        gridBagConstraints.insets.bottom = 5;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 5;
        int n = 1;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = n;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.anchor = 10;
        gridBagConstraints2.insets.top = 5;
        gridBagConstraints2.insets.bottom = 5;
        gridBagConstraints2.insets.right = 5;
        gridBagConstraints2.insets.left = 5;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.gridy = n;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.anchor = 10;
        gridBagConstraints3.insets.top = 5;
        gridBagConstraints3.insets.bottom = 5;
        gridBagConstraints3.insets.right = 5;
        gridBagConstraints3.insets.left = 5;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.gridy = n;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.anchor = 10;
        gridBagConstraints4.insets.top = 5;
        gridBagConstraints4.insets.bottom = 5;
        gridBagConstraints4.insets.right = 5;
        gridBagConstraints4.insets.left = 5;
        this.add((Component)jScrollPaneFast, gridBagConstraints);
        this.add((Component)this.\u00d500000, gridBagConstraints2);
        this.add((Component)this.\u00f500000, gridBagConstraints3);
        gridBagConstraints2.gridy = n = 2;
        gridBagConstraints3.gridy = n;
        gridBagConstraints4.gridy = n;
        this.add((Component)this.float, gridBagConstraints2);
        this.add((Component)this.\u00d200000, gridBagConstraints3);
        this.add((Component)this.void, gridBagConstraints4);
        gridBagConstraints2.gridy = n = 3;
        gridBagConstraints3.gridy = n;
        gridBagConstraints4.gridy = n;
        this.add((Component)this.\u00d600000, gridBagConstraints2);
        this.add((Component)this.\u00f600000, gridBagConstraints3);
        this.add((Component)this.o00000, gridBagConstraints4);
        gridBagConstraints2.gridy = n = 4;
        gridBagConstraints3.gridy = n;
        gridBagConstraints4.gridy = n;
        this.add((Component)new JLabel("Zonen RS Teiler"), gridBagConstraints2);
        this.add((Component)this.\u00d200000(), gridBagConstraints3);
    }
}

