/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.b.super;

import helden.framework.E.B;
import helden.framework.E.C.I;
import helden.framework.E.F;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Renamed from helden.gui.super.B.super.oOOo
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oooo_2
extends JPanel {
    private JComboBox new;
    private I o00000;

    public oooo_2(F f2) {
        this.o00000 = (I)f2.o00000(B.int, 0);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        this.new = new JComboBox();
        this.new.setModel(new DefaultComboBoxModel<I._o>(I._o.values()));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)new JLabel("Zustand der Rune:"), gridBagConstraints);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.fill = 2;
        this.add((Component)this.new, gridBagConstraints2);
        this.\u00d200000();
        this.Object();
    }

    public boolean o00000() {
        this.o00000.o00000((I._o)((Object)this.new.getSelectedItem()));
        return true;
    }

    private void \u00d200000() {
    }

    private void Object() {
        this.new.setSelectedItem((Object)this.o00000.\u00d3\u00d30000());
    }
}

