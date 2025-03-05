/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.framework.Einstellungen;
import helden.gui.OooO;
import helden.gui.allgemein.new.F;
import helden.gui.allgemein.new.I;
import helden.gui.return;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public final class P
extends AbstractAction {
    private static P \u00d200000;
    private JTree o00000;
    private boolean Object;
    private int \u00d500000;
    private F \u00d400000;

    public static P o00000(JTree jTree, return return_) {
        if (\u00d200000 == null) {
            \u00d200000 = new P(jTree, return_);
        }
        return \u00d200000;
    }

    private P(JTree jTree, return return_) {
        super("in Auswahl kopieren", OooO.\u00d300000().\u00d400000());
        this.o00000 = jTree;
        this.\u00d400000 = new F(return_);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TreePath treePath;
        TreePath treePath2 = this.o00000.getSelectionPath();
        if (treePath2 != null && (treePath = Einstellungen.getInstance().getTreeSelectionPath()) != null && !treePath2.equals(treePath)) {
            int n;
            I i2 = (I)treePath.getLastPathComponent();
            I i3 = (I)treePath2.getLastPathComponent();
            if (i3.isLeaf()) {
                i3 = (I)i3.getParent();
            }
            for (n = 0; n < i3.getPath().length; ++n) {
                if (!i3.getPath()[n].equals(i2)) continue;
                JOptionPane.showMessageDialog(this.o00000, "Die Gruppe kann nicht in sich selbst Kopiert werden!", "Kopieren nicht m\u00f6glich!", 2);
                return;
            }
            for (n = 0; n < i3.getChildCount(); ++n) {
                if (!i3.getChildAt(n).equals(i2)) continue;
                JOptionPane.showMessageDialog(this.o00000, "Die Gruppe existiert schon!", "Kopieren nicht m\u00f6glich!", 2);
                return;
            }
            if (!i2.isLeaf()) {
                int n2;
                this.o00000(i2);
                n = this.\u00d500000 + 1;
                if (!this.Object) {
                    ++n;
                }
                if (n + (n2 = i3.getLevel()) > 4) {
                    JOptionPane.showMessageDialog(this.o00000, "Die maximale Tiefe wird \u00dcberschritten!", "Kopieren nicht m\u00f6glich!", 2);
                    return;
                }
            }
            for (n = 0; n < i3.getChildCount() && this.\u00d400000.o00000((I)i3.getChildAt(n), i2) < 0; ++n) {
            }
            I i4 = new I(i2);
            this.o00000(i2, i4);
            ((DefaultTreeModel)this.o00000.getModel()).insertNodeInto(i4, i3, n);
            ((DefaultTreeModel)this.o00000.getModel()).reload(i3);
        }
    }

    private void o00000(I i2) {
        if (i2.isLeaf()) {
            this.\u00d500000 = 0;
            this.Object = true;
        } else {
            this.\u00d500000 = 0;
            this.Object = false;
            this.o00000(i2, 0);
        }
    }

    private void o00000(I i2, int n) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i3 = 0; i3 < i2.getChildCount(); ++i3) {
            if (!i2.getChildAt(i3).isLeaf()) {
                bl = false;
                bl2 = true;
                this.o00000((I)i2.getChildAt(i3), n + 1);
            }
            if (bl2 || !i2.getChildAt(i3).isLeaf()) continue;
            bl = true;
        }
        if (this.\u00d500000 <= n && !this.Object && bl) {
            this.\u00d500000 = n + 1;
            this.Object = true;
        }
        if (this.\u00d500000 <= n && bl2) {
            this.\u00d500000 = n + 1;
            this.Object = false;
        }
    }

    private void o00000(I i2, I i3) {
        for (int i4 = 0; i4 < i2.getChildCount(); ++i4) {
            I i5 = new I((I)i2.getChildAt(i4));
            if (!i2.getChildAt(i4).isLeaf()) {
                this.o00000((I)i2.getChildAt(i4), i5);
            }
            ((DefaultTreeModel)this.o00000.getModel()).insertNodeInto(i5, i3, i4);
        }
    }
}

