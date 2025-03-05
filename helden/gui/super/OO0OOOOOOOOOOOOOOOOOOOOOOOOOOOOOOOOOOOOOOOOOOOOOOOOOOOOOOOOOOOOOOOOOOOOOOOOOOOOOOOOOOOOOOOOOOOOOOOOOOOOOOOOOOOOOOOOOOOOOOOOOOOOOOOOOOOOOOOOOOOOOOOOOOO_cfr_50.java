/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.C.I;
import helden.framework.OoOO.D;
import helden.framework.held.K;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends AbstractListModel
implements ComboBoxModel {
    private D \u00d200000 = D.Object;
    private K super = null;

    public OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(K k2) {
        this.super = k2;
    }

    @Override
    public Object getElementAt(int n) {
        switch (n) {
            case 0: {
                return D.\u00f400000;
            }
            case 1: {
                return D.o00000;
            }
            case 2: {
                return D.Object;
            }
            case 3: {
                return D.\u00d500000;
            }
            case 4: {
                return D.\u00d200000;
            }
        }
        throw new IllegalArgumentException("Es gibt nur " + this.getSize() + " Elemente");
    }

    @Override
    public Object getSelectedItem() {
        return this.\u00d200000;
    }

    @Override
    public int getSize() {
        if (this.super.o\u00d50000() && this.super.o00000(I.newreturn)) {
            return 5;
        }
        return 4;
    }

    @Override
    public void setSelectedItem(Object object) {
        D d2;
        this.\u00d200000 = d2 = (D)object;
    }
}

