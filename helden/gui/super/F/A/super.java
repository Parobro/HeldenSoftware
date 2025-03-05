/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.super.F.A.G;
import helden.gui.super.F.A.super.voidsuper;
import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class super
implements G {
    protected voidsuper o00000;
    protected EventListenerList \u00d200000 = new EventListenerList();

    public super(voidsuper voidsuper2) {
        this.o00000 = voidsuper2;
    }

    @Override
    public void addTreeModelListener(TreeModelListener treeModelListener) {
        this.\u00d200000.add(TreeModelListener.class, treeModelListener);
    }

    @Override
    public Class o00000(int n) {
        return Object.class;
    }

    @Override
    public int getIndexOfChild(Object object, Object object2) {
        for (int i2 = 0; i2 < this.getChildCount(object); ++i2) {
            if (!this.getChild(object, i2).equals(object2)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public Object getRoot() {
        return this.o00000;
    }

    @Override
    public boolean new(Object object, int n) {
        return this.o00000(n) == G.class;
    }

    @Override
    public boolean isLeaf(Object object) {
        return this.getChildCount(object) < 1;
    }

    @Override
    public void removeTreeModelListener(TreeModelListener treeModelListener) {
        this.\u00d200000.remove(TreeModelListener.class, treeModelListener);
    }

    @Override
    public void o00000(Object object, Object object2, int n) {
    }

    @Override
    public void valueForPathChanged(TreePath treePath, Object object) {
    }

    protected void \u00d400000(Object object, Object[] objectArray, int[] nArray, Object[] objectArray2) {
        Object[] objectArray3 = this.\u00d200000.getListenerList();
        TreeModelEvent treeModelEvent = null;
        for (int i2 = objectArray3.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray3[i2] != TreeModelListener.class) continue;
            if (treeModelEvent == null) {
                treeModelEvent = new TreeModelEvent(object, objectArray, nArray, objectArray2);
            }
            ((TreeModelListener)objectArray3[i2 + 1]).treeNodesChanged(treeModelEvent);
        }
    }

    protected void \u00d300000(Object object, Object[] objectArray, int[] nArray, Object[] objectArray2) {
        Object[] objectArray3 = this.\u00d200000.getListenerList();
        TreeModelEvent treeModelEvent = null;
        for (int i2 = objectArray3.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray3[i2] != TreeModelListener.class) continue;
            if (treeModelEvent == null) {
                treeModelEvent = new TreeModelEvent(object, objectArray, nArray, objectArray2);
            }
            ((TreeModelListener)objectArray3[i2 + 1]).treeNodesInserted(treeModelEvent);
        }
    }

    protected void o00000(Object object, Object[] objectArray, int[] nArray, Object[] objectArray2) {
        Object[] objectArray3 = this.\u00d200000.getListenerList();
        TreeModelEvent treeModelEvent = null;
        for (int i2 = objectArray3.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray3[i2] != TreeModelListener.class) continue;
            if (treeModelEvent == null) {
                treeModelEvent = new TreeModelEvent(object, objectArray, nArray, objectArray2);
            }
            ((TreeModelListener)objectArray3[i2 + 1]).treeNodesRemoved(treeModelEvent);
        }
    }

    protected void new(Object object, Object[] objectArray, int[] nArray, Object[] objectArray2) {
        Object[] objectArray3 = this.\u00d200000.getListenerList();
        TreeModelEvent treeModelEvent = null;
        for (int i2 = objectArray3.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray3[i2] != TreeModelListener.class) continue;
            if (treeModelEvent == null) {
                treeModelEvent = new TreeModelEvent(object, objectArray, nArray, objectArray2);
            }
            ((TreeModelListener)objectArray3[i2 + 1]).treeStructureChanged(treeModelEvent);
        }
    }
}

