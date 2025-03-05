/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.C;
import helden.framework.held.D;
import helden.framework.held.OOOo;
import helden.framework.held.P;
import helden.framework.held.object.oooo_1;
import helden.framework.held.oooo_0;
import helden.gui.allgemein.Utils;
import helden.gui.super.E.G;
import helden.gui.super.E.String;
import helden.gui.super.super;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
implements ActionListener {
    private oooo_1 \u00d300000;
    private String super;
    private super \u00d200000;

    public A(String string, super super_) {
        this.super = string;
        this.\u00d200000 = super_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        java.lang.String string = ((JButton)actionEvent.getSource()).getName();
        if (string.equals("Aktivierung")) {
            JDialog jDialog = new JDialog(Utils.getFrame(this.super), "Talente aktivieren", true);
            G g2 = new G(jDialog, this.\u00d300000);
            jDialog.getContentPane().add(g2);
            jDialog.setSize(600, 600);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
            this.super.dosuper().fireTableDataChanged();
            this.super.repaint();
        } else {
            JButton jButton = (JButton)actionEvent.getSource();
            voidsuper voidsuper2 = null;
            try {
                voidsuper2 = (voidsuper)this.super.\u00d200000(jButton);
                this.\u00d300000.\u00d200000(voidsuper2);
                this.super.dosuper().super();
            }
            catch (X x) {
                x.printStackTrace();
            }
            catch (D d2) {
                d2.printStackTrace();
            }
            catch (OOOo oOOo) {
                JOptionPane.showMessageDialog(this.super, "Voraussetzungen nicht erf\u00fcllt: " + oOOo.getMessage().toString());
            }
            catch (oooo_0 oooo_02) {
                JOptionPane.showMessageDialog(this.super, "Nicht gen\u00fcgend freie Abenteuerpunkte");
            }
            catch (P p2) {
                JOptionPane.showMessageDialog(this.super, "Die Eigenschaften sind zu niedrig");
            }
            catch (C c) {
                JOptionPane.showMessageDialog(this.super, "Maximum erreicht");
            }
        }
        if (this.\u00d300000 != null) {
            this.super.\u00d500000(this.\u00d300000);
        }
        this.\u00d200000.public();
    }

    public oooo_1 o00000() {
        return this.\u00d300000;
    }

    public void o00000(oooo_1 oooo_12) {
        this.\u00d300000 = oooo_12;
        if (oooo_12 != null) {
            this.super.\u00d500000(oooo_12);
        }
    }
}

