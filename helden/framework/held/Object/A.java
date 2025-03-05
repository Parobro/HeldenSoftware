/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.held.Object.private;
import helden.framework.held.object.oooo_3;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A {
    public static final String o00000 = "COPYRIGHT";
    public static final String new = "SPLASH";
    private Image \u00d300000 = null;

    public A(String string, int n) {
        if (o00000.equals(string)) {
            this.o00000(n);
        } else {
            this.new(n);
        }
    }

    public Image o00000() {
        return this.\u00d300000;
    }

    private void o00000(int n) {
        String string = "helden/gui/icons/magier_rothaar_enc.jpg";
        int n2 = 53080;
        if (n == 1) {
            string = "helden/gui/icons/bardin_amber_enc.jpg";
            n2 = 49400;
        } else if (n == 2) {
            string = "helden/gui/icons/magier_rothaar_enc.jpg";
            n2 = 53080;
        } else if (n == 3) {
            string = "helden/gui/icons/draconiter_ordenskrieger_enc.jpg";
            n2 = 58248;
        } else if (n == 4) {
            string = "helden/gui/icons/hexe_enc.jpg";
            n2 = 42264;
        } else if (n == 5) {
            string = "helden/gui/icons/halbelfe_geheimagentin_enc.jpg";
            n2 = 19216;
        } else if (n == 6) {
            string = "helden/gui/icons/mhanadistanischer_falkner_enc.jpg";
            n2 = 41568;
        } else if (n == 7) {
            string = "helden/gui/icons/utulu-gladiatorin_enc.jpg";
            n2 = 49960;
        } else if (n == 8) {
            string = "helden/gui/icons/zwergenkrieger_enc.jpg";
            n2 = 51120;
        } else if (n == 9) {
            string = "helden/gui/icons/goblin_schamanin_enc.jpg";
            n2 = 28640;
        } else if (n == 10) {
            string = "helden/gui/icons/steppenelf_krieger_enc.jpg";
            n2 = 29632;
        } else if (n == 11) {
            string = "helden/gui/icons/mittelreichische_schelmin_enc.jpg";
            n2 = 19680;
        } else if (n == 12) {
            string = "helden/gui/icons/achaz_kristallomantin_enc.jpg";
            n2 = 70616;
        }
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(string);
        byte[] byArray = null;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        try {
            byArray = new byte[n2];
            while ((n4 = inputStream.read(byArray, n5, n2 - n5)) > 0) {
                n5 += n4;
            }
        }
        catch (Exception exception) {
            private.\u00d200000("Bild kann nichts geladen werden", "maik");
        }
        int n6 = n5;
        n5 = 0;
        while (n6 > 0) {
            int n7 = n6;
            if (n6 >= 1032) {
                n7 = 1032;
            }
            byte[] byArray2 = new byte[n7];
            System.arraycopy(byArray, n5, byArray2, 0, n7);
            n5 += n7;
            n6 -= n7;
            try {
                byte[] byArray3 = oooo_3.super(byArray2);
                arrayList.add(byArray3);
                n3 += byArray3.length;
            }
            catch (Exception exception) {
                private.\u00d200000("Bild kann nichts decodiert werden", "maik");
            }
        }
        byte[] byArray4 = new byte[n3];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            for (int i3 = 0; i3 < ((byte[])arrayList.get(i2)).length; ++i3) {
                byArray4[i2 * 1024 + i3] = ((byte[])arrayList.get(i2))[i3];
            }
        }
        this.\u00d300000 = Toolkit.getDefaultToolkit().createImage(byArray4);
    }

    private void new(int n) {
        String string = "helden/gui/icons/magier_enc.png";
        int n2 = 79840;
        if (n == 1) {
            string = "helden/gui/icons/bardin_enc.png";
            n2 = 76664;
        } else if (n == 2) {
            string = "helden/gui/icons/magier_enc.png";
            n2 = 79840;
        } else if (n == 3) {
            string = "helden/gui/icons/draconiter_enc.png";
            n2 = 103312;
        } else if (n == 4) {
            string = "helden/gui/icons/hexe_enc.png";
            n2 = 95272;
        } else if (n == 5) {
            string = "helden/gui/icons/geheimagentin_enc.png";
            n2 = 56928;
        } else if (n == 6) {
            string = "helden/gui/icons/falkner_enc.png";
            n2 = 84552;
        } else if (n == 7) {
            string = "helden/gui/icons/gladiatorin_enc.png";
            n2 = 78496;
        } else if (n == 8) {
            string = "helden/gui/icons/zwergenkrieger_enc.png";
            n2 = 85736;
        } else if (n == 9) {
            string = "helden/gui/icons/schamanin_enc.png";
            n2 = 98504;
        } else if (n == 10) {
            string = "helden/gui/icons/steppenelf_enc.png";
            n2 = 83168;
        } else if (n == 11) {
            string = "helden/gui/icons/schelmin_enc.png";
            n2 = 54904;
        } else if (n == 12) {
            string = "helden/gui/icons/kristallomantin_enc.png";
            n2 = 85736;
        }
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(string);
        byte[] byArray = null;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        try {
            byArray = new byte[n2];
            while ((n4 = inputStream.read(byArray, n5, n2 - n5)) > 0) {
                n5 += n4;
            }
        }
        catch (Exception exception) {
            private.\u00d200000("Bild kann nichts geladen werden " + string, "maik");
        }
        int n6 = n5;
        n5 = 0;
        while (n6 > 0) {
            int n7 = n6;
            if (n6 >= 1032) {
                n7 = 1032;
            }
            byte[] byArray2 = new byte[n7];
            System.arraycopy(byArray, n5, byArray2, 0, n7);
            n5 += n7;
            n6 -= n7;
            try {
                byte[] byArray3 = oooo_3.super(byArray2);
                arrayList.add(byArray3);
                n3 += byArray3.length;
            }
            catch (Exception exception) {
                private.\u00d200000("Bild kann nichts decodiert werden", "maik");
            }
        }
        byte[] byArray4 = new byte[n3];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            for (int i3 = 0; i3 < ((byte[])arrayList.get(i2)).length; ++i3) {
                byArray4[i2 * 1024 + i3] = ((byte[])arrayList.get(i2))[i3];
            }
        }
        this.\u00d300000 = Toolkit.getDefaultToolkit().createImage(byArray4);
    }
}

