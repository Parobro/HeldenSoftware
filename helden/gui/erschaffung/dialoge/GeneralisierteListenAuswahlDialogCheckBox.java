/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialog;
import java.util.Vector;
import javax.swing.JCheckBox;

public class GeneralisierteListenAuswahlDialogCheckBox
extends GeneralisierteListenAuswahlDialog {
    private Vector<JCheckBox> \u00d400000 = new Vector();

    public GeneralisierteListenAuswahlDialogCheckBox(oooo_0 oooo_02) {
        super(oooo_02);
        this.setElemente();
    }

    @Override
    public Vector<Integer> getSelektierteIndices() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i2 = 0; i2 < this.\u00d400000.size(); ++i2) {
            JCheckBox jCheckBox = this.\u00d400000.elementAt(i2);
            if (!jCheckBox.isSelected()) continue;
            vector.add(new Integer(i2));
        }
        return vector;
    }

    @Override
    public void setElemente() {
        for (b_0 b_02 : this.Object.\u00d300000()) {
            JCheckBox jCheckBox = new JCheckBox(b_02.toString());
            this.\u00d400000.add(jCheckBox);
            this.getListePanel().add(jCheckBox);
        }
    }
}

