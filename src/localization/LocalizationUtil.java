package localization;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalizationUtil {
    public static void main(String[] args) {
        System.out.println(getBNdigit("520501521 augst"));
        System.out.println(getDigitEnglishFromBangla("১২৫৪ inter"));

        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.forLanguageTag("bn"));
        String format = numberInstance.format(12546.1225);
        System.out.println(format);


        Locale loc = Locale.forLanguageTag("bn");
        System.out.println(loc.getLanguage().equals("en"));



    }

    public static String getDigitBanglaFromEnglish(String number) {
        char[] banglaDigits = {'০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯'};

        if (number == null)
            return new String("");
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < number.length(); i++) {
                if (Character.isDigit(number.charAt(i))) {
                    if (((int) (number.charAt(i)) - 48) <= 9) {
                        builder.append(banglaDigits[(int) (number.charAt(i)) - 48]);
                    } else {
                        builder.append(number.charAt(i));
                    }
                } else {
                    builder.append(number.charAt(i));
                }
            }
        } catch (Exception e) {
            // logger.debug("getDigitBanglaFromEnglish: ",e);
            return new String("");
        }
        return builder.toString();
    }

    public static String getDigitEnglishFromBangla(String number) {
        Map banglaToEnglishDigitsMap = new HashMap();
        banglaToEnglishDigitsMap.put('০', '0');
        banglaToEnglishDigitsMap.put('১', '1');
        banglaToEnglishDigitsMap.put('২', '2');
        banglaToEnglishDigitsMap.put('৩', '3');
        banglaToEnglishDigitsMap.put('৪', '4');
        banglaToEnglishDigitsMap.put('৫', '5');
        banglaToEnglishDigitsMap.put('৬', '6');
        banglaToEnglishDigitsMap.put('৭', '7');
        banglaToEnglishDigitsMap.put('৮', '8');
        banglaToEnglishDigitsMap.put('৯', '9');

        if (number == null)
            return "";
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < number.length(); i++) {
                if (banglaToEnglishDigitsMap.containsKey(number.charAt(i))) {
                    builder.append(banglaToEnglishDigitsMap.get(number.charAt(i)));
                } else {
                    builder.append(number.charAt(i));
                }
            }
        } catch (Exception e) {
            return "";
        }
        return builder.toString();
    }


    public static String getBNdigit(String number) {
        Map banglaToEnglishDigitsMap = new HashMap();
        banglaToEnglishDigitsMap.put('0', '০');
        banglaToEnglishDigitsMap.put('1', '১');
        banglaToEnglishDigitsMap.put('2', '২');
        banglaToEnglishDigitsMap.put('3', '৩');
        banglaToEnglishDigitsMap.put('4', '৪');
        banglaToEnglishDigitsMap.put('5', '৫');
        banglaToEnglishDigitsMap.put('6', '৬');
        banglaToEnglishDigitsMap.put('7', '৭');
        banglaToEnglishDigitsMap.put('8', '৮');
        banglaToEnglishDigitsMap.put('9', '৯');

        if (number == null)
            return "";
        StringBuilder builder = new StringBuilder();
        try {
            for (int i = 0; i < number.length(); i++) {
                if (banglaToEnglishDigitsMap.containsKey(number.charAt(i))) {
                    builder.append(banglaToEnglishDigitsMap.get(number.charAt(i)));
                } else {
                    builder.append(number.charAt(i));
                }
            }
        } catch (Exception e) {
            return "";
        }
        return builder.toString();
    }
}
