/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo;

import helden.gui.A;
import helden.gui.allgemein.ProxyEinstellungenPanel;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;

/*
 * Renamed from helden.gui.ooOO.c
 */
public final class c_0
extends AbstractAction {
    private static c_0 o00000;
    private A \u00d200000;

    public static c_0 o00000(A a2) {
        if (o00000 == null) {
            o00000 = new c_0(a2);
        }
        return o00000;
    }

    private c_0(A a2) {
        super("Proxy einstellen ...");
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ProxyEinstellungenPanel proxyEinstellungenPanel = new ProxyEinstellungenPanel(this);
        JDialog jDialog = new JDialog(Utils.getFrame(this.\u00d200000), "Proy einstellen", true);
        proxyEinstellungenPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(proxyEinstellungenPanel);
        jDialog.setSize(250, 250);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
    }
}

