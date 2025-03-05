/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GeneralisierteListenAuswahlDialogExtended
extends GeneralisierteListenAuswahlDialog
implements ActionListener {
    private Vector<JCheckBox> void = new Vector();

    public GeneralisierteListenAuswahlDialogExtended(oooo_0 oooo_02) {
        super(oooo_02);
        this.setElemente();
        this.actionPerformed(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.getLabel().setText(this.Object.o00000(this.getAuswahlAsList()));
        this.repaint();
    }

    @Override
    public Vector<Integer> getSelektierteIndices() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i2 = 0; i2 < this.void.size(); ++i2) {
            JCheckBox jCheckBox = this.void.elementAt(i2);
            if (!jCheckBox.isSelected()) continue;
            vector.add(new Integer(i2));
        }
        return vector;
    }

    public boolean isGueltig() {
        return this.Object.\u00d200000(this.getAuswahlAsList());
    }

    @Override
    public void setElemente() {
        for (b_0 b_02 : this.Object.\u00d300000()) {
            JCheckBox jCheckBox = new JCheckBox(b_02.toString());
            this.void.add(jCheckBox);
            jCheckBox.addActionListener(this);
            this.getListePanel().add(jCheckBox);
        }
    }

    protected ArrayList<b_0> getAuswahlAsList() {
        ArrayList<b_0> arrayList = new ArrayList<b_0>();
        for (Integer n : this.getSelektierteIndices()) {
            arrayList.add(this.Object.\u00d300000().get(n));
        }
        return arrayList;
    }
}

