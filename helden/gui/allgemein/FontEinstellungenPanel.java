/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.FontCellRenderer;
import helden.gui.allgemein.FontEinstellungenController;
import helden.gui.allgemein.FontModel;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.h;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FontEinstellungenPanel
extends JPanel {
    private JButton void;
    private JButton \u00f500000;
    private FontEinstellungenController Object;
    private JSlider \u00d500000;
    private JTextField o00000;
    private JLabel \u00d400000;
    private JLabel \u00f400000;
    private JScrollPaneFast \u00d600000 = null;
    private JTable \u00d200000 = null;
    private boolean \u00f600000;

    public FontEinstellungenPanel(h h2, boolean bl) {
        this.setLayout(new BorderLayout());
        this.Object = new FontEinstellungenController(this, h2, bl);
        this.\u00f600000 = bl;
        this.addInhalt();
        this.createNavigationsPanel();
        this.setFontGroesse();
    }

    public void addInhalt() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 1;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridy = 3;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridx = 2;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridy = 3;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints3.gridx = 1;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.anchor = 13;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints4.gridy = 3;
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.anchor = 12;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 1;
        JPanel jPanel = new JPanel();
        jPanel.setName("Inhalt");
        jPanel.setLayout(new GridBagLayout());
        this.\u00d400000 = new JLabel();
        this.\u00d400000.setText("Font: ");
        this.\u00f400000 = new JLabel();
        this.\u00f400000.setText("Fontgr\u00f6\u00dfe: ");
        jPanel.add((Component)this.\u00d400000, gridBagConstraints5);
        if (this.\u00f600000) {
            jPanel.add((Component)this.\u00f400000, gridBagConstraints4);
            jPanel.add((Component)this.getFontGroesse(), gridBagConstraints3);
            jPanel.add((Component)this.getFontGroesseText(), gridBagConstraints2);
        }
        jPanel.add((Component)this.o00000(), gridBagConstraints);
        this.add((Component)jPanel, "Center");
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
        if (this.\u00f500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00f500000 = new JButton("Abbrechen", imageIcon);
            this.\u00f500000.setName("Abbrechen");
            this.\u00f500000.addActionListener(this.Object);
        }
        return this.\u00f500000;
    }

    public FontEinstellungenController getController() {
        return this.Object;
    }

    public JSlider getFontGroesse() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSlider();
            this.\u00d500000.setName("groesse");
            this.\u00d500000.setOrientation(0);
            this.\u00d500000.setMaximum(5);
            this.\u00d500000.setMinimum(1);
            this.\u00d500000.setValue(Einstellungen.getInstance().getFontGroesse() + 3);
            this.\u00d500000.setMinorTickSpacing(1);
            this.\u00d500000.setSnapToTicks(true);
            this.\u00d500000.setPaintTicks(true);
            this.\u00d500000.addChangeListener(this.Object);
        }
        return this.\u00d500000;
    }

    public JTextField getFontGroesseText() {
        if (this.o00000 == null) {
            this.o00000 = new JTextField("normal", 7);
            this.o00000.setText("normal");
            this.o00000.setEditable(false);
            this.o00000.setHorizontalAlignment(0);
        }
        return this.o00000;
    }

    public JTable getFontTable() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JTable();
            this.\u00d200000.setModel(new FontModel());
            this.\u00d200000.setRowHeight(oooo_1.o00000(30));
            TableColumnModel tableColumnModel = this.\u00d200000.getColumnModel();
            this.\u00d200000.setSelectionMode(0);
            block4: for (int i2 = 0; i2 < 2; ++i2) {
                TableColumn tableColumn = tableColumnModel.getColumn(i2);
                switch (i2) {
                    case 0: {
                        tableColumn.setPreferredWidth(80);
                        continue block4;
                    }
                    case 1: {
                        tableColumn.setPreferredWidth(200);
                        tableColumn.setCellRenderer(new FontCellRenderer());
                        continue block4;
                    }
                    default: {
                        throw new IllegalArgumentException("Es gibt nur 2 Spalten.");
                    }
                }
            }
            this.\u00d200000.getSelectionModel().addListSelectionListener(this.Object);
        }
        return this.\u00d200000;
    }

    public JButton getOkButton() {
        if (this.void == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.void = new JButton("OK", imageIcon);
            this.void.setName("OK");
            this.void.addActionListener(this.Object);
        }
        return this.void;
    }

    public void setFontGroesse() {
        int n = Einstellungen.getInstance().getFontGroesse();
        if (n == -2) {
            this.getFontGroesseText().setText("sehr klein");
        }
        if (n == -1) {
            this.getFontGroesseText().setText("klein");
        }
        if (n == 0) {
            this.getFontGroesseText().setText("normal");
        }
        if (n == 1) {
            this.getFontGroesseText().setText("gro\u00df");
        }
        if (n == 2) {
            this.getFontGroesseText().setText("sehr gro\u00df");
        }
    }

    public void update() {
        this.Object.updateSelection();
    }

    private JScrollPaneFast o00000() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JScrollPaneFast();
            this.\u00d600000.setViewportView(this.getFontTable());
        }
        return this.\u00d600000;
    }
}

