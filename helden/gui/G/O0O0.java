/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.comm.CommUtilities;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.Utils;
import helden.gui.g.oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.gui.icons.IconFactory;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0O0
extends JDialog {
    private oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 Object;
    private JButton \u00d400000;
    private JButton \u00d200000;
    private JButton \u00f500000;
    private JPanel void;
    private JPanel \u00f400000;
    private JList o00000;
    private JSplitPane \u00f600000;
    private JPanel \u00d600000;
    private JButton \u00d500000;

    public O0O0(JFrame jFrame, K k2) {
        super((Frame)jFrame, true);
        if (jFrame == null) {
            this.setModal(false);
        }
        if (k2 == null) {
            this.setTitle("Einen Helden eingeben");
        } else {
            this.setTitle("Einen Helden editieren");
        }
        this.setSize(900, 550);
        this.getContentPane().setLayout(new BorderLayout());
        this.\u00d600000 = new JPanel();
        this.\u00d600000.setLayout(new BorderLayout());
        this.\u00d600000.setVisible(true);
        this.Object = new oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(this);
        this.\u00f600000 = new JSplitPane(1, this.\u00d600000(), this.\u00d600000);
        this.\u00f600000.setOneTouchExpandable(true);
        this.\u00f600000.setDividerLocation(0.33);
        this.getContentPane().add((Component)this.\u00f600000, "Center");
        this.\u00f600000.setDividerLocation(170);
        this.\u00d800000();
        this.Object.super(k2);
        Utils.zentriere(this);
        this.setVisible(true);
    }

    public JButton super() {
        if (this.\u00f500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRStop.gif")));
            this.\u00f500000 = new JButton("Abbrechen", imageIcon);
            this.\u00f500000.addActionListener(this.Object);
        }
        return this.\u00f500000;
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO int() {
        return this.Object.class();
    }

    public JButton \u00d300000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JButton("Hilfe", IconFactory.getFragezeichen());
            this.\u00d500000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String string = "http://wiki.helden-software.de/Eingeben/" + O0O0.this.o00000.getSelectedValue().toString();
                    CommUtilities.showInBrowser(string);
                }
            });
        }
        return this.\u00d500000;
    }

    public JList \u00f400000() {
        if (this.o00000 == null) {
            this.o00000 = new JList(new DefaultListModel());
            this.o00000.addListSelectionListener(this.Object);
            this.o00000.setSelectionMode(1);
            this.o00000.setName("MenuListe");
        }
        return this.o00000;
    }

    public JList \u00d200000() {
        return this.o00000;
    }

    public JButton \u00d400000() {
        if (this.\u00d400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRForward.gif")));
            this.\u00d400000 = new JButton("Weiter", imageIcon);
            this.\u00d400000.addActionListener(this.Object);
            this.\u00d400000.setName("WeiterButton");
        }
        return this.\u00d400000;
    }

    public JButton class() {
        if (this.\u00d200000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/VCRBack.gif")));
            this.\u00d200000 = new JButton("Zur\u00fcck", imageIcon);
            this.\u00d200000.addActionListener(this.Object);
            this.\u00d200000.setName("ZurueckButton");
        }
        return this.\u00d200000;
    }

    public void super(JPanel jPanel) {
        jPanel.setVisible(false);
        if (this.\u00f400000 != null) {
            this.\u00d600000.remove(this.\u00f400000);
            this.\u00f400000.setVisible(false);
        }
        this.\u00f400000 = jPanel;
        this.\u00d600000.add((Component)this.\u00f400000, "Center");
        this.\u00f400000.setVisible(true);
        this.\u00d600000.repaint();
    }

    public void super(String string) {
        if (this.void != null) {
            this.\u00d600000.remove(this.void);
            this.void.setVisible(false);
        }
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        JLabel jLabel = new JLabel(string);
        jLabel.setAlignmentX(0.0f);
        jLabel.setBorder(BorderFactory.createEmptyBorder(2, 10, 3, 0));
        jPanel.add(jLabel);
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanel.setBackground(Color.WHITE);
        this.void = jPanel;
        this.\u00d600000.add((Component)this.void, "North");
        this.void.setVisible(true);
        this.\u00d600000.repaint();
    }

    private void \u00d800000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.class());
        jPanel.add(this.\u00d400000());
        jPanel.add(this.super());
        jPanel.add(this.\u00d300000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.\u00d600000.add((Component)jPanel, "South");
    }

    private JList \u00d600000() {
        this.o00000 = this.\u00f400000();
        return this.o00000;
    }
}

