/*
* (C) Copyright 1997 i-Teco, CJSK. All Rights reserved.
* i-Teco PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*
* Эксклюзивные права 1997 i-Teco, ЗАО.
* Данные исходные коды не могут использоваться и быть изменены
* без официального разрешения компании i-Teco.          
*/
package my.scanner;

/**
 * <h3></h3>
 * <p></p>
 * <p>Author: predtechenskaya (predtechenskaya@i-teco.ru)</p>
 * <p>Date: 03.12.13</p>
 */
public class Configuration {
    public Configuration(String fromDir, String toDir) {
        this.fromDir = fromDir;
        this.toDir = toDir;
    }

    public Configuration(String fromDir, String toDir, String mask) {
        this.fromDir = fromDir;
        this.toDir = toDir;
        this.mask = mask;
    }

    public Configuration(String fromDir, String toDir, String mask, boolean includeSubfolders) {
        this.fromDir = fromDir;
        this.toDir = toDir;
        this.mask = mask;
        this.includeSubfolders = includeSubfolders;
    }

    public Configuration(String fromDir, String toDir, String mask, boolean includeSubfolders, boolean autoDelete) {
        this.fromDir = fromDir;
        this.toDir = toDir;
        this.mask = mask;
        this.includeSubfolders = includeSubfolders;
        this.autoDelete = autoDelete;
    }

    private String fromDir;
    private String toDir;

    private String mask = null;
    private boolean includeSubfolders = false;
    private boolean autoDelete = false;

    public boolean isAutoDelete() {
        return autoDelete;
    }

    public String getFromDir() {
        return fromDir;
    }

    public boolean isIncludeSubfolders() {
        return includeSubfolders;
    }

    public String getMask() {
        return mask;
    }

    public String getToDir() {
        return toDir;
    }
}
