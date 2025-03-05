/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import helden.gui.components.JScrollPaneFast;
import helden.gui.erschaffung.dialoge.auswahlen.AuswahlListe;
import helden.gui.erschaffung.dialoge.auswahlen.VorteilRenderer;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ListenAuswahlPanel
extends JPanel
implements AuswahlListe {
    private JList super;

    public ListenAuswahlPanel() {
        this.setName("Auswahl-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add(jScrollPaneFast);
    }

    @Override
    public Vector<Integer> getSelektierteIndices() {
        Vector<Integer> vector = new Vector<Integer>(1);
        vector.add(new Integer(this.o00000().getSelectedIndex()));
        return vector;
    }

    public void setElemente(ArrayList arrayList) {
        DefaultListModel defaultListModel = new DefaultListModel();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            defaultListModel.addElement(arrayList.get(i2));
        }
        this.o00000().setModel(defaultListModel);
        this.o00000().setSelectedIndex(0);
    }

    private JList o00000() {
        if (this.super == null) {
            this.super = new JList();
            this.super.setCellRenderer(new VorteilRenderer());
            this.super.setSelectionMode(0);
        }
        return this.super;
    }
}

