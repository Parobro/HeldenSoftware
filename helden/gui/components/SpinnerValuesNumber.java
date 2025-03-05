/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.HeldenMath;
import helden.framework.held.object.oooo_0;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SpinnerListModel;

public class SpinnerValuesNumber
extends SpinnerListModel {
    private static String o00000 = "";
    private Class \u00d200000;

    public static List getList(int n, int n2, Integer n3, int n4) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (n3 != null && n3 < n) {
            n = n3;
        }
        if (n3 != null && n3 > n2) {
            n2 = n3;
        }
        for (int i2 = n; i2 <= n2; i2 += n4) {
            if (i2 == 0) {
                arrayList.add(o00000);
            }
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    public static List getListV(double d2, double d3, Number number, double d4) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (number != null && number.doubleValue() < d2) {
            d2 = number.doubleValue();
        }
        if (number != null && number.doubleValue() > d3) {
            d3 = number.doubleValue();
        }
        for (double d5 = d2; d5 <= d3; d5 += d4) {
            arrayList.add(new Double(HeldenMath.round(d5, 2)));
            if (d5 != 0.0) continue;
            arrayList.add(o00000);
        }
        return arrayList;
    }

    public SpinnerValuesNumber(Integer n, int n2, int n3, int n4) {
        super(SpinnerValuesNumber.getList(n2, n3, n, n4));
        this.\u00d200000 = Integer.class;
        this.setValue(n);
    }

    public SpinnerValuesNumber(Number number, double d2, double d3, double d4) {
        super(SpinnerValuesNumber.getListV(d2, d3, number, d4));
        this.\u00d200000 = Double.class;
        this.setValue(number);
    }

    @Override
    public Object getValue() {
        Object object = super.getValue();
        if (object.equals(o00000)) {
            return null;
        }
        return object;
    }

    @Override
    public void setValue(Object object) {
        try {
            object = this.\u00d200000.equals(Double.class) ? (Number)(object instanceof Number ? new Double(((Number)object).doubleValue()) : new Double(Double.parseDouble((String)object))) : (Number)new Integer(Integer.parseInt(object.toString()));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (object == null) {
            super.setValue(o00000);
        } else {
            try {
                super.setValue(object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                oooo_0.\u00d300000("Setting to " + object + " " + object.getClass());
            }
        }
    }
}

