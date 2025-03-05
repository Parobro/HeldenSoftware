/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.daten;

import helden.framework.namen.daten.NamenListener;
import helden.framework.namen.daten.Namenliste;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Namenlisten
implements Iterable<Namenliste>,
NamenListener<Namenliste> {
    private List<WeakReference<NamenListener<Namenlisten>>> \u00d500000 = new ArrayList<WeakReference<NamenListener<Namenlisten>>>();
    private List<Namenliste> \u00d600000 = new ArrayList<Namenliste>();

    public int add(Namenliste namenliste) {
        int n = this.indexOf(namenliste.getBezeichnung());
        if (n < 0) {
            n = -(n + 1);
            this.\u00d600000.add(n, namenliste);
            namenliste.addNamenListener(this);
            this.o00000(0, n, n);
        }
        return n;
    }

    public void add(Namenlisten namenlisten) {
        for (Namenliste namenliste : namenlisten) {
            this.add(namenliste);
        }
    }

    public void addNamenListener(NamenListener<Namenlisten> namenListener) {
        this.\u00d500000.add(new WeakReference<NamenListener<Namenlisten>>(namenListener));
    }

    public boolean enthaeltInterne() {
        int n = this.size();
        for (int i2 = 0; i2 < n; ++i2) {
            if (!this.get(i2).istIntern()) continue;
            return true;
        }
        return false;
    }

    public Namenliste get(int n) {
        return this.\u00d600000.get(n);
    }

    public Namenliste get(String string) {
        int n = this.indexOf(string);
        return this.get(n);
    }

    public String getBezeichnung(int n) {
        return this.\u00d600000.get(n).getBezeichnung();
    }

    public int indexOf(Namenliste namenliste) {
        return this.indexOf(namenliste.getBezeichnung());
    }

    public int indexOf(String string) {
        int n;
        Collator collator = Collator.getInstance();
        for (n = 0; n < this.size() && collator.compare(string, this.getBezeichnung(n)) > 0; ++n) {
        }
        if (n >= this.size() || !this.getBezeichnung(n).equals(string)) {
            return -n - 1;
        }
        return n;
    }

    @Override
    public Iterator<Namenliste> iterator() {
        return this.\u00d600000.iterator();
    }

    @Override
    public void namenChanged(Namenliste namenliste, int n, int n2, int n3) {
        if (2 == n) {
            n3 = n2 = this.\u00d600000.indexOf(namenliste);
            Namenliste namenliste2 = this.get(n2);
            this.\u00d600000.remove(n2);
            int n4 = this.indexOf(namenliste2);
            n4 = -(n4 + 1);
            this.\u00d600000.add(n4, namenliste2);
            if (n4 > n2) {
                n3 = n4;
            } else {
                n2 = n4;
            }
            this.o00000(n, n2, n3);
        } else if (3 == n) {
            this.o00000(n, n2, n3);
        }
    }

    public void remove(int n) {
        this.\u00d600000.remove(n);
        this.o00000(1, n, n);
    }

    public void remove(int[] nArray) {
        if (nArray.length > 0) {
            Arrays.sort(nArray);
            for (int i2 = nArray.length - 1; i2 >= 0; --i2) {
                this.\u00d600000.remove(nArray[i2]);
            }
            this.o00000(1, nArray[0], nArray[nArray.length - 1]);
        }
    }

    public void removeNamenListener(NamenListener<Namenlisten> namenListener) {
        for (int i2 = this.\u00d500000.size() - 1; i2 >= 0; --i2) {
            NamenListener namenListener2 = (NamenListener)this.\u00d500000.get(i2).get();
            if (namenListener2 != null && namenListener != namenListener2) continue;
            this.\u00d500000.remove(i2);
        }
    }

    public int size() {
        return this.\u00d600000.size();
    }

    private void o00000(int n, int n2, int n3) {
        if (this.\u00d500000.size() > 0) {
            for (int i2 = this.\u00d500000.size() - 1; i2 >= 0; --i2) {
                NamenListener namenListener = (NamenListener)this.\u00d500000.get(i2).get();
                if (namenListener != null) {
                    namenListener.namenChanged(this, n, n2, n3);
                    continue;
                }
                this.\u00d500000.remove(i2);
            }
        }
    }
}

