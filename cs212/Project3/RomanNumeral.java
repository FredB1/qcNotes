import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  private String numeral;
  private int num;
  private static final Map<String, Integer> ROMAN_TO_ARABIC = new HashMap<>();

  static {
    ROMAN_TO_ARABIC.put("I", 1);
    ROMAN_TO_ARABIC.put("V", 5);
    ROMAN_TO_ARABIC.put("X", 10);
    ROMAN_TO_ARABIC.put("L", 50);
    ROMAN_TO_ARABIC.put("C", 100);
    ROMAN_TO_ARABIC.put("D", 500);
    ROMAN_TO_ARABIC.put("M", 1000);
  }

  public RomanNumeral(String numeral) {
    validateRomanNumeral(numeral);
    this.numeral = numeral;
    this.num = convert(numeral);
  }

  private void validateRomanNumeral(String numeral) {
    for (int i = 0; i < numeral.length(); i++) {
      String c = String.valueOf(numeral.charAt(i));
      if (!ROMAN_TO_ARABIC.containsKey(c)) {
        throw new IllegalRomanNumeralException("Invalid character in Roman numeral: " + c);
      }
    }
  }

  private int convert(String numeral) {
    int total = 0;
    String[] temp = numeral.split("");
    int[] values = new int[temp.length];

    for (int i = 0; i < temp.length; i++) {
      values[i] = ROMAN_TO_ARABIC.get(temp[i]);
    }

    for (int i = 0; i < values.length; i++) {
      if (i < values.length - 1) {
        total = (values[i] >= values[i + 1]) ? total + values[i] : total - values[i];
      } else {
        total += values[i];
      }
    }
    return total;
  }

  public String getNumeral() {
    return this.numeral;
  }

  public void setNumeral(String s) {
    this.numeral = s;
    this.num = convert(s);
  }

  public int getNum() {
    return this.num;
  }

  public boolean equals(Object x) {
    if (x instanceof RomanNumeral) {
      RomanNumeral z = (RomanNumeral) x;
      return this.num == z.getNum();
    }
    return false;
  }

  public String toString() {
    return this.numeral;
  }

  public int compare(RomanNumeral x) {
    return Integer.compare(this.num, x.getNum());
  }
}
