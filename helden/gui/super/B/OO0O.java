/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.gui.oooo_1;
import helden.gui.super.B.C;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OO0O
extends JPanel {
    private JButton \u00d800000;
    private JButton \u00d200000;
    private GridBagLayout \u00d400000;
    private GridBagConstraints[] \u00d600000 = new GridBagConstraints[4];
    private C super;
    private helden.gui.super.B.super.C \u00d300000;
    private F class;

    public OO0O(F f2, helden.framework.held.object.oooo_1 oooo_12) {
        this.super = new C(this, f2);
        this.\u00d400000 = new GridBagLayout();
        this.\u00d200000();
        this.setLayout(new BorderLayout());
        try {
            this.class = f2.\u00f400000();
            this.o00000(this.class, oooo_12);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
    }

    public void o00000(F f2, helden.framework.held.object.oooo_1 oooo_12) {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d400000);
        this.\u00d300000 = new helden.gui.super.B.super.C(f2, oooo_12);
        this.add((Component)this.\u00d300000, "Center");
        this.\u00d300000();
    }

    public void \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d600000());
        jPanel.add(this.o00000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton o00000() {
        if (this.\u00d200000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00d200000 = new JButton("Abbrechen", imageIcon);
            this.\u00d200000.setName("Abbrechen");
            this.\u00d200000.addActionListener(this.super);
        }
        return this.\u00d200000;
    }

    public C \u00d800000() {
        return this.super;
    }

    public F \u00d500000() {
        return this.class;
    }

    public helden.gui.super.B.super.C String() {
        return this.\u00d300000;
    }

    public JButton \u00d600000() {
        if (this.\u00d800000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d800000 = new JButton("OK", imageIcon);
            this.\u00d800000.setName("OK");
            this.\u00d800000.addActionListener(this.super);
        }
        return this.\u00d800000;
    }

    private void \u00d200000() {
        this.\u00d600000[0] = new GridBagConstraints();
        this.\u00d600000[0].gridx = 0;
        this.\u00d600000[0].anchor = 17;
        this.\u00d600000[1] = new GridBagConstraints();
        this.\u00d600000[1].gridx = 1;
        this.\u00d600000[1].anchor = 17;
        this.\u00d600000[1].insets.top = 3;
        this.\u00d600000[1].insets.bottom = 2;
        this.\u00d600000[1].insets.right = 5;
        this.\u00d600000[1].insets.left = 1;
        this.\u00d600000[2] = new GridBagConstraints();
        this.\u00d600000[2].weightx = 1.0;
        this.\u00d600000[2].gridx = 2;
        this.\u00d600000[2].fill = 2;
        this.\u00d600000[2].insets.top = 3;
        this.\u00d600000[2].insets.bottom = 2;
        this.\u00d600000[2].insets.right = 5;
        this.\u00d600000[3] = new GridBagConstraints();
        this.\u00d600000[3].gridx = 3;
        this.\u00d600000[3].anchor = 17;
        this.\u00d600000[3].insets.top = 3;
        this.\u00d600000[3].insets.bottom = 2;
        this.\u00d600000[3].insets.right = 10;
    }
}

