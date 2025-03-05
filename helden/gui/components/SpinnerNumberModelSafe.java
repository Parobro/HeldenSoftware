/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import javax.swing.SpinnerNumberModel;

public class SpinnerNumberModelSafe
extends SpinnerNumberModel {
    public SpinnerNumberModelSafe(double d2, double d3, double d4, double d5) {
        super(d2, Math.min(d2, d3), Math.max(d2, d4), d5);
    }

    public SpinnerNumberModelSafe(int n, int n2, int n3, int n4) {
        super(n, Math.min(n, n2), Math.max(n, n3), n4);
    }
}

