/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.oooo.a.oooo_0;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class GeneralisierteListenAuswahlDialog
extends JPanel {
    protected JPanel o00000;
    protected oooo_0 Object;
    private JLabel \u00d200000;

    public GeneralisierteListenAuswahlDialog(oooo_0 oooo_02) {
        this.setLayout(new BorderLayout());
        this.Object = oooo_02;
        this.add((Component)this.getLabel(), "North");
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.getListePanel());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public abstract Vector<Integer> getSelektierteIndices();

    public abstract void setElemente();

    protected JLabel getLabel() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JLabel(" ");
        }
        return this.\u00d200000;
    }

    protected JPanel getListePanel() {
        if (this.o00000 == null) {
            this.o00000 = new JPanel();
            this.o00000.setLayout(new BoxLayout(this.o00000, 1));
            this.o00000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.o00000;
    }
}

