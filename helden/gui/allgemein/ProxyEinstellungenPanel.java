/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.ProxyEinstellungenController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ProxyEinstellungenPanel
extends JPanel {
    private JButton null;
    private JButton \u00f800000;
    private GridBagLayout \u00d600000;
    private GridBagConstraints[] \u00d200000 = new GridBagConstraints[4];
    private ProxyEinstellungenController \u00d500000;
    private int \u00f600000;
    private JTextField \u00f500000;
    private JTextField String;
    private JTextField \u00d300000;
    private JPasswordField for;
    private JCheckBox o00000;
    private JCheckBox \u00d800000;

    public ProxyEinstellungenPanel(AbstractAction abstractAction) {
        this.\u00d600000 = new GridBagLayout();
        this.\u00d200000();
        this.setLayout(new BorderLayout());
        this.\u00d500000 = new ProxyEinstellungenController(this, abstractAction);
        this.super().setText(Einstellungen.getInstance().getProxyPort());
        this.\u00d800000().setText(Einstellungen.getInstance().getProxyServer());
        this.\u00d600000().setText(Einstellungen.getInstance().getProxyUser());
        this.class().setText(Einstellungen.getInstance().getProxyPwd());
        this.\u00d300000().setSelected(Einstellungen.getInstance().getProxyVerwenden());
        this.\u00d400000().setSelected(Einstellungen.getInstance().getProxyAuthentifikation());
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d600000);
        JLabel jLabel = new JLabel("Proxyserver:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel, this.\u00d200000[0]);
        jPanel.add(jLabel);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.\u00d800000(), this.\u00d200000[1]);
        jPanel.add(this.\u00d800000());
        JLabel jLabel2 = new JLabel("Proxyport:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel2, this.\u00d200000[0]);
        jPanel.add(jLabel2);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.super(), this.\u00d200000[1]);
        jPanel.add(this.super());
        JLabel jLabel3 = new JLabel("Proxy verwenden:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel3, this.\u00d200000[0]);
        jPanel.add(jLabel3);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.\u00d300000(), this.\u00d200000[1]);
        jPanel.add(this.\u00d300000());
        JLabel jLabel4 = new JLabel("Username:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel4, this.\u00d200000[0]);
        jPanel.add(jLabel4);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.\u00d600000(), this.\u00d200000[1]);
        jPanel.add(this.\u00d600000());
        JLabel jLabel5 = new JLabel("Passwort:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel5, this.\u00d200000[0]);
        jPanel.add(jLabel5);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.class(), this.\u00d200000[1]);
        jPanel.add(this.class());
        JLabel jLabel6 = new JLabel("Ben\u00f6tigt Authentifikation?:");
        this.\u00d200000[0].gridy = this.\u00f600000;
        this.\u00d600000.setConstraints(jLabel6, this.\u00d200000[0]);
        jPanel.add(jLabel6);
        this.\u00d200000[1].gridy = this.\u00f600000++;
        this.\u00d600000.setConstraints(this.\u00d400000(), this.\u00d200000[1]);
        jPanel.add(this.\u00d400000());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.add(this.getAbbrechenButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public JButton getAbbrechenButton() {
        if (this.\u00f800000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00f800000 = new JButton("Abbrechen", imageIcon);
            this.\u00f800000.setName("Abbrechen");
            this.\u00f800000.addActionListener(this.\u00d500000);
        }
        return this.\u00f800000;
    }

    public boolean getAuth() {
        return this.\u00d800000.isSelected();
    }

    public ProxyEinstellungenController getController() {
        return this.\u00d500000;
    }

    public JButton getOkButton() {
        if (this.null == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.null = new JButton("OK", imageIcon);
            this.null.setName("OK");
            this.null.addActionListener(this.\u00d500000);
        }
        return this.null;
    }

    public String getPort() {
        return this.\u00f500000.getText();
    }

    public String getProxy() {
        return this.String.getText();
    }

    public String getPwd() {
        return new String(this.for.getPassword());
    }

    public String getUser() {
        return this.\u00d300000.getText();
    }

    public boolean getVerwenden() {
        return this.o00000.isSelected();
    }

    private JCheckBox \u00d400000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JCheckBox();
        }
        return this.\u00d800000;
    }

    private JTextField super() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JTextField();
        }
        return this.\u00f500000;
    }

    private JTextField class() {
        if (this.for == null) {
            this.for = new JPasswordField();
        }
        return this.for;
    }

    private JTextField \u00d800000() {
        if (this.String == null) {
            this.String = new JTextField();
        }
        return this.String;
    }

    private JTextField \u00d600000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextField();
        }
        return this.\u00d300000;
    }

    private JCheckBox \u00d300000() {
        if (this.o00000 == null) {
            this.o00000 = new JCheckBox();
        }
        return this.o00000;
    }

    private void \u00d200000() {
        this.\u00f600000 = 0;
        this.\u00d200000[0] = new GridBagConstraints();
        this.\u00d200000[0].gridx = 0;
        this.\u00d200000[0].anchor = 13;
        this.\u00d200000[0].insets.top = 3;
        this.\u00d200000[0].insets.bottom = 2;
        this.\u00d200000[0].insets.right = 3;
        this.\u00d200000[0].insets.left = 5;
        this.\u00d200000[1] = new GridBagConstraints();
        this.\u00d200000[1].gridx = 1;
        this.\u00d200000[1].anchor = 13;
        this.\u00d200000[1].fill = 1;
        this.\u00d200000[1].weightx = 1.0;
        this.\u00d200000[1].insets.top = 3;
        this.\u00d200000[1].insets.bottom = 2;
        this.\u00d200000[1].insets.right = 5;
        this.\u00d200000[2] = new GridBagConstraints();
        this.\u00d200000[2].gridx = 2;
        this.\u00d200000[2].anchor = 17;
        this.\u00d200000[2].insets.top = 3;
        this.\u00d200000[2].insets.bottom = 2;
        this.\u00d200000[2].insets.right = 1;
    }
}

