/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.C.D;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.plugin.datenplugin.DatenPluginVorteil;
import java.util.ArrayList;
import java.util.Iterator;

public class DatenPluginVorteilImpl
implements DatenPluginVorteil {
    private public o00000;

    public DatenPluginVorteilImpl(public public_) {
        this.o00000 = public_;
    }

    @Override
    public String[] getAusgewaehltes() {
        if (this.o00000 instanceof M) {
            M m = (M)this.o00000;
            String[] stringArray = new String[m.\u00d2\u00d20000()];
            Iterator iterator = m.intsuper().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                stringArray[n] = iterator.next().toString();
                ++n;
            }
            return stringArray;
        }
        return new String[0];
    }

    @Override
    public String getName() {
        return this.o00000.toString();
    }

    @Override
    public ArrayList<String> getSettings() {
        return null;
    }

    @Override
    public int getWert() {
        if (this.o00000 instanceof J) {
            return ((J)this.o00000).ObjectString();
        }
        return 0;
    }

    @Override
    public boolean isAuswahlVorteil() {
        return this.o00000 instanceof D;
    }

    @Override
    public boolean isMehfachAuswahlVorteil() {
        return this.o00000 instanceof M;
    }

    @Override
    public boolean isNachteil() {
        return this.o00000.\u00d500000();
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    @Override
    public boolean isWertVorteil() {
        return this.o00000 instanceof J;
    }

    @Override
    public String toString() {
        return this.o00000.toString();
    }
}

