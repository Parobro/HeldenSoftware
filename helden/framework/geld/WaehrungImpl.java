/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.MuenzSorter;
import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class WaehrungImpl
implements Cloneable,
Waehrung {
    private String o00000;
    private HashMap<String, Muenze> \u00d200000;

    public WaehrungImpl(String string) {
        this.o00000 = string;
        this.\u00d200000 = new HashMap();
    }

    public Object clone() {
        WaehrungImpl waehrungImpl = new WaehrungImpl(this.o00000);
        Iterator<String> iterator = this.getMuenzBezeichner();
        while (iterator.hasNext()) {
            Muenze muenze = this.getMuenzen(iterator.next()).getClone();
            waehrungImpl.setMuenzen(muenze.getBezeichner(), muenze);
        }
        return waehrungImpl;
    }

    @Override
    public String getBezeichner() {
        return this.o00000;
    }

    @Override
    public Waehrung getClone() {
        return (Waehrung)this.clone();
    }

    @Override
    public Iterator<String> getMuenzBezeichner() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(this.\u00d200000.keySet());
        Collections.sort(arrayList, new MuenzSorter(this));
        return arrayList.iterator();
    }

    @Override
    public Muenze getMuenzen(String string) {
        return this.\u00d200000.get(string);
    }

    @Override
    public void setMuenzen(String string, Muenze muenze) {
        this.\u00d200000.put(string, muenze);
    }
}

