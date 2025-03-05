/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class InvisibleDefaultMutableTreeNode
extends DefaultMutableTreeNode {
    private static final long serialVersionUID = 4049373469956751243L;
    protected boolean o00000;

    public InvisibleDefaultMutableTreeNode() {
        this(null);
    }

    public InvisibleDefaultMutableTreeNode(Object object) {
        this(object, true, true);
    }

    public InvisibleDefaultMutableTreeNode(Object object, boolean bl, boolean bl2) {
        super(object, bl);
        this.o00000 = bl2;
    }

    public TreeNode getChildAt(int n, boolean bl) {
        if (!bl) {
            return super.getChildAt(n);
        }
        if (this.children == null) {
            throw new ArrayIndexOutOfBoundsException("node has no children");
        }
        int n2 = -1;
        int n3 = -1;
        Enumeration enumeration = this.children.elements();
        while (enumeration.hasMoreElements()) {
            InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = (InvisibleDefaultMutableTreeNode)enumeration.nextElement();
            if (invisibleDefaultMutableTreeNode.isVisible()) {
                ++n3;
            }
            ++n2;
            if (n3 != n) continue;
            return (TreeNode)this.children.elementAt(n2);
        }
        return null;
    }

    public int getChildCount(boolean bl) {
        if (!bl) {
            return super.getChildCount();
        }
        if (this.children == null) {
            return 0;
        }
        int n = 0;
        Enumeration enumeration = this.children.elements();
        while (enumeration.hasMoreElements()) {
            InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = (InvisibleDefaultMutableTreeNode)enumeration.nextElement();
            if (!invisibleDefaultMutableTreeNode.isVisible()) continue;
            ++n;
        }
        return n;
    }

    public boolean isVisible() {
        return this.o00000;
    }

    public void setVisible(boolean bl) {
        this.o00000 = bl;
    }
}

