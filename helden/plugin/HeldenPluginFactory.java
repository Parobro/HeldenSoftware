/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin;

import helden.framework.Einstellungen;
import helden.framework.held.object.oooo_0;
import helden.gui.A;
import helden.gui.ooOO.X;
import helden.plugin.HeldenDatenPlugin;
import helden.plugin.HeldenInformationsPlugin;
import helden.plugin.HeldenPlugin;
import helden.plugin.HeldenXMLDatenPlugin;
import helden.plugin.HeldenXMLDatenPlugin2;
import helden.plugin.HeldenXMLDatenPlugin3;
import helden.plugin.datenxmlplugin.DatenAustausch;
import helden.plugin.datenxmlplugin.DatenAustausch3Impl;
import helden.plugin.datenxmlplugin.XMLPluginViaTCPIP;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.jar.JarFile;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class HeldenPluginFactory {
    private static HashMap<HeldenPlugin, DatenAustausch3Impl> tabplugins = new HashMap();

    public static HashMap<HeldenPlugin, DatenAustausch3Impl> getPluginsMitTab() {
        return tabplugins;
    }

    public static void initPlugins(JMenu jMenu, A a2) {
        tabplugins.clear();
        jMenu.removeAll();
        HeldenPluginFactory heldenPluginFactory = new HeldenPluginFactory();
        for (HeldenPlugin object2 : heldenPluginFactory.getAlleHeldenPlugins()) {
            Object object;
            if (Einstellungen.getInstance().isTestMode()) {
                oooo_0.\u00d300000(object2.getMenuName());
                for (Type type : object2.getClass().getGenericInterfaces()) {
                    oooo_0.\u00d300000("    " + type.toString());
                }
            }
            if (object2 instanceof HeldenInformationsPlugin || object2 instanceof HeldenXMLDatenPlugin || object2 instanceof HeldenXMLDatenPlugin2 || object2 instanceof HeldenXMLDatenPlugin3) {
                if (object2 instanceof HeldenInformationsPlugin) {
                    object = (HeldenInformationsPlugin)object2;
                    HeldenPluginFactory.o00000(HeldenPluginFactory.o00000(object.getUntermenus(), object2, a2), jMenu, object2, a2);
                    continue;
                }
                if (object2 instanceof HeldenXMLDatenPlugin3) {
                    object = (HeldenXMLDatenPlugin3)object2;
                    DatenAustausch3Impl datenAustausch = new DatenAustausch3Impl(a2.int());
                    object.init(datenAustausch, a2);
                    if (object.hatMenu()) {
                        HeldenPluginFactory.o00000(object.getUntermenus(), jMenu, object2, a2);
                    }
                    tabplugins.put((HeldenPlugin)object, datenAustausch);
                    continue;
                }
                if (object2 instanceof HeldenXMLDatenPlugin2) {
                    object = (HeldenXMLDatenPlugin2)object2;
                    DatenAustausch jMenuItem = new DatenAustausch(a2.int(), null);
                    object.init(jMenuItem);
                    HeldenPluginFactory.o00000(HeldenPluginFactory.o00000(object.getUntermenus(), object2, a2), jMenu, object2, a2);
                    continue;
                }
                if (!(object2 instanceof HeldenXMLDatenPlugin)) continue;
                object = (HeldenXMLDatenPlugin)object2;
                HeldenPluginFactory.o00000(HeldenPluginFactory.o00000(object.getUntermenus(), object2, a2), jMenu, object2, a2);
                continue;
            }
            object = new X(a2, object2);
            JMenuItem heldenDatenPlugin = new JMenuItem();
            heldenDatenPlugin.setAction((Action)object);
            heldenDatenPlugin.setIcon(((X)object).o00000());
            jMenu.add(heldenDatenPlugin);
        }
        XMLPluginViaTCPIP xMLPluginViaTCPIP = new XMLPluginViaTCPIP(a2.int());
        new Thread(xMLPluginViaTCPIP).start();
        for (HeldenDatenPlugin heldenDatenPlugin : heldenPluginFactory.getAlleHeldenDatenPlugins()) {
            X x = new X(a2, heldenDatenPlugin);
            JMenuItem jMenuItem = new JMenuItem();
            jMenuItem.setAction(x);
            jMenuItem.setIcon(x.o00000());
            jMenu.add(jMenuItem);
        }
    }

    public static void sendMsg(String string) {
        for (DatenAustausch3Impl datenAustausch3Impl : HeldenPluginFactory.getPluginsMitTab().values()) {
            datenAustausch3Impl.sendMsg(string);
        }
    }

    private static void o00000(ArrayList<JComponent> arrayList, JMenu jMenu, HeldenPlugin heldenPlugin, A a2) {
        if (arrayList.size() == 0) {
            X x = new X(a2, heldenPlugin);
            JMenuItem jMenuItem = new JMenuItem();
            jMenuItem.setAction(x);
            jMenuItem.setIcon(x.o00000());
            jMenu.add(jMenuItem);
        } else {
            JMenu jMenu2 = new JMenu(heldenPlugin.getMenuName());
            for (JComponent jComponent : arrayList) {
                jMenu2.add(jComponent);
            }
            jMenu.add(jMenu2);
        }
    }

    private static ArrayList<JComponent> o00000(ArrayList<String> arrayList, HeldenPlugin heldenPlugin, A a2) {
        ArrayList<JComponent> arrayList2 = new ArrayList<JComponent>();
        Iterator<String> iterator = arrayList.iterator();
        Integer n = 0;
        while (iterator.hasNext()) {
            Serializable serializable;
            Serializable serializable2;
            String string = iterator.next();
            if (string.equals("====")) {
                arrayList2.add(new JSeparator());
            } else {
                serializable2 = new X(a2, heldenPlugin, string, n);
                serializable = new JMenuItem();
                serializable.setAction((Action)((Object)serializable2));
                serializable.setIcon(((X)serializable2).o00000());
                arrayList2.add((JComponent)serializable);
            }
            serializable2 = n;
            n = n + 1;
            serializable = n;
        }
        return arrayList2;
    }

    public List<HeldenDatenPlugin> getAlleHeldenDatenPlugins() {
        ArrayList<HeldenDatenPlugin> arrayList = new ArrayList<HeldenDatenPlugin>();
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad"));
        if (file.exists() && file.isDirectory()) {
            File[] fileArray;
            for (File file2 : fileArray = file.listFiles()) {
                HeldenDatenPlugin heldenDatenPlugin;
                if (!file2.getName().toLowerCase().endsWith("jar") || (heldenDatenPlugin = this.getHeldenDatenPlugin(file2)) == null) continue;
                arrayList.add(heldenDatenPlugin);
            }
        }
        return arrayList;
    }

    public Vector<HeldenPlugin> getAlleHeldenPlugins() {
        Vector<HeldenPlugin> vector = new Vector<HeldenPlugin>();
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad"));
        if (file.exists() && file.isDirectory()) {
            File[] fileArray = file.listFiles();
            for (int i2 = 0; i2 < fileArray.length; ++i2) {
                HeldenPlugin heldenPlugin;
                if (!fileArray[i2].getName().toLowerCase().endsWith("jar") || (heldenPlugin = this.getHeldenPlugin(fileArray[i2])) == null) continue;
                if (this.o00000(heldenPlugin)) {
                    int n = JOptionPane.showConfirmDialog(A.\u00d4O0000(), "Das Plugin " + heldenPlugin.getMenuName() + " ist veraltet. Soll es gel\u00f6scht werden?");
                    if (n != 0) continue;
                    Einstellungen.getInstance().getZuLoeschendeDateienList().add(fileArray[i2].getAbsolutePath());
                    continue;
                }
                vector.add(heldenPlugin);
            }
        }
        return vector;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public HeldenDatenPlugin getHeldenDatenPlugin(File file) {
        JarFile jarFile = null;
        try {
            Object object;
            URL[] uRLArray;
            jarFile = new JarFile(file);
            Iterator<Object> iterator = jarFile.getManifest().getMainAttributes().keySet().iterator();
            String string = "";
            while (iterator.hasNext()) {
                uRLArray = iterator.next();
                object = (String)jarFile.getManifest().getMainAttributes().get(uRLArray);
                if (!uRLArray.toString().equals("HeldenDatenPluginClass") || ((String)object).length() <= 6) continue;
                string = ((String)object).trim().substring(0, ((String)object).length() - 6);
            }
            if (!string.equals("") && string != null && string.length() > 0) {
                uRLArray = new URL[]{file.toURI().toURL()};
                object = new URLClassLoader(uRLArray);
                Class<?> clazz = ((ClassLoader)object).loadClass(string);
                Constructor<?> constructor = clazz.getConstructor(new Class[0]);
                HeldenDatenPlugin heldenDatenPlugin = (HeldenDatenPlugin)constructor.newInstance(new Object[0]);
                return heldenDatenPlugin;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        catch (InvocationTargetException invocationTargetException) {
            invocationTargetException.printStackTrace();
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                if (jarFile != null) {
                    jarFile.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public HeldenPlugin getHeldenPlugin(File file) {
        JarFile jarFile = null;
        try {
            Object object;
            URL[] uRLArray;
            jarFile = new JarFile(file);
            Iterator<Object> iterator = jarFile.getManifest().getMainAttributes().keySet().iterator();
            String string = "";
            while (iterator.hasNext()) {
                uRLArray = iterator.next();
                object = (String)jarFile.getManifest().getMainAttributes().get(uRLArray);
                if (uRLArray.toString().equals("HeldenPluginClass") && ((String)object).length() > 6) {
                    string = ((String)object).trim().substring(0, ((String)object).length() - 6);
                }
                if (!uRLArray.toString().equals("HeldenDatenPluginClass")) continue;
                string = null;
                break;
            }
            if (string != null && !string.equals("") && string.length() > 0) {
                uRLArray = new URL[]{file.toURI().toURL()};
                object = new URLClassLoader(uRLArray, Thread.currentThread().getContextClassLoader());
                Class<?> clazz = ((ClassLoader)object).loadClass(string);
                Constructor<?> constructor = clazz.getConstructor(new Class[0]);
                HeldenPlugin heldenPlugin = (HeldenPlugin)constructor.newInstance(new Object[0]);
                return heldenPlugin;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        catch (InvocationTargetException invocationTargetException) {
            invocationTargetException.printStackTrace();
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                if (jarFile != null) {
                    jarFile.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return null;
    }

    private boolean o00000(HeldenPlugin heldenPlugin) {
        return heldenPlugin.getMenuName().equals("ZauberInfo 1.2");
    }
}

