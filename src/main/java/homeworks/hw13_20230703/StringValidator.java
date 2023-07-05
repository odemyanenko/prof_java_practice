package homeworks.hw13_20230703;

import java.lang.reflect.Method;

public class StringValidator {

  @StringConstraint(minLength = 5, maxLength = 10)
  public boolean validateString(String str) {
    try {
      Method method = getClass().getMethod("validateString", String.class);
      StringConstraint annotation = method.getAnnotation(StringConstraint.class);
      return annotation.minLength() <= str.length() && annotation.maxLength() >= str.length();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
      return false;
    }
  }
}
