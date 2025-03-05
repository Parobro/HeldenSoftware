/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.Version;
import helden.framework.Einstellungen;
import helden.framework.ExternesProgramm;
import helden.framework.held.Object.private;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

public class R {
    public ArrayList<ExternesProgramm> o00000() {
        Closeable closeable;
        ArrayList<ExternesProgramm> arrayList = new ArrayList<ExternesProgramm>();
        File file = new File(System.getProperty("user.home") + System.getProperty("file.separator") + ".dsa4.properties");
        Properties properties = new Properties();
        String string = "Pfad";
        String string2 = "File";
        String string3 = " -Xms40M -Xmx256M";
        if (!Einstellungen.getInstance().getPfade().getPfad("einstellungsPfad").equals(System.getProperty("user.home") + System.getProperty("file.separator") + ".heldEinstellungen4_1.xml")) {
            string3 = string3 + " -ep" + Einstellungen.getInstance().getPfade().getPfad("einstellungsPfad");
        }
        ProtectionDomain protectionDomain = this.getClass().getProtectionDomain();
        CodeSource codeSource = protectionDomain.getCodeSource();
        int n = codeSource.getLocation().toString().lastIndexOf("/");
        string = codeSource.getLocation().toString().substring(6, n);
        string2 = codeSource.getLocation().toString().substring(n + 1);
        boolean bl = true;
        if (file.exists()) {
            bl = false;
            try {
                Object object;
                Object object22;
                closeable = new FileInputStream(file);
                properties.load((InputStream)closeable);
                ((FileInputStream)closeable).close();
                if (this.o00000(properties)) {
                    Object object3;
                    boolean bl2 = false;
                    if (!string.equals(URLDecoder.decode(properties.getProperty("helden4_1.path"), "UTF-8"))) {
                        bl2 = true;
                    }
                    if (!string.equals(URLDecoder.decode(properties.getProperty("helden4_1.file"), "UTF-8"))) {
                        bl2 = true;
                    }
                    if (!Version.getVersion().equals(URLDecoder.decode(properties.getProperty("helden4_1.version"), "UTF-8"))) {
                        bl2 = true;
                    }
                    if (!Version.getVersion().equals(URLDecoder.decode(properties.getProperty("helden4_1.parameter"), "UTF-8"))) {
                        bl2 = true;
                    }
                    for (Object object22 : properties.keySet()) {
                        object = (String)object22;
                        if (!((String)object).startsWith("heldenUpdater")) continue;
                        properties.remove(object);
                    }
                    if (properties.containsKey("helden4_1.parameter")) {
                        object3 = properties.getProperty("helden4_1.parameter");
                        object22 = ((String)object3).split(" ");
                        for (Object object4 : object22) {
                            String string4 = ((String)object4).trim();
                            if (string4.equals("")) continue;
                            if (string4.startsWith("-ep")) {
                                boolean bl3 = false;
                                for (String string5 : Einstellungen.getInstance().getJarParameterList()) {
                                    if (!string5.startsWith("-ep")) continue;
                                    bl3 = true;
                                }
                                if (bl3) continue;
                                if (string4.endsWith(".heldEinstellungen4_1.xml")) {
                                    string4 = string4.substring(0, string4.indexOf(".heldEinstellungen4_1.xml"));
                                }
                                Einstellungen.getInstance().getJarParameterList().add(string4);
                                continue;
                            }
                            Einstellungen.getInstance().getVMParameterList().add(string4);
                        }
                    }
                    if (bl2) {
                        properties.put("helden4_1.path", string);
                        properties.put("helden4_1.name", "Helden (DSA4.1)");
                        properties.put("helden4_1.file", string2);
                        properties.put("helden4_1.version", Version.getVersion());
                        properties.put("helden4_1.parameter", string3);
                        object3 = new FileOutputStream(file);
                        properties.store((OutputStream)object3, "");
                        ((OutputStream)object3).flush();
                        ((FileOutputStream)object3).close();
                    }
                } else {
                    properties.put("helden4_1.lastUpdateCheck", new Date().getTime() / 1000L + "");
                    properties.put("helden4_1.path", string);
                    properties.put("helden4_1.name", "Helden (DSA4.1)");
                    properties.put("helden4_1.file", string2);
                    properties.put("helden4_1.version", Version.getVersion());
                    properties.put("helden4_1.parameter", string3);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    properties.store(fileOutputStream, "");
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                for (Object object3 : properties.keySet()) {
                    if (!((String)object3).endsWith(".name") || properties.get(object3).equals("Helden (DSA4.1)")) continue;
                    object22 = (String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "path");
                    object22 = object22 + "/" + (String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "file");
                    object = new File((String)(object22 = URLDecoder.decode(object22, "UTF-8")));
                    if (!((File)object).exists() || !((File)object).isFile()) continue;
                    ExternesProgramm externesProgramm = new ExternesProgramm((String)properties.get(object3));
                    externesProgramm.setPfad(URLDecoder.decode((String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "path"), "UTF-8"));
                    externesProgramm.setDatei(URLDecoder.decode((String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "file"), "UTF-8"));
                    externesProgramm.setVersion(URLDecoder.decode((String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "version"), "UTF-8"));
                    externesProgramm.setParameter(URLDecoder.decode((String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "parameter"), "UTF-8"));
                    if (properties.containsKey(((String)object3).substring(0, ((String)object3).length() - 4) + "jarParameter")) {
                        externesProgramm.setJarParameter(URLDecoder.decode((String)properties.get(((String)object3).substring(0, ((String)object3).length() - 4) + "jarParameter"), "UTF-8"));
                    } else {
                        externesProgramm.setJarParameter("");
                    }
                    arrayList.add(externesProgramm);
                }
            }
            catch (Exception exception) {
                private.\u00d200000(exception.getMessage(), "alle");
                bl = true;
                arrayList.clear();
            }
        }
        if (bl) {
            properties.clear();
            properties.put("helden4_1.path", string);
            properties.put("helden4_1.name", "Helden (DSA4.1)");
            properties.put("helden4_1.file", string2);
            properties.put("helden4_1.version", Version.getVersion());
            properties.put("helden4_1.parameter", string3);
            try {
                closeable = new FileOutputStream(file);
                properties.store((OutputStream)closeable, "");
                ((OutputStream)closeable).flush();
                ((FileOutputStream)closeable).close();
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return arrayList;
    }

    private boolean o00000(Properties properties) {
        return properties.containsKey("helden4_1.name") && properties.containsKey("helden4_1.path") && properties.containsKey("helden4_1.file") && properties.containsKey("helden4_1.version") && properties.containsKey("helden4_1.parameter") && properties.containsKey("helden4_1.lastUpdateCheck");
    }
}

