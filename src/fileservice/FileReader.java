/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author aquimby1
 */
public interface FileReader {
    public List<LinkedHashMap<String, String>> readFile()throws IOException;
}
