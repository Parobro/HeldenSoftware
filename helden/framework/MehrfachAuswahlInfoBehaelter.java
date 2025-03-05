/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MehrfachAuswahlInfoBehaelter<G, T> {
    private ArrayList<T> \u00d300000;
    private G o00000;
    private boolean \u00d200000;

    public MehrfachAuswahlInfoBehaelter(ArrayList<T> arrayList, G g2, boolean bl) {
        this.\u00d300000 = arrayList;
        this.o00000 = g2;
        this.\u00d200000 = bl;
    }

    public MehrfachAuswahlInfoBehaelter(G g2) {
        this.\u00d300000 = new ArrayList();
        this.o00000 = g2;
        this.\u00d200000 = true;
    }

    public MehrfachAuswahlInfoBehaelter(G g2, boolean bl) {
        this.\u00d300000 = new ArrayList();
        this.o00000 = g2;
        this.\u00d200000 = bl;
    }

    public boolean add(T t) {
        return this.\u00d300000.add(t);
    }

    public boolean addAll(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (this.contains(t)) continue;
            this.\u00d300000.add(t);
            bl = true;
        }
        return bl;
    }

    public boolean auswahlEquals(Collection<T> collection) {
        return this.\u00d300000.containsAll(collection) && collection.containsAll(this.\u00d300000);
    }

    public void clear() {
        this.\u00d300000.clear();
    }

    public boolean contains(T t) {
        return this.\u00d300000.contains(t);
    }

    public boolean containsAll(Collection<T> collection) {
        return this.\u00d300000.containsAll(collection);
    }

    public ArrayList<T> getAuswahlen() {
        return new ArrayList<T>(this.\u00d300000);
    }

    public G getBezeichner() {
        return this.o00000;
    }

    public boolean isAlleVarianten() {
        return this.\u00d200000;
    }

    public boolean isEmpty() {
        return this.\u00d300000.isEmpty();
    }

    public boolean remove(T t) {
        return this.\u00d300000.remove(t);
    }

    public boolean removeAll(Collection<T> collection) {
        return this.\u00d300000.removeAll(collection);
    }

    public void setAlleVarianten(boolean bl) {
        this.\u00d200000 = bl;
    }

    public void setAuswahlen(ArrayList<T> arrayList) {
        this.\u00d300000 = arrayList;
    }

    public String toString() {
        String string = this.o00000.toString();
        if (!this.isEmpty()) {
            string = string + " [" + this.getAuswahlen().get(0).toString();
            for (int i2 = 1; i2 < this.getAuswahlen().size(); ++i2) {
                string = string + ", " + this.getAuswahlen().get(i2).toString();
            }
            string = string + "]";
        }
        return string;
    }
}

