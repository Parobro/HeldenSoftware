/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.OoOO.E;
import helden.framework.E.OoOO.F;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.B.super.class;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String
extends JPanel {
    private JTextField new = null;
    private JSpinner \u00d500000 = null;
    private JSpinner o00000 = null;
    private JSpinner \u00d800000 = null;
    private JList return;
    private JComboBox \u00d300000;
    private JSpinner \u00d400000;

    public String(final class clazz) {
        this.\u00d400000();
        DefaultListModel<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> defaultListModel = new DefaultListModel<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO object2 : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d500000()) {
            defaultListModel.addElement(object2);
        }
        this.return.setModel(defaultListModel);
        this.return.setSelectedIndex(0);
        this.\u00f400000().setModel(new DefaultComboBoxModel<java.lang.String>(new java.lang.String[]{"W2", "W3", "W6", "W20"}));
        JButton jButton = new JButton("Hinzuf\u00fcgen");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (String.this.\u00d300000().getText().length() < 3) {
                    return;
                }
                ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
                for (Object object : String.this.return.getSelectedValues()) {
                    arrayList.add((oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
                }
                clazz.o00000(new E(String.this.\u00d300000().getText(), arrayList.toArray(new oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO[0]), new F((Integer)String.this.\u00d200000().getValue(), Integer.parseInt(String.this.\u00d300000.getSelectedItem().toString().substring(1)), (Integer)String.this.\u00d400000.getValue()), (Integer)String.this.\u00d800000.getValue(), (Integer)String.this.\u00d500000.getValue()));
            }
        });
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 0, 0, 5);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        this.add((Component)jButton, gridBagConstraints);
        this.super();
    }

    public JComboBox \u00f400000() {
        return this.\u00d300000;
    }

    public boolean \u00d800000() {
        return true;
    }

    private JSpinner \u00d200000() {
        if (this.o00000 == null) {
            this.o00000 = new JSpinner();
            this.o00000.setModel(new SpinnerNumberModel(1, 1, 40, 1));
        }
        return this.o00000;
    }

    private JTextField \u00d300000() {
        if (this.new == null) {
            this.new = new JTextField();
            this.new.setColumns(20);
        }
        return this.new;
    }

    private JSpinner \u00d600000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JSpinner();
            this.\u00d800000.setModel(new SpinnerNumberModel(1, 0, 30, 1));
        }
        return this.\u00d800000;
    }

    private JSpinner class() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JSpinner();
            this.\u00d500000.setModel(new SpinnerNumberModel(1, 0, 30, 1));
        }
        return this.\u00d500000;
    }

    private void \u00d400000() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        JLabel jLabel = new JLabel();
        jLabel.setText("AT");
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.anchor = 17;
        gridBagConstraints2.gridx = 2;
        gridBagConstraints2.weightx = 0.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.fill = 2;
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.weightx = 0.2;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.gridy = 2;
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints4.gridx = 4;
        gridBagConstraints4.weightx = 0.2;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.gridy = 2;
        JLabel jLabel2 = new JLabel();
        jLabel2.setText(" ");
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.anchor = 17;
        gridBagConstraints5.gridx = 2;
        gridBagConstraints5.weightx = 0.1;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 3;
        gridBagConstraints5.fill = 2;
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.anchor = 17;
        gridBagConstraints6.gridx = 2;
        gridBagConstraints6.weightx = 0.1;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints6.gridy = 2;
        gridBagConstraints6.fill = 2;
        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.anchor = 17;
        gridBagConstraints7.gridy = 0;
        gridBagConstraints7.weightx = 1.0;
        gridBagConstraints7.gridwidth = 4;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 0);
        gridBagConstraints7.gridx = 2;
        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 1;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 3;
        JLabel jLabel3 = new JLabel();
        jLabel3.setText("TP");
        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints9.gridy = 0;
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Name");
        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 1;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints10.gridy = 2;
        JLabel jLabel5 = new JLabel();
        jLabel5.setText("PA");
        JLabel jLabel6 = new JLabel();
        jLabel6.setText(" ");
        this.setSize(444, 348);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0, 83, 0, 0};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
        this.setLayout(gridBagLayout);
        this.add((Component)jLabel5, gridBagConstraints10);
        this.add((Component)jLabel4, gridBagConstraints9);
        this.add((Component)jLabel3, gridBagConstraints8);
        this.add((Component)this.\u00d300000(), gridBagConstraints7);
        this.add((Component)this.class(), gridBagConstraints6);
        this.add((Component)this.\u00d200000(), gridBagConstraints5);
        this.add((Component)jLabel2, gridBagConstraints4);
        this.add((Component)jLabel6, gridBagConstraints3);
        this.add((Component)this.\u00d600000(), gridBagConstraints2);
        this.add((Component)jLabel, gridBagConstraints);
        this.\u00d300000 = new JComboBox();
        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints11.fill = 2;
        gridBagConstraints11.gridx = 3;
        gridBagConstraints11.gridy = 3;
        this.add((Component)this.\u00d300000, gridBagConstraints11);
        JLabel jLabel7 = new JLabel("+");
        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints12.fill = 2;
        gridBagConstraints12.gridx = 4;
        gridBagConstraints12.gridy = 3;
        this.add((Component)jLabel7, gridBagConstraints12);
        this.\u00d400000 = new JSpinner();
        this.\u00d400000.setModel(new SpinnerNumberModel(0, -30, 30, 1));
        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints13.gridx = 5;
        gridBagConstraints13.gridy = 3;
        gridBagConstraints13.fill = 2;
        this.add((Component)this.\u00d400000, gridBagConstraints13);
        JLabel jLabel8 = new JLabel("Distanzklasse");
        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.insets = new Insets(0, 0, 5, 5);
        gridBagConstraints14.gridx = 1;
        gridBagConstraints14.gridy = 4;
        this.add((Component)jLabel8, gridBagConstraints14);
        this.return = new JList();
        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints15.anchor = 17;
        gridBagConstraints15.gridwidth = 4;
        gridBagConstraints15.fill = 3;
        gridBagConstraints15.gridx = 2;
        gridBagConstraints15.gridy = 4;
        this.add((Component)this.return, gridBagConstraints15);
    }

    private void super() {
    }
}

