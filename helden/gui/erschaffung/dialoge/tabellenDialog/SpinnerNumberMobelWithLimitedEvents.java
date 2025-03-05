/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpinnerNumberMobelWithLimitedEvents
extends SpinnerNumberModel {
    private boolean super = true;

    public SpinnerNumberMobelWithLimitedEvents(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    public void enableChanged(boolean bl) {
        this.super = bl;
    }

    @Override
    protected void fireStateChanged() {
        if (this.super) {
            super.fireStateChanged();
        }
    }
}

