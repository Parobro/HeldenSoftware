/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.daten;

import helden.framework.namen.daten.NamenListener;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Namenliste
implements Comparable<Namenliste> {
    private String \u00d400000;
    private List<WeakReference<NamenListener<Namenliste>>> \u00d200000;
    private List<String> super;
    private boolean \u00d300000;

    public Namenliste(Namenliste namenliste) {
        this.\u00d400000 = namenliste.\u00d400000;
        this.\u00d200000 = new ArrayList<WeakReference<NamenListener<Namenliste>>>();
        this.super = new ArrayList<String>(namenliste.super);
        this.\u00d300000 = namenliste.\u00d300000;
    }

    public Namenliste(String string) {
        this.\u00d400000 = string;
        this.\u00d200000 = new ArrayList<WeakReference<NamenListener<Namenliste>>>();
        this.super = new ArrayList<String>();
        this.\u00d300000 = false;
    }

    public void add(String string) {
        int n = this.indexOf(string);
        if (n < 0) {
            n = -(n + 1);
            this.super.add(n, string);
            this.fireNameChangeEvent(0, n, n);
        }
    }

    public void addNamenListener(NamenListener<Namenliste> namenListener) {
        this.\u00d200000.add(new WeakReference<NamenListener<Namenliste>>(namenListener));
    }

    @Override
    public int compareTo(Namenliste namenliste) {
        return Collator.getInstance().compare(this.getBezeichnung(), namenliste.getBezeichnung());
    }

    public void fireNameChangeEvent(int n, int n2, int n3) {
        if (this.\u00d200000.size() > 0) {
            for (int i2 = this.\u00d200000.size() - 1; i2 >= 0; --i2) {
                NamenListener namenListener = (NamenListener)this.\u00d200000.get(i2).get();
                if (namenListener != null) {
                    namenListener.namenChanged(this, n, n2, n3);
                    continue;
                }
                this.\u00d200000.remove(i2);
            }
        }
    }

    public String getBezeichnung() {
        return this.\u00d400000;
    }

    public String getName(int n) {
        return this.super.get(n);
    }

    public List<String> getNamen() {
        return new ArrayList<String>(this.super);
    }

    public int indexOf(String string) {
        int n;
        for (n = Collections.binarySearch(this.super, string, Collator.getInstance()); n > 0 && this.getName(n - 1).equals(string); --n) {
        }
        return n;
    }

    public boolean istIntern() {
        return this.\u00d300000;
    }

    public void remove(int n) {
        this.super.remove(n);
        this.fireNameChangeEvent(1, n, n);
    }

    public void remove(int[] nArray) {
        Arrays.sort(nArray);
        for (int i2 = nArray.length - 1; i2 >= 0; --i2) {
            int n = nArray[i2];
            this.super.remove(n);
        }
        this.fireNameChangeEvent(1, nArray[0], nArray[nArray.length - 1]);
    }

    public void remove(String string) {
        int n = this.indexOf(string);
        if (n >= 0) {
            this.remove(n);
        }
    }

    public void removeNamenListener(NamenListener<Namenliste> namenListener) {
        for (int i2 = this.\u00d200000.size() - 1; i2 >= 0; --i2) {
            NamenListener namenListener2 = (NamenListener)this.\u00d200000.get(i2).get();
            if (namenListener2 != null && namenListener != namenListener2) continue;
            this.\u00d200000.remove(i2);
        }
    }

    public void setBezeichnung(String string) {
        if (!this.\u00d400000.equals(string)) {
            this.\u00d400000 = string.trim();
            this.fireNameChangeEvent(2, -1, -1);
        }
    }

    public void setIntern(boolean bl) {
        this.\u00d300000 = bl;
    }

    public void setNamen(List<String> list) {
        int n = this.size();
        this.super = new ArrayList<String>(list);
        this.fireNameChangeEvent(3, 0, n - 1);
    }

    public int size() {
        return this.super.size();
    }

    public String toString() {
        if (this.istIntern()) {
            return this.getBezeichnung() + " *";
        }
        return this.\u00d400000;
    }
}

