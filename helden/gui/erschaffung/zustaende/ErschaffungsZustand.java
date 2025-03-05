/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.icons.IconFactory;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class ErschaffungsZustand {
    private JComponent \u00d300000;
    private JButton \u00d600000;
    private JButton \u00d200000;
    private JButton class;
    protected HEW2 super;
    private JButton \u00d400000;

    public ErschaffungsZustand(HEW2 hEW2) {
        this.super = hEW2;
        ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
        ImageIcon imageIcon2 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
        ImageIcon imageIcon3 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Save.gif")));
        Dimension dimension = new Dimension(120, 45);
        this.\u00d600000 = new JButton("<html>Weiter<br>", imageIcon2);
        this.\u00d600000.setMnemonic('W');
        this.\u00d600000.setPreferredSize(dimension);
        this.\u00d200000 = new JButton("<html>Entwurf<br>speichern", imageIcon3);
        this.\u00d200000.setMnemonic('S');
        this.\u00d200000.setPreferredSize(dimension);
        this.\u00d400000 = new JButton("<html>Hilfe<br>", IconFactory.getFragezeichen());
        this.\u00d400000.setMnemonic('H');
        this.\u00d400000.setPreferredSize(dimension);
        this.\u00d400000.setToolTipText("Der Hilfetext wird im Browser ge\u00f6ffnet");
        this.class = new JButton("<html>Zur\u00fcck<br>", imageIcon);
        this.class.setMnemonic('Z');
        this.class.setPreferredSize(dimension);
        this.\u00d600000.setHorizontalTextPosition(2);
    }

    public abstract String getBezeichner();

    public ArrayList<Hinweis> getFehler() {
        return null;
    }

    public String getHelp() {
        return "";
    }

    public JButton getHilfe() {
        return this.\u00d400000;
    }

    public JPanel getPanelInklNavi(ActionListener actionListener) {
        JPanel jPanel = new JPanel();
        jPanel.setSize(200, 40);
        jPanel.setLayout(new BorderLayout());
        this.init();
        jPanel.add((Component)this.getPanel(), "Center");
        jPanel.add((Component)this.o00000(actionListener), "South");
        return jPanel;
    }

    public JButton getSpeichern() {
        return this.\u00d200000;
    }

    public JButton getVor() {
        return this.\u00d600000;
    }

    public HEW2 getWerkzeug() {
        return this.super;
    }

    public JButton getZurueck() {
        return this.class;
    }

    public JComponent getZusatzComponente() {
        return this.\u00d300000;
    }

    public void init() {
    }

    public boolean isActive() {
        return true;
    }

    public void setZusatzComponente(JComponent jComponent) {
        this.\u00d300000 = jComponent;
    }

    public abstract void update();

    public void wirdJetztDargstellt() {
        this.update();
    }

    protected abstract JPanel getPanel();

    private JPanel o00000(ActionListener actionListener) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 13;
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel.add((Component)this.class, gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel.add((Component)new JLabel(), gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel.add((Component)this.\u00d200000, gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel.add((Component)this.\u00d400000, gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel.add((Component)new JLabel(), gridBagConstraints);
        ++gridBagConstraints.gridx;
        jPanel.add((Component)this.\u00d600000, gridBagConstraints);
        this.\u00d600000.addActionListener(actionListener);
        this.class.addActionListener(actionListener);
        this.\u00d200000.addActionListener(actionListener);
        this.\u00d400000.addActionListener(actionListener);
        return jPanel;
    }
}

