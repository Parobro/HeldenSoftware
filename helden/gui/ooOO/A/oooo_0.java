/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.oooo.a;

import helden.framework.D.P;
import helden.framework.held.Object.floatsuper;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.A.OoOO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JLabel;

/*
 * Renamed from helden.gui.ooOO.A.ooOO
 */
public final class oooo_0
extends OoOO {
    private A o00000;

    public oooo_0() {
        super("Sonderfertigkeiten anzeigen", null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        StringBuffer stringBuffer = new StringBuffer("");
        Iterator<P> iterator = helden.framework.d.oooo_0.Object().iterator();
        stringBuffer.append("<html><body><table border=1>");
        while (iterator.hasNext()) {
            object = iterator.next();
            stringBuffer.append("<tr><td>");
            stringBuffer.append(((P)object).toString());
            stringBuffer.append("</td><td>");
            stringBuffer.append(((P)object).o00000((floatsuper)null));
            stringBuffer.append("</td><td>");
            stringBuffer.append(((P)object).\u00f5o0000().toString().replace("&&", "<br>&&").replace("||", "<br>||"));
            stringBuffer.append("</td></tr>");
        }
        stringBuffer.append("</table></body></html>");
        object = new JLabel(stringBuffer.toString());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast((Component)object);
        JDialog jDialog = new JDialog(Utils.getFrame(this.o00000), "Test", true);
        jDialog.add(jScrollPaneFast);
        jDialog.setSize(600, 450);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
    }

    @Override
    public void o00000(A a2) {
        this.o00000 = a2;
    }
}

