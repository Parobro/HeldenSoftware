/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Stringsuper;
import helden.framework.held.object.oooo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.Zauber;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AktivierungRenderer
implements ListCellRenderer {
    private ListCellRenderer \u00d200000 = new DefaultListCellRenderer();
    private helden.framework.held.K \u00d300000;
    private String \u00d400000;
    private boolean super;

    public AktivierungRenderer(oooo_2 oooo_22, boolean bl) {
        this.\u00d300000 = oooo_22.\u00d800000();
        this.\u00d400000 = oooo_22.String();
        this.super = bl;
    }

    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        if (object == null) {
            return this.\u00d200000.getListCellRendererComponent(jList, object, n, bl, bl2);
        }
        oo0o_0 oo0o_02 = (oo0o_0)object;
        StringBuffer stringBuffer = new StringBuffer();
        if (oo0o_02 instanceof voidsuper) {
            int n2 = 1000;
            try {
                n2 = !this.\u00d400000.equals("AP") ? this.\u00d300000.\u00f8O0000().super(oo0o_02, this.\u00d300000, false, this.super) : this.\u00d300000.\u00f8O0000().super(oo0o_02, this.\u00d300000, false, this.super);
            }
            catch (Stringsuper stringsuper) {
                throw new RuntimeException(stringsuper);
            }
            stringBuffer.append(" (");
            stringBuffer.append(n2);
            stringBuffer.append(" ");
            stringBuffer.append(this.\u00d400000);
            stringBuffer.append(")");
        } else if (oo0o_02 instanceof Zauber) {
            Zauber zauber = (Zauber)oo0o_02;
            K[] kArray = zauber.getRepraesentationen();
            stringBuffer.append(" (");
            for (int i2 = 0; i2 < kArray.length; ++i2) {
                String string = kArray[i2].super();
                stringBuffer.append(string);
                if (i2 >= kArray.length - 1) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(")");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        if (!oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            stringBuffer2.append("[");
            stringBuffer2.append(oo0o_02.getArt().toString().substring(0, 3));
            stringBuffer2.append("] ");
        }
        stringBuffer2.append(oo0o_02.toString());
        stringBuffer2.append(stringBuffer);
        return this.\u00d200000.getListCellRendererComponent(jList, stringBuffer2, n, bl, bl2);
    }
}

