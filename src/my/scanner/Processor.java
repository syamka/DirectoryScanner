/*
* (C) Copyright 1997 i-Teco, CJSK. All Rights reserved.
* i-Teco PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*
* Эксклюзивные права 1997 i-Teco, ЗАО.
* Данные исходные коды не могут использоваться и быть изменены
* без официального разрешения компании i-Teco.          
*/
package my.scanner;

import java.io.IOException;
import java.util.Iterator;

/**
 * <h3></h3>
 * <p></p>
 * <p>Author: predtechenskaya (predtechenskaya@i-teco.ru)</p>
 * <p>Date: 03.12.13</p>
 */
public class Processor {

    Configuration configuration;

    FileScanner scanner;

    public Processor(Configuration configuration) throws IOException {
        this.configuration = configuration;
        this.scanner = new FileScanner(this.configuration.getFromDir());
    }

    public void process(){
        printFiles();
    }


    protected void printFiles(){
        Iterator it = scanner.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



}
