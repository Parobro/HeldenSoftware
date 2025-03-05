/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.held.Object.O0OO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.G.thissuper;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class U
extends JPanel {
    private JButton return;
    private boolean \u00f500000;
    private GridBagLayout \u00d400000;
    private GridBagConstraints[] o00000 = new GridBagConstraints[4];
    private thissuper \u00d300000;
    private int if;
    private Map<String, JTextField> \u00f400000;
    private Map<JTextField, JLabel> new;
    private Icon \u00d800000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
    private Icon \u00d500000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));

    public U() {
        this.\u00f400000 = new HashMap<String, JTextField>();
        this.new = new HashMap<JTextField, JLabel>();
        this.\u00d400000 = new GridBagLayout();
        this.o00000();
        this.setLayout(new BorderLayout());
        this.\u00d300000 = new thissuper(this);
    }

    public void o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (!this.\u00f500000) {
            return;
        }
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d400000);
        public public_ = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().\u00d300000(I.\u00f4O0000);
        JTextField jTextField = new JTextField();
        jTextField.setName(public_.toString());
        jTextField.setEditable(false);
        jTextField.setText(public_.toString());
        this.o00000[0].gridy = this.if;
        this.\u00d400000.setConstraints(jTextField, this.o00000[0]);
        jPanel.add(jTextField);
        JTextField jTextField2 = new JTextField();
        jTextField2.setName(public_.toString() + " :");
        jTextField2.setEditable(true);
        jTextField2.setText(public_.oO0000().substring(18));
        jTextField2.addFocusListener(this.\u00d300000);
        this.\u00f400000.put(public_.toString(), jTextField2);
        this.o00000[1].gridy = this.if;
        this.\u00d400000.setConstraints(jTextField2, this.o00000[1]);
        jPanel.add(jTextField2);
        JLabel jLabel = new JLabel(this.\u00d800000);
        jLabel.setName("L\u00e4nge Ok");
        jLabel.setToolTipText("Ok");
        jLabel.setIcon(this.\u00d800000);
        jLabel.setDisabledIcon(this.\u00d500000);
        this.new.put(jTextField2, jLabel);
        this.o00000[2].gridy = this.if++;
        this.\u00d400000.setConstraints(jLabel, this.o00000[2]);
        jPanel.add(jLabel);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void \u00d500000() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.\u00d400000());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public thissuper Object() {
        return this.\u00d300000;
    }

    public JButton \u00d400000() {
        if (this.return == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.return = new JButton("OK", imageIcon);
            this.return.setName("OK");
            this.return.addActionListener(this.\u00d300000);
        }
        return this.return;
    }

    public JLabel o00000(JTextField jTextField) {
        return this.new.get(jTextField);
    }

    public JTextField o00000(String string) {
        return this.\u00f400000.get(string);
    }

    public int Object(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (this.\u00f500000) {
            public public_ = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().\u00d300000(I.\u00f4O0000);
            if (!this.new.get(this.\u00f400000.get(public_.toString())).isEnabled()) {
                return -1;
            }
            if (this.\u00f400000.get(public_.toString()).getText().equals("")) {
                return 1;
            }
        }
        return 0;
    }

    public void \u00d200000() {
        this.new = new HashMap<JTextField, JLabel>();
        this.\u00f400000 = new HashMap<String, JTextField>();
        this.if = 0;
        this.removeAll();
        this.repaint();
    }

    public void o00000(O0OO o0OO2, boolean bl) {
        this.\u00f500000 = bl;
        this.\u00d300000.o00000(o0OO2);
    }

    public void \u00d200000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        M m = (M)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().\u00d300000(I.\u00f4O0000);
        public public_ = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().\u00d300000(I.\u00f4O0000);
        m.o00000(this.\u00f400000.get(public_.toString()).getText(), (int)new Integer(1));
        m.\u00d500000(m.intsuper().iterator().next());
        m.o00000(this.\u00f400000.get(public_.toString()).getText());
    }

    private void o00000() {
        this.o00000[0] = new GridBagConstraints();
        this.o00000[0].gridx = 0;
        this.o00000[0].anchor = 17;
        this.o00000[0].insets.top = 3;
        this.o00000[0].insets.bottom = 2;
        this.o00000[0].insets.right = 5;
        this.o00000[0].insets.left = 5;
        this.o00000[1] = new GridBagConstraints();
        this.o00000[1].weightx = 1.0;
        this.o00000[1].gridx = 2;
        this.o00000[1].fill = 2;
        this.o00000[1].insets.top = 3;
        this.o00000[1].insets.bottom = 2;
        this.o00000[1].insets.right = 5;
        this.o00000[2] = new GridBagConstraints();
        this.o00000[2].gridx = 3;
        this.o00000[2].anchor = 17;
        this.o00000[2].insets.top = 3;
        this.o00000[2].insets.bottom = 2;
        this.o00000[2].insets.right = 10;
    }
}

