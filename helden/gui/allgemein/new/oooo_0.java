/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.framework.Einstellungen;
import helden.gui.OooO;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.allgemein.new.oOoO
 */
public final class oooo_0
extends AbstractAction {
    private static oooo_0 \u00d200000;
    private JTree o00000;

    public static oooo_0 super(JTree jTree) {
        if (\u00d200000 == null) {
            \u00d200000 = new oooo_0(jTree);
        }
        return \u00d200000;
    }

    private oooo_0(JTree jTree) {
        super("Auswahl in die Zwischenablage", OooO.\u00d300000().\u00d400000());
        this.o00000 = jTree;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TreePath treePath = this.o00000.getSelectionPath();
        if (treePath != null) {
            Einstellungen.getInstance().setTreeSelectionPath(treePath);
        }
    }
}

