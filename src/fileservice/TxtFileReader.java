/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author AJ
 */
public class TxtFileReader implements FileReader{
    private String filePath;
    private FormatStrategy format;

    public TxtFileReader(FormatStrategy format, String filePath) {
        this.filePath = filePath;
        this.format = format;
    }

    
    @Override
    public List<LinkedHashMap<String, String>> readFile() throws IOException{
         BufferedReader in = null;
            List<String> dataIn = new ArrayList<String>();
            try {
                          
                
               in = new BufferedReader(new java.io.FileReader(filePath));
               String line = in.readLine();               
               while(line != null){
                  
               dataIn.add(line);
                   
                   
                   line = in.readLine();
               }  // strips out any carriage return chars
               
               
               
               
               } catch(IOException ioe) {
                System.out.println("Houston, we have a problem! reading this file");
            } finally {                
                    in.close();
            }
            
            return format.decode(dataIn);
    }
    
    
    
    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the format
     */
    public FormatStrategy getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(FormatStrategy format) {
        this.format = format;
    }
    
    
    
}
