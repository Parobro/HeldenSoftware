/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.oooo_1;
import helden.gui.super.F.A.G;
import helden.gui.super.F.A.I;
import helden.gui.super.F.A.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.F.A.if;
import helden.gui.super.F.A.ooOO;
import helden.gui.super.F.A.return;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.LookAndFeel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class H
extends JTable {
    protected I o00000;

    public H(G g2) {
        this.o00000 = new I(g2, this);
        super.setModel(new ooOO(g2, this.o00000));
        O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.o00000);
        this.o00000.setSelectionModel(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.setSelectionModel(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d200000());
        this.setDefaultRenderer(G.class, this.o00000);
        this.setDefaultEditor(G.class, new if(this.o00000, this));
        this.setDefaultRenderer(String.class, new return());
        this.setShowGrid(true);
        this.setIntercellSpacing(new Dimension(2, 2));
        this.setRowHeight(oooo_1.o00000(20));
        this.o00000.setRowHeight(20);
        if (this.o00000.getRowHeight() < 1) {
            this.setRowHeight(18);
        }
        this.getColumnModel().getColumn(0).setMinWidth(200);
    }

    public void new() {
        for (int i2 = 1; i2 < this.o00000.getRowCount(); ++i2) {
            this.o00000.collapseRow(i2);
        }
    }

    public void o00000() {
        for (int i2 = 0; i2 < this.o00000.getRowCount(); ++i2) {
            this.o00000.expandRow(i2);
        }
    }

    @Override
    public int getEditingRow() {
        if (this.getColumnClass(this.editingColumn) == G.class) {
            return -1;
        }
        return this.editingRow;
    }

    public JTree \u00d300000() {
        return this.o00000;
    }

    @Override
    public void setRowHeight(int n) {
        super.setRowHeight(n);
        if (this.o00000 != null && this.o00000.getRowHeight() != n) {
            this.o00000.setRowHeight(this.getRowHeight());
        }
    }

    @Override
    public void updateUI() {
        super.updateUI();
        if (this.o00000 != null) {
            this.o00000.updateUI();
        }
        LookAndFeel.installColorsAndFont(this, "Tree.background", "Tree.foreground", "Tree.font");
    }
}

