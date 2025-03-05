/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.icons;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class IconFactory {
    protected static ImageIcon \u00d200000;
    protected static ImageIcon void;
    protected static ImageIcon \u00d400000;
    protected static ImageIcon \u00f400000;
    protected static ImageIcon \u00f500000;
    protected static ImageIcon float;
    protected static ImageIcon \u00d500000;
    protected static ImageIcon Object;
    protected static ImageIcon \u00d600000;
    protected static ImageIcon \u00f600000;
    protected static ImageIcon oO0000;
    protected static boolean OO0000;
    private static ImageIcon o00000;

    public static ImageIcon getConfig() {
        IconFactory.o00000();
        return o00000;
    }

    public static ImageIcon getFragezeichen() {
        IconFactory.o00000();
        return oO0000;
    }

    public static ImageIcon getIconBasis() {
        IconFactory.o00000();
        return \u00d200000;
    }

    public static ImageIcon getIconBGB() {
        IconFactory.o00000();
        return void;
    }

    public static ImageIcon getIconEmpfohlen() {
        IconFactory.o00000();
        return \u00d400000;
    }

    public static ImageIcon getIconHauszauber() {
        IconFactory.o00000();
        return \u00f400000;
    }

    public static ImageIcon getIconLeittalent() {
        IconFactory.o00000();
        return \u00f500000;
    }

    public static ImageIcon getIconRuhend() {
        IconFactory.o00000();
        return float;
    }

    public static ImageIcon getIconUngeeignet() {
        IconFactory.o00000();
        return \u00d500000;
    }

    public static ImageIcon getIconVerbilligt() {
        IconFactory.o00000();
        return Object;
    }

    public static ImageIcon getIconVeteran() {
        IconFactory.o00000();
        return \u00f600000;
    }

    public static ImageIcon getIconWarnung() {
        IconFactory.o00000();
        return \u00d600000;
    }

    public static JLabel getLabel(ImageIcon imageIcon) {
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setToolTipText(imageIcon.getDescription());
        return jLabel;
    }

    private static void o00000() {
        if (OO0000) {
            return;
        }
        String string = "helden/gui/icons/iconset/";
        \u00d200000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_basis16.gif"), "Basistalent");
        void = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_bgb16.gif"), "Breitgef\u00e4cherte Bildung");
        \u00d400000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_empfohlen16.gif"), "Empfohlen");
        \u00f400000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_hauszauber16.gif"), "Hauszauber");
        \u00f500000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_leittalent16.gif"), "Leittalent/Leitzauber");
        float = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_ruhend16.gif"), "Ruhend");
        \u00d500000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_ungeeignet16.gif"), "Ungeeignet");
        Object = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_verbilligt16.gif"), "Verbilligt");
        \u00d600000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_warnung16.gif"), "Warnung");
        \u00f600000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "helden_icon_veteran16.gif"), "Veteran");
        string = "helden/gui/icons/";
        oO0000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "Question.gif"), "Hilfe");
        o00000 = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(string + "guiuse.gif"), "Config");
        OO0000 = true;
    }

    private IconFactory() {
    }

    static {
        OO0000 = false;
    }
}

