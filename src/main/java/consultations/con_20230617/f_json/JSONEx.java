package consultations.con_20230617.f_json;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class JSONEx {
  public static void main(String[] args) {
    try {
      InputStream inputStream = JSONEx.class.getResourceAsStream("/ex.json");
      assert inputStream != null;
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

      StringBuilder stringBuilder = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        stringBuilder.append(line);
      }

      JSONObject json = new JSONObject(stringBuilder.toString());
      Map<String, Object> map = json.toMap();

      for (String key : map.keySet()) {
        System.out.println(key + " : " + map.get(key));
      }

    } catch (IOException e) {
      System.out.println("Error reading or parsing JSON: " + e.getMessage());
    }
  }
}
