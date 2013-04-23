/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author AJ
 */
public interface FormatStrategy {
    public String encode(List<LinkedHashMap<String, String>>  data,boolean hasHeader);
    
    public List<LinkedHashMap<String,String>> decode(List<String> dataIn);
}
