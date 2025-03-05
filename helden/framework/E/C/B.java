/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.G;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
implements G {
    private int \u00f800000 = 0;
    private int OO0000 = 0;
    private int \u00d2O0000 = 0;
    private int \u00d600000 = 0;
    private int \u00f600000 = 0;
    private int \u00d3O0000 = 0;
    private int \u00d800000 = 0;
    private int interface = 0;
    private int \u00f4O0000 = 0;
    private int \u00d6O0000 = 0;
    private int int = 0;
    private boolean \u00d8O0000;
    private int do;
    private int \u00f400000;
    private boolean \u00d4O0000;

    public B(int[] nArray, int n, boolean bl, int n2) {
        this.\u00f800000 = nArray[0];
        this.OO0000 = nArray[1];
        this.\u00d2O0000 = nArray[2];
        this.\u00d600000 = nArray[3];
        this.\u00f600000 = nArray[4];
        this.\u00d3O0000 = nArray[5];
        this.\u00d800000 = nArray[6];
        this.interface = nArray[7];
        this.\u00f4O0000 = nArray[8];
        this.\u00d6O0000 = nArray[9];
        this.int = n;
        this.\u00d8O0000 = false;
        this.do = 1;
        this.\u00d4O0000 = bl;
        this.\u00f400000 = n2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        int[] nArray = new int[]{this.\u00f800000, this.OO0000, this.\u00d2O0000, this.\u00d600000, this.\u00f600000, this.\u00d3O0000, this.\u00d800000, this.interface, this.\u00f4O0000, this.\u00d6O0000};
        B b = new B(nArray, this.int, this.\u00d4O0000, this.\u00f400000);
        b.o00000(this.\u00d8O0000);
        b.for(this.do);
        return b;
    }

    public int null() {
        return this.\u00f400000;
    }

    public int for() {
        return this.do;
    }

    @Override
    public A \u00d800000() {
        return helden.framework.E.B.OO0000;
    }

    public int \u00f6O0000() {
        return this.\u00d600000;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public int \u00f800000() {
        return this.OO0000;
    }

    public B private() throws CloneNotSupportedException {
        return (B)this.clone();
    }

    public int \u00f600000() {
        return this.int;
    }

    public int oO0000() {
        return this.\u00f4O0000;
    }

    public int \u00d2O0000() {
        return this.\u00d6O0000;
    }

    public int \u00f8O0000() {
        return this.\u00f800000;
    }

    public int \u00d6O0000() {
        return this.\u00f600000;
    }

    public int \u00f500000() {
        return this.\u00d800000;
    }

    public int \u00d8O0000() {
        return this.\u00d3O0000;
    }

    public int \u00d5O0000() {
        return this.interface;
    }

    public int newsuper() {
        return this.\u00d2O0000;
    }

    public boolean \u00f5O0000() {
        return this.\u00d4O0000;
    }

    public boolean \u00d3O0000() {
        return this.\u00d8O0000;
    }

    public void \u00d600000(int n) {
        this.\u00f400000 = n;
    }

    public void for(int n) {
        this.do = n;
    }

    public void \u00d2O0000(int n) {
        this.\u00d600000 = n;
    }

    public void oO0000(int n) {
        this.OO0000 = n;
    }

    public void \u00f600000(int n) {
        this.int = n;
    }

    public void null(int n) {
        this.\u00f4O0000 = n;
    }

    public void \u00d500000(int n) {
        this.\u00d6O0000 = n;
    }

    public void \u00d300000(int n) {
        this.\u00f800000 = n;
    }

    public void \u00f800000(int n) {
        this.\u00f600000 = n;
    }

    public void String(int n) {
        this.\u00d800000 = n;
    }

    public void \u00d800000(int n) {
        this.\u00d3O0000 = n;
    }

    public void \u00d200000(int n) {
        this.interface = n;
    }

    public void \u00f500000(int n) {
        this.\u00d2O0000 = n;
    }

    public void o00000(boolean bl) {
        this.\u00d8O0000 = bl;
    }
}

