/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.O0OO;
import helden.framework.oooo.oo0o_0;
import helden.gui.G.D;
import helden.gui.G.float;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Q
extends D
implements ItemListener,
ChangeListener {
    private float oo0000;
    private Map<voidsuper, Integer> nullsuper = new HashMap<voidsuper, Integer>();
    private O0OO \u00d3o0000;

    public Q(O0OO o0OO2) {
        super(o0OO2);
        boolean bl;
        int n;
        this.oo0000 = new float(this);
        this.\u00d3o0000 = o0OO2;
        ArrayList<voidsuper> arrayList = N.floatsuper().super(this.\u00d600000().\u00d800000().oO0000());
        Collections.sort(arrayList);
        for (voidsuper voidsuper2 : arrayList) {
            n = 0;
            bl = true;
            try {
                n = this.\u00d600000().\u00d800000().\u00d300000((oo0o_0)voidsuper2);
            }
            catch (helden.framework.held.D d2) {
                bl = false;
            }
            this.oo0000.o00000(voidsuper2, bl, voidsuper2.\u00f5\u00d60000(), n);
        }
        Iterator<voidsuper> iterator = this.\u00d600000().\u00d800000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2;
            voidsuper2 = iterator.next();
            if (this.oo0000.\u00d200000(voidsuper2.toString()) != null) continue;
            n = 0;
            bl = true;
            try {
                n = this.\u00d600000().\u00d800000().\u00d300000((oo0o_0)voidsuper2);
            }
            catch (helden.framework.held.D d3) {
                bl = false;
            }
            this.oo0000.o00000(voidsuper2, bl, voidsuper2.\u00f5\u00d60000(), n);
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle die Talente";
    }

    @Override
    public JPanel super() {
        return this.oo0000;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getSource() instanceof JCheckBox) {
            JCheckBox jCheckBox = (JCheckBox)itemEvent.getSource();
            String string = jCheckBox.getText();
            voidsuper voidsuper2 = N.floatsuper().\u00d200000(string);
            if (jCheckBox.isSelected()) {
                this.\u00d600000().\u00d800000().\u00f8O0000().super(voidsuper2, this.super(voidsuper2));
                this.\u00d600000().\u00d3O0000();
            } else {
                this.\u00d600000().\u00d800000().\u00f8O0000().super(voidsuper2);
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSpinner jSpinner = (JSpinner)changeEvent.getSource();
        String string = jSpinner.getName();
        int n = (Integer)jSpinner.getValue();
        voidsuper voidsuper2 = N.floatsuper().\u00d200000(string);
        this.super(voidsuper2, new Integer(n));
        if (this.\u00d600000().\u00d800000().\u00f8O0000().\u00d300000(voidsuper2)) {
            this.\u00d600000().\u00d800000().\u00f8O0000().super(voidsuper2, this.super(voidsuper2));
            this.\u00d600000().\u00d3O0000();
        }
        this.oo0000.\u00d200000(string).setSelected(true);
    }

    @Override
    public boolean \u00d400000() {
        boolean bl = true;
        this.\u00d3o0000.\u00d3O0000();
        return bl;
    }

    protected int super(voidsuper voidsuper2) {
        Integer n = this.nullsuper.get(voidsuper2);
        if (n == null) {
            n = new Integer(0);
            this.super(voidsuper2, n);
        }
        return n;
    }

    protected void super(voidsuper voidsuper2, Integer n) {
        this.nullsuper.put(voidsuper2, n);
    }
}

