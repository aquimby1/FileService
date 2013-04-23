/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileservice;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AJ
 */
public class FileService {
    private String readPath;
    private FormatStrategy readFormat;    
    private FileWriter writer;
    private FileReader reader;
    private String writePath;
    private FormatStrategy writeFormat;
    private List<Map<String,String>> data;

    public FileService(String readPath, FormatStrategy readFormat, String writePath, FormatStrategy writeFormat) {
        this.readPath = readPath;
        this.readFormat = readFormat;
        this.writePath = writePath;
        this.writeFormat = writeFormat;
    }

    public List<LinkedHashMap<String,String>> readFile()throws IOException{
        
        return reader.readFile();
    }    
    
    /**
     * @return the readPath
     */
    public String getReadPath() {
        return readPath;
    }

    /**
     * @param readPath the readPath to set
     */
    public void setReadPath(String readPath) {
        this.readPath = readPath;
    }

    /**
     * @return the writePath
     */
    public String getWritePath() {
        return writePath;
    }

    /**
     * @param writePath the writePath to set
     */
    public void setWritePath(String writePath) {
        this.writePath = writePath;
    }

    /**
     * @return the writer
     */
    public FileWriter getWriter() {
        return writer;
    }

    /**
     * @param writer the writer to set
     */
    public void setWriter(FileWriter writer) {
        this.writer = writer;
    }

    /**
     * @return the reader
     */
    public FileReader getReader() {
        return reader;
    }

    /**
     * @param reader the reader to set
     */
    public void setReader(FileReader reader) {
        this.reader = reader;
    }

    /**
     * @return the readFormat
     */
    public FormatStrategy getReadFormat() {
        return readFormat;
    }

    /**
     * @param readFormat the readFormat to set
     */
    public void setReadFormat(FormatStrategy readFormat) {
        this.readFormat = readFormat;
    }

    /**
     * @return the writeFormat
     */
    public FormatStrategy getWriteFormat() {
        return writeFormat;
    }

    /**
     * @param writeFormat the writeFormat to set
     */
    public void setWriteFormat(FormatStrategy writeFormat) {
        this.writeFormat = writeFormat;
    }
    
    
}
