package fileprototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoType implements Cloneable {
    private int id;
    private String fileName;
    private Map<String, Integer> scores;

    public ProtoType(int id, String fileName, Map<String, Integer> scores) {
        this.id = id;
        this.fileName = fileName;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<String, Integer> scores) {
        this.scores = scores;
    }

    @Override
    public ProtoType clone()  {
        ProtoType protoType = null;
        try {
            protoType = (ProtoType)super.clone();
            protoType.scores = (Map<String, Integer>)((HashMap)this.scores).clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return protoType;
    }
}
