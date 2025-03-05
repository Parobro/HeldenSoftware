/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod;

import helden.framework.OOoO.R;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.GModBezeichner;
import helden.framework.held.object.oooo_0;
import helden.framework.settings.Settings;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GMod {
    private GModAuswahlen[] \u00d400000;
    private int \u00d200000;
    private R Object;
    private GModBezeichner o00000;

    public GMod(GModBezeichner gModBezeichner, GModAuswahlen ... gModAuswahlenArray) {
        this.o00000 = gModBezeichner;
        this.\u00d200000 = gModAuswahlenArray.length;
        this.\u00d400000 = gModAuswahlenArray;
        this.generiereEineMoeglicheAuswahl(null);
    }

    public Object clone() throws CloneNotSupportedException {
        GMod gMod = null;
        try {
            Constructor<?> constructor = this.getClass().getConstructor(new Class[0]);
            gMod = (GMod)constructor.newInstance(new Object[0]);
            if (this.getAuswahl() != null) {
                gMod.setAuswahl((R)this.getAuswahl().clone());
            }
        }
        catch (InstantiationException instantiationException) {
            oooo_0.o00000(instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            oooo_0.o00000(illegalAccessException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            oooo_0.o00000(illegalArgumentException);
        }
        catch (InvocationTargetException invocationTargetException) {
            oooo_0.o00000(invocationTargetException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            oooo_0.o00000(noSuchMethodException);
        }
        catch (SecurityException securityException) {
            oooo_0.o00000(securityException);
        }
        return gMod;
    }

    public void generiereEineMoeglicheAuswahl(Settings settings) {
        R r = new R(this.\u00d200000);
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            if (this.\u00d400000[i2].getListe(settings).size() == 0) {
                r.\u00d200000(i2, "");
                continue;
            }
            r.\u00d200000(i2, this.\u00d400000[i2].getListe(settings).get(0));
        }
        this.setAuswahl(r);
    }

    public int getAnzahlAuswahlen() {
        return this.\u00d200000;
    }

    public R getAuswahl() {
        return this.Object;
    }

    public Object getAuswahlByName(String string) {
        if (this.Object == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.\u00d400000.length; ++i2) {
            if (!this.\u00d400000[i2].getBezeichner().equals(string)) continue;
            return this.getAuswahl().o00000(i2);
        }
        return null;
    }

    public R getAuswahlFormatiert() {
        R r = new R(this.\u00d200000);
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            r.\u00d200000(i2, this.\u00d400000[i2].format(this.Object.o00000(i2)));
        }
        return r;
    }

    public GModAuswahlen[] getAuswahlMoeglichkeiten() {
        return this.\u00d400000;
    }

    public Object getFormatiertAuswahlByName(String string) {
        if (this.Object == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.\u00d400000.length; ++i2) {
            if (!this.\u00d400000[i2].getBezeichner().equals(string)) continue;
            return this.getAuswahlFormatiert().o00000(i2);
        }
        return null;
    }

    public GModBezeichner getName() {
        return this.o00000;
    }

    public boolean isGueltig() {
        return true;
    }

    public void setAnzahlAuswahlen(int n) {
        this.\u00d200000 = n;
    }

    public void setAuswahl(R r) {
        this.Object = r;
    }

    public void setAuswahlPosition(int n, String string) {
        R r;
        if (this.getAuswahl() == null) {
            r = new R(this.\u00d200000);
            this.setAuswahl(r);
        }
        r = this.getAuswahl();
        for (Object t : this.\u00d400000[n].getListe(null)) {
            if (!t.toString().equals(string)) continue;
            r.\u00d200000(n, t);
            return;
        }
        oooo_0.\u00f500000("Wert " + string + " an Position " + n + " nicht gefunden!");
    }

    public String toString() {
        if (this.Object == null) {
            return this.getName().toString();
        }
        return this.getName().toString() + ": " + this.getAuswahlFormatiert().toString();
    }
}

