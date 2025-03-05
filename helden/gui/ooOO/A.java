/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.D.P;
import helden.framework.HeldenMath;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.J;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Stringsuper;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public final class A
extends AbstractAction {
    private static A o00000;
    private helden.gui.A \u00d300000;
    private Random \u00d200000;

    public static A o00000(helden.gui.A a2) {
        if (o00000 == null) {
            o00000 = new A(a2);
        }
        return o00000;
    }

    private A(helden.gui.A a2) {
        super("Auto Steiger ...", null);
        this.\u00d300000 = a2;
        this.\u00d200000 = new Random();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        K k2 = (K)this.\u00d300000.\u00d2O0000();
        floatsuper floatsuper2 = new floatsuper(k2);
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        HashMap<Object, Float> hashMap2 = new HashMap<Object, Float>();
        int n = k2.\u00d8O0000().size();
        this.o00000(k2, hashMap);
        this.\u00d400000(k2, hashMap);
        this.\u00d200000(k2, hashMap);
        this.Object(k2, hashMap);
        this.o00000(hashMap, hashMap2);
        if (!this.o00000(hashMap2)) {
            return;
        }
        this.o00000(k2, floatsuper2, hashMap2);
        this.o00000(k2, n);
    }

    private void o00000(HashMap<Object, Integer> hashMap, HashMap<Object, Float> hashMap2) {
        int n = 0;
        for (Object object : hashMap.keySet()) {
            n += hashMap.get(object).intValue();
        }
        for (Object object : hashMap.keySet()) {
            int n2 = hashMap.get(object);
            hashMap2.put(object, Float.valueOf((float)n2 / (float)n));
        }
    }

    private void Object(K k2, HashMap<Object, Integer> hashMap) {
        for (P p2 : k2.\u00f5O0000().\u00f600000()) {
            String string = this.o00000(p2);
            Integer n = 0;
            if (hashMap.containsKey(string)) {
                n = hashMap.get(string);
            }
            if (p2.\u00f4O0000()) continue;
            n = n + p2.o\u00d20000();
            hashMap.put(string, n);
        }
    }

    private void o00000(K k2, HashMap<Object, Integer> hashMap) {
        int n = 0;
        int n2 = 0;
        J j2 = k2.\u00d3\u00d30000();
        for (b_0 b_02 : j2.\u00d200000()) {
            int n3;
            if (!b_02.floatString()) continue;
            int n4 = k2.\u00d3\u00d30000().OO0000(b_02);
            int n5 = k2.\u00d3\u00d30000().do(b_02);
            int n6 = k2.\u00d3\u00d30000().\u00d200000(b_02);
            if (k2.\u00d3\u00d30000().class(b_02)) {
                n4 = 0;
            }
            if (b_02.publicString()) {
                for (n3 = n4; n3 < n5; ++n3) {
                    n += k2.\u00d3\u00d30000().\u00d300000(b_02, n3);
                }
                continue;
            }
            for (n3 = 0; n3 < n6; ++n3) {
                n2 += k2.\u00d3\u00d30000().\u00d300000(b_02, n3);
            }
        }
        hashMap.put("Gute Eigenschaften", n);
        hashMap.put("Sonstige Eigenschaften", n2);
    }

    private void \u00d400000(K k2, HashMap<Object, Integer> hashMap) {
        for (voidsuper voidsuper2 : k2.\u00f8O0000().\u00d200000()) {
            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = this.o00000(voidsuper2);
            Integer n = 0;
            if (hashMap.containsKey(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12)) {
                n = hashMap.get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12);
            }
            int n2 = k2.\u00f8O0000().\u00d800000(voidsuper2);
            for (int i2 = -1; i2 < n2; ++i2) {
                try {
                    n = n + (int)k2.\u00f8O0000().\u00d200000(voidsuper2, k2, i2, false);
                    continue;
                }
                catch (Stringsuper stringsuper) {
                    // empty catch block
                }
            }
            hashMap.put(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, n);
        }
    }

    private void \u00d200000(K k2, HashMap<Object, Integer> hashMap) {
        Integer n = 0;
        for (KonkreterZauber konkreterZauber : k2.\u00d5o0000().\u00d200000()) {
            int n2 = k2.\u00d5o0000().\u00d800000(konkreterZauber);
            for (int i2 = -1; i2 < n2; ++i2) {
                try {
                    n = n + (int)k2.\u00d5o0000().super((oo0o_0)konkreterZauber, k2, i2, false);
                    continue;
                }
                catch (Stringsuper stringsuper) {
                    // empty catch block
                }
            }
        }
        hashMap.put(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000, n);
    }

    private oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 o00000(voidsuper voidsuper2) {
        oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = voidsuper2.getArt();
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
            E e = (E)voidsuper2;
            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = e.classclass() ? oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do : oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000;
        }
        return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12;
    }

    private int o00000(oooo_1 oooo_12, ArrayList<voidsuper> arrayList) {
        int n = Integer.MAX_VALUE;
        for (voidsuper voidsuper2 : arrayList) {
            n = Math.min(n, HeldenMath.runde(oooo_12.\u00d800000().o00000((oo0o_0)voidsuper2, false)));
        }
        return n;
    }

    private ArrayList<P> o00000(Object object, oooo_1 oooo_12, floatsuper floatsuper2) {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oooo_12.o00000(true).\u00f600000()) {
            if (!this.o00000(p2).equals(object) || !p2.getClass().equals(P.class) || !floatsuper2.Object(p2.\u00f5o0000()) || !oooo_12.\u00d800000().oO0000().contains(p2) || p2.new() || p2.\u00f4O0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    private String o00000(P p2) {
        String string = "SF: " + p2.while();
        if (p2.while().equals("")) {
            string = "SF: Allgemein";
        }
        return string;
    }

    private void o00000(K k2, int n) {
        Integer n2 = helden.framework.A.A.for();
        for (int i2 = n; i2 < k2.\u00d8O0000().size(); ++i2) {
            helden.framework.A.A a2 = k2.\u00d8O0000().get(i2);
            a2.o00000(n2, "automatisches Steigern");
            a2.o00000("automatisches Steigern");
        }
    }

    private boolean o00000(final HashMap<Object, Float> hashMap) {
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Object> arrayList = new ArrayList<Object>(hashMap.keySet());
        Collections.sort(arrayList, new Comparator(){

            public int compare(Object object, Object object2) {
                return ((Float)hashMap.get(object2)).compareTo((Float)hashMap.get(object));
            }
        });
        for (Object object2 : arrayList) {
            stringBuilder.append(String.format("% 5.2f", (double)hashMap.get(object2).floatValue() * 100.0) + "% " + object2 + "\n");
        }
        JTextArea jTextArea = new JTextArea(stringBuilder.toString());
        jTextArea.setEditable(false);
        object2 = new JPanel(new BorderLayout());
        ((Container)object2).add((Component)new JLabel("<html>Die automatische Steigerung nutzt die verf\u00fcgaren AP,<br>um automatisiert Talente, Zauber und Eigenschaften zu steigern und <br>Sonderfertigkeiten zu kaufen.<br><br>Die bisherige Nutzung der AP in den verschiedenen Bereichen ist unten<br>aufgef\u00fchrt. Die verf\u00fcgbaren AP werden auf Basis dieser Verteilung genutzt.<br><br>- neue Talente und Zauber werden nicht aktiviert.<br>- Bei Magiern werden keine neuen Repr\u00e4sentationen oder Ritualkenntnissen gekauft.<br>- Es wird nicht versucht, zwingend alle AP auszugeben.<br>- Es werden keine Nachteile gesenkt.<br>- Es werden keine Sonderfertigkeiten mit Auswahlen gekauft<br>"), "North");
        ((Container)object2).add((Component)jTextArea, "Center");
        int n = JOptionPane.showConfirmDialog(this.\u00d300000, object2, "Automatische Steigerung", 2);
        return n == 0;
    }

    private void o00000(K k2, floatsuper floatsuper2, HashMap<Object, Float> hashMap) {
        int n = k2.\u00d400000();
        ArrayList<Object> arrayList = new ArrayList<Object>(hashMap.keySet());
        arrayList.remove("Gute Eigenschaften");
        arrayList.remove(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000);
        arrayList.remove(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do);
        arrayList.add(0, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do);
        arrayList.add(0, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000);
        arrayList.add(0, "Gute Eigenschaften");
        for (Object object : arrayList) {
            int n2 = HeldenMath.runde(hashMap.get(object).floatValue() * (float)n);
            if (object instanceof oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1) {
                if (object.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
                    this.Object(k2, n2);
                    continue;
                }
                this.o00000(k2, (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1)object, n2);
                continue;
            }
            if (object.toString().equals("Gute Eigenschaften")) {
                this.\u00d200000(k2, n2);
                continue;
            }
            if (object.toString().startsWith("SF: ")) {
                this.o00000(k2, object, n2, floatsuper2);
                continue;
            }
            System.out.println("Keine Routine f\u00fcr " + object);
        }
    }

    private void o00000(K k2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, int n) {
        oooo_1 oooo_12 = new oooo_1(k2);
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : k2.\u00f8O0000().\u00d200000()) {
            if (!this.o00000(voidsuper2).equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12)) continue;
            arrayList.add(voidsuper2);
        }
        while (arrayList.size() > 0 && n >= this.o00000(oooo_12, arrayList)) {
            voidsuper voidsuper2;
            int n2 = 0;
            voidsuper2 = null;
            do {
                int n3 = this.\u00d200000.nextInt(arrayList.size());
                voidsuper2 = arrayList.get(n3);
            } while ((n2 = HeldenMath.runde(oooo_12.\u00d800000().o00000((oo0o_0)voidsuper2, false))) > n);
            try {
                oooo_12.\u00d200000(voidsuper2);
                n -= n2;
            }
            catch (Exception exception) {
                arrayList.remove(voidsuper2);
                System.out.println(voidsuper2 + ": " + exception.toString());
            }
        }
    }

    private void \u00d200000(K k2, int n) {
        oooo_1 oooo_12 = new oooo_1(k2);
        ArrayList<b_0> arrayList = new ArrayList<b_0>(b_0.o\u00d60000());
        arrayList.remove(b_0.\u00f5\u00f5\u00d2000);
        while (arrayList.size() > 0 && n > 0) {
            int n2 = this.\u00d200000.nextInt(arrayList.size());
            b_0 b_02 = (b_0)arrayList.get(n2);
            int n3 = HeldenMath.runde(oooo_12.\u00d800000().\u00d3\u00d30000().\u00d600000(b_02));
            if (n3 > n) {
                arrayList.remove(b_02);
                continue;
            }
            try {
                oooo_12.\u00d300000(b_02);
                n -= n3;
            }
            catch (Exception exception) {
                arrayList.remove(b_02);
                System.out.println(b_02 + ": " + exception.toString());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void o00000(K k2, Object object, int n, floatsuper floatsuper2) {
        void var8_11;
        oooo_1 oooo_12 = new oooo_1(k2);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (Map.Entry<E, ArrayList<P>> arrayList3 : helden.framework.OOoO.P.o00000().entrySet()) {
            for (P p2 : arrayList3.getValue()) {
                if (arrayList2.contains(p2.\u00f500000())) continue;
                arrayList2.add(p2.\u00f500000());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(k2.\u00f8O0000().\u00d200000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000));
        arrayList4.add(k2.\u00f8O0000().\u00d200000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do));
        Iterator iterator = arrayList4.iterator();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = (voidsuper)iterator.next();
            if (voidsuper2 == null) continue;
            for (P p3 : helden.framework.OOoO.P.o00000().get(voidsuper2)) {
                arrayList2.remove(p3.\u00f500000());
            }
        }
        System.out.println("Talente: " + arrayList4.toString());
        System.out.println("Excl: " + arrayList2);
        ArrayList<P> arrayList = this.o00000(object, oooo_12, floatsuper2);
        while (var8_11.size() > 0 && n > 0) {
            int n2 = this.\u00d200000.nextInt(var8_11.size());
            P p4 = (P)var8_11.get(n2);
            int n3 = p4.o\u00d20000();
            if (n3 > n || arrayList2.contains(p4.\u00f500000())) {
                var8_11.remove(p4);
                continue;
            }
            try {
                oooo_12.o00000(p4);
                n -= n3;
                ArrayList<P> arrayList3 = this.o00000(object, oooo_12, floatsuper2);
            }
            catch (Exception exception) {
                var8_11.remove(p4);
                System.out.println(p4 + ": " + exception.toString());
            }
        }
    }

    private void Object(K k2, int n) {
        oooo_1 oooo_12 = new oooo_1(k2);
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>(k2.\u00d5o0000().\u00d200000());
        while (arrayList.size() > 0 && n > 0) {
            int n2 = this.\u00d200000.nextInt(arrayList.size());
            KonkreterZauber konkreterZauber = (KonkreterZauber)arrayList.get(n2);
            int n3 = HeldenMath.runde(oooo_12.\u00d800000().o00000((oo0o_0)konkreterZauber, false));
            if (n3 > n) {
                arrayList.remove(konkreterZauber);
                continue;
            }
            try {
                oooo_12.\u00d200000(konkreterZauber);
                n -= n3;
            }
            catch (Exception exception) {
                arrayList.remove(konkreterZauber);
                System.out.println(konkreterZauber + ": " + exception.toString());
            }
        }
    }
}

