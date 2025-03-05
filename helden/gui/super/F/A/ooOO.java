/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.super.F.A.G;
import helden.gui.super.F.A.I;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ooOO
extends AbstractTableModel {
    private I super;
    private G \u00d200000;

    public ooOO(G g2, I i2) {
        this.super = i2;
        this.\u00d200000 = g2;
        i2.addTreeExpansionListener(new TreeExpansionListener(){

            @Override
            public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
                ooOO.this.fireTableDataChanged();
            }

            @Override
            public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
                ooOO.this.fireTableDataChanged();
            }
        });
        g2.addTreeModelListener(new TreeModelListener(){

            @Override
            public void treeNodesChanged(TreeModelEvent treeModelEvent) {
                ooOO.this.o00000();
            }

            @Override
            public void treeNodesInserted(TreeModelEvent treeModelEvent) {
                ooOO.this.o00000();
            }

            @Override
            public void treeNodesRemoved(TreeModelEvent treeModelEvent) {
                ooOO.this.o00000();
            }

            @Override
            public void treeStructureChanged(TreeModelEvent treeModelEvent) {
                ooOO.this.\u00d200000();
            }
        });
    }

    @Override
    public Class<?> getColumnClass(int n) {
        return this.\u00d200000.o00000(n);
    }

    @Override
    public int getColumnCount() {
        return this.\u00d200000.o00000();
    }

    @Override
    public String getColumnName(int n) {
        return this.\u00d200000.new(n);
    }

    @Override
    public int getRowCount() {
        return this.super.getRowCount();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        return this.\u00d200000.o00000(this.o00000(n), n2);
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return this.\u00d200000.new(this.o00000(n), n2);
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        this.\u00d200000.o00000(object, this.o00000(n), n2);
    }

    protected void o00000() {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                ooOO.this.fireTableDataChanged();
            }
        });
    }

    protected Object o00000(int n) {
        TreePath treePath = this.super.getPathForRow(n);
        return treePath.getLastPathComponent();
    }

    private void \u00d200000() {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                ooOO.this.fireTableStructureChanged();
            }
        });
    }
}

