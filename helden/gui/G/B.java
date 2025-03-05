/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.L;
import helden.framework.held.Object.O0OO;
import helden.framework.held.Object.private;
import helden.framework.held.T;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.G.D;
import helden.gui.G.Oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends D
implements ItemListener {
    private Oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO if;
    private T \u00f800000;
    private Vector<voidsuper> OO0000 = new Vector();
    private L \u00f500000;

    public B(O0OO o0OO2) {
        super(o0OO2);
        Object object;
        this.if = new Oo0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this);
        this.\u00f800000 = this.\u00d600000().\u00d800000().\u00f8O0000();
        Iterator<voidsuper> iterator = this.\u00f800000.super();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (((U)object).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d2O0000)) continue;
            this.if.o00000((voidsuper)object, this.\u00d300000().\u00f8O0000().super((oo0o_0)object, this.\u00d300000().\u00d500000()), false);
        }
        this.\u00f500000 = this.\u00d600000().\u00d800000().\u00d5o0000();
        object = this.\u00f500000.super();
        while (object.hasNext()) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)object.next();
            this.if.o00000(konkreterZauber, this.\u00d300000().\u00d5o0000().super((oo0o_0)konkreterZauber, this.\u00d300000().\u00d500000()), false);
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle die Leittalente";
    }

    @Override
    public JPanel super() {
        return this.if;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getSource() instanceof JCheckBox) {
            Object object;
            JCheckBox jCheckBox = (JCheckBox)itemEvent.getSource();
            String string = jCheckBox.getText();
            boolean bl = false;
            ArrayList<voidsuper> arrayList = N.floatsuper().\u00d400000();
            Iterator<voidsuper> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().toString().equals(string)) continue;
                object = N.floatsuper().\u00d200000(string);
                if (jCheckBox.isSelected()) {
                    this.\u00d600000().\u00d800000().\u00f8O0000().\u00d200000((oo0o_0)object);
                } else {
                    this.\u00d600000().\u00d800000().\u00f8O0000().\u00d300000((oo0o_0)object);
                }
                bl = true;
            }
            if (!bl) {
                object = this.\u00d600000().\u00d800000().\u00d5o0000().super();
                while (object.hasNext()) {
                    KonkreterZauber konkreterZauber = (KonkreterZauber)object.next();
                    private.\u00d200000(konkreterZauber.toString(), "alle");
                    if (!konkreterZauber.toString().equals(string)) continue;
                    if (jCheckBox.isSelected()) {
                        this.\u00d600000().\u00d800000().\u00d5o0000().\u00d200000((oo0o_0)konkreterZauber);
                        continue;
                    }
                    this.\u00d600000().\u00d800000().\u00d5o0000().\u00d300000((oo0o_0)konkreterZauber);
                }
            }
        }
    }

    @Override
    public void class() {
        this.\u00d600000().\u00d800000().\u00f8O0000().\u00d6O0000().clear();
    }

    @Override
    public boolean \u00d400000() {
        boolean bl = true;
        for (voidsuper voidsuper2 : this.OO0000) {
            this.\u00d600000().\u00d800000().\u00f8O0000().\u00d200000((oo0o_0)voidsuper2);
        }
        return bl;
    }
}

