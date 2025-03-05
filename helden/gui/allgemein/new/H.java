/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.new;

import helden.gui.allgemein.new.O;
import helden.gui.allgemein.new.OO0O;
import helden.gui.allgemein.new.P;
import helden.gui.allgemein.new.oooo_0;
import helden.gui.return;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTree;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class H
extends MouseAdapter {
    private JTree super;
    private JPopupMenu \u00d300000;
    private return \u00d200000;

    public H(JTree jTree, return return_) {
        this.super = jTree;
        this.\u00d200000 = return_;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.o00000(mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.o00000(mouseEvent);
    }

    private JPopupMenu o00000() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new JPopupMenu();
            this.\u00d300000.add(oooo_0.super(this.super));
            this.\u00d300000.add(P.o00000(this.super, this.\u00d200000));
            this.\u00d300000.add(OO0O.o00000(this.super, this.\u00d200000));
            this.\u00d300000.addSeparator();
            this.\u00d300000.add(O.o00000(this.super));
        }
        return this.\u00d300000;
    }

    private void o00000(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.o00000().show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
        }
    }
}

