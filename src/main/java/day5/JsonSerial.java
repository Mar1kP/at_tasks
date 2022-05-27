package day5;

import day4.reflection.MyCustomClass;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class JsonSerial {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("field1", "value1");
        System.out.println(jsonObject);

        ObjectMapper objectMapper = new ObjectMapper();
        MyCustomClass object = null;
        try {
            object = objectMapper.readValue(jsonObject.toString(), MyCustomClass.class);
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
        System.out.println(object);

        object.setField3(111);
        JSONObject jsonObject2 = new JSONObject(object);
        System.out.println(jsonObject2);

        File file1 = new File("tmp.json");
        try {
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(jsonObject2.toString());
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("IOException");
        }

        try {
            String content = Files.readString(Path.of(file1.getPath()));
            System.out.println(new JSONObject(content));
        }
        catch (IOException e) {
            System.out.println("IOException");
        }

        jsonObject2.put("arrayfield", new JSONArray());
        jsonObject2.getJSONArray("arrayfield").put(new JSONObject("{\"field4\":\"222\"}"));
        System.out.println(jsonObject2);

    }
}
