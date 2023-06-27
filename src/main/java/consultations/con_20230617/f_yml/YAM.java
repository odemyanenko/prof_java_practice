package consultations.con_20230617.f_yml;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YAM {
  public static void main(String[] args) {
    Yaml yaml = new Yaml();
    InputStream inputStream = YAM.class
            .getClassLoader()
            .getResourceAsStream("application.yml");

    if (inputStream == null){
      System.out.println("Cannot find file");
      return;
    }

    try {
      Map<String, Object> obj = yaml.load(inputStream);
      System.out.println(obj);
    }
    catch (Exception e){
      System.out.println("Error parsing yaml: " + e.getMessage());
    }
  }
}
