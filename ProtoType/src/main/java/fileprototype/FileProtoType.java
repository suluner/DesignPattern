package fileprototype;

import java.util.Map;

public class FileProtoType extends ProtoType{
    public FileProtoType(int id, String fileName, Map<String, Integer> scores) {
        super(id, fileName, scores);
    }
    public void show (){
        System.out.println("File id:" + this.getId());
        System.out.println("File name:" + this.getFileName());
        System.out.println("File scores:" + this.getScores());
    }
}