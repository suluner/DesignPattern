import fileprototype.FileProtoType;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    public static void main(String args[]) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("zhangsan", 99);
        FileProtoType fileProtoType = new FileProtoType(1, "fileA", scores);
        fileProtoType.show();

        FileProtoType fileProtoType1 = (FileProtoType) fileProtoType.clone();
        fileProtoType1.show();
    }
}
