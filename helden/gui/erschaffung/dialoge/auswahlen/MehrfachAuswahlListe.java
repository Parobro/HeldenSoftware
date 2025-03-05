/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import helden.gui.components.JScrollPaneFast;
import helden.gui.erschaffung.dialoge.auswahlen.AuswahlListe;
import helden.gui.erschaffung.dialoge.auswahlen.StringRepraesentation;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class MehrfachAuswahlListe
extends JPanel
implements AuswahlListe {
    private Vector<JCheckBox> \u00d300000;
    private JPanel \u00d200000;

    public MehrfachAuswahlListe() {
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d200000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        this.\u00d300000 = new Vector();
    }

    public Vector<JCheckBox> getCheckBoxen() {
        return this.\u00d300000;
    }

    @Override
    public Vector<Integer> getSelektierteIndices() {
        Vector<Integer> vector = new Vector<Integer>();
        for (int i2 = 0; i2 < this.\u00d300000.size(); ++i2) {
            JCheckBox jCheckBox = this.\u00d300000.elementAt(i2);
            if (!jCheckBox.isSelected()) continue;
            vector.add(new Integer(i2));
        }
        return vector;
    }

    public void setElemente(ArrayList arrayList) {
        for (Object e : arrayList) {
            String string = StringRepraesentation.praesentiere(e);
            JCheckBox jCheckBox = new JCheckBox(string);
            this.\u00d300000.add(jCheckBox);
            this.\u00d200000().add(jCheckBox);
        }
    }

    private JPanel \u00d200000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JPanel();
            this.\u00d200000.setLayout(new BoxLayout(this.\u00d200000, 1));
            this.\u00d200000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.\u00d200000;
    }
}

