/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.OooO;
import helden.gui.allgemein.EreignisHinzufuegenPanel;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oOOOo
extends AbstractAction {
    private static oOOOo o00000;
    private A new;

    public static oOOOo super(A a2) {
        if (o00000 == null) {
            o00000 = new oOOOo(a2);
        }
        return o00000;
    }

    private oOOOo(A a2) {
        super("Ereignis hinzuf\u00fcgen ...", OooO.\u00d300000().\u00d400000());
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.new.\u00d2O0000();
        EreignisHinzufuegenPanel ereignisHinzufuegenPanel = new EreignisHinzufuegenPanel(this, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        JDialog jDialog = new JDialog(Utils.getFrame(this.new), "Ereignisse", true);
        ereignisHinzufuegenPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(ereignisHinzufuegenPanel);
        jDialog.setSize(800, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        this.new.\u00d8O0000();
    }
}

