public class RomanNumeral {

  private String numeral;
  private int num;
  private static final String[] ROMAN_NUMERALS = {
    "I",
    "V",
    "X",
    "L",
    "C",
    "D",
    "M",
  };
  private static final int[] ARABIC_NUMERALS = { 1, 5, 10, 50, 100, 500, 1000 };

  public RomanNumeral(String numeral) {
    this.numeral = numeral;
    this.num = convert(numeral);
  }

  private int convert(String numeral) {
    int total = 0;
    String[] temp = numeral.split("");
    int[] values = new int[temp.length];

    for (int i = 0; i < temp.length; i++) {
      for (int j = 0; j < ROMAN_NUMERALS.length; j++) {
        if (temp[i].equals(ROMAN_NUMERALS[j])) {
          values[i] = ARABIC_NUMERALS[j];
          break;
        }
      }
    }

    for (int i = 0; i < values.length; i++) {
      if (i < values.length - 1) {
        total =
          (values[i] >= values[i + 1]) ? total + values[i] : total - values[i];
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
