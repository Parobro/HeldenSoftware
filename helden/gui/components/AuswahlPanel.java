/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.gui.components.AuswahlController;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AuswahlPanel<T>
extends JPanel {
    private int \u00f500000 = 1;
    private int new = 1;
    private JPanel o00000;
    private ArrayList<T> return;
    private JButton \u00f400000;
    private AuswahlController \u00d500000;
    private Map<JToggleButton, T> \u00d800000;
    private ButtonGroup \u00d400000;
    private T \u00d300000;

    public AuswahlPanel(ArrayList<T> arrayList, String string, Integer n) {
        this.return = arrayList;
        this.\u00f500000 = n;
        this.new = n;
        this.\u00d500000 = new AuswahlController(this);
        this.setLayout(new BorderLayout());
        this.\u00d800000 = new HashMap<JToggleButton, T>();
        this.\u00d400000 = new ButtonGroup();
        this.addUeberschrift(string);
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public AuswahlPanel(ArrayList<T> arrayList, String string, Integer n, Integer n2) {
        this.return = arrayList;
        this.\u00f500000 = n;
        this.new = n2;
        this.\u00d500000 = new AuswahlController(this);
        this.setLayout(new BorderLayout());
        this.\u00d800000 = new HashMap<JToggleButton, T>();
        this.\u00d400000 = new ButtonGroup();
        this.addUeberschrift(string);
        this.addInhalt();
        this.createNavigationsPanel();
    }

    public void addInhalt() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        for (int i2 = 0; i2 < this.return.size(); ++i2) {
            JToggleButton jToggleButton;
            T t = this.return.get(i2);
            if (this.getMinAuswaehlen() == 1 && this.getMaxAuswaehlen() == 1) {
                jToggleButton = new JRadioButton(t.toString());
                this.\u00d400000.add(jToggleButton);
                jToggleButton.addActionListener(this.\u00d500000);
                jToggleButton.setName(t.toString());
                this.\u00d800000.put(jToggleButton, t);
                jToggleButton.setSelected(true);
            } else {
                jToggleButton = new JCheckBox(t.toString());
                jToggleButton.setName(t.toString());
                jToggleButton.addActionListener(this.\u00d500000);
                this.\u00d800000.put(jToggleButton, t);
            }
            jToggleButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
            jPanel.add(jToggleButton);
        }
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jPanel);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void addUeberschrift(String string) {
        JTextArea jTextArea = new JTextArea(string, 5, 40);
        jTextArea.setBackground(Color.WHITE);
        jTextArea.setLayout(new FlowLayout());
        this.add((Component)jTextArea, "North");
    }

    public boolean check() {
        int n = this.getAusgewaelteVarianteimPanelList().size();
        if (this.getMinAuswaehlen() > n || n > this.getMaxAuswaehlen()) {
            String string = this.getMinAuswaehlen() == this.getMaxAuswaehlen() ? "Bitte w\u00e4hlen sie genau " + this.getMinAuswaehlen() + " Elemente aus.\n" : "Bitte w\u00e4hlen sie mindestens " + this.getMinAuswaehlen() + " und " + "maximal " + this.getMaxAuswaehlen() + " Elemente aus.\n";
            JOptionPane.showMessageDialog(null, string, "Auswahl", 2);
            return false;
        }
        return true;
    }

    public void createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add((Component)jPanel, "South");
    }

    public ArrayList<T> getAusgewaelteVarianteimPanelList() {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (JToggleButton jToggleButton : this.\u00d800000.keySet()) {
            if (!jToggleButton.isSelected()) continue;
            arrayList.add(this.\u00d800000.get(jToggleButton));
        }
        return arrayList;
    }

    public T getAuswahl() {
        return this.\u00d300000;
    }

    public AuswahlController getController() {
        return this.\u00d500000;
    }

    public int getMaxAuswaehlen() {
        return this.new;
    }

    public int getMinAuswaehlen() {
        return this.\u00f500000;
    }

    public JButton getOkButton() {
        if (this.\u00f400000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00f400000 = new JButton("OK", imageIcon);
            this.\u00f400000.setName("OK");
            this.\u00f400000.addActionListener(this.\u00d500000);
        }
        return this.\u00f400000;
    }

    public JPanel getPanel() {
        return this.o00000;
    }
}

