class Converter {
    String a1,a2,arab1,arab2;
    Roman_numerals roman_numerals1;
    Roman_numerals roman_numerals2;
    int result;
    String resultString = "";
    boolean rom;
    int arabValue[] = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String romValue[] = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    void convert() {
        roman_numerals1 = Roman_numerals.valueOf(a1.toUpperCase());
        arab1 = roman_numerals1.getRomNum();
        roman_numerals2 = Roman_numerals.valueOf(a2.toUpperCase());
        arab2 = roman_numerals2.getRomNum();
    }

    void convertOutputRom() {
        int i = -1;
        if (rom == true) {
            if (result <= 0) {
                resultString = "B римской системе нет отрицательных чисел.";
            } else {
                for (int item : arabValue) {
                    i++;
                    while (item <= result) {
                        resultString += romValue[i];
                        result -= item;
                    }
                }
                return;
            }
        } else {
            resultString = String.valueOf(result);
        }
    }
}