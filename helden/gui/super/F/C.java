/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F;

import helden.framework.held.Object._;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.oooo_2;
import helden.gui.A;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import helden.gui.super.F;
import helden.gui.super.F.A.E;
import helden.gui.super.F.A.H;
import helden.gui.super.F.D;
import helden.gui.super.F.super;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;

public class C
extends F {
    private D O\u00f60000;
    private JButton \u00d5\u00f50000 = null;
    private JButton \u00d6\u00f50000 = null;
    private JButton \u00f6\u00f50000 = null;
    private H \u00d2\u00f60000 = null;
    private JButton \u00d4\u00f50000 = null;
    private super supervoid;
    private ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> o\u00f60000;
    private E \u00d4\u00f60000;
    private JSpinner classvoid = null;
    private JButton \u00f5\u00f50000 = null;
    private JButton \u00f4\u00f50000 = null;
    private JToggleButton publicreturn = null;
    private HashMap<oooo_2, Integer> intvoid = _.o00000();

    public C() {
        this.o\u00f60000 = new ArrayList();
        this.setOpaque(true);
        this.\u00d5\u00d50000();
    }

    public JSpinner interfaceObject() {
        if (this.classvoid == null) {
            this.classvoid = new JSpinner();
            this.classvoid.setPreferredSize(new Dimension(50, 20));
            this.classvoid.setModel(new SpinnerNumberModel(4, 1, 14, 1));
        }
        return this.classvoid;
    }

    public JToggleButton \u00f4\u00d50000() {
        if (this.publicreturn == null) {
            this.publicreturn = new JToggleButton();
            this.publicreturn.setText("Ausklappen");
        }
        return this.publicreturn;
    }

    public JButton \u00f4\u00d40000() {
        if (this.\u00d4\u00f50000 == null) {
            this.\u00d4\u00f50000 = new JButton();
            this.\u00d4\u00f50000.setText("Gruppe Exportieren");
        }
        return this.\u00d4\u00f50000;
    }

    public H voidString() {
        if (this.\u00d2\u00f60000 == null) {
            this.\u00d2\u00f60000 = new H(this.\u00f5\u00d40000());
            this.\u00d2\u00f60000.setRowHeight(oooo_1.o00000(20));
        }
        return this.\u00d2\u00f60000;
    }

    public E \u00f5\u00d40000() {
        if (this.\u00d4\u00f60000 == null) {
            this.\u00d4\u00f60000 = new E(new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>(), this.intvoid);
        }
        return this.\u00d4\u00f60000;
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> o\u00d50000() {
        return this.o\u00f60000;
    }

    public JButton \u00d4\u00d50000() {
        if (this.\u00f6\u00f50000 == null) {
            this.\u00f6\u00f50000 = new JButton();
            this.\u00f6\u00f50000.setText("Kampfprotokoll");
        }
        return this.\u00f6\u00f50000;
    }

    public JButton ObjectString() {
        if (this.\u00f4\u00f50000 == null) {
            this.\u00f4\u00f50000 = new JButton(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/VCRBack.gif")));
        }
        return this.\u00f4\u00f50000;
    }

    public JButton \u00d6\u00d50000() {
        if (this.\u00d5\u00f50000 == null) {
            this.\u00d5\u00f50000 = new JButton();
            this.\u00d5\u00f50000.setText("Spalten w\u00e4hlen");
            this.\u00d5\u00f50000.setEnabled(false);
        }
        return this.\u00d5\u00f50000;
    }

    public JButton O\u00d50000() {
        if (this.\u00d6\u00f50000 == null) {
            this.\u00d6\u00f50000 = new JButton();
            this.\u00d6\u00f50000.setText("Spielleiterbogen");
            this.\u00d6\u00f50000.setEnabled(false);
        }
        return this.\u00d6\u00f50000;
    }

    public JButton \u00d2\u00d50000() {
        if (this.\u00f5\u00f50000 == null) {
            this.\u00f5\u00f50000 = new JButton(new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/VCRForward.gif")));
        }
        return this.\u00f5\u00f50000;
    }

    public void o00000(boolean bl) {
        if (this.O\u00f60000 != null) {
            this.O\u00f60000.o00000(bl);
        }
    }

    public void o00000(A a2) {
        this.O\u00f60000 = new D(a2.\u00f6O0000().\u00d200000(), a2.int(), this);
        a2.\u00f6O0000().\u00d200000().getSelectionModel().addTreeSelectionListener(this.O\u00f60000);
        a2.\u00f6O0000().\u00d200000().getModel().addTreeModelListener(this.O\u00f60000);
        this.supervoid = new super(a2, this);
        this.\u00f4\u00d40000().addActionListener(this.supervoid);
        this.\u00d4\u00d50000().addActionListener(this.supervoid);
        this.\u00d2\u00d50000().addActionListener(this.supervoid);
        this.ObjectString().addActionListener(this.supervoid);
        this.interfaceObject().addChangeListener(this.supervoid);
        this.\u00f4\u00d50000().addActionListener(this.supervoid);
    }

    public void \u00d200000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.o\u00f60000 = arrayList;
    }

    public void o00000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        this.\u00f5\u00d40000().o00000(this.supervoid.o00000(arrayList));
        if (this.\u00f4\u00d50000().isSelected()) {
            this.voidString().o00000();
        } else {
            this.voidString().new();
        }
    }

    private JPanel \u00f6\u00d40000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.fill = 3;
        gridBagConstraints.gridy = 0;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridy = 0;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 3;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridy = 0;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.fill = 3;
        gridBagConstraints4.gridy = 0;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 5;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.fill = 3;
        gridBagConstraints5.gridy = 0;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 4;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.fill = 3;
        gridBagConstraints6.gridy = 0;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 1;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints7.gridy = 0;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 0;
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(true);
        jPanel.setLayout(new GridBagLayout());
        jPanel.add((Component)this.\u00d4\u00d50000(), gridBagConstraints6);
        jPanel.add((Component)this.\u00f4\u00d40000(), gridBagConstraints5);
        jPanel.add((Component)this.interfaceObject(), gridBagConstraints4);
        jPanel.add((Component)this.\u00d2\u00d50000(), gridBagConstraints3);
        jPanel.add((Component)this.ObjectString(), gridBagConstraints2);
        jPanel.add((Component)this.\u00f4\u00d50000(), gridBagConstraints);
        return jPanel;
    }

    private void \u00d5\u00d50000() {
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(0);
        borderLayout.setVgap(0);
        this.setLayout(borderLayout);
        this.setSize(new Dimension(574, 384));
        this.o00000(this.\u00f6\u00d40000(), "North");
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast();
        jScrollPaneFast.setViewportView(this.voidString());
        this.o00000(jScrollPaneFast, "Center");
    }
}

