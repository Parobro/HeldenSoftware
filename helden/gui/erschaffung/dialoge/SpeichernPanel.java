/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.gui.erschaffung.zustaende.SpeichernZustand;
import helden.gui.oooo_1;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpeichernPanel
extends JPanel {
    private SpeichernZustand return = null;
    private JButton \u00f400000 = null;
    private JTextArea new = null;
    private JPanel o00000 = null;
    private JLabel \u00d500000 = null;
    private JLabel \u00d400000 = null;
    private JButton \u00d300000 = null;
    private JPanel \u00d800000 = null;

    public SpeichernPanel(SpeichernZustand speichernZustand) {
        this.return = speichernZustand;
        this.new();
        this.getJSpeicherNameTextArea().setText(speichernZustand.getDefautTextFieldText());
    }

    public JTextArea getJSpeicherNameTextArea() {
        if (this.new == null) {
            this.new = new JTextArea(1, 25);
            this.new.setText("leer");
        }
        return this.new;
    }

    public String getText() {
        return this.getJSpeicherNameTextArea().getText();
    }

    private JButton \u00d300000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JButton();
            this.\u00d300000.setText("Schlie\u00dfen");
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.\u00d300000.setMnemonic('C');
            this.\u00d300000.setIcon(imageIcon);
            this.\u00d300000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    SpeichernPanel.this.return.close();
                }
            });
        }
        return this.\u00d300000;
    }

    private JPanel \u00d500000() {
        if (this.\u00d800000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridy = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridy = 0;
            this.\u00d800000 = new JPanel();
            this.\u00d800000.setLayout(new GridBagLayout());
            this.\u00d800000.add((Component)this.\u00d400000(), gridBagConstraints2);
            this.\u00d800000.add((Component)this.\u00d300000(), gridBagConstraints);
        }
        return this.\u00d800000;
    }

    private JPanel o00000() {
        if (this.o00000 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.gridy = 0;
            this.\u00d400000 = new JLabel();
            this.\u00d400000.setText("Dateiname");
            this.\u00d500000 = new JLabel();
            this.\u00d500000.setText("Speichern des aktuellen Erschaffungszustand");
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.fill = 0;
            gridBagConstraints2.gridy = 1;
            gridBagConstraints2.weightx = 1.0;
            gridBagConstraints2.weighty = 1.0;
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridwidth = 2;
            gridBagConstraints2.gridx = 0;
            this.o00000 = new JPanel();
            this.o00000.setLayout(new GridBagLayout());
            this.o00000.add((Component)this.getJSpeicherNameTextArea(), gridBagConstraints2);
            this.o00000.add((Component)this.\u00d400000, gridBagConstraints);
        }
        return this.o00000;
    }

    private JButton \u00d400000() {
        if (this.\u00f400000 == null) {
            this.\u00f400000 = new JButton();
            this.\u00f400000.setText("Speichern");
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Save.gif")));
            this.\u00f400000.setMnemonic('S');
            this.\u00f400000.setIcon(imageIcon);
            this.\u00f400000.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    SpeichernPanel.this.return.speichern();
                }
            });
        }
        return this.\u00f400000;
    }

    private void new() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 3;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.insets = new Insets(10, 10, 46, 10);
        gridBagConstraints2.gridx = 0;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridwidth = 4;
        gridBagConstraints3.gridy = 1;
        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(394, 261));
        this.add((Component)this.o00000(), gridBagConstraints3);
        this.add((Component)this.\u00d500000, gridBagConstraints2);
        this.add((Component)this.\u00d500000(), gridBagConstraints);
    }
}

