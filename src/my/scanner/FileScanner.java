/*
* (C) Copyright 1997 i-Teco, CJSK. All Rights reserved.
* i-Teco PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*
* Эксклюзивные права 1997 i-Teco, ЗАО.
* Данные исходные коды не могут использоваться и быть изменены
* без официального разрешения компании i-Teco.          
*/
package my.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * <h3></h3>
 * <p></p>
 * <p>Author: predtechenskaya (predtechenskaya@i-teco.ru)</p>
 * <p>Date: 03.12.13</p>
 */
public class FileScanner implements Iterable<File> {

    boolean withSubfolders = false;

    public FileScanner(String inputDir) throws IOException {
        File dir = new File(inputDir);
        if(!dir.exists())
            throw new IOException("Директория " + inputDir + " не существует");
        prepareList(dir);
    }


    @Override
    public Iterator<File> iterator() {
        return listFiles.iterator();
    }

    class FileIterator implements Iterator<File> {

        Iterator<File> baseIt;
        FileIterator(Iterator<File> listIt){
            baseIt = listIt;
        }

        @Override
        public boolean hasNext() {
            return baseIt.hasNext();
        }

        @Override
        public File next() {
            return baseIt.next();
        }

        @Override
        public void remove() {

        }
    }

    List<File> listFiles = new LinkedList<File>();

    private void prepareList(File scandir){
        for(File f: scandir.listFiles()){
            if(match(f)){
                listFiles.add(f);
            }
            else if(f.isDirectory() && withSubfolders)
                prepareList(f);
        }
    }


    protected boolean match(File file){
        if(file.isFile())
            return true;
        return false;
    }



}
