/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO.A;

import helden.framework.D.for;
import helden.framework.OoOO.G;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModBezeichner;
import helden.framework.held.K;
import helden.framework.int.L;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.P;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.gui.allgemein.Utils;
import helden.gui.components.JScrollPaneFast;
import helden.gui.ooOO.A.OoOO;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JLabel;

public final class A
extends OoOO {
    private helden.gui.A \u00d200000;

    public A() {
        super("Infos \u00fcber ProfessionsContainer", null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object4;
        super super_22;
        K k2 = (K)this.\u00d200000.\u00d2O0000();
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("<html><body>");
        stringBuffer.append("<h1>Professionen</h1>");
        stringBuffer.append("Hautprofession");
        stringBuffer.append("<ul>");
        for (super super_22 : k2.\u00d800000().Object(String._o.\u00d300000)) {
            stringBuffer.append("<li>" + super_22.toString() + " (" + super_22.getClass().toString() + ")");
            if (!(super_22 instanceof L)) continue;
            stringBuffer.append("<ul>");
            object4 = (L)super_22;
            for (P object32 : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object4).getGewaehlteVarianten()) {
                stringBuffer.append("<li>" + object32.toString());
            }
            stringBuffer.append("</ul>");
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("BGB");
        stringBuffer.append("<ul>");
        for (super super_22 : k2.\u00d800000().Object(String._o.\u00d500000)) {
            stringBuffer.append("<li>" + super_22.toString());
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("Magische Weiterbildung");
        stringBuffer.append("<ul>");
        for (super super_22 : k2.\u00d800000().Object(String._o.\u00d800000)) {
            stringBuffer.append("<li>" + super_22.toString());
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("Sp\u00e4tweihe");
        stringBuffer.append("<ul>");
        for (super super_22 : k2.\u00d800000().Object(String._o.\u00d200000)) {
            stringBuffer.append("<li>" + super_22.toString());
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("<h1>Eigenschaftsmodifikatoren</h1><table border=1>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(b_0.whilewhilesuper);
        arrayList.add(b_0.newwhilesuper);
        arrayList.add(b_0.\u00f8\u00f4\u00d2000);
        arrayList.add(b_0.\u00d5\u00f4\u00d2000);
        arrayList.add(b_0.O\u00f5\u00d2000);
        arrayList.add(b_0.\u00f4\u00f4\u00d2000);
        arrayList.add(b_0.returnwhilesuper);
        arrayList.add(b_0.privatedosuper);
        arrayList.add(b_0.\u00f5\u00f5\u00d2000);
        arrayList.add(b_0.\u00f4\u00f5\u00d2000);
        arrayList.add(b_0.thispublicsuper);
        arrayList.add(b_0.\u00f4\u00d8\u00d2000);
        arrayList.add(b_0.O\u00f4\u00d2000);
        arrayList.add(b_0.\u00d4\u00f5\u00d2000);
        arrayList.add(b_0.\u00d3\u00f4\u00d2000);
        arrayList.add(b_0.\u00d8\u00f5\u00d2000);
        arrayList.add(b_0.\u00f5\u00f5\u00d2000);
        stringBuffer.append("<tr><td>Eigentschaft</td><td>Insgesamt</td><td>Hauptprofession</td></tr>");
        super_22 = this.\u00d200000.\u00d2O0000().\u00d800000();
        object4 = arrayList.iterator();
        while (object4.hasNext()) {
            b_0 b_02 = (b_0)object4.next();
            if (((String)super_22).getModifikator(b_02) == 0) continue;
            stringBuffer.append("<tr><td>" + b_02.toString() + "</td><td>" + ((String)super_22).getModifikator(b_02) + "</td><td>" + ((String)super_22).Objectif().get(0).getModifikator(b_02) + "</td></tr>");
        }
        stringBuffer.append("</table>");
        stringBuffer.append("<h1>Verbilligte Sonderfertigkeiten</h1><ul>");
        for (for for_ : k2.thisObject()) {
            stringBuffer.append("<li>Bezeichner: " + for_.getBezeichner() + "<br>");
            if (for_.getAuswahlen().size() > 0) {
                stringBuffer.append("Auswahlen " + for_.getAuswahlen() + "<br>");
            }
            if (for_.Object() != null) {
                stringBuffer.append("Talent " + for_.Object());
            }
            Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = k2.newnew();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getGewaehlteVerbilligteSonderfertigkeiten().contains(for_)) continue;
                stringBuffer.append(" (gew\u00e4hlt \u00fcber " + ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).toString() + ")");
            }
            if (!k2.\u00d800000().voidif().contains(for_)) continue;
            stringBuffer.append(" (ProfessionsContainer liefert: gew\u00e4hlt)");
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("<h1>Sprachen</h1>");
        stringBuffer.append("<ul>");
        stringBuffer.append("<li>Muttersprache: " + k2.\u00f800000().getMuttersprache());
        stringBuffer.append("<li>Schrift der Muttersprache: " + k2.\u00f800000().getSchrift());
        if (k2.\u00f800000().getZweitLehrsprache() != null) {
            Iterator<G> iterator = k2.\u00f800000().getZweitLehrsprache().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append("<li>Zweit-/Lehrsprache: " + iterator.next().toString() + " (Kultur)");
            }
        }
        if (k2.\u00d4O0000().getZweitLehrsprache() != null) {
            Iterator<G> iterator = k2.\u00d4O0000().getZweitLehrsprache().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append("<li>Zweit-/Lehrsprache: " + iterator.next().toString() + " (Profession)");
            }
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("<h1>Mods</h1>");
        stringBuffer.append("<ul>");
        for (GMod gMod : k2.o00000((GModBezeichner)null)) {
            stringBuffer.append("<li> " + gMod.toString());
        }
        stringBuffer.append("</ul>");
        stringBuffer.append("</body></html>");
        JLabel jLabel = new JLabel(stringBuffer.toString());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(jLabel);
        object = new JDialog(Utils.getFrame(this.\u00d200000), "Test", true);
        ((Container)object).add(jScrollPaneFast);
        ((Window)object).setSize(600, 450);
        Utils.zentriere((Window)object);
        ((Dialog)object).setVisible(true);
    }

    @Override
    public void o00000(helden.gui.A a2) {
        this.\u00d200000 = a2;
    }
}

