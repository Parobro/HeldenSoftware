/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class KategorienArrayList<T> {
    private ArrayList<T> class = new ArrayList();
    private ArrayList<T> super = new ArrayList();
    private Settings \u00d200000;
    private ArrayList<T>[] \u00d400000 = new ArrayList[this.getAnzahlListen()];
    private ArrayList<T> \u00d300000;

    public KategorienArrayList() {
        for (int i2 = 0; i2 < this.getAnzahlListen(); ++i2) {
            this.\u00d400000[i2] = new ArrayList();
        }
    }

    public void add(T t) {
        this.class.add(t);
        this.\u00d300000 = null;
        if (!this.isExecluded(t)) {
            this.\u00d400000[this.getZugehoerigeListe(t)].add(t);
        }
    }

    public void addAll(Collection<T> collection) {
        for (T t : collection) {
            this.add(t);
        }
    }

    public void addExclude(Settings settings) {
        if (this.\u00d200000 != settings) {
            this.\u00d200000 = settings;
            this.refresh();
        }
    }

    public void addExclude(T t) {
        if (!this.super.contains(t)) {
            this.super.add(t);
            this.refresh();
        }
    }

    public void clearExclude() {
        this.super.clear();
        this.refresh();
    }

    public int getAnzahlListen() {
        return 1;
    }

    public String getKategorieNamen(int n) {
        return "N/A";
    }

    public ArrayList<T> getListe() {
        if (this.\u00d300000 == null) {
            this.\u00d300000 = new ArrayList();
            this.\u00d300000.addAll(this.class);
        }
        return this.\u00d300000;
    }

    public ArrayList<T> getListe(int n) {
        return this.\u00d400000[n];
    }

    public int getZugehoerigeListe(T t) {
        return 0;
    }

    public boolean isExecluded(T t) {
        return this.super.contains(t) || this.\u00d200000 != null && !this.\u00d200000.contains(t);
    }

    public void refresh() {
        for (int i2 = 0; i2 < this.getAnzahlListen(); ++i2) {
            this.\u00d400000[i2].clear();
        }
        for (T t : this.class) {
            if (this.isExecluded(t)) continue;
            this.\u00d400000[this.getZugehoerigeListe(t)].add(t);
        }
    }

    public void removeExclude(T t) {
        this.super.remove(t);
        this.refresh();
    }
}

