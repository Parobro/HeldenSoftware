/*
 * Decompiled with CFR 0.152.
 */
package helden.logging;

import helden.framework.Einstellungen;
import helden.logging.HeldenOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class Logger {
    private static Logger String;
    private String \u00d200000;
    private String \u00d300000;
    private PrintStream \u00d500000;
    private SimpleDateFormat o00000 = new SimpleDateFormat("yyyy.MM.dd_HHmmssSS");

    public static Logger getInstance() {
        if (String == null) {
            String = new Logger();
        }
        return String;
    }

    private Logger() {
        this.\u00d300000 = "log_" + this.o00000.format(new Date()) + ".txt";
    }

    public boolean isLogging() {
        return this.\u00d500000 != null;
    }

    public synchronized void log(ArrayList<Object> arrayList) {
        System.err.println("---------------------------------");
        System.err.println("Entry: " + this.o00000.format(new Date()));
        for (Object object : arrayList) {
            System.err.println(object);
        }
        System.err.println("---------------------------------");
    }

    public synchronized void log(String string) {
        System.err.println("---------------------------------");
        System.err.println("Entry: " + this.o00000.format(new Date()));
        System.err.println(string);
        System.err.println("---------------------------------");
    }

    public synchronized void log(String[] stringArray) {
        System.err.println("---------------------------------");
        System.err.println("Entry: " + this.o00000.format(new Date()));
        for (String string : stringArray) {
            System.err.println(string);
        }
        System.err.println("---------------------------------");
    }

    public void startLoging() {
        if (Einstellungen.getInstance().isTestMode()) {
            return;
        }
        if (this.\u00d500000 == null) {
            this.\u00d500000 = System.err;
            this.\u00d200000 = Einstellungen.getInstance().getPfade().getPfad("logs");
            File file = new File(this.\u00d200000 + File.separatorChar + this.\u00d300000);
            try {
                file.createNewFile();
                System.setErr(new PrintStream(new HeldenOutputStream(file, this.\u00d500000), true, "UTF-8"));
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.\u00d500000 = null;
            }
        }
    }

    public void stopLogging() {
        if (this.\u00d500000 != null) {
            System.setErr(this.\u00d500000);
            this.\u00d500000 = null;
            this.\u00d200000 = null;
        }
    }
}

