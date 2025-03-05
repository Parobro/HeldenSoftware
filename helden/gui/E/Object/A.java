/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.Object;

import helden.gui.E.Object.D;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
extends JPanel {
    private JTextField void = null;
    private JList \u00d200000 = null;
    private JButton \u00d600000;
    private JTextField Object = null;
    private JPasswordField \u00d500000 = null;
    private JPasswordField \u00d400000 = null;
    private D o00000;

    public A(D d2) {
        this.o00000 = d2;
        this.\u00d200000();
    }

    public JTextField \u00d800000() {
        if (this.Object == null) {
            this.Object = new JTextField();
        }
        return this.Object;
    }

    public JTextField String() {
        if (this.void == null) {
            this.void = new JTextField();
        }
        return this.void;
    }

    public JButton \u00d500000() {
        if (this.\u00d600000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d600000 = new JButton("Senden", imageIcon);
            this.\u00d600000.setName("Senden");
            this.\u00d600000.addActionListener(this.o00000);
        }
        return this.\u00d600000;
    }

    public JPasswordField \u00d600000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JPasswordField();
        }
        return this.\u00d500000;
    }

    public JPasswordField \u00d300000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JPasswordField();
        }
        return this.\u00d400000;
    }

    public JList o00000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JList();
        }
        return this.\u00d200000;
    }

    private GridBagConstraints o00000(int n, int n2) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = n;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.fill = 2;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridy = n2;
        return gridBagConstraints;
    }

    private void \u00d200000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridy = 5;
        JLabel jLabel = new JLabel();
        jLabel.setText("Server");
        JLabel jLabel2 = new JLabel();
        jLabel2.setText("EMail");
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("Login");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.add((Component)jLabel3, this.o00000(0, 0));
        jPanel.add((Component)this.String(), this.o00000(1, 0));
        jPanel.add((Component)jLabel2, this.o00000(0, 1));
        jPanel.add((Component)this.\u00d800000(), this.o00000(1, 1));
        jPanel.add((Component)jLabel, this.o00000(0, 4));
        GridBagConstraints gridBagConstraints2 = this.o00000(1, 4);
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.weighty = 2.0;
        gridBagConstraints2.weightx = 2.0;
        jPanel.add((Component)new JScrollPaneFast(this.o00000()), gridBagConstraints2);
        jPanel.add((Component)new JLabel("Passwort"), this.o00000(0, 2));
        jPanel.add((Component)this.\u00d600000(), this.o00000(1, 2));
        jPanel.add((Component)new JLabel("<html>Passwort<br>(Wiederholung)"), this.o00000(0, 3));
        jPanel.add((Component)this.\u00d300000(), this.o00000(1, 3));
        jPanel.add((Component)this.\u00d500000(), gridBagConstraints);
        this.setSize(300, 292);
        this.setLayout(new BorderLayout());
        this.add((Component)jPanel, "Center");
    }
}

