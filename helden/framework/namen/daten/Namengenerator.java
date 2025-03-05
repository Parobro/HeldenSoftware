/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.daten;

import helden.framework.namen.daten.NamenListener;
import helden.framework.namen.daten.Namenliste;
import java.lang.ref.WeakReference;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Namengenerator
implements Comparable<Namengenerator> {
    private String \u00d300000;
    private List<String> \u00d800000;
    private List<String> \u00d600000;
    private List<String> int;
    private List<String> class;
    private boolean \u00f400000;
    private List<WeakReference<NamenListener<Namengenerator>>> \u00d400000;
    private Map<String, Namenliste> super;
    private Random \u00d200000;

    public Namengenerator(Namengenerator namengenerator) {
        this.\u00d300000 = namengenerator.\u00d300000;
        this.\u00d800000 = new ArrayList<String>(namengenerator.\u00d800000);
        this.\u00d600000 = new ArrayList<String>(namengenerator.\u00d600000);
        this.int = new ArrayList<String>(namengenerator.int);
        this.class = new ArrayList<String>(namengenerator.class);
        this.\u00f400000 = namengenerator.\u00f400000;
        this.super = new HashMap<String, Namenliste>(namengenerator.super);
        this.\u00d200000 = new Random();
    }

    public Namengenerator(String string) {
        this.\u00d300000 = string;
        this.\u00d800000 = new ArrayList<String>(1);
        this.\u00d600000 = new ArrayList<String>(1);
        this.int = new ArrayList<String>(1);
        this.class = new ArrayList<String>(1);
        this.\u00f400000 = false;
        this.\u00d400000 = new ArrayList<WeakReference<NamenListener<Namengenerator>>>();
        this.super = new HashMap<String, Namenliste>();
        this.\u00d200000 = new Random();
    }

    public void addNamenListener(NamenListener<Namengenerator> namenListener) {
        this.\u00d400000.add(new WeakReference<NamenListener<Namengenerator>>(namenListener));
    }

    @Override
    public int compareTo(Namengenerator namengenerator) {
        return Collator.getInstance().compare(this.getBezeichnung(), namengenerator.getBezeichnung());
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (object == this) {
            return true;
        }
        Namengenerator namengenerator = (Namengenerator)object;
        return this.\u00d300000.equals(namengenerator.\u00d300000);
    }

    public String erzeugeName(boolean bl, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            if (bl2 && 0 < this.\u00d600000.size()) {
                stringBuilder.append(this.getString(this.\u00d600000));
            } else {
                stringBuilder.append(this.getString(this.\u00d800000));
            }
        } else if (bl2 && 0 < this.class.size()) {
            stringBuilder.append(this.getString(this.class));
        } else {
            stringBuilder.append(this.getString(this.int));
        }
        for (String string : this.super.keySet()) {
            Namenliste namenliste = this.super.get(string);
            while (0 <= stringBuilder.indexOf(string)) {
                String string2;
                if (namenliste == null || namenliste.size() == 0) {
                    string2 = "Fehler bei '" + string.replace("<", "").replace(">", "") + "/" + this.getBezeichnung() + "'";
                } else {
                    int n = this.\u00d200000.nextInt(namenliste.size());
                    string2 = namenliste.getName(n);
                }
                this.o00000(stringBuilder, string, string2);
            }
        }
        return stringBuilder.toString();
    }

    public String getBezeichnung() {
        return this.\u00d300000;
    }

    public List<String> getFormatStringsNamenMaennlich() {
        return new ArrayList<String>(this.\u00d800000);
    }

    public List<String> getFormatStringsNamenMaennlichAdlig() {
        return new ArrayList<String>(this.\u00d600000);
    }

    public List<String> getFormatStringsNamenWeiblich() {
        return new ArrayList<String>(this.int);
    }

    public List<String> getFormatStringsNamenWeiblichAdlig() {
        return this.class;
    }

    public Map<String, Namenliste> getPlatzhalter() {
        return new HashMap<String, Namenliste>(this.super);
    }

    public String getString(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        int n = new Random().nextInt(list.size());
        return list.get(n);
    }

    public int hashCode() {
        return this.\u00d300000.hashCode();
    }

    public boolean istIntern() {
        return this.\u00f400000;
    }

    public void removeNamenListener(NamenListener<Namengenerator> namenListener) {
        for (int i2 = this.\u00d400000.size() - 1; i2 >= 0; --i2) {
            NamenListener namenListener2 = (NamenListener)this.\u00d400000.get(i2).get();
            if (namenListener2 != null && namenListener != namenListener2) continue;
            this.\u00d400000.remove(i2);
        }
    }

    public void setBezeichnung(String string) {
        if (!(string = string.trim()).equals(this.\u00d300000)) {
            this.\u00d300000 = string;
            this.o00000();
        }
    }

    public void setFormateMaennlich(List<String> list) {
        this.\u00d800000.clear();
        this.\u00d800000.addAll(list);
    }

    public void setFormateMaennlichAdlig(List<String> list) {
        this.\u00d600000.clear();
        this.\u00d600000.addAll(list);
    }

    public void setFormateWeiblich(List<String> list) {
        this.int.clear();
        this.int.addAll(list);
    }

    public void setFormateWeiblichAdlig(List<String> list) {
        this.class.clear();
        this.class.addAll(list);
    }

    public void setIntern(boolean bl) {
        this.\u00f400000 = bl;
    }

    public void setPlatzhalter(Map<String, Namenliste> map) {
        this.super.clear();
        this.super.putAll(map);
    }

    public String toString() {
        if (this.istIntern()) {
            return this.getBezeichnung() + " *";
        }
        return this.getBezeichnung();
    }

    private void o00000(StringBuilder stringBuilder, String string, String string2) {
        int n = stringBuilder.indexOf(string);
        if (0 > n) {
            return;
        }
        int n2 = n + string.length();
        stringBuilder.replace(n, n2, string2);
    }

    private void o00000() {
        if (this.\u00d400000.size() > 0) {
            for (int i2 = this.\u00d400000.size() - 1; i2 >= 0; --i2) {
                NamenListener namenListener = (NamenListener)this.\u00d400000.get(i2).get();
                if (namenListener != null) {
                    namenListener.namenChanged(this, 2, -1, -1);
                    continue;
                }
                this.\u00d400000.remove(i2);
            }
        }
    }
}

