/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H.B;

import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.P;
import helden.framework.settings.Setting;
import helden.gui.H.B.B;
import helden.gui.allgemein.Utils;
import helden.gui.components.AuswahlPanel;
import helden.gui.oooo_1;
import helden.model.dsa41.orden.Orden;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class A
extends AbstractAction {
    private static A o00000;
    private helden.gui.A new;
    private K \u00d300000;

    public static A o00000(helden.gui.A a2) {
        if (o00000 == null) {
            o00000 = new A(a2);
        }
        return o00000;
    }

    private A(helden.gui.A a2) {
        super("Ordensbeitritt (BETA) ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Blank.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.\u00d300000 = (K)this.new.\u00d2O0000();
        if (!this.\u00d300000.o00000(Setting.returnsuper)) {
            String string = "Ordensbeitritte sind in diesem Setting nicht m\u00f6glich.\n\n";
            JOptionPane.showMessageDialog(null, string, "", 2);
            return;
        }
        Orden orden = new Orden();
        AuswahlPanel<P> auswahlPanel = new AuswahlPanel<P>(orden.getVarianten(), "", 1);
        JDialog jDialog = new JDialog(Utils.getFrame(this.new), "Ordensbeitritt", true);
        auswahlPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(auswahlPanel);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        if (!auswahlPanel.getController().istBestaetigt()) {
            return;
        }
        ArrayList<P> arrayList = auswahlPanel.getAusgewaelteVarianteimPanelList();
        orden.waehleVariante(arrayList.get(0));
        floatsuper floatsuper2 = new floatsuper(this.\u00d300000);
        if (!floatsuper2.Object(orden.getNotwendigeVoraussetzungen())) {
            JOptionPane.showMessageDialog(null, "<html><body>Nicht alle Voraussetzungen sind erf\u00fcllt:<br>" + orden.getNotwendigeVoraussetzungen().toStringFormatiertHTML(), "Voraussetzungen", 1);
            return;
        }
        B b = new B(this.\u00d300000);
        b.o00000(orden);
        this.new.\u00d800000();
    }
}

