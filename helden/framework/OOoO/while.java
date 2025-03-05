/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class while<A, B> {
    private A new;
    private B o00000;

    public while(A a2, B b) {
        this.new = a2;
        this.o00000 = b;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof while)) {
            return false;
        }
        while while_ = (while)object;
        boolean bl = this.getWert1().equals(while_.getWert1()) && this.getWert2().equals(while_.getWert2());
        return bl;
    }

    public A getWert1() {
        return this.new;
    }

    public B getWert2() {
        return this.o00000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public void setWert1(A a2) {
        this.new = a2;
    }

    public void setWert2(B b) {
        this.o00000 = b;
    }

    public String toString() {
        return this.new + " " + this.o00000;
    }
}

