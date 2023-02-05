package re.util;

import re.model.GeoPoint;
import re.model.Model;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utility {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0");

    public static final String RX ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
    public static final String RX4 ="^(?=.*\\d)(?=.*[A-Za-z]).{8,20}$";
    public static final String RX2 ="^(?=.\\\\d)(?=.[A-Za-z])[A-Za-z0-9]{6}$";

    public static final String BD_PHONE_REGEX = "^\\+?(88)?0?1[3456789][0-9]{8}\\b"; //+8801775236027 ||8801775236027 || 01775236027 || 1775236027



    public static String getDigitFormStr(String str){
        return str.replaceAll("\\D+","");
    }

    public static String getOtpDigitFromStr(String msg) {

        if (Objects.isNull(msg)) {
            return null;
        }
        Pattern otpPattern = Pattern.compile("(|^)\\d{4}");
        Matcher matcher = otpPattern.matcher(msg);
        if (matcher.find()) {
           return matcher.group(0);
        }
        return null;
    }

    private static String get10dPhoneNo(String phone) {

            boolean b = phone.startsWith("0");
            if(b){
                String substring = phone.substring(1);
                return substring;
            }

        return phone;
    }

    public static boolean isPassValid(String pas){
        Pattern pasRx = Pattern.compile(RX4);
        boolean matches = pasRx.matcher(pas).matches();
        if(matches){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPhoneValid(String phone){
        Pattern pasRx = Pattern.compile(BD_PHONE_REGEX);
        boolean matches = pasRx.matcher(phone).matches();
        if(matches){
            return true;
        }else {
            return false;
        }
    }

    public static Integer getIndexPosition(List<Model> sizeList, String id){
        OptionalInt optionalInt = IntStream.range(0, sizeList.size())
                .filter(i -> id.equals(sizeList.get(i).getId()))
                .findFirst();
        if(optionalInt.isPresent()){
            return optionalInt.getAsInt();
        }
        return null;
    }

    public static Integer getCellingNo(double xx){
        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
        return Integer.valueOf(decimalFormat.format(xx));
    }

    public static Double getSumOfLatOrLng(boolean isLat,List<GeoPoint> geoPointList){
        if(isLat){
            List<Double> listOfLatitude = geoPointList.stream().map(g -> g.getLatitude()).collect(Collectors.toList());
            return listOfLatitude.stream().reduce(0.0,Double::sum);
        }else {
            List<Double> listOfLongitude = geoPointList.stream().map(g -> g.getLongitude()).collect(Collectors.toList());
            return listOfLongitude.stream().reduce(0.0,Double::sum);
        }
    }

}