/*
 * Decompiled with CFR 0.152.
 */
package helden.cloudinterface;

import helden.cloudinterface.HeldenContainer;
import helden.framework.OOoO.R;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.C;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.OOOo;
import helden.framework.held.P;
import helden.framework.held.object.oooo_1;
import helden.framework.held.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HeldenContainerImpl
implements HeldenContainer {
    private K o00000;

    public HeldenContainerImpl(K k2) {
        this.setHeld(k2);
        k2.ifnew().o00000(false);
    }

    public K getHeld() {
        return this.o00000;
    }

    @Override
    public String getHeldenKey() {
        return this.o00000.\u00f4o0000();
    }

    @Override
    public String getKultur() {
        return this.o00000.\u00f800000().toString();
    }

    @Override
    public String getName() {
        return this.o00000.\u00f5o0000();
    }

    @Override
    public String getProfession() {
        return this.o00000.\u00d800000().toString();
    }

    @Override
    public String getRasse() {
        return this.o00000.o\u00d20000().toString();
    }

    @Override
    public List<R> getSteigerungsKostenTalent() {
        ArrayList<R> arrayList = new ArrayList<R>();
        arrayList.add(new R("Talent", "Kosten", "Lernmethode", "Talentwert", "Art"));
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        arrayList2.addAll(this.o00000.\u00f8O0000().\u00d200000());
        arrayList2.addAll(this.o00000.\u00d5o0000().\u00d200000());
        for (oo0o_0 oo0o_02 : arrayList2) {
            String string = "Talent";
            if (oo0o_02 instanceof KonkreterZauber) {
                string = "Zauber";
            }
            try {
                arrayList.add(new R(oo0o_02.toString(), (int)this.o00000.o00000(oo0o_02, false), this.o00000.\u00d400000(oo0o_02).toString(), this.o00000.\u00d300000(oo0o_02), string));
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }

    @Override
    public long getTime() {
        K k2 = this.o00000;
        long l2 = k2.ifnew().new();
        if (l2 == 0L && k2.\u00d8O0000().size() > 0) {
            Date date = k2.\u00d8O0000().get(k2.\u00d8O0000().size() - 1).\u00d800000();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            l2 = calendar.getTimeInMillis();
        }
        return l2;
    }

    @Override
    public String getXML() throws Exception {
        return OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().o00000(this.o00000);
    }

    public void setHeld(K k2) {
        this.o00000 = k2;
    }

    @Override
    public String steigereTalent(String string, int n) {
        oooo_1 oooo_12 = new oooo_1(this.o00000);
        voidsuper voidsuper2 = N.floatsuper().\u00d200000(string);
        try {
            if (this.o00000.\u00d300000((oo0o_0)voidsuper2) != n) {
                return "FAIL Bitte Held aktualisieren!";
            }
            oooo_12.\u00d200000(voidsuper2);
        }
        catch (D d2) {
            return "FAIL Talent ist gar nicht aktiviert!";
        }
        catch (oooo_0 oooo_02) {
            return "FAIL Nicht gen\u00fcgend AP!";
        }
        catch (P p2) {
            return "FAIL Die beteiligten Eigenschaften sind nicht hoch genug!";
        }
        catch (C c) {
            return "FAIL Maximalwert erreicht!";
        }
        catch (OOOo oOOo) {
            return "FAIL Die Voraussetzungen f\u00fcr das Talent sind nicht erf\u00fcllt!";
        }
        return "OK";
    }
}

