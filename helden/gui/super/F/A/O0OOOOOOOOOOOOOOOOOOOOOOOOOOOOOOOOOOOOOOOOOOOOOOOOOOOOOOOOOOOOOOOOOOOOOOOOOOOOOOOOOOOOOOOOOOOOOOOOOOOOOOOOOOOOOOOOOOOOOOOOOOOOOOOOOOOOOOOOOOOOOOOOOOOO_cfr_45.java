/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.super.F.A.I;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends DefaultTreeSelectionModel {
    protected boolean o00000;
    private I \u00d200000;

    public O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(I i2) {
        this.\u00d200000 = i2;
        this.\u00d200000().addListSelectionListener(this.\u00d300000());
    }

    public ListSelectionModel \u00d200000() {
        return this.listSelectionModel;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void resetRowSelection() {
        if (!this.o00000) {
            this.o00000 = true;
            try {
                super.resetRowSelection();
            }
            finally {
                this.o00000 = false;
            }
        }
    }

    protected ListSelectionListener \u00d300000() {
        return new _o();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void super() {
        if (!this.o00000) {
            this.o00000 = true;
            try {
                int n = this.listSelectionModel.getMinSelectionIndex();
                int n2 = this.listSelectionModel.getMaxSelectionIndex();
                this.clearSelection();
                if (n != -1 && n2 != -1) {
                    for (int i2 = n; i2 <= n2; ++i2) {
                        TreePath treePath;
                        if (!this.listSelectionModel.isSelectedIndex(i2) || (treePath = this.\u00d200000.getPathForRow(i2)) == null) continue;
                        this.addSelectionPath(treePath);
                    }
                }
            }
            finally {
                this.o00000 = false;
            }
        }
    }

    class _o
    implements ListSelectionListener {
        _o() {
        }

        @Override
        public void valueChanged(ListSelectionEvent listSelectionEvent) {
            O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.this.super();
        }
    }
}

