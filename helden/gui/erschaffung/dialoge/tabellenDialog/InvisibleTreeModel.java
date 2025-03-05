/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.InvisibleDefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class InvisibleTreeModel
extends DefaultTreeModel {
    private static final long serialVersionUID = -8223496442709089128L;
    protected boolean super;

    public InvisibleTreeModel(TreeNode treeNode) {
        this(treeNode, false);
    }

    public InvisibleTreeModel(TreeNode treeNode, boolean bl) {
        this(treeNode, false, false);
    }

    public InvisibleTreeModel(TreeNode treeNode, boolean bl, boolean bl2) {
        super(treeNode, bl);
        this.super = bl2;
    }

    public void activateFilter(boolean bl) {
        this.super = bl;
    }

    @Override
    public Object getChild(Object object, int n) {
        if (this.super && object instanceof InvisibleDefaultMutableTreeNode) {
            return ((InvisibleDefaultMutableTreeNode)object).getChildAt(n, this.super);
        }
        return ((TreeNode)object).getChildAt(n);
    }

    @Override
    public int getChildCount(Object object) {
        if (this.super && object instanceof InvisibleDefaultMutableTreeNode) {
            return ((InvisibleDefaultMutableTreeNode)object).getChildCount(this.super);
        }
        return ((TreeNode)object).getChildCount();
    }

    public boolean isActivatedFilter() {
        return this.super;
    }
}

