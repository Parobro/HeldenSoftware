/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.held.object.oooo_0;
import helden.plugin.HeldenPluginFactory;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class while {
    private boolean \u00d400000 = false;
    private long \u00d300000 = 0L;
    private boolean \u00d500000 = true;
    private PropertyChangeSupport o00000;
    private List<while> new = new ArrayList<while>();

    public while(PropertyChangeSupport propertyChangeSupport) {
        this.o00000 = propertyChangeSupport;
    }

    public while \u00d500000() {
        while while_ = new while(this.o00000);
        while_.o00000(this.\u00d500000);
        this.new.add(while_);
        return while_;
    }

    public long new() {
        long l2 = this.\u00d300000;
        for (while while_ : this.new) {
            l2 = Math.max(l2, while_.new());
        }
        return l2;
    }

    public boolean o00000() {
        for (while while_ : this.new) {
            if (!while_.o00000()) continue;
            return true;
        }
        return this.\u00d400000;
    }

    public void \u00d300000() {
        if (!this.\u00d500000) {
            this.new(true);
            this.\u00d300000 = System.currentTimeMillis();
            this.o00000.firePropertyChange("Changed", null, null);
            HeldenPluginFactory.sendMsg("\u00c4nderung");
            oooo_0.\u00d300000("Changed -- " + oooo_0.o00000(1) + "\n" + oooo_0.o00000(2));
        }
    }

    public void \u00d400000() {
        this.new(false);
        this.o00000.firePropertyChange("Changed", null, null);
    }

    public void o00000(long l2) {
        this.\u00d300000 = l2;
    }

    public void o00000(boolean bl) {
        for (while while_ : this.new) {
            while_.\u00d500000 = bl;
        }
        this.\u00d500000 = bl;
    }

    private void new(boolean bl) {
        this.\u00d400000 = bl;
    }
}

