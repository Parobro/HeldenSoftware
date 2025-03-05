/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.namen.daten.Namengenerator;
import helden.gui.erschaffung.zustaende.AussehenZustand;
import helden.gui.icons.IconFactory;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AussehenDialog
extends JPanel
implements DocumentListener {
    private JTextField null;
    private String \u00d200000 = "abh\u00e4ngig von der Kultur";
    private JTextField \u00d800000;
    private JTextField \u00f600000;
    private GridBagLayout \u00d600000;
    private JTextField o00000;
    private JTextField \u00f500000;
    private JButton \u00d300000;
    private AussehenZustand \u00f800000;
    private JButton for;
    private JButton \u00d500000;
    private JPopupMenu String;

    public AussehenDialog(AussehenZustand aussehenZustand) {
        this.\u00f800000 = aussehenZustand;
        this.setName("Person-Panel");
        this.setLayout(new BorderLayout());
        this.setLayout(new GridBagLayout());
        this.\u00d600000 = new GridBagLayout();
        this.setLayout(this.\u00d600000);
        this.add(this.Object());
        this.add(this.getNameTextField());
        this.add(this.getNameButton());
        this.add(this.getNamenConfig());
        this.add(this.\u00d200000());
        this.add(this.getGroesseTextField());
        this.add(this.getWuerfelnButton());
        this.add(this.\u00d400000());
        this.add(this.getGewichtTextField());
        this.add(this.o00000());
        this.add(this.getHaarfarbeTextField());
        this.add(this.\u00d500000());
        this.add(this.getAugenfarbeTextField());
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        this.\u00f800000.setHeldenName();
    }

    public JTextField getAugenfarbeTextField() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JTextField();
            this.\u00d800000.setEditable(false);
            this.\u00d800000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.\u00d800000, gridBagConstraints);
        }
        return this.\u00d800000;
    }

    public JPopupMenu getEinstellungMenu() {
        if (this.String == null) {
            JPopupMenu jPopupMenu = new JPopupMenu("Einstellungen");
            JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("adlig");
            jCheckBoxMenuItem.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    AussehenDialog.this.\u00f800000.setAdelig(((JCheckBoxMenuItem)actionEvent.getSource()).isSelected());
                }
            });
            jPopupMenu.add(jCheckBoxMenuItem);
            ButtonGroup buttonGroup = new ButtonGroup();
            JRadioButton jRadioButton = this.o00000(jPopupMenu, this.\u00d200000, buttonGroup);
            jRadioButton.setSelected(true);
            for (Namengenerator namengenerator : this.\u00f800000.getNameGeneratoren()) {
                this.o00000(jPopupMenu, namengenerator.getBezeichnung(), buttonGroup);
            }
            this.String = jPopupMenu;
        }
        return this.String;
    }

    public JTextField getGewichtTextField() {
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new JTextField();
            this.\u00f500000.setEditable(false);
            this.\u00f500000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.\u00f500000, gridBagConstraints);
        }
        return this.\u00f500000;
    }

    public JTextField getGroesseTextField() {
        if (this.o00000 == null) {
            this.o00000 = new JTextField();
            this.o00000.setEditable(false);
            this.o00000.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.o00000, gridBagConstraints);
        }
        return this.o00000;
    }

    public JTextField getHaarfarbeTextField() {
        if (this.null == null) {
            this.null = new JTextField();
            this.null.setEditable(false);
            this.null.setMaximumSize(new Dimension(200, 20));
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.null, gridBagConstraints);
        }
        return this.null;
    }

    public String getHeldenName() {
        return this.getNameTextField().getText();
    }

    public JButton getNameButton() {
        if (this.for == null) {
            this.for = new JButton("Name ausw\u00fcrfeln");
            this.for.addActionListener(this.\u00f800000);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.for, gridBagConstraints);
        }
        return this.for;
    }

    public JButton getNamenConfig() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JButton(IconFactory.getConfig());
            this.\u00d500000.addActionListener(this.\u00f800000);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.\u00d500000, gridBagConstraints);
        }
        return this.\u00d500000;
    }

    public JTextField getNameTextField() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new JTextField();
            this.\u00f600000.setName("Name");
            this.\u00f600000.setColumns(20);
            this.\u00f600000.setMaximumSize(new Dimension(200, 20));
            this.\u00f600000.getDocument().addDocumentListener(this);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.\u00f600000, gridBagConstraints);
        }
        return this.\u00f600000;
    }

    public Component getWuerfelnButton() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JButton("Nochmal w\u00fcrfeln");
            this.\u00d300000.addActionListener(this.\u00f800000);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.fill = 2;
            gridBagConstraints.insets.top = 3;
            gridBagConstraints.insets.bottom = 2;
            gridBagConstraints.insets.right = 5;
            gridBagConstraints.insets.left = 0;
            this.\u00d600000.setConstraints(this.\u00d300000, gridBagConstraints);
        }
        return this.\u00d300000;
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        this.\u00f800000.setHeldenName();
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        this.\u00f800000.setHeldenName();
    }

    public void setHeldenName(String string) {
        this.getNameTextField().setText(string);
    }

    private JRadioButton o00000(final JPopupMenu jPopupMenu, String string, ButtonGroup buttonGroup) {
        JRadioButton jRadioButton = new JRadioButton(string);
        jRadioButton.setName(string);
        jRadioButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String string = ((JRadioButton)actionEvent.getSource()).getName();
                AussehenDialog.this.\u00f800000.setNamensgenerator(AussehenDialog.this.\u00f800000.getNamenLader().getNamengeneratoren().get(string));
                jPopupMenu.setVisible(false);
            }
        });
        buttonGroup.add(jRadioButton);
        jPopupMenu.add(jRadioButton);
        return jRadioButton;
    }

    private JLabel \u00d500000() {
        JLabel jLabel = new JLabel("Augenfarbe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.\u00d600000.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d400000() {
        JLabel jLabel = new JLabel("Gewicht:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.\u00d600000.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel \u00d200000() {
        JLabel jLabel = new JLabel("Gr\u00f6\u00dfe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.\u00d600000.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel o00000() {
        JLabel jLabel = new JLabel("Haarfarbe:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.\u00d600000.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }

    private JLabel Object() {
        JLabel jLabel = new JLabel("Name:");
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 5;
        gridBagConstraints.insets.left = 10;
        this.\u00d600000.setConstraints(jLabel, gridBagConstraints);
        return jLabel;
    }
}

