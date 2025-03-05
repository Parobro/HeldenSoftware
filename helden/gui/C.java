/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.class;
import helden.gui.ooOO.FA;
import helden.gui.ooOO.Objectnew;
import helden.gui.ooOO.u;
import helden.gui.oooo.oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.gui.oooo.ooo0_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends MouseAdapter {
    private A o00000;
    private JPopupMenu new;

    public C(A a2) {
        this.o00000 = a2;
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
        if (this.new == null) {
            this.new = new JPopupMenu();
            if (!Einstellungen.getInstance().isVerderben()) {
                this.new.add(u.o00000(this.o00000, false));
                this.new.add(u.o00000(this.o00000, true));
                this.new.add(oo0ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0.o00000(this.o00000));
                this.new.add(FA.o00000(this.o00000));
                this.new.addSeparator();
            }
            this.new.add(class.o00000(this.o00000));
            this.new.add(ooo0_1.o00000(this.o00000));
            this.new.add(Objectnew.o00000(this.o00000));
        }
        return this.new;
    }

    private void o00000(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.o00000().show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
        }
    }
}

