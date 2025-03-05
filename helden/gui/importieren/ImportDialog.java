/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.importieren;

import helden.gui.A;
import helden.gui.importieren.ImportZustand;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ImportDialog
extends JDialog {
    private JPanel o00000 = null;
    private JPanel \u00d200000 = null;
    private JButton String = null;
    private JButton \u00d600000 = null;
    private JLabel \u00d300000 = null;
    private JTextArea \u00d800000 = null;
    private ImportZustand \u00d500000;

    public ImportDialog(A a2, ImportZustand importZustand) {
        super(a2);
        this.setTitle("Import \u00fcber URL");
        this.\u00d500000 = importZustand;
        this.new();
    }

    public JButton getJCloseButton() {
        if (this.String == null) {
            this.String = new JButton();
            this.String.setText("Abbrechen");
            this.String.addActionListener(this.\u00d500000);
        }
        return this.String;
    }

    public JButton getJImportButton() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JButton();
            this.\u00d600000.setText("importieren");
            this.\u00d600000.addActionListener(this.\u00d500000);
        }
        return this.\u00d600000;
    }

    public JTextArea getJURLTextArea() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JTextArea();
        }
        return this.\u00d800000;
    }

    private JPanel o00000() {
        if (this.o00000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.fill = 2;
            gridBagConstraints2.gridy = 1;
            gridBagConstraints2.weightx = 0.0;
            gridBagConstraints2.weighty = 0.0;
            gridBagConstraints2.insets = new Insets(10, 5, 10, 5);
            gridBagConstraints2.gridx = 0;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy = 0;
            this.\u00d300000 = new JLabel();
            this.\u00d300000.setText("Url");
            this.o00000 = new JPanel();
            this.o00000.setLayout(new GridBagLayout());
            this.o00000.add((Component)this.\u00d300000, gridBagConstraints3);
            this.o00000.add((Component)this.getJURLTextArea(), gridBagConstraints2);
            this.o00000.add((Component)this.\u00d300000(), gridBagConstraints);
        }
        return this.o00000;
    }

    private JPanel \u00d300000() {
        if (this.\u00d200000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 0;
            this.\u00d200000 = new JPanel();
            this.\u00d200000.setLayout(new GridBagLayout());
            this.\u00d200000.add((Component)this.getJCloseButton(), gridBagConstraints2);
            this.\u00d200000.add((Component)this.getJImportButton(), gridBagConstraints);
        }
        return this.\u00d200000;
    }

    private void new() {
        this.setSize(new Dimension(355, 228));
        this.setContentPane(this.o00000());
    }
}

