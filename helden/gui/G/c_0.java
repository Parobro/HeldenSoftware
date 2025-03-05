/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.gui.G.oOOO.ooOO;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.c
 */
public class c_0<A>
extends JPanel {
    private JList o00000;

    public c_0() {
        this.setName("Auswahl-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add(jScrollPaneFast);
    }

    public A new() {
        return (A)this.o00000().getSelectedValue();
    }

    public void o00000(ArrayList<A> arrayList) {
        DefaultListModel<A> defaultListModel = new DefaultListModel<A>();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            defaultListModel.addElement(arrayList.get(i2));
        }
        this.o00000().setModel(defaultListModel);
        this.o00000().setSelectedIndex(0);
    }

    public void o00000(ArrayList<A> arrayList, A a2) {
        DefaultListModel<A> defaultListModel = new DefaultListModel<A>();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            defaultListModel.addElement(arrayList.get(i2));
        }
        this.o00000().setModel(defaultListModel);
        this.o00000().setSelectedValue(a2, true);
    }

    private JList o00000() {
        if (this.o00000 == null) {
            this.o00000 = new JList();
            this.o00000.setCellRenderer(new ooOO());
            this.o00000.setSelectionMode(0);
        }
        return this.o00000;
    }
}

