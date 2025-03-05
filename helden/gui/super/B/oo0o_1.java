/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.b;

import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungsFabrik;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.B.OoOO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.super.B.oo0O
 */
public class oo0o_1
extends JPanel {
    private OoOO \u00d300000;
    private HashMap<Muenze, JSpinner> o00000 = new HashMap();
    private JButton \u00d500000;
    private JButton new;
    private helden.framework.held.object.oooo_1 \u00d400000;

    public oo0o_1(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d400000 = oooo_12;
        this.\u00d300000 = new OoOO(oooo_12, this);
        this.setLayout(new BorderLayout());
        this.\u00d200000();
        this.\u00d300000();
    }

    public void \u00d200000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d400000());
        jPanel.add(this.super());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton super() {
        if (this.new == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.new = new JButton("Abbrechen", imageIcon);
            this.new.setName("Abbrechen");
            this.new.addActionListener(this.\u00d300000);
        }
        return this.new;
    }

    public OoOO class() {
        return this.\u00d300000;
    }

    public JSpinner super(Muenze muenze) {
        if (this.o00000.get(muenze) == null) {
            JSpinner jSpinner = new JSpinner();
            jSpinner.setModel(new SpinnerNumberModel(this.\u00d400000.\u00d800000().\u00f400000().getMuenzAnzahl(muenze), 0, 1000, 1));
            this.o00000.put(muenze, jSpinner);
        }
        return this.o00000.get(muenze);
    }

    public JButton \u00d400000() {
        if (this.\u00d500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d500000 = new JButton("OK", imageIcon);
            this.\u00d500000.setName("OK");
            this.\u00d500000.addActionListener(this.\u00d300000);
        }
        return this.\u00d500000;
    }

    private void \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(0, 5, 5, 5);
        gridBagConstraints.gridy = 0;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.anchor = 13;
        gridBagConstraints2.gridy = 0;
        Iterator<String> iterator = WaehrungsFabrik.getInstance().getAllWaehrungenBezeichner().iterator();
        int n = 1;
        int n2 = 0;
        while (iterator.hasNext()) {
            gridBagConstraints.gridy = n2 + 1;
            Waehrung waehrung = WaehrungsFabrik.getInstance().getWaehrungen(iterator.next());
            JLabel jLabel = new JLabel();
            jLabel.setHorizontalAlignment(2);
            jLabel.setText(waehrung.getBezeichner());
            Iterator<String> iterator2 = waehrung.getMuenzBezeichner();
            jPanel.add((Component)jLabel, gridBagConstraints);
            while (iterator2.hasNext()) {
                gridBagConstraints2.gridy = n2;
                gridBagConstraints2.gridx = n++;
                String string = iterator2.next();
                JLabel jLabel2 = new JLabel(string);
                jLabel2.setHorizontalAlignment(0);
                gridBagConstraints2.insets = new Insets(5, 5, 0, 5);
                jPanel.add((Component)jLabel2, gridBagConstraints2);
                gridBagConstraints2.gridy = n2 + 1;
                gridBagConstraints2.insets = new Insets(0, 5, 5, 5);
                jPanel.add((Component)this.super(waehrung.getMuenzen(string)), gridBagConstraints2);
            }
            n2 += 2;
            n = 1;
        }
        this.add((Component)new JScrollPaneFast(jPanel), "Center");
    }
}

