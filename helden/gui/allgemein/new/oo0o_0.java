/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.gui.allgemein.new.I;
import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

/*
 * Renamed from helden.gui.allgemein.new.Oo0O
 */
public class oo0o_0
extends DefaultTreeCellEditor {
    public oo0o_0(JTree jTree, DefaultTreeCellRenderer defaultTreeCellRenderer) {
        super(jTree, defaultTreeCellRenderer);
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        I i2;
        TreePath treePath = this.tree.getSelectionPath();
        return treePath == null || !(i2 = (I)treePath.getLastPathComponent()).isRoot() && !i2.isLeaf() && i2.getUserObject() != null && (i2.getUserObject() == null || i2.getUserObject().toString().equals("Neu"));
    }
}

