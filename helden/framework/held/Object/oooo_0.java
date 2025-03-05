/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.object;

import helden.framework.C.J;
import helden.framework.Einstellungen;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.held.Object.OoOO
 */
public final class oooo_0 {
    private static oooo_0 \u00d200000;
    private static String \u00d500000;
    private static Boolean String;
    private HashMap<String, Logger> \u00d300000 = new HashMap();
    private FileHandler o00000;

    public static void \u00d300000(String string) {
        oooo_0.\u00d500000().o00000(Level.FINE, string);
    }

    public static void o00000(String string) {
        oooo_0.\u00d500000().o00000(Level.FINER, string);
    }

    public static void o00000(String string, Object object) {
        if (object instanceof J) {
            oooo_0.\u00d500000().o00000(Level.FINEST, string, ((J)object).O\u00d50000());
        }
    }

    public static void o00000() {
        oooo_0.\u00d500000().\u00d400000();
    }

    public static void o00000(Exception exception) {
        oooo_0.\u00f500000(exception.getMessage());
        exception.printStackTrace();
        System.out.println("===");
    }

    public static void \u00f500000(String string) {
        oooo_0.\u00d500000().o00000(Level.SEVERE, string);
    }

    public static void new(String string, Object object) {
        oooo_0.\u00d500000().o00000(Level.SEVERE, string, object);
    }

    public static String o00000(int n) {
        int n2 = -1;
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            if (n2 >= 0) {
                if (n2 == n) {
                    return stackTraceElement.getClassName() + ":" + stackTraceElement.getLineNumber() + " " + stackTraceElement.getMethodName();
                }
                ++n2;
                continue;
            }
            if (!stackTraceElement.getClassName().equals("helden.framework.held.Object.OoOO") && !stackTraceElement.getClassName().equals("helden.framework.held.Object.private")) continue;
            n2 = 0;
        }
        return "";
    }

    public static void \u00f400000(String string) {
        oooo_0.\u00d500000().o00000(Level.INFO, string);
    }

    public static void \u00d300000(String string, Object object) {
        oooo_0.\u00d500000().o00000(Level.INFO, string, object);
    }

    public static String o00000(Object object) {
        if (object == null) {
            return "NULL";
        }
        return object.toString();
    }

    public static void \u00d300000() {
        oooo_0.\u00d500000().return();
    }

    public static void new(String string) {
        oooo_0.\u00d500000().o00000(Level.FINER, string);
    }

    public static void return(String string) {
        \u00d500000 = string;
    }

    public static void o00000(Boolean bl) {
        String = bl;
    }

    public static void \u00d400000(String string) {
        oooo_0.\u00d500000().o00000(Level.WARNING, string);
    }

    private static oooo_0 \u00d500000() {
        if (\u00d200000 == null) {
            \u00d200000 = new oooo_0();
        }
        return \u00d200000;
    }

    private oooo_0() {
    }

    public void o00000(Level level, String string) {
        helden.framework.OOoO.String<String, String, String> string2 = oooo_0.\u00d500000().new();
        this.\u00d500000(string2.o00000()).logp(level, string2.\u00d300000(), string2.new(), string);
    }

    public void o00000(Level level, String string, Object object) {
        helden.framework.OOoO.String<String, String, String> string2 = oooo_0.\u00d500000().new();
        this.\u00d500000(string2.o00000()).logp(level, string2.\u00d300000(), string2.new(), string, object);
    }

    private String \u00d800000(String string) {
        if (!string.startsWith("helden")) {
            return "helden.misc";
        }
        String[] stringArray = string.split("\\.");
        String string2 = "";
        int n = 0;
        for (String string3 : stringArray) {
            string2 = string2 + string3;
            if (++n == 3) break;
            string2 = string2 + ".";
        }
        return string2;
    }

    private helden.framework.OOoO.String<String, String, String> new() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            if (stackTraceElement.getClassName().equals("helden.framework.held.Object.OoOO") || stackTraceElement.getClassName().equals("helden.framework.held.Object.private")) continue;
            return new helden.framework.OOoO.String<String, String, String>(stackTraceElement.getClassName() + ":" + stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), this.\u00d800000(stackTraceElement.getClassName()));
        }
        return new helden.framework.OOoO.String<String, String, String>("", "", "");
    }

    private Logger \u00d500000(String string) {
        if (!this.\u00d300000.containsKey(string)) {
            Logger logger = Logger.getLogger(string);
            if (String == null) {
                String = Einstellungen.getInstance().isTestMode();
            }
            if (String.booleanValue()) {
                if (this.o00000 == null) {
                    try {
                        this.o00000 = new FileHandler(\u00d500000);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                logger.addHandler(this.o00000);
                logger.setLevel(Level.ALL);
            } else {
                logger.setLevel(Level.WARNING);
            }
            this.\u00d300000.put(string, logger);
        }
        return this.\u00d300000.get(string);
    }

    private void \u00d400000() {
        helden.framework.OOoO.String<String, String, String> string = oooo_0.\u00d500000().new();
        this.\u00d500000(string.o00000()).entering(string.\u00d300000(), string.new());
    }

    private void return() {
        helden.framework.OOoO.String<String, String, String> string = oooo_0.\u00d500000().new();
        this.\u00d500000(string.o00000()).exiting(string.\u00d300000(), string.new());
    }

    static {
        \u00d500000 = "helden-software-log.xml";
    }
}

