/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.gui.super.B.K;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class JComboCheckBox
extends JComboBox {
    private K o00000 = null;

    public JComboCheckBox() {
        this.\u00d200000();
    }

    public JComboCheckBox(ComboBoxModel comboBoxModel) {
        super(comboBoxModel);
        this.\u00d200000();
    }

    public JComboCheckBox(DefaultComboBoxModel defaultComboBoxModel, K k2) {
        this((ComboBoxModel)defaultComboBoxModel);
        this.o00000 = k2;
    }

    public JComboCheckBox(JCheckBox[] jCheckBoxArray) {
        super(jCheckBoxArray);
        this.\u00d200000();
    }

    public JComboCheckBox(Vector<Object> vector) {
        super(vector);
        this.\u00d200000();
    }

    public void setModel(ComboBoxModel comboBoxModel) {
        super.setModel(comboBoxModel);
    }

    private void \u00d200000() {
        this.setRenderer(new _o());
        this.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JComboCheckBox.this.o00000();
            }
        });
    }

    private void o00000() {
        if (this.getSelectedItem() instanceof JCheckBox) {
            JCheckBox jCheckBox;
            jCheckBox.setSelected(!(jCheckBox = (JCheckBox)this.getSelectedItem()).isSelected());
            this.o00000.String();
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    class _o
    implements ListCellRenderer {
        private JLabel new;

        public _o() {
            JComboCheckBox.this.setOpaque(true);
        }

        public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
            if (object instanceof Component) {
                Component component = (Component)object;
                if (bl) {
                    component.setBackground(jList.getSelectionBackground());
                    component.setForeground(jList.getSelectionForeground());
                } else {
                    component.setBackground(jList.getBackground());
                    component.setForeground(jList.getForeground());
                }
                return component;
            }
            if (this.new == null) {
                this.new = object != null ? new JLabel(object.toString()) : new JLabel("");
            } else if (object != null) {
                this.new.setText(object.toString());
            } else {
                this.new.setText("");
            }
            return this.new;
        }
    }
}

