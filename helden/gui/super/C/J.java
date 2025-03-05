/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.F;
import helden.framework.E.OooO;
import helden.framework.held.object.oooo_1;
import helden.gui.allgemein.Utils;
import helden.gui.super.C.G;
import helden.gui.super.C.O;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class J
implements ActionListener {
    private O super;
    private JDialog \u00d200000;
    private oooo_1 \u00d400000;
    private ArrayList<F> \u00d300000;
    private int class;

    public J(G g2, oooo_1 oooo_12, int n) {
        this.class = n;
        this.\u00d400000 = oooo_12;
        this.\u00d300000 = (ArrayList)oooo_12.\u00d800000().o00000(n).oO0000().clone();
        this.super = new O(oooo_12, this, n);
        this.\u00d200000 = new JDialog(Utils.getFrame(g2), "R\u00fcstung w\u00e4hlen", true);
        this.\u00d200000.getContentPane().add(this.super);
        this.\u00d200000.setSize(700, 500);
        Utils.zentriere(this.\u00d200000);
        this.\u00d200000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int[] nArray;
        int n;
        String string;
        if (actionEvent.getSource() == this.super.\u00d500000()) {
            this.\u00d400000.\u00d800000().o00000(this.class).oO0000().clear();
            this.\u00d400000.\u00d800000().o00000(this.class).oO0000().addAll(this.\u00d300000);
            this.\u00d200000.setVisible(false);
        }
        if (actionEvent.getSource() == this.super.o00000()) {
            this.\u00d200000.setVisible(false);
        }
        if ((string = ((JButton)actionEvent.getSource()).getName()).equals("ADD")) {
            n = this.super.\u00d300000().getSelectedRowCount();
            if (n < 0) {
                JOptionPane.showConfirmDialog(this.super, "Bitte treffen sie eine Auswahl in der Inventartabelle", "Nichts gew\u00e4hlt", -1);
            } else {
                nArray = this.super.\u00d300000().getSelectedRows();
                for (int n2 : nArray) {
                    F f2 = (F)this.super.\u00d300000().getModel().getValueAt(n2, 2);
                    if (this.\u00d300000.contains(f2)) continue;
                    this.\u00d300000.add(f2);
                }
                Collections.sort(this.\u00d300000, new OooO());
                this.super.o00000(this.\u00d300000);
            }
        }
        if (string.equals("REM")) {
            n = this.super.\u00d600000().getSelectedRow();
            if (n < 0) {
                JOptionPane.showConfirmDialog(this.super, "Bitte treffen sie eine Auswahl in der R\u00fcstungstabelle", "Nichts gew\u00e4hlt", -1);
            } else {
                nArray = this.super.\u00d600000().getSelectedRows();
                Object object = new ArrayList();
                for (int n3 : nArray) {
                    ((ArrayList)object).add(n3);
                }
                Collections.sort(object);
                for (int i2 = ((ArrayList)object).size() - 1; i2 >= 0; --i2) {
                    F f3 = (F)this.super.\u00d600000().getModel().getValueAt((Integer)((ArrayList)object).get(i2), 2);
                    this.\u00d300000.remove(f3);
                }
                this.super.o00000(this.\u00d300000);
            }
            Collections.sort(this.\u00d300000, new OooO());
            this.super.o00000(this.\u00d300000);
        }
    }
}

