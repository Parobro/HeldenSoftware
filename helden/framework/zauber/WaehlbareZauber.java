/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WaehlbareZauber {
    protected HashMap<KonkreterZauber, Integer> o00000 = new HashMap();

    public void add(KonkreterZauber konkreterZauber) {
        if (!this.o00000.containsKey(konkreterZauber)) {
            this.o00000.put(konkreterZauber, new Integer(0));
        }
    }

    public void add(KonkreterZauber konkreterZauber, Integer n) {
        this.o00000.put(konkreterZauber, n);
    }

    public void addAll(ArrayList<KonkreterZauber> arrayList) {
        for (KonkreterZauber konkreterZauber : arrayList) {
            this.add(konkreterZauber);
        }
    }

    public void addAll(WaehlbareZauber waehlbareZauber) {
        for (Map.Entry<KonkreterZauber, Integer> entry : waehlbareZauber.o00000.entrySet()) {
            this.o00000.put(entry.getKey(), entry.getValue());
        }
    }

    public void erhoeheKostenFuerDaemonisch() {
        ArrayList<KonkreterZauber> arrayList = this.getZauberListe();
        for (KonkreterZauber konkreterZauber : arrayList) {
            if (!konkreterZauber.hatDaemonischesMerkmal()) continue;
            this.add(konkreterZauber, 1);
        }
    }

    public int getKostenModifizier(KonkreterZauber konkreterZauber) {
        Integer n = this.o00000.get(konkreterZauber);
        if (n == null) {
            return 0;
        }
        return n;
    }

    public ArrayList<KonkreterZauber> getZauberListe() {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        Iterator<Map.Entry<KonkreterZauber, Integer>> iterator = this.o00000.entrySet().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().getKey());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public void remove(KonkreterZauber konkreterZauber) {
        this.o00000.remove(konkreterZauber);
    }

    public void removeAll(ArrayList<KonkreterZauber> arrayList) {
        for (KonkreterZauber konkreterZauber : arrayList) {
            this.o00000.remove(konkreterZauber);
        }
    }

    public void removeAll(WaehlbareZauber waehlbareZauber) {
        Iterator<Map.Entry<KonkreterZauber, Integer>> iterator = waehlbareZauber.o00000.entrySet().iterator();
        while (iterator.hasNext()) {
            this.o00000.remove(iterator.next());
        }
    }
}

