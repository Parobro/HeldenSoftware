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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class OO0O
extends AbstractAction {
    private static OO0O \u00d200000;
    private JTree super;
    private boolean \u00d300000;
    private int class;
    private F \u00d400000;

    public static OO0O o00000(JTree jTree, return return_) {
        if (\u00d200000 == null) {
            \u00d200000 = new OO0O(jTree, return_);
        }
        return \u00d200000;
    }

    private OO0O(JTree jTree, return return_) {
        super("in Auswahl verschieben", OooO.\u00d300000().\u00d400000());
        this.super = jTree;
        this.\u00d400000 = new F(return_);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TreePath treePath;
        TreePath treePath2 = this.super.getSelectionPath();
        if (treePath2 != null && (treePath = Einstellungen.getInstance().getTreeSelectionPath()) != null && !treePath2.equals(treePath)) {
            int n;
            int n2;
            I i2 = (I)treePath.getLastPathComponent();
            I i3 = (I)treePath2.getLastPathComponent();
            if (i3.isLeaf()) {
                i3 = (I)i3.getParent();
            }
            for (n2 = 0; n2 < i3.getPath().length; ++n2) {
                if (!i3.getPath()[n2].equals(i2)) continue;
                JOptionPane.showMessageDialog(this.super, "Die Gruppe kann nicht in sich selbst Kopiert werden!", "Kopieren nicht m\u00f6glich!", 2);
                return;
            }
            for (n2 = 0; n2 < i3.getChildCount(); ++n2) {
                if (!i3.getChildAt(n2).equals(i2)) continue;
                JOptionPane.showMessageDialog(this.super, "Die Gruppe existiert schon!", "Kopieren nicht m\u00f6glich!", 2);
                return;
            }
            this.o00000(i2);
            n2 = this.class + 1;
            if (!this.\u00d300000) {
                ++n2;
            }
            if (n2 + (n = i3.getLevel()) > 4) {
                JOptionPane.showMessageDialog(this.super, "Die maximale Tiefe wird \u00dcberschritten!", "Kopieren nicht m\u00f6glich!", 2);
                return;
            }
            for (int i4 = 0; i4 < i3.getChildCount() && this.\u00d400000.o00000((I)i3.getChildAt(i4), i2) < 0; ++i4) {
            }
            ((DefaultTreeModel)this.super.getModel()).removeNodeFromParent(i2);
            ((DefaultTreeModel)this.super.getModel()).insertNodeInto(i2, i3, 0);
            ((DefaultTreeModel)this.super.getModel()).reload(i3);
            Einstellungen.getInstance().setTreeSelectionPath(null);
        }
    }

    private void o00000(I i2) {
        if (i2.isLeaf()) {
            this.class = 0;
            this.\u00d300000 = true;
        } else {
            this.class = 0;
            this.\u00d300000 = false;
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
        if (this.class <= n && !this.\u00d300000 && bl) {
            this.class = n + 1;
            this.\u00d300000 = true;
        }
        if (this.class <= n && bl2) {
            this.class = n + 1;
            this.\u00d300000 = false;
        }
    }
}

