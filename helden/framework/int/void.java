/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.D.H;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo.o0oo_0;
import helden.framework.d.oooo_0;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;

public class void
extends OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO {
    private OOOo \u00d3\u00f6\u00f4O00;

    public void(Settings settings) {
        this.setSetting(settings);
        this.\u00d3\u00f6\u00f4O00 = new OOOo();
    }

    public void o00000(P p2, boolean bl) {
        this.\u00d3\u00f6\u00f4O00.o00000(p2);
        for (H h2 : p2.O\u00d20000()) {
            P p3 = oooo_0.o00000(h2);
            p3.new(0);
            this.\u00d3\u00f6\u00f4O00.o00000(p3);
        }
        if (bl) {
            this.resetModifikationen();
        }
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    public boolean \u00d6O0000(String string) {
        return this.\u00d3\u00f6\u00f4O00.\u00d200000(string);
    }

    public OOOo classfloat() {
        return this.\u00d3\u00f6\u00f4O00;
    }

    public void o00000(P p2) {
        for (H h2 : p2.O\u00d20000()) {
            this.\u00d3\u00f6\u00f4O00.\u00d200000(oooo_0.o00000(h2));
        }
        this.resetTalentwerte();
        this.resetModifikationen();
    }

    public void \u00d5O0000(String string) {
        try {
            this.o00000(oooo_0.o00000(string));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void \u00d200000(P p2) {
        this.\u00d3\u00f6\u00f4O00.\u00d200000(p2);
        this.o00000(p2);
    }

    public void \u00d4O0000(String string) {
        this.\u00d3\u00f6\u00f4O00.\u00d300000(string);
        this.\u00d5O0000(string);
    }

    @Override
    public void setzeModifikationen() {
        if (this.\u00d3\u00f6\u00f4O00 == null) {
            return;
        }
        for (P p2 : this.\u00d3\u00f6\u00f4O00) {
            helden.framework.D.void void_;
            if (p2 instanceof helden.framework.D.void) {
                void_ = (helden.framework.D.void)p2;
                for (Q q : void_.o\u00d40000()) {
                    this.setTalentwert(q.\u00d5O0000(), 3);
                }
            } else if (p2.\u00d5O0000() != null) {
                this.setTalentwert(p2.\u00d5O0000(), 3);
            }
            if (p2 instanceof OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO && this.getSetting() != null && this.getSetting().getIncludedSettings().contains((Object)Setting.returnsuper)) {
                this.putModifikator(b_0.\u00f5\u00f5\u00d2000, 1);
            }
            if (p2.toString().equals(while.returnpublicnew.toString())) {
                this.setTalentwert(voidsuper.\u00f8\u00f5\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00f5\u00f4\u00f6000.toString())) {
                this.setTalentwert(voidsuper.\u00f4\u00d4\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00d3\u00d5\u00d5000.toString())) {
                this.setTalentwert(voidsuper.\u00d4\u00f5\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00d8\u00d8o000.toString())) {
                this.setTalentwert(voidsuper.\u00d4o\u00d8000, 3);
            }
            if (p2.toString().equals(while.\u00d3\u00d6\u00f4000.toString())) {
                this.setTalentwert(voidsuper.nulldoObject, 3);
            }
            if (p2.toString().equals(while.\u00d3\u00d8\u00d3000.toString())) {
                this.setTalentwert(voidsuper.\u00d4\u00d4\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00d6O\u00d2000.toString())) {
                this.setTalentwert(voidsuper.privateinterfaceObject, 3);
            }
            if (p2.toString().equals(while.ifvoid.toString())) {
                this.setTalentwert(voidsuper.returnnewObject, 3);
            }
            if (p2.toString().equals(while.\u00d20\u00d3000.toString())) {
                this.setTalentwert(voidsuper.\u00f4O\u00d8000, 3);
            }
            if (p2.toString().equals(while.\u00d8\u00f5\u00d5000.toString())) {
                this.setTalentwert(voidsuper.\u00d4\u00d2\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00d3O\u00d4000.toString())) {
                this.setTalentwert(voidsuper.ifreturnObject, 3);
            }
            if (p2.toString().equals(while.forStringString.toString())) {
                this.setTalentwert(voidsuper.\u00f8O\u00d6000, 3);
            }
            if (p2.toString().equals(while.oo\u00f5000.toString())) {
                this.setTalentwert(voidsuper.\u00f8\u00f8\u00d5000, 3);
            }
            if (p2.toString().equals(while.returnpublicString.toString())) {
                this.setTalentwert(voidsuper.\u00f8o\u00d8000, 3);
            }
            if (p2.toString().equals(while.returnObjectsuper.toString())) {
                this.setTalentwert(voidsuper.o0\u00d8000, 3);
            }
            if (p2.toString().equals(while.\u00f5\u00d6\u00f6000.toString())) {
                this.setTalentwert(voidsuper.nullfloatObject, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00d8\u00f6000.toString())) {
                this.setTalentwert(voidsuper.\u00f8\u00d2\u00d8000, 3);
            }
            if (p2.toString().equals(while.\u00f8\u00d3O000.toString())) {
                this.setTalentwert(voidsuper.\u00f5\u00d4\u00d5000, 3);
            }
            if (p2.toString().equals(while.privateStringObject.toString())) {
                this.setTalentwert(voidsuper.\u00d4\u00f6\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00f8\u00d3\u00d5000.toString())) {
                this.setTalentwert(voidsuper.\u00d8\u00f6\u00d5000, 3);
            }
            if (p2.toString().equals(while.oO\u00d3000.toString())) {
                this.setTalentwert(voidsuper.returnthisString, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00d2\u00f4000.toString())) {
                this.setTalentwert(voidsuper.\u00d3\u00f6\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00d6\u00d8\u00d8000.toString())) {
                this.putModifikator(b_0.\u00d4\u00f5\u00d2000, 12);
            }
            if (p2.toString().equals(while.\u00d3\u00d6O000.toString())) {
                this.putModifikator(b_0.\u00d4\u00f5\u00d2000, 12);
            }
            if (p2.toString().equals(while.o\u00d4\u00d4000.toString())) {
                this.putModifikator(b_0.\u00d4\u00f5\u00d2000, 24);
            }
            if (p2.toString().equals(while.o\u00d2\u00f4000.toString())) {
                this.putModifikator(b_0.\u00d4\u00f5\u00d2000, 24);
            }
            if (p2.toString().equals(while.\u00d8\u00d6\u00d5000.toString()) && p2 instanceof o0oo_0) {
                void_ = (o0oo_0)p2;
                int n = 0;
                switch ((Integer)((R)void_.\u00f4\u00d30000()).o00000(1)) {
                    case 1: {
                        n = 6;
                        break;
                    }
                    case 2: {
                        n = 12;
                        break;
                    }
                    case 3: {
                        n = 18;
                        break;
                    }
                    case 4: {
                        n = 24;
                        break;
                    }
                    case 5: {
                        n = 30;
                        break;
                    }
                    case 6: {
                        n = 36;
                        break;
                    }
                    default: {
                        n = 0;
                    }
                }
                this.putModifikator(b_0.\u00d4\u00f5\u00d2000, n);
            }
            if (p2.toString().equals(while.\u00d2\u00d3\u00d4000.toString()) || p2.toString().equals(while.\u00d2\u00d4\u00d2000.toString()) || p2.toString().equals(while.\u00f6\u00d30000.toString()) || p2.toString().equals(while.\u00f6\u00d8\u00d2000.toString()) || p2.toString().equals(while.thiswhilesuper.toString()) || p2.toString().equals(while.\u00f6\u00d3\u00d6000.toString()) || p2.toString().equals(while.\u00f8\u00f5\u00d2000.toString()) || p2.toString().equals(while.\u00d6\u00d2\u00f5000.toString()) || p2.toString().equals(while.\u00d5\u00d6O000.toString()) || p2.toString().equals(while.\u00d3\u00d3\u00d5000.toString()) || p2.toString().equals(while.\u00d80\u00d3000.toString())) {
                this.setTalentwert(voidsuper.o\u00f8\u00d6000, 3);
                this.setTalentwert(voidsuper.newforObject, 3);
                this.setTalentwert(voidsuper.O\u00d6\u00d6000, 3);
                this.setTalentwert(voidsuper.\u00d3\u00d4\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00f5\u00f6\u00d4000.toString())) {
                this.setTalentwert(voidsuper.o\u00d3\u00d8000, 3);
            }
            if (p2.toString().equals(while.newintsuper.toString())) {
                this.setTalentwert(voidsuper.\u00d5\u00f8\u00d5000, 3);
            }
            if (p2.toString().equals(while.privateforclass.toString())) {
                this.setTalentwert(voidsuper.\u00f4\u00d5\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00d5\u00d3\u00f4000.toString())) {
                this.setTalentwert(voidsuper.forinterfaceObject, 3);
            }
            if (p2.toString().equals(while.\u00f6O\u00d5000.toString())) {
                this.setTalentwert(voidsuper.\u00d5\u00d8\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00f5o\u00d8000.toString())) {
                this.setTalentwert(voidsuper.nullpublicObject, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00d3\u00f6000.toString())) {
                this.setTalentwert(voidsuper.\u00f4\u00f4\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00d8\u00d5\u00d2000.toString())) {
                this.setTalentwert(voidsuper.\u00f5\u00d8\u00d6000, 3);
            }
            if (p2.toString().equals(while.returnclasssuper.toString())) {
                this.setTalentwert(voidsuper.\u00d8\u00f8\u00d6000, 3);
            }
            if (p2.toString().equals(while.o00000.toString())) {
                this.setTalentwert(voidsuper.\u00d8\u00d4\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00d8\u00f5000.toString())) {
                this.setTalentwert(voidsuper.\u00f5\u00f6\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00d6\u00d8000.toString())) {
                this.setTalentwert(voidsuper.O\u00d2\u00d6000, 3);
            }
            if (p2.toString().equals(while.o\u00d6\u00d3000.toString())) {
                this.setTalentwert(voidsuper.\u00d5\u00f4\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00f5\u00d8\u00d2000.toString())) {
                this.setTalentwert(voidsuper.nullclassObject, 3);
            }
            if (p2.toString().equals(while.\u00d2\u00d2\u00d3000.toString())) {
                this.setTalentwert(voidsuper.\u00d8\u00f6\u00d6000, 3);
            }
            if (p2.toString().equals(while.forfornew.toString())) {
                this.setTalentwert(voidsuper.O\u00d2\u00d8000, 3);
            }
            if (p2.toString().equals(while.o\u00d8O000.toString())) {
                this.setTalentwert(voidsuper.\u00f4\u00f8\u00d6000, 3);
            }
            if (p2.toString().equals(while.Stringthissuper.toString())) {
                this.setTalentwert(voidsuper.\u00d3\u00f5\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00d6\u00d2o000.toString())) {
                this.setTalentwert(voidsuper.o\u00d6\u00d6000, 3);
            }
            if (p2.toString().equals(while.\u00d80\u00f5000.toString())) {
                this.setTalentwert(voidsuper.\u00f8\u00f5\u00d6000, 3);
            }
            if (p2.toString().equals(while.whileintsuper.toString())) {
                this.setTalentwert(voidsuper.newthisString, 3);
            }
            if (p2.toString().equals(while.o\u00d2\u00d3000.toString())) {
                this.setTalentwert(voidsuper.O0\u00d8000, 3);
            }
            if (p2.toString().equals(while.\u00d5\u00f4O000.toString())) {
                this.setTalentwert(voidsuper.\u00f8\u00d4\u00d5000, 3);
            }
            if (p2.toString().equals(while.\u00d2\u00d5\u00d3000.toString())) {
                this.setTalentwert(voidsuper.nullintObject, 3);
            }
            if (p2.toString().equals(while.\u00f6\u00f8\u00d5000.toString())) {
                this.setTalentwert(voidsuper.\u00d80\u00d6000, 3);
            }
            if (p2.toString().equals(while.o\u00f8\u00d4000.toString())) {
                this.setTalentwert(voidsuper.o\u00d8\u00d6000, 3);
            }
            if (!p2.toString().equals(while.newObjectclass.toString())) continue;
            this.setTalentwert(voidsuper.ifnewObject, 3);
        }
    }
}

