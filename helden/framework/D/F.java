/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.D.void;
import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.HeldenMath;
import helden.framework.OOoO.I;
import helden.framework.OOoO.R;
import helden.framework.OOoO.while;
import helden.framework.OoOO.private;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_0;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class F
extends void<R> {
    private ArrayList[] \u00d8\u00d4\u00f8000;
    private int \u00d6\u00d4\u00f8000;
    private oooo_0 whileinterfaceclass;
    private String[] \u00f5\u00d4\u00f8000;
    private ArrayList<while<R, Float>> \u00f6\u00d4\u00f8000;

    protected static ArrayList \u00d500000(int n) {
        return F.o00000(1, n);
    }

    protected static ArrayList o00000(int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = n; i2 <= n2; ++i2) {
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    protected F(String string, int n, ArrayList ... arrayListArray) {
        this(string, n, arrayListArray.length);
        for (int i2 = 0; i2 < this.\u00d6\u00d4\u00f8000; ++i2) {
            this.\u00d8\u00d4\u00f8000[i2] = arrayListArray[i2];
        }
        this.\u00f4\u00d40000();
    }

    protected F(String string, int n, int n2) {
        super(string, 0, new HashSet(), n);
        this.\u00d6\u00d4\u00f8000 = n2;
        this.\u00d8\u00d4\u00f8000 = new ArrayList[this.\u00d6\u00d4\u00f8000];
        this.\u00f6\u00d4\u00f8000 = new ArrayList();
    }

    public void o00000(R r, float f2) {
        this.\u00f6\u00d4\u00f8000.add(new while<R, Float>(r, Float.valueOf(f2)));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        F f2 = null;
        try {
            f2 = (F)this.getClass().newInstance();
        }
        catch (Exception exception) {
            helden.framework.held.object.oooo_0.o00000(exception);
        }
        this.o00000(this, f2);
        f2.\u00f6\u00d4\u00f8000.addAll(this.\u00f6\u00d4\u00f8000);
        return f2;
    }

    public void new(Settings settings) {
        R r = new R(this.\u00d6\u00d4\u00f8000);
        for (int i2 = 0; i2 < this.\u00d6\u00d4\u00f8000; ++i2) {
            if (this.\u00d8\u00d4\u00f8000[i2].size() == 0) {
                r.\u00d200000(i2, "");
                continue;
            }
            boolean bl = false;
            for (Object e : this.\u00d8\u00d4\u00f8000[i2]) {
                if (settings != null && !settings.contains(this) && !settings.containsAuswahl(this, e)) continue;
                r.\u00d200000(i2, e);
                bl = true;
                break;
            }
            if (bl) continue;
            helden.framework.held.object.oooo_0.\u00f500000("Keine M\u00f6gliche Auswahl gefunden! SF: " + this + " Position: " + (i2 + 1) + " Spaltenname: " + this.return(i2) + " " + this.\u00d8\u00d4\u00f8000[i2]);
        }
        r.o00000(this.\u00f5\u00d40000());
        this.\u00f8\u00d30000().clear();
        this.\u00f8\u00d30000().add(r);
    }

    public int \u00f8\u00d40000() {
        return this.\u00d6\u00d4\u00f8000;
    }

    public ArrayList o00000(int n, Settings settings) {
        ArrayList arrayList = new ArrayList();
        for (Object e : this.\u00d8\u00d4\u00f8000[n]) {
            if (settings != null && !settings.contains(e) && !settings.checkString("S" + this.\u00f500000() + "#*").equals((Object)Settings.RESULT.Object) && !settings.checkString("S" + this.\u00f500000() + "#" + e.toString()).equals((Object)Settings.RESULT.Object)) continue;
            arrayList.add(e);
        }
        return arrayList;
    }

    public int \u00d300000(R r) {
        float f2 = this.o00000(r);
        for (while<R, Float> while_ : this.\u00f6\u00d4\u00f8000) {
            if (while_.getWert1() != null && !while_.getWert1().equals(r)) continue;
            f2 *= while_.getWert2().floatValue();
        }
        return HeldenMath.runde(f2);
    }

    public ArrayList[] privateObject() {
        return this.\u00d8\u00d4\u00f8000;
    }

    public oooo_0 \u00f5\u00d40000() {
        return this.whileinterfaceclass;
    }

    public String return(int n) {
        if (this.\u00f5\u00d4\u00f8000 == null || this.\u00f5\u00d4\u00f8000.length < n) {
            return "";
        }
        return this.\u00f5\u00d4\u00f8000[n];
    }

    public R new(ArrayList arrayList) {
        R r = null;
        try {
            r = (R)((R)this.\u00f8\u00d30000().iterator().next()).clone();
        }
        catch (Exception exception) {
            helden.framework.held.object.oooo_0.o00000(exception);
            return null;
        }
        for (int i2 = 0; i2 < this.\u00f8\u00d40000(); ++i2) {
            if (this.\u00d8\u00d4\u00f8000[i2].size() == 0) {
                r.\u00d200000(i2, arrayList.get(i2));
                continue;
            }
            Iterator iterator = null;
            Object e = arrayList.get(i2);
            if (e instanceof I) {
                String string = ((I)e).\u00d200000();
                for (Object e2 : this.\u00d8\u00d4\u00f8000[i2]) {
                    private private_;
                    if (!(e2 instanceof private) || !(private_ = (private)e2).getID().equals(string)) continue;
                    iterator = e2;
                    break;
                }
            } else {
                for (Iterator iterator2 : this.\u00d8\u00d4\u00f8000[i2]) {
                    if (iterator2 instanceof EigeneErweiterungenMoeglich && !((EigeneErweiterungenMoeglich)((Object)iterator2)).istIntern() || !iterator2.toString().equals(arrayList.get(i2))) continue;
                    iterator = iterator2;
                    break;
                }
            }
            if (iterator == null) {
                helden.framework.held.object.oooo_0.\u00f500000(this.\u00f500000() + ": Auswahl " + i2 + "[" + arrayList.get(i2) + "] nicht gefunden!");
            }
            r.\u00d200000(i2, iterator);
        }
        return r;
    }

    public abstract int o00000(R var1);

    public oo0o_0 \u00d400000(R r) {
        return null;
    }

    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (bl && !floatsuper2.Object(this.\u00f500000(r))) {
            return "<html><body>Der Held erf\u00fcllt nicht alle Voraussetzungen f\u00fcr diese Sonderfertigkeit:<br>" + this.\u00f500000(r).toStringFormatiertHTML();
        }
        return null;
    }

    @Override
    public void o00000() {
        super.o00000();
        this.\u00f6\u00d4\u00f8000.clear();
    }

    public void o00000(oooo_0 oooo_02) {
        this.whileinterfaceclass = oooo_02;
        this.\u00f8\u00d30000().clear();
        this.\u00f4\u00d40000();
    }

    public void new(R r) {
        if (r.o00000() != this.\u00d6\u00d4\u00f8000) {
            throw new RuntimeException("Falsche Anzahl an Auswahlen " + this.toString());
        }
        for (int i2 = 0; i2 < this.\u00d6\u00d4\u00f8000; ++i2) {
            Object object = r.o00000(i2);
            if (this.\u00d8\u00d4\u00f8000[i2].size() == 0) {
                if (object instanceof String) continue;
                throw new RuntimeException(i2 + ". Element muss ein String sein!");
            }
            if (this.\u00d8\u00d4\u00f8000[i2].contains(object)) continue;
            throw new RuntimeException("Auswahl an Pos " + i2 + " ist falsch! " + this.\u00d8\u00d4\u00f8000[i2].toString());
        }
        r.o00000(this.\u00f5\u00d40000());
        this.\u00d400000(r);
    }

    @Override
    public void \u00d500000(String string) {
        if (this.\u00d8\u00d4\u00f8000.length > 1) {
            throw new RuntimeException("TupelMASF: waehle f\u00fcr ein NTUPEL mit n>1");
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(string);
        R r = this.new(arrayList);
        r.o00000(this.\u00f5\u00d40000());
        this.\u00d400000(r);
    }

    protected void \u00f4\u00d40000() {
        R r = new R(this.\u00d6\u00d4\u00f8000);
        for (int i2 = 0; i2 < this.\u00d6\u00d4\u00f8000; ++i2) {
            if (this.\u00d8\u00d4\u00f8000[i2].size() == 0) {
                r.\u00d200000(i2, "");
                continue;
            }
            r.\u00d200000(i2, this.\u00d8\u00d4\u00f8000[i2].get(0));
        }
        r.o00000(this.\u00f5\u00d40000());
        this.\u00f8\u00d30000().add(r);
    }

    protected void o00000(String ... stringArray) {
        this.\u00f5\u00d4\u00f8000 = stringArray;
    }
}

