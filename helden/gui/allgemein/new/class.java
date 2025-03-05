/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.framework.Einstellungen;
import helden.framework.held.Object.Y;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.Utils;
import helden.gui.allgemein.new.F;
import helden.gui.allgemein.new.I;
import helden.gui.allgemein.new.Object;
import helden.gui.return;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class class
implements ActionListener,
TreeSelectionListener,
PropertyChangeListener {
    private JTree o00000;
    private DefaultTreeModel return;
    private JDialog \u00d300000;
    private return new;
    private Object \u00d400000;
    private F \u00d500000;

    public class(JTree jTree, DefaultTreeModel defaultTreeModel, return return_) {
        this.o00000 = jTree;
        this.return = defaultTreeModel;
        this.new = return_;
        return_.o00000(this);
        this.o00000.addTreeSelectionListener(this);
        this.\u00d500000 = new F(return_);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (((JButton)actionEvent.getSource()).getText().startsWith("Bearbeiten")) {
            this.\u00d400000 = new Object(this, this.return, this.new);
            this.\u00d300000 = new JDialog(Utils.getFrame(this.o00000), "Gruppen Bearbeiten", true);
            this.\u00d300000.getContentPane().add(this.\u00d400000);
            this.\u00d300000.setSize(800, 600);
            Utils.zentriere(this.\u00d300000);
            this.\u00d300000.setVisible(true);
        }
        if (((JButton)actionEvent.getSource()).getText().startsWith("OK")) {
            this.\u00d400000.new(this.return);
            this.\u00d300000.setVisible(false);
        }
        if (((JButton)actionEvent.getSource()).getText().startsWith("Abbrechen")) {
            this.\u00d300000.setVisible(false);
        }
    }

    public void o00000(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
    }

    public I o00000(DefaultMutableTreeNode defaultMutableTreeNode, String string, boolean bl, String string2) {
        int n;
        I i2 = null;
        i2 = bl ? new I(string, bl) : new I(string, string2);
        if (defaultMutableTreeNode == null) {
            defaultMutableTreeNode = (I)this.return.getRoot();
        }
        if (defaultMutableTreeNode.isLeaf()) {
            defaultMutableTreeNode = defaultMutableTreeNode.getParent() == null ? (I)this.return.getRoot() : (I)defaultMutableTreeNode.getParent();
        }
        if (defaultMutableTreeNode.getLevel() > 3 && bl) {
            return null;
        }
        for (n = defaultMutableTreeNode.getChildCount() - 1; n >= 0; --n) {
            if (!(((I)defaultMutableTreeNode.getChildAt(n)).isLeaf() && i2.isLeaf() ? ((I)defaultMutableTreeNode.getChildAt(n)).\u00d200000().equals(i2.\u00d200000()) : this.\u00d500000.o00000((I)defaultMutableTreeNode.getChildAt(n), i2) == 0)) continue;
            return (I)defaultMutableTreeNode.getChildAt(n);
        }
        n = this.new(defaultMutableTreeNode, i2, 0, defaultMutableTreeNode.getChildCount());
        this.return.insertNodeInto(i2, defaultMutableTreeNode, n);
        this.return.reload(defaultMutableTreeNode);
        return i2;
    }

    public void o00000(String string, String string2) {
        I i2 = null;
        I i3 = (I)this.return.getRoot();
        for (int i4 = 0; i4 < i3.getChildCount(); ++i4) {
            I i5 = (I)i3.getChildAt(i4);
            if (i5.isLeaf() || !i5.getUserObject().toString().equals("Neu")) continue;
            i2 = i5;
        }
        if (i2 == null) {
            i2 = this.o00000((DefaultMutableTreeNode)i3, "Neu", true, null);
        }
        this.o00000(i2, string, false, string2);
    }

    public void o00000() {
        I i2 = new I("Helden", true);
        this.return.setRoot(i2);
        Y y2 = Einstellungen.getInstance().getSelectetPathNote();
        if (y2 != null) {
            this.new(y2, i2);
        }
        this.o00000.repaint();
    }

    public void o00000(Y y2, I i2) {
        if (y2 == null) {
            return;
        }
        ArrayList<Y> arrayList = y2.o00000();
        try {
            for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
                java.lang.Object object;
                Y y3 = arrayList.get(i3);
                if (!y3.\u00d300000()) {
                    object = this.o00000((DefaultMutableTreeNode)i2, y3.new(), true, null);
                    this.o00000(y3, (I)object);
                }
                if (!y3.\u00d300000() || (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.new.\u00d300000((String)(object = y3.new()))) == null) continue;
                this.o00000((DefaultMutableTreeNode)i2, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000(), false, (String)object);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("AP") || propertyChangeEvent.getPropertyName().equals("FreieAP") || propertyChangeEvent.getPropertyName().equals("Name")) {
            this.o00000.repaint();
        }
    }

    public void o00000(String string, I i2) {
        if (i2 == null || string == null) {
            return;
        }
        for (int i3 = i2.getChildCount() - 1; i3 >= 0; --i3) {
            TreeNode treeNode;
            I i4 = (I)i2.getChildAt(i3);
            if (i4.isLeaf() && i4.\u00d200000().equals(string) && (treeNode = i4.getParent()) != null) {
                this.return.removeNodeFromParent(i4);
            }
            if (i4.isLeaf()) continue;
            this.o00000(string, i4);
        }
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        I i2 = (I)this.o00000.getLastSelectedPathComponent();
        if (i2 != null && i2.isLeaf()) {
            this.new.o00000(i2.\u00d200000());
        }
    }

    private int o00000(DefaultMutableTreeNode defaultMutableTreeNode, I i2, int n, int n2) {
        int n3;
        for (n3 = n; n3 < n2 && this.\u00d500000.o00000((I)defaultMutableTreeNode.getChildAt(n3), i2) < 0; ++n3) {
        }
        return n3;
    }

    private int new(DefaultMutableTreeNode defaultMutableTreeNode, I i2, int n, int n2) {
        if (n2 - n < 10) {
            return this.o00000(defaultMutableTreeNode, i2, n, n2);
        }
        int n3 = (n + n2) / 2;
        int n4 = this.\u00d500000.o00000((I)defaultMutableTreeNode.getChildAt(n3), i2);
        if (n4 == 0) {
            return n3;
        }
        if (n4 > 0) {
            return this.new(defaultMutableTreeNode, i2, n, n3);
        }
        return this.new(defaultMutableTreeNode, i2, n3, n2);
    }

    private void new(Y y2, I i2) {
        if (y2 == null) {
            return;
        }
        if (y2.\u00d300000()) {
            if (y2.new().equals(i2.\u00d200000())) {
                this.o00000.scrollPathToVisible(new TreePath(i2.getPath()));
                this.o00000.setSelectionPath(new TreePath(i2.getPath()));
            }
        } else {
            if (y2.new().equals(i2.o00000())) {
                this.o00000.scrollPathToVisible(new TreePath(i2.getPath()));
                this.o00000.setSelectionPath(new TreePath(i2.getPath()));
            }
            if (y2.o00000().size() > 0) {
                for (int i3 = i2.getChildCount() - 1; i3 >= 0; --i3) {
                    this.new(y2.o00000().get(0), (I)i2.getChildAt(i3));
                }
            }
        }
    }
}

