/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.ooOO.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class class
implements ActionListener {
    private T super;
    private JDialog \u00d200000;

    public class(T t, JDialog jDialog) {
        this.super = t;
        this.\u00d200000 = jDialog;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.super.\u00d400000())) {
            this.\u00d200000.setVisible(false);
        }
    }
}

