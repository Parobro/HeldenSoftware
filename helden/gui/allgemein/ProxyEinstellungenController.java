/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.ProxyEinstellungenPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ProxyEinstellungenController
implements ActionListener {
    private ProxyEinstellungenPanel o00000;
    private JDialog \u00d200000;

    public ProxyEinstellungenController(ProxyEinstellungenPanel proxyEinstellungenPanel, AbstractAction abstractAction) {
        this.o00000 = proxyEinstellungenPanel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.o00000, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d200000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.getOkButton()) {
            Einstellungen.getInstance().setProxyServer(this.o00000.getProxy());
            Einstellungen.getInstance().setProxyPort(this.o00000.getPort());
            Einstellungen.getInstance().setProxyUser(this.o00000.getUser());
            Einstellungen.getInstance().setProxyPwd(this.o00000.getPwd());
            Einstellungen.getInstance().setProxyVerwenden(this.o00000.getVerwenden());
            Einstellungen.getInstance().setProxyAuthentifikation(this.o00000.getAuth());
            this.\u00d200000.setVisible(false);
        }
    }

    public void setDialog(JDialog jDialog) {
        this.\u00d200000 = jDialog;
    }
}

