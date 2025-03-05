/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialog;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class GeneralisierteListenAuswahlDialogRadioButtons
extends GeneralisierteListenAuswahlDialog {
    private Vector<JRadioButton> \u00d500000 = new Vector();
    private ButtonGroup \u00d600000 = new ButtonGroup();

    public GeneralisierteListenAuswahlDialogRadioButtons(oooo_0 oooo_02) {
        super(oooo_02);
        this.setElemente();
    }

    @Override
    public Vector<Integer> getSelektierteIndices() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i2 = 0; i2 < this.\u00d500000.size(); ++i2) {
            JRadioButton jRadioButton = this.\u00d500000.elementAt(i2);
            if (!jRadioButton.isSelected()) continue;
            vector.add(new Integer(i2));
        }
        return vector;
    }

    @Override
    public void setElemente() {
        for (b_0 b_02 : this.Object.\u00d300000()) {
            JRadioButton jRadioButton = new JRadioButton(b_02.toString());
            this.\u00d500000.add(jRadioButton);
            this.\u00d600000.add(jRadioButton);
            this.getListePanel().add(jRadioButton);
        }
    }
}

