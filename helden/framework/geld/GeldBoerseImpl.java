/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.GeldBoerse;
import helden.framework.geld.MuenzImplSorter;
import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungsFabrik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class GeldBoerseImpl
implements GeldBoerse {
    private HashMap<Muenze, Integer> o00000 = new HashMap();

    @Override
    public void addMuenze(Muenze muenze, int n) {
        Integer n2 = this.o00000.get(muenze);
        if (n2 != null) {
            if (n2 + n > 0) {
                this.o00000.put(muenze, new Integer(n2 + n));
            } else {
                this.o00000.remove(muenze);
            }
        } else if (n > 0) {
            this.o00000.put(muenze, new Integer(n));
        }
    }

    @Override
    public Vector<String> getGeldStrings(boolean bl) {
        Vector<String> vector = new Vector<String>();
        Iterator<String> iterator = WaehrungsFabrik.getInstance().getAllWaehrungenBezeichner().iterator();
        while (iterator.hasNext()) {
            Waehrung waehrung = WaehrungsFabrik.getInstance().getWaehrungen(iterator.next());
            Iterator<String> iterator2 = waehrung.getMuenzBezeichner();
            String string = waehrung.getBezeichner() + " ( ";
            boolean bl2 = false;
            while (iterator2.hasNext()) {
                String string2 = iterator2.next();
                Muenze muenze = waehrung.getMuenzen(string2);
                if (this.getMuenzAnzahl(muenze) > 0) {
                    string = string + muenze.getKurzString() + ": " + this.getMuenzAnzahl(muenze) + " ";
                    bl2 = true;
                    continue;
                }
                string = string + muenze.getKurzString() + ": " + 0 + " ";
            }
            if (!bl2 && !bl) continue;
            string = string + ")";
            vector.add(string);
        }
        return vector;
    }

    @Override
    public int getMuenzAnzahl(Muenze muenze) {
        Integer n = this.o00000.get(muenze);
        if (n != null) {
            return n;
        }
        return 0;
    }

    @Override
    public Iterator<Muenze> getMuenzeIter() {
        ArrayList<Muenze> arrayList = new ArrayList<Muenze>(this.o00000.keySet());
        Collections.sort(arrayList, new MuenzImplSorter());
        return arrayList.iterator();
    }

    @Override
    public void putMuenze(Muenze muenze, int n) {
        if (n > 0) {
            this.o00000.put(muenze, new Integer(n));
        } else {
            this.o00000.remove(muenze);
        }
    }
}

