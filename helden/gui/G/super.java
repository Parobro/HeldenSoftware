/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.O0OO;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.G.D;
import helden.gui.G.T;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class super
extends D
implements ItemListener {
    private T return;
    private helden.framework.held.T \u00d800000;
    private ArrayList<voidsuper> \u00f400000 = new ArrayList();

    public super(O0OO o0OO2) {
        super(o0OO2);
        this.return = new T(this);
        this.\u00d800000 = this.\u00d600000().\u00d800000().\u00f8O0000();
        Iterator<voidsuper> iterator = this.\u00d800000.super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d2O0000)) continue;
            this.return.super(voidsuper2, false, false);
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle die Mirakeltalente";
    }

    @Override
    public JPanel super() {
        return this.return;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getSource() instanceof JCheckBox) {
            JCheckBox jCheckBox = (JCheckBox)itemEvent.getSource();
            String string = jCheckBox.getText();
            voidsuper voidsuper2 = N.floatsuper().\u00d200000(string);
            if (jCheckBox.isSelected()) {
                this.\u00f400000.add(voidsuper2);
            } else {
                this.\u00f400000.remove(voidsuper2);
            }
        }
    }

    @Override
    public void class() {
    }

    @Override
    public boolean \u00d400000() {
        boolean bl = true;
        for (voidsuper voidsuper2 : this.\u00f400000) {
            this.\u00d600000().\u00d800000().\u00f8O0000().\u00d200000(voidsuper2);
        }
        return bl;
    }
}

