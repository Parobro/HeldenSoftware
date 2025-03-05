/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.super.F.A.E;
import helden.gui.super.F.A.G;
import helden.gui.super.F.A.H;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class I
extends JTree
implements TableCellRenderer {
    protected int super;
    private H \u00d200000;

    public I(G g2, H h2) {
        super(g2);
        if (g2 instanceof E) {
            DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();
            this.setCellRenderer(defaultTreeCellRenderer);
        }
        this.\u00d200000 = h2;
        this.setRootVisible(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        if (bl) {
            this.setBackground(jTable.getSelectionBackground());
        } else {
            this.setBackground(jTable.getBackground());
        }
        if (object != null) {
            this.setToolTipText(object.toString());
        }
        this.super = n;
        return this;
    }

    @Override
    public void paint(Graphics graphics) {
        if (this.super >= 0) {
            graphics.translate(0, -this.super * this.getRowHeight());
            super.paint(graphics);
        }
    }

    @Override
    public void setBounds(int n, int n2, int n3, int n4) {
        super.setBounds(n, 0, n3, this.\u00d200000.getHeight());
    }

    @Override
    public void setRowHeight(int n) {
        if (n > 0) {
            super.setRowHeight(n);
            if (this.\u00d200000 != null && this.\u00d200000.getRowHeight() != n) {
                this.\u00d200000.setRowHeight(this.getRowHeight());
            }
        }
    }

    @Override
    public void updateUI() {
        super.updateUI();
        TreeCellRenderer treeCellRenderer = this.getCellRenderer();
        if (treeCellRenderer instanceof DefaultTreeCellRenderer) {
            DefaultTreeCellRenderer defaultTreeCellRenderer = (DefaultTreeCellRenderer)treeCellRenderer;
            defaultTreeCellRenderer.setTextSelectionColor(UIManager.getColor("Table.selectionForeground"));
            defaultTreeCellRenderer.setBackgroundSelectionColor(UIManager.getColor("Table.selectionBackground"));
        }
    }
}

