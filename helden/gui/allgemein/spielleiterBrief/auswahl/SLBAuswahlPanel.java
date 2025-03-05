/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.spielleiterBrief.auswahl;

import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.Object.C;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.allgemein.spielleiterBrief.auswahl.SLBAuswahlController;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SLBAuswahlPanel
extends JPanel {
    private JTextField \u00d300000;
    private JButton return;
    private JButton \u00f500000;
    private GridBagLayout \u00d400000;
    private GridBagConstraints[] o00000 = new GridBagConstraints[4];
    private SLBAuswahlController new;
    private int \u00f400000;
    private HashMap<String, Boolean> \u00d500000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d800000;

    public SLBAuswahlPanel(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, HashMap<String, Boolean> hashMap, SLBAuswahlController sLBAuswahlController) {
        this.\u00d800000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.new = sLBAuswahlController;
        this.\u00d500000 = hashMap;
        this.\u00d400000 = new GridBagLayout();
        this.o00000();
        this.setLayout(new BorderLayout());
        this.add((Component)this.\u00d300000(), "North");
        this.createNavigationsPanel();
        this.addInhalt2();
    }

    public void addInhalt2() {
        JComponent jComponent;
        Object object5;
        Object object2;
        Object object3;
        Object object4;
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(this.\u00d400000);
        Iterator<voidsuper> iterator = this.\u00d800000.\u00f8O0000().super();
        while (iterator.hasNext()) {
            object4 = iterator.next();
            object3 = new JCheckBox(((U)object4).toString());
            this.o00000[0].gridy = this.\u00f400000;
            this.\u00d400000.setConstraints((Component)object3, this.o00000[0]);
            jPanel.add((Component)object3);
            try {
                object2 = new JLabel("" + this.\u00d800000.\u00d300000((oo0o_0)object4));
                ((Component)object3).setName(((U)object4).toString() + this.\u00d800000.\u00d300000((oo0o_0)object4));
                this.o00000[1].gridy = this.\u00f400000;
                this.\u00d400000.setConstraints((Component)object2, this.o00000[1]);
                jPanel.add((Component)object2);
                if (this.\u00d500000.containsKey(((U)object4).toString() + this.\u00d800000.\u00d300000((oo0o_0)object4))) {
                    ((AbstractButton)object3).setSelected(true);
                }
            }
            catch (D d2) {
                d2.printStackTrace();
            }
            ((AbstractButton)object3).addActionListener(this.new);
            ++this.\u00f400000;
        }
        try {
            if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d800000.\u00f4o0000()).isMetatalentedrucken()) {
                if (this.\u00d800000.\u00f8O0000().\u00d300000(voidsuper.\u00d4\u00f6\u00d6000)) {
                    object4 = new JCheckBox("Ansitzjagd");
                    ((Component)object4).setName("Ansitzjagd");
                    ((AbstractButton)object4).addActionListener(this.new);
                    this.o00000[0].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object4, this.o00000[0]);
                    jPanel.add((Component)object4);
                    ((Component)object4).setName("Ansitzjagd");
                    object3 = new JLabel("" + C.\u00d600000(this.\u00d800000));
                    this.o00000[1].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object3, this.o00000[1]);
                    jPanel.add((Component)object3);
                    if (this.\u00d500000.containsKey("Ansitzjagd")) {
                        ((AbstractButton)object4).setSelected(true);
                    }
                    ++this.\u00f400000;
                }
                if (this.\u00d800000.\u00f8O0000().\u00d300000(voidsuper.\u00d4\u00f6\u00d6000)) {
                    object4 = new JCheckBox("Pirschjagd");
                    ((Component)object4).setName("Pirschjagd");
                    ((AbstractButton)object4).addActionListener(this.new);
                    this.o00000[0].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object4, this.o00000[0]);
                    jPanel.add((Component)object4);
                    ((Component)object4).setName("Pirschjagd");
                    object3 = new JLabel("" + C.\u00d500000(this.\u00d800000));
                    this.o00000[1].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object3, this.o00000[1]);
                    jPanel.add((Component)object3);
                    if (this.\u00d500000.containsKey("Pirschjagd")) {
                        ((AbstractButton)object4).setSelected(true);
                    }
                    ++this.\u00f400000;
                }
                if (this.\u00d800000.\u00f8O0000().\u00d300000(voidsuper.o\u00d5\u00d6000)) {
                    object4 = new JCheckBox("Nahrung sammeln");
                    ((Component)object4).setName("Nahrung sammeln");
                    ((AbstractButton)object4).addActionListener(this.new);
                    this.o00000[0].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object4, this.o00000[0]);
                    jPanel.add((Component)object4);
                    ((Component)object4).setName("Nahrung sammeln");
                    object3 = new JLabel("" + C.\u00f600000(this.\u00d800000));
                    this.o00000[1].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object3, this.o00000[1]);
                    jPanel.add((Component)object3);
                    if (this.\u00d500000.containsKey("Nahrung sammeln")) {
                        ((AbstractButton)object4).setSelected(true);
                    }
                    ++this.\u00f400000;
                }
                if (this.\u00d800000.\u00f8O0000().\u00d300000(voidsuper.o\u00d5\u00d6000)) {
                    object4 = new JCheckBox("Kr\u00e4uter suchen");
                    ((Component)object4).setName("Kr\u00e4uter suchen");
                    ((AbstractButton)object4).addActionListener(this.new);
                    this.o00000[0].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object4, this.o00000[0]);
                    jPanel.add((Component)object4);
                    ((Component)object4).setName("Kr\u00e4uter suchen");
                    object3 = new JLabel("" + C.\u00f800000(this.\u00d800000));
                    this.o00000[1].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object3, this.o00000[1]);
                    jPanel.add((Component)object3);
                    if (this.\u00d500000.containsKey("Kr\u00e4uter suchen")) {
                        ((AbstractButton)object4).setSelected(true);
                    }
                    ++this.\u00f400000;
                }
                if (this.\u00d800000.\u00f8O0000().\u00d300000(voidsuper.o\u00d3\u00d6000)) {
                    object4 = new JCheckBox("Wache halten");
                    ((Component)object4).setName("Wache halten");
                    ((AbstractButton)object4).addActionListener(this.new);
                    this.o00000[0].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object4, this.o00000[0]);
                    jPanel.add((Component)object4);
                    ((Component)object4).setName("Wache halten");
                    object3 = new JLabel("" + C.null(this.\u00d800000));
                    this.o00000[1].gridy = this.\u00f400000;
                    this.\u00d400000.setConstraints((Component)object3, this.o00000[1]);
                    jPanel.add((Component)object3);
                    if (this.\u00d500000.containsKey("Wache halten")) {
                        ((AbstractButton)object4).setSelected(true);
                    }
                    ++this.\u00f400000;
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object4 = this.\u00d800000.\u00d5o0000().super();
        while (object4.hasNext()) {
            object3 = (KonkreterZauber)object4.next();
            object2 = new JCheckBox(((U)object3).toString());
            ((Component)object2).setName(((U)object3).toString());
            ((AbstractButton)object2).addActionListener(this.new);
            this.o00000[0].gridy = this.\u00f400000;
            this.\u00d400000.setConstraints((Component)object2, this.o00000[0]);
            jPanel.add((Component)object2);
            try {
                object5 = new JLabel("" + this.\u00d800000.\u00d300000((oo0o_0)object3));
                this.o00000[1].gridy = this.\u00f400000;
                this.\u00d400000.setConstraints((Component)object5, this.o00000[1]);
                jPanel.add((Component)object5);
                if (this.\u00d800000.\u00d300000((oo0o_0)object3) > 8) {
                    ((AbstractButton)object2).setSelected(true);
                    this.\u00d500000.put(((U)object3).toString(), true);
                }
            }
            catch (D d3) {
                d3.printStackTrace();
            }
            ++this.\u00f400000;
        }
        object3 = this.\u00d800000.\u00d500000().\u00d500000();
        while (object3.hasNext()) {
            object2 = object3.next();
            object5 = new JCheckBox(((public)object2).oO0000());
            if (this.\u00d500000.containsKey(((public)object2).oO0000())) {
                ((AbstractButton)object5).setSelected(true);
            }
            ((Component)object5).setName(((public)object2).oO0000());
            ((AbstractButton)object5).addActionListener(this.new);
            if (object2 instanceof J) {
                ((Component)object5).setName(((public)object2).oO0000());
                ((AbstractButton)object5).setText(((public)object2).toString() + " " + ((J)object2).ObjectString());
                if (this.\u00d500000.containsKey(((public)object2).toString() + " " + ((J)object2).ObjectString())) {
                    ((AbstractButton)object5).setSelected(true);
                }
            }
            if (object2 instanceof helden.framework.C.D) {
                ((AbstractButton)object5).setText(((helden.framework.C.D)object2).oO0000());
            }
            this.o00000[0].gridy = this.\u00f400000;
            this.\u00d400000.setConstraints((Component)object5, this.o00000[0]);
            jPanel.add((Component)object5);
            jComponent = new JLabel();
            this.o00000[1].gridy = this.\u00f400000++;
            this.\u00d400000.setConstraints(jComponent, this.o00000[1]);
            jPanel.add(jComponent);
        }
        for (Object object5 : this.\u00d800000.\u00f5O0000()) {
            jComponent = new JCheckBox(((P)object5).toString());
            jComponent.setName(((P)object5).toString());
            jComponent.addActionListener(this.new);
            this.o00000[0].gridy = this.\u00f400000;
            this.\u00d400000.setConstraints(jComponent, this.o00000[0]);
            jPanel.add(jComponent);
            if (this.\u00d500000.containsKey(((P)object5).toString())) {
                jComponent.setSelected(true);
            }
            JLabel jLabel = new JLabel();
            this.o00000[1].gridy = this.\u00f400000++;
            this.\u00d400000.setConstraints(jLabel, this.o00000[1]);
            jPanel.add(jLabel);
        }
        object5 = new JScrollPaneFast(jPanel);
        ((JScrollPane)object5).getVerticalScrollBar().setUnitIncrement(10);
        ((JScrollPane)object5).getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)object5, "Center");
        this.aktualisiereText();
    }

    public void aktualisiereText() {
        this.new().setText("" + this.\u00d500000.size());
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

    public void deSelektAuswahl(String string) {
        if (this.\u00d500000.containsKey(string)) {
            this.\u00d500000.remove(string);
        }
    }

    public JButton getAbbrechenButton() {
        if (this.\u00f500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Delete.gif"));
            this.\u00f500000 = new JButton("Abbrechen", imageIcon);
            this.\u00f500000.setName("Abbrechen");
            this.\u00f500000.addActionListener(this.new);
        }
        return this.\u00f500000;
    }

    public HashMap<String, Boolean> getAuswahl() {
        return this.\u00d500000;
    }

    public SLBAuswahlController getController() {
        return this.new;
    }

    public JButton getOkButton() {
        if (this.return == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Check.gif"));
            this.return = new JButton("OK", imageIcon);
            this.return.setName("OK");
            this.return.addActionListener(this.new);
        }
        return this.return;
    }

    public void selektAuswahl(String string) {
        if (!this.\u00d500000.containsKey(string)) {
            this.\u00d500000.put(string, true);
        }
    }

    private JTextField new() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JTextField();
            this.\u00d300000.setColumns(4);
            this.\u00d300000.setEditable(false);
        }
        return this.\u00d300000;
    }

    private JPanel \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("Max 40 Eintr\u00e4ge");
        jLabel.setBorder(BorderFactory.createEmptyBorder(2, 10, 3, 5));
        jPanel.add(jLabel);
        JLabel jLabel2 = new JLabel("Benutzt werde:");
        jLabel2.setBorder(BorderFactory.createEmptyBorder(2, 50, 3, 5));
        jPanel.add(jLabel2);
        JTextField jTextField = this.new();
        jPanel.add(jTextField);
        return jPanel;
    }

    private void o00000() {
        this.\u00f400000 = 0;
        this.o00000[0] = new GridBagConstraints();
        this.o00000[0].gridx = 0;
        this.o00000[0].anchor = 17;
        this.o00000[0].insets.top = 3;
        this.o00000[0].insets.bottom = 2;
        this.o00000[0].insets.right = 3;
        this.o00000[0].insets.left = 10;
        this.o00000[1] = new GridBagConstraints();
        this.o00000[1].weightx = 1.0;
        this.o00000[1].gridx = 1;
        this.o00000[1].anchor = 10;
        this.o00000[1].insets.top = 3;
        this.o00000[1].insets.bottom = 2;
        this.o00000[1].insets.right = 5;
        this.o00000[1].insets.left = 10;
    }
}

