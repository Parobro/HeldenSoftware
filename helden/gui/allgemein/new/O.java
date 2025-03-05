/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.gui.OooO;
import helden.gui.allgemein.new.I;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O
extends AbstractAction {
    private static O \u00d200000;
    private JTree super;

    public static O o00000(JTree jTree) {
        if (\u00d200000 == null) {
            \u00d200000 = new O(jTree);
        }
        return \u00d200000;
    }

    public O(JTree jTree) {
        super("Gruppe umbenennen", OooO.\u00d300000().\u00d400000());
        this.super = jTree;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        I i2;
        TreePath treePath = this.super.getSelectionPath();
        if (treePath != null && !(i2 = (I)treePath.getLastPathComponent()).isLeaf() && !i2.isRoot()) {
            if (((I)i2.getParent()).isRoot() && "Neu".equals(i2.getUserObject().toString())) {
                return;
            }
            String string = i2.getUserObject().toString();
            Object object = JOptionPane.showInputDialog(this.super, "Gruppenname", "Gruppenname \u00e4ndern!", 2, null, null, string);
            if (object == null) {
                return;
            }
            String string2 = ((String)object).replace('\\', '/');
            if (((I)i2.getParent()).isRoot() && "Neu".equals(string2)) {
                JOptionPane.showMessageDialog(this.super, "Der Name \"Neu\" ist reserviert", "Fehlerhafte Eingabe", 2);
                return;
            }
            if (string2.length() < 3) {
                JOptionPane.showMessageDialog(this.super, "Der Name ist zu kurz!\nmin 3 Zeichen", "Fehlerhafte Eingabe", 2);
                return;
            }
            i2.o00000(string2);
            i2.setUserObject(string2);
            ((DefaultTreeModel)this.super.getModel()).reload(i2);
        }
    }
}

