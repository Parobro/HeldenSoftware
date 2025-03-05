/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.ooOO;
import helden.framework.D.H;
import helden.framework.D.P;
import helden.framework.OOoO.oO0O;
import helden.framework.OOoO.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class public
extends I
implements Cloneable {
    private String O\u00d3\u00d2000;
    private String O\u00d4\u00d2000;
    protected int o\u00d3\u00d2000;
    private boolean \u00f4\u00d3\u00d2000 = false;
    protected int o\u00d4\u00d2000;
    private PropertyChangeSupport Stringfloatsuper;
    private boolean \u00f8\u00d3\u00d2000;
    private I \u00d5\u00d3\u00d2000;
    private List<I> \u00d3\u00d3\u00d2000;
    private boolean \u00d4\u00d3\u00d2000;
    protected public \u00f5\u00d3\u00d2000;
    private Set<I> \u00d8\u00d3\u00d2000;
    private ArrayList<oO0O<P, AbstraktBedingung, Integer>> thisfloatsuper;
    private String ififsuper = "";
    private AbstraktBedingung \u00f5\u00d2\u00d2000 = null;
    private ArrayList<while<b_0, Integer>> whileifsuper;
    private ArrayList<I> \u00f8\u00d2\u00d2000;

    public static ooOO o00000(I i2, int n, voidsuper voidsuper2) {
        return new ooOO(i2, n, voidsuper2);
    }

    public static public o00000(b_0 b_02) {
        public public_ = new public(I.\u00d3OO000, -10, true, true);
        public_.\u00d200000("Miserable Eigenschaft: " + b_02.toString());
        return public_;
    }

    public static public Object(I i2, int n) {
        public public_ = new public(i2, n, true, true);
        return public_;
    }

    public static public o00000(I i2, int n, BedingungsVerknuepfung bedingungsVerknuepfung) {
        public public_ = public.Object(i2, n);
        public_.o00000(bedingungsVerknuepfung);
        return public_;
    }

    public static ooOO o00000(I i2, int n, voidsuper voidsuper2, AbstraktBedingung abstraktBedingung) {
        ooOO ooOO2 = new ooOO(i2, n, voidsuper2);
        ooOO2.o00000(abstraktBedingung);
        return ooOO2;
    }

    public static public \u00d200000(I i2, int n) {
        public public_ = new public(i2, n, true, false);
        return public_;
    }

    public static public o00000(I i2, int n) {
        public public_ = new public(i2, n, false, false);
        return public_;
    }

    public static public \u00d400000(I i2, int n) {
        return new public(i2, n, false, true);
    }

    public static public o00000(I i2, int n, AbstraktBedingung abstraktBedingung) {
        public public_ = public.\u00d400000(i2, n);
        public_.o00000(abstraktBedingung);
        return public_;
    }

    protected public(I i2, int n, boolean bl, boolean bl2) {
        super(i2.toString(), i2.\u00d400000());
        this.\u00d5\u00d3\u00d2000 = i2;
        this.Stringfloatsuper = new PropertyChangeSupport(this);
        this.\u00d200000(i2.toString());
        this.\u00f4\u00d3\u00d2000 = bl;
        this.\u00f8\u00d3\u00d2000 = bl2;
        this.o00000(n);
        this.\u00d8\u00d3\u00d2000 = new HashSet<I>();
        this.thisfloatsuper = new ArrayList();
        this.\u00f8\u00d2\u00d2000 = new ArrayList();
    }

    public void \u00d200000(I i2) {
        this.\u00f8\u00d2\u00d2000.add(i2);
    }

    public void o00000(b_0 b_02, Integer n) {
        if (this.whileifsuper == null) {
            this.whileifsuper = new ArrayList();
        }
        this.whileifsuper.add(new while<b_0, Integer>(b_02, new Integer(n)));
    }

    public public o00000(I i2, boolean bl) {
        if (this.\u00d3\u00d3\u00d2000 == null) {
            this.\u00d3\u00d3\u00d2000 = new ArrayList<I>();
        }
        this.\u00d3\u00d3\u00d2000.add(i2);
        if (this.\u00d3\u00d3\u00d2000.size() > 1 && (this.\u00d4\u00d3\u00d2000 || bl)) {
            helden.framework.held.object.oooo_0.\u00f500000("aufStockbar kann nur erlaubt werden, wenn es nur eine Erweiterung gibt");
        }
        this.\u00d4\u00d3\u00d2000 = bl;
        return this;
    }

    public void o00000(PropertyChangeListener propertyChangeListener, boolean bl) {
        PropertyChangeListener[] propertyChangeListenerArray;
        for (PropertyChangeListener propertyChangeListener2 : propertyChangeListenerArray = this.Stringfloatsuper.getPropertyChangeListeners()) {
            if (!propertyChangeListener2.equals(propertyChangeListener)) continue;
            return;
        }
        this.Stringfloatsuper.addPropertyChangeListener(propertyChangeListener);
    }

    public void o00000(H h2, int n) {
        this.o00000(h2, n, null);
    }

    public void o00000(H h2, int n, AbstraktBedingung abstraktBedingung) {
        this.o00000(oooo_0.o00000(h2), abstraktBedingung, n);
    }

    public void o00000(P p2, AbstraktBedingung abstraktBedingung, int n) {
        this.thisfloatsuper.add(new oO0O<P, AbstraktBedingung, Integer>(p2, abstraktBedingung, n));
    }

    public void o00000(I i2) {
        this.\u00d8\u00d3\u00d2000.add(i2);
    }

    public Object clone() throws CloneNotSupportedException {
        public public_ = new public(this.\u00f4O0000(), this.supersuper(), this.\u00d500000(), this.\u00f400000());
        public_.\u00d3\u00d3\u00d2000 = this.\u00d3\u00d3\u00d2000;
        public_.\u00d4\u00d3\u00d2000 = this.\u00d4\u00d3\u00d2000;
        public_.\u00d8\u00d3\u00d2000 = this.\u00d8\u00d3\u00d2000;
        public_.\u00d200000(this.O\u00d3\u00d2000);
        for (oO0O<P, AbstraktBedingung, Integer> oO0O2 : this.thisfloatsuper) {
            public_.o00000(oO0O2.\u00d300000(), oO0O2.new(), oO0O2.o00000());
        }
        public_.o00000(this.\u00d5O0000());
        return public_;
    }

    @Override
    public boolean equals(Object object) {
        String string;
        String string2;
        if (object == null) {
            return false;
        }
        if (object instanceof public) {
            string2 = this.oO0000();
            string = ((public)object).oO0000();
        } else {
            string2 = this.toString();
            string = object.toString();
        }
        if (string2.equals(string)) {
            return true;
        }
        if (!string2.startsWith(string) && !string.startsWith(string2)) {
            return false;
        }
        return string2.startsWith(I.\u00d8\u00d80000.toString()) && string.startsWith(I.\u00d8\u00d80000.toString()) || string2.startsWith(I.\u00d3OO000.toString()) && string.startsWith(I.\u00d3OO000.toString()) || string2.startsWith(I.while.toString()) && string.startsWith(I.while.toString()) || string2.startsWith(I.\u00d8O0000.toString()) && string.startsWith(I.\u00d8O0000.toString());
    }

    public boolean \u00f400000() {
        return this.\u00f8\u00d3\u00d2000;
    }

    public int \u00d600000() {
        int n = this.supersuper() * -100;
        return n;
    }

    public ArrayList<I> void() {
        return this.\u00f8\u00d2\u00d2000;
    }

    public public \u00d4O0000() {
        return this.\u00f5\u00d3\u00d2000;
    }

    public AbstraktBedingung \u00d5O0000() {
        return this.\u00f5\u00d2\u00d2000;
    }

    public String \u00f6O0000() {
        return this.ififsuper;
    }

    public ArrayList<while<b_0, Integer>> \u00d2O0000() {
        return this.whileifsuper;
    }

    public List<I> float() {
        return this.\u00d3\u00d3\u00d2000;
    }

    public int supersuper() {
        return this.o\u00d3\u00d2000;
    }

    public String public() {
        return this.O\u00d4\u00d2000;
    }

    public Vector<KostenArt> \u00d200000(floatsuper floatsuper2) {
        return new Vector<KostenArt>();
    }

    public ArrayList<oO0O<P, AbstraktBedingung, Integer>> o00000(floatsuper floatsuper2) {
        ArrayList<oO0O<P, AbstraktBedingung, Integer>> arrayList = new ArrayList<oO0O<P, AbstraktBedingung, Integer>>();
        for (oO0O<P, AbstraktBedingung, Integer> oO0O2 : this.thisfloatsuper) {
            if (oO0O2.new() != null && floatsuper2 != null && !floatsuper2.Object(oO0O2.new())) continue;
            arrayList.add(oO0O2);
        }
        return arrayList;
    }

    public Collection<I> \u00f5O0000() {
        return this.\u00d8\u00d3\u00d2000;
    }

    public I \u00f4O0000() {
        return this.\u00d5\u00d3\u00d2000;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean \u00f500000() {
        return this.\u00d4\u00d3\u00d2000;
    }

    public boolean \u00d6O0000() {
        return this.\u00f5\u00d3\u00d2000 != null;
    }

    public boolean \u00d500000() {
        return this.\u00f4\u00d3\u00d2000;
    }

    public String oO0000() {
        return this.toString();
    }

    public void o00000(PropertyChangeListener propertyChangeListener) {
        this.Stringfloatsuper.removePropertyChangeListener(propertyChangeListener);
    }

    public void \u00f600000() {
        this.o\u00d3\u00d2000 = this.o\u00d4\u00d2000;
    }

    public void OO0000() {
        this.o\u00d4\u00d2000 = this.o\u00d3\u00d2000;
    }

    public void o00000(public public_) {
        this.\u00f5\u00d3\u00d2000 = public_;
    }

    public void o00000(AbstraktBedingung abstraktBedingung) {
        this.\u00f5\u00d2\u00d2000 = abstraktBedingung;
    }

    public void o00000(String string) {
        this.ififsuper = string;
    }

    public void o00000(int n) {
        this.o00000(n, true);
    }

    public void o00000(int n, boolean bl) {
        int n2 = this.supersuper();
        this.o\u00d3\u00d2000 = n;
        if (bl) {
            this.Stringfloatsuper.firePropertyChange("GP", n2, this.o\u00d3\u00d2000);
        }
    }

    public void Object(String string) {
        this.O\u00d4\u00d2000 = string;
    }

    public void \u00d200000(String string) {
        this.O\u00d3\u00d2000 = string;
    }

    @Override
    public String toString() {
        return this.O\u00d3\u00d2000;
    }

    protected void o00000(boolean bl) {
        this.\u00f8\u00d3\u00d2000 = !bl;
    }
}

