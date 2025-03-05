/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.object.oooo_1;
import helden.gui.super.b.oo0o_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JSpinner;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
implements ActionListener {
    private JDialog new;
    private oooo_1 \u00d300000;
    private oo0o_1 o00000;

    public OoOO(oooo_1 oooo_12, oo0o_1 oo0o_12) {
        this.\u00d300000 = oooo_12;
        this.o00000 = oo0o_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.\u00d400000()) {
            Vector<String> vector = this.\u00d300000.\u00d800000().\u00f400000().getGeldStrings(true);
            for (Waehrung waehrung : WaehrungsFabrik.getInstance().getAllWaehrungen()) {
                Iterator<String> iterator = waehrung.getMuenzBezeichner();
                while (iterator.hasNext()) {
                    String string = iterator.next();
                    Muenze muenze = waehrung.getMuenzen(string);
                    JSpinner jSpinner = this.o00000.super(muenze);
                    int n = (Integer)jSpinner.getValue();
                    this.\u00d300000.\u00d800000().\u00f400000().putMuenze(muenze, n);
                }
            }
            Vector<String> vector2 = this.\u00d300000.\u00d800000().\u00f400000().getGeldStrings(true);
            this.\u00d300000.o00000(vector, vector2, "Geldb\u00f6rse");
        }
        this.new.setVisible(false);
    }

    public void super(JDialog jDialog) {
        this.new = jDialog;
    }
}

