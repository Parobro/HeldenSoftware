/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.gui.A;
import helden.gui.allgemein.FontEinstellungenPanel;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class h
extends AbstractAction {
    private A o00000;
    private String Object;
    private boolean \u00d200000;

    protected h(String string, A a2, boolean bl) {
        super(string);
        this.Object = string;
        this.\u00d200000 = bl;
        this.o00000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.o00000();
    }

    public A new() {
        return this.o00000;
    }

    private void o00000() {
        FontEinstellungenPanel fontEinstellungenPanel = new FontEinstellungenPanel(this, this.\u00d200000);
        JDialog jDialog = new JDialog(Utils.getFrame(this.o00000), this.Object, true);
        fontEinstellungenPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(fontEinstellungenPanel);
        fontEinstellungenPanel.update();
        jDialog.setSize(450, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        this.o00000.repaint();
    }
}

