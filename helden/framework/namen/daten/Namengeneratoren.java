/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.daten;

import helden.framework.namen.daten.NamenListener;
import helden.framework.namen.daten.Namengenerator;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Namengeneratoren
implements NamenListener<Namengenerator>,
Iterable<Namengenerator> {
    private List<WeakReference<NamenListener<Namengeneratoren>>> \u00d800000 = new ArrayList<WeakReference<NamenListener<Namengeneratoren>>>();
    private List<Namengenerator> null = new ArrayList<Namengenerator>();

    public int add(Namengenerator namengenerator) {
        int n = this.indexOf(namengenerator);
        if (n < 0) {
            n = -(n + 1);
            this.null.add(n, namengenerator);
            namengenerator.addNamenListener(this);
            this.\u00d200000(0, n, n);
        }
        return n;
    }

    public void add(Namengeneratoren namengeneratoren) {
        for (Namengenerator namengenerator : namengeneratoren) {
            this.add(namengenerator);
        }
    }

    public void addNameListener(NamenListener<Namengeneratoren> namenListener) {
        this.\u00d800000.add(new WeakReference<NamenListener<Namengeneratoren>>(namenListener));
    }

    public boolean enthaeltInterne() {
        int n = this.size();
        for (int i2 = 0; i2 < n; ++i2) {
            if (!this.get(i2).istIntern()) continue;
            return true;
        }
        return false;
    }

    public Namengenerator get(int n) {
        return this.null.get(n);
    }

    public Namengenerator get(String string) {
        int n = this.indexOf(string);
        if (n < 0) {
            return null;
        }
        return this.null.get(n);
    }

    public String getBezeichnung(int n) {
        return this.null.get(n).getBezeichnung();
    }

    public int indexOf(Namengenerator namengenerator) {
        return this.indexOf(namengenerator.getBezeichnung());
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
    public Iterator<Namengenerator> iterator() {
        return this.null.iterator();
    }

    @Override
    public void namenChanged(Namengenerator namengenerator, int n, int n2, int n3) {
        if (n == 2) {
            n3 = n2 = this.null.indexOf(namengenerator);
            this.null.remove(n2);
            int n4 = this.indexOf(namengenerator.getBezeichnung());
            n4 = -(n4 + 1);
            this.null.add(n4, namengenerator);
            if (n4 > n3) {
                n3 = n4;
            } else {
                n2 = n4;
            }
            this.\u00d200000(n, n2, n3);
        } else if (3 == n) {
            this.\u00d200000(n, n2, n3);
        }
    }

    public void remove(int n) {
        this.null.remove(n).removeNamenListener(this);
        this.\u00d200000(1, n, n);
    }

    public void remove(int[] nArray) {
        Arrays.sort(nArray);
        if (nArray.length > 0) {
            int n;
            for (n = this.null.size() - 1; n >= 0; --n) {
                this.null.remove(nArray[n]).removeNamenListener(this);
            }
            n = nArray[0];
            int n2 = nArray[nArray.length - 1];
            this.\u00d200000(1, n, n2);
        }
    }

    public void removeNamenListener(NamenListener<Namengeneratoren> namenListener) {
        for (int i2 = this.\u00d800000.size() - 1; i2 >= 0; --i2) {
            NamenListener namenListener2 = (NamenListener)this.\u00d800000.get(i2).get();
            if (namenListener2 != null && namenListener != namenListener2) continue;
            this.\u00d800000.remove(i2);
        }
    }

    public int size() {
        return this.null.size();
    }

    private void \u00d200000(int n, int n2, int n3) {
        if (this.\u00d800000.size() > 0) {
            for (int i2 = this.\u00d800000.size() - 1; i2 >= 0; --i2) {
                NamenListener namenListener = (NamenListener)this.\u00d800000.get(i2).get();
                if (namenListener != null) {
                    namenListener.namenChanged(this, n, n2, n3);
                    continue;
                }
                this.\u00d800000.remove(i2);
            }
        }
    }
}

