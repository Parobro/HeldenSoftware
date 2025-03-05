/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo.a;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.E.F;
import helden.framework.OoOO.interface;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.oOoO.A.Object;
import helden.framework.oooo.a.b_0;
import helden.framework.zauber.ZauberMitWertUndHZ;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from helden.framework.oOoO.A.oOOO
 */
public class oooo_0 {
    private ArrayList<b_0> \u00d200000 = new ArrayList();
    private ArrayList<b_0> String;
    private int \u00d300000;
    private Object o00000;

    public oooo_0() {
        this.\u00d300000 = 1;
    }

    public oooo_0(int n, Object object) {
        this.\u00d300000 = n;
        this.o00000 = object;
    }

    public void o00000(b_0 b_02) {
        this.\u00d200000.add(b_02);
    }

    public boolean \u00d200000(List<b_0> list) {
        return true;
    }

    public String o00000() {
        return null;
    }

    public String \u00d500000() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.String());
        stringBuilder.append(": ");
        stringBuilder.append(this.\u00d300000);
        stringBuilder.append(" aus [");
        for (b_0 b_02 : this.String) {
            stringBuilder.append("{");
            stringBuilder.append(helden.framework.held.object.oooo_0.o00000(b_02));
            stringBuilder.append("}");
        }
        stringBuilder.append("] ");
        stringBuilder.append(this.o00000);
        return stringBuilder.toString();
    }

    public void o00000(floatsuper floatsuper2) {
        this.String = new ArrayList();
        for (b_0 b_02 : this.\u00d200000) {
            if (!floatsuper2.Object(b_02.\u00d200000())) continue;
            this.String.add(b_02);
        }
    }

    public String o00000(List<b_0> list) {
        return "";
    }

    public int \u00d600000() {
        return this.\u00d300000;
    }

    public Object String() {
        return this.o00000;
    }

    public ArrayList<b_0> \u00d300000() {
        return this.String;
    }

    public ArrayList<b_0> \u00d200000() {
        return this.\u00d200000;
    }

    public void \u00d200000(b_0 b_02) {
        this.\u00d200000.remove(b_02);
    }

    public void o00000(int n, K k2, boolean bl) {
        for (java.lang.Object object : this.String.get(n).Object()) {
            java.lang.Object object2;
            if (object instanceof public) {
                this.o00000.gewaehlterVorteil((public)object);
                continue;
            }
            if (object instanceof P) {
                this.o00000.gewaehlteSonderfertigkeit((P)object);
                continue;
            }
            if (object instanceof interface) {
                object2 = (interface)object;
                if (((interface)object2).\u00d300000() != null) {
                    this.o00000.gewaehltesTalent(((interface)object2).new(), ((interface)object2).\u00d300000(), k2, bl);
                }
                if (!((interface)object2).o00000()) continue;
                this.o00000.gewaehltesLeittalent(((interface)object2).new());
                continue;
            }
            if (object instanceof ZauberMitWertUndHZ) {
                object2 = (ZauberMitWertUndHZ)object;
                this.o00000.gewaehltesTalent(((ZauberMitWertUndHZ)object2).getZauber(), ((ZauberMitWertUndHZ)object2).getWert(), k2, bl);
                if (!((ZauberMitWertUndHZ)object2).isHauszauber()) continue;
                this.o00000.gewaehlterHauszauber(((ZauberMitWertUndHZ)object2).getZauber());
                continue;
            }
            if (object instanceof for) {
                this.o00000.waehleVerbilligteSonderfertigkeit((for)object);
                continue;
            }
            if (object instanceof F) {
                k2.\u00d8o0000().new((F)object);
                continue;
            }
            private.\u00d200000("Unbekannter Typ: " + object.toString() + " " + object.getClass().toString(), "sven");
        }
    }

    public void o00000(int n) {
        this.\u00d300000 = n;
    }

    public void o00000(Object object) {
        this.o00000 = object;
    }
}

