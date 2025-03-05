/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.HeldenMath;
import helden.framework.OOoO.String;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.HEW2Kosten;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class KostenVerteiler {
    private Comparator<KostenEntry> o00000 = new Comparator<KostenEntry>(){

        public int o00000(KostenEntry kostenEntry, KostenEntry kostenEntry2) {
            int n = kostenEntry.\u00d600000;
            if (kostenEntry.\u00d600000 == 0) {
                --n;
            }
            int n2 = kostenEntry2.\u00d600000;
            if (kostenEntry2.\u00d600000 == 0) {
                --n2;
            }
            if (n == n2) {
                return 0;
            }
            if (n < n2) {
                return -1;
            }
            return 1;
        }
    };
    private HEW2 \u00d200000;

    public KostenVerteiler(HEW2 hEW2) {
        this.\u00d200000 = hEW2;
    }

    public void beruecksichtigeSonstigePunkteQuellen() {
        ArrayList<KostenEntry> arrayList = new ArrayList<KostenEntry>();
        for (KostenEntry object : this.getKosten().getList().values()) {
            if (!(object.getKostengegenstand() instanceof oo0o_0) || object.\u00d500000 != KostenArt.\u00f600000 && object.\u00d500000 != KostenArt.\u00f800000 && object.\u00d500000 != KostenArt.\u00f400000 && object.\u00d500000 != KostenArt.\u00d300000 && object.\u00d500000 != KostenArt.class) continue;
            arrayList.add(object);
            object.\u00d500000 = KostenArt.\u00f600000;
        }
        Collections.sort(arrayList, this.o00000);
        if (this.\u00d200000.getHswZauber() != null && this.\u00d200000.getHswZauber().isHatVerrechnungpunkte()) {
            this.String(arrayList);
        }
        if (this.\u00d200000.getTalente() != null) {
            for (KostenArt kostenArt : this.\u00d200000.getKosten().getRKPKostenArten()) {
                if (!kostenArt.getNutzbareBereiche().contains((Object)KostenEntry.kostenBereich.\u00d600000)) continue;
                this.o00000(arrayList, kostenArt);
            }
        }
        Iterator<KostenArt> iterator = new Comparator(){

            public int compare(Object object, Object object2) {
                KostenEntry kostenEntry = (KostenEntry)object;
                KostenEntry kostenEntry2 = (KostenEntry)object2;
                int n = kostenEntry.\u00d400000;
                int n2 = kostenEntry2.\u00d400000;
                if (kostenEntry.\u00d600000 == 0) {
                    n -= 2;
                }
                if (kostenEntry2.\u00d600000 == 0) {
                    n2 -= 2;
                }
                if (n == n2) {
                    return 0;
                }
                if (n < n2) {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(arrayList, iterator);
        if (this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f400000) > 0) {
            this.\u00d300000(arrayList);
        }
        if (this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000) > 0) {
            this.\u00d200000(arrayList);
        }
        if (this.getKosten().getVerfuegbarePunkte(KostenArt.\u00d300000) > 0) {
            this.o00000(arrayList);
        }
    }

    public HEW2Kosten getKosten() {
        return this.\u00d200000.getKosten();
    }

    private void \u00d300000(ArrayList<KostenEntry> arrayList) {
        HashMap<oo0o_0, Integer> hashMap = new HashMap<oo0o_0, Integer>();
        int n = this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f400000) - this.getKosten().getKosten(KostenArt.\u00f400000);
        for (KostenEntry kostenEntry : arrayList) {
            if (!(kostenEntry.\u00d200000 instanceof voidsuper) && !(kostenEntry.\u00d200000 instanceof KonkreterZauber)) continue;
            oo0o_0 oo0o_02 = (oo0o_0)kostenEntry.\u00d200000;
            if (!kostenEntry.\u00d500000.equals(KostenArt.\u00f600000)) {
                hashMap.put(oo0o_02, 99);
                continue;
            }
            int n2 = this.\u00d200000.getTalente().getMaximaleBGBTalentPunkte(oo0o_02);
            Integer n3 = (Integer)hashMap.get(oo0o_02);
            if (n3 == null) {
                n3 = 0;
            }
            if (n3 >= n2) continue;
            if (kostenEntry.\u00d400000 <= n) {
                n -= kostenEntry.\u00d400000;
                kostenEntry.\u00d500000 = KostenArt.\u00f400000;
                Integer n4 = n3;
                Integer n5 = n3 = Integer.valueOf(n3 + 1);
            } else {
                n3 = 99;
            }
            hashMap.put(oo0o_02, n3);
        }
    }

    private void \u00d200000(ArrayList<KostenEntry> arrayList) {
        int n = this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000) - this.getKosten().getKosten(KostenArt.\u00f800000);
        int n2 = HeldenMath.haelfte(this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000)) - this.\u00d200000.magischeAPausGebildet();
        HashMap<Integer, Moeglichkeit> hashMap = new HashMap<Integer, Moeglichkeit>();
        hashMap.put(0, new Moeglichkeit());
        int n3 = 0;
        for (KostenEntry object : arrayList) {
            boolean bl;
            if (!object.\u00d500000.equals(KostenArt.\u00f600000) || !(object.\u00d200000 instanceof oo0o_0)) continue;
            oo0o_0 oo0o_02 = (oo0o_0)object.\u00d200000;
            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = oo0o_02.getArt();
            boolean bl2 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000);
            boolean bl3 = bl = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super) || bl2;
            if (!bl) continue;
            ArrayList arrayList2 = new ArrayList(hashMap.values());
            for (Moeglichkeit moeglichkeit : arrayList2) {
                Moeglichkeit moeglichkeit2 = moeglichkeit.getClone();
                moeglichkeit2.\u00d200000.add(object);
                moeglichkeit2.\u00d400000 += object.\u00d400000;
                if (bl2) {
                    moeglichkeit2.Object += object.\u00d400000;
                }
                if (moeglichkeit2.\u00d400000 > n || moeglichkeit2.Object > n2) continue;
                hashMap.put(new Integer(moeglichkeit2.\u00d400000), moeglichkeit2);
                if (moeglichkeit2.\u00d400000 <= n3) continue;
                n3 = moeglichkeit2.\u00d400000;
            }
        }
        Moeglichkeit moeglichkeit = (Moeglichkeit)hashMap.get(n3);
        for (KostenEntry kostenEntry : moeglichkeit.\u00d200000) {
            kostenEntry.\u00d500000 = KostenArt.\u00f800000;
        }
    }

    private void o00000(ArrayList<KostenEntry> arrayList, KostenArt kostenArt) {
        Object object;
        Object object2;
        for (KostenEntry object32 : arrayList) {
            if (!object32.getArt().equals(kostenArt)) continue;
            object32.restoreKosten();
        }
        int n = this.getKosten().getVerfuegbarePunkte(kostenArt) - this.getKosten().getKosten(kostenArt);
        ArrayList<String<Object, Float, Object>> arrayList2 = new ArrayList<String<Object, Float, Object>>();
        ArrayList<Object> arrayList3 = new ArrayList<Object>();
        Iterator<voidsuper> iterator = this.\u00d200000.getHeld().\u00f8O0000().super();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (!kostenArt.darfGenutztWerden(object2, KostenEntry.kostenBereich.\u00d600000)) continue;
            int n2 = 0;
            int n3 = 0;
            object = new ArrayList();
            for (KostenEntry n5 : arrayList) {
                if (!n5.\u00d200000.equals(object2) || !kostenArt.darfGenutztWerden(object2, KostenEntry.kostenBereich.\u00d600000, n5, this.\u00d200000)) continue;
                if (n5.\u00d600000 == 0) {
                    n5.\u00d400000 = this.\u00d200000.getTalente().getVRkosten((voidsuper)object2);
                    n -= n5.\u00d400000;
                    n5.\u00d500000 = kostenArt;
                    arrayList3.add(object2);
                    continue;
                }
                n2 += n5.getKosten();
                ++n3;
                ((ArrayList)object).add(n5);
            }
            if (n3 <= 0) continue;
            float n4 = (float)n2 / ((float)n3 * (float)this.\u00d200000.getTalente().getVRkosten((voidsuper)object2));
            arrayList2.add(new String<Object, Float, Object>(object2, Float.valueOf(n4), object));
        }
        object2 = new Comparator(){

            public int compare(Object object, Object object2) {
                String string = (String)object;
                String string2 = (String)object2;
                if (string.new() == string2.new()) {
                    return 0;
                }
                if (((Float)string.new()).floatValue() < ((Float)string2.new()).floatValue()) {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(arrayList2, object2);
        for (String string : arrayList2) {
            int n4;
            object = (voidsuper)string.\u00d300000();
            int n5 = n4 = this.\u00d200000.getTalente().getVRkosten((voidsuper)object);
            if (arrayList3.contains(object) || this.\u00d200000.getHeld().\u00d4O0000().getTalente().Object((oo0o_0)object) > 0 || this.\u00d200000.getHeld().\u00d4O0000().getWahlWert0((oo0o_0)object) > 0 || ((voidsuper)object).\u00f5\u00d60000()) {
                n5 = 0;
            }
            for (KostenEntry kostenEntry : (ArrayList)string.o00000()) {
                if (n < n4) continue;
                kostenEntry.\u00d400000 = this.\u00d200000.getTalente().getVRkosten((voidsuper)string.\u00d300000()) + n5;
                n5 = 0;
                n -= kostenEntry.\u00d400000;
                kostenEntry.\u00d500000 = kostenArt;
            }
        }
    }

    private void o00000(ArrayList<KostenEntry> arrayList) {
        int n = this.getKosten().getVerfuegbarePunkte(KostenArt.\u00d300000) - this.getKosten().getKosten(KostenArt.\u00d300000);
        HashMap<Integer, Moeglichkeit> hashMap = new HashMap<Integer, Moeglichkeit>();
        hashMap.put(0, new Moeglichkeit());
        int n2 = 0;
        for (KostenEntry object : arrayList) {
            if (!object.\u00d500000.equals(KostenArt.\u00f600000) || !(object.\u00d200000 instanceof voidsuper)) continue;
            oo0o_0 oo0o_02 = (oo0o_0)object.\u00d200000;
            if (!this.\u00d200000.getTalente().isVeteranTalent(oo0o_02)) continue;
            ArrayList arrayList2 = new ArrayList(hashMap.values());
            for (Moeglichkeit moeglichkeit : arrayList2) {
                Moeglichkeit moeglichkeit2 = moeglichkeit.getClone();
                moeglichkeit2.\u00d200000.add(object);
                moeglichkeit2.\u00d400000 += object.\u00d400000;
                if (moeglichkeit2.\u00d400000 > n) continue;
                hashMap.put(new Integer(moeglichkeit2.\u00d400000), moeglichkeit2);
                if (moeglichkeit2.\u00d400000 <= n2) continue;
                n2 = moeglichkeit2.\u00d400000;
            }
        }
        Moeglichkeit moeglichkeit = (Moeglichkeit)hashMap.get(n2);
        for (KostenEntry kostenEntry : moeglichkeit.\u00d200000) {
            kostenEntry.\u00d500000 = KostenArt.\u00d300000;
        }
    }

    private void String(ArrayList<KostenEntry> arrayList) {
        Object object;
        for (KostenEntry object22 : arrayList) {
            object22.restoreKosten();
        }
        int n = this.getKosten().getVerfuegbarePunkte(KostenArt.class) - this.getKosten().getKosten(KostenArt.class);
        ArrayList arrayList2 = new ArrayList();
        Iterator<KonkreterZauber> iterator = this.\u00d200000.getHeld().\u00d5o0000().super();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!this.\u00d200000.getHswZauber().getVrAktivierteZauber().contains(object)) continue;
            int iterator2 = 0;
            int n2 = 0;
            ArrayList<KostenEntry> n4 = new ArrayList<KostenEntry>();
            for (KostenEntry kostenEntry : arrayList) {
                if (!kostenEntry.\u00d200000.equals(object)) continue;
                if (kostenEntry.\u00d600000 == 0) {
                    kostenEntry.\u00d400000 = this.\u00d200000.getHswZauber().getVRkosten((KonkreterZauber)object);
                    n -= kostenEntry.\u00d400000;
                    kostenEntry.\u00d500000 = KostenArt.class;
                    continue;
                }
                iterator2 += kostenEntry.getKosten();
                ++n2;
                n4.add(kostenEntry);
            }
            if (n2 <= 0) continue;
            float f2 = (float)iterator2 / ((float)n2 * (float)this.\u00d200000.getHswZauber().getVRkosten((KonkreterZauber)object));
            arrayList2.add(new String(object, Float.valueOf(f2), n4));
        }
        object = new Comparator<String<KonkreterZauber, Float, ArrayList<KostenEntry>>>(){

            public int o00000(String<KonkreterZauber, Float, ArrayList<KostenEntry>> string, String<KonkreterZauber, Float, ArrayList<KostenEntry>> string2) {
                if (string.new() == string2.new()) {
                    return 0;
                }
                if (string.new().floatValue() < string2.new().floatValue()) {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(arrayList2, object);
        for (String string : arrayList2) {
            int n3 = this.\u00d200000.getHswZauber().getVRkosten((KonkreterZauber)string.\u00d300000());
            for (KostenEntry kostenEntry : (ArrayList)string.o00000()) {
                if (n < n3) continue;
                kostenEntry.\u00d400000 = this.\u00d200000.getHswZauber().getVRkosten((KonkreterZauber)string.\u00d300000());
                n -= kostenEntry.\u00d400000;
                kostenEntry.\u00d500000 = KostenArt.class;
            }
        }
    }

    public class Moeglichkeit {
        public ArrayList<KostenEntry> \u00d200000 = new ArrayList();
        public int \u00d400000;
        public int Object;

        public Moeglichkeit getClone() {
            Moeglichkeit moeglichkeit = new Moeglichkeit();
            moeglichkeit.\u00d400000 = this.\u00d400000;
            moeglichkeit.Object = this.Object;
            moeglichkeit.\u00d200000.addAll(this.\u00d200000);
            return moeglichkeit;
        }
    }
}

