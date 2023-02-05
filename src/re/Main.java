package re;

import re.model.GeoPoint;
import re.model.Model;
import re.model.Password;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static re.util.Utility.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //  String dPhoneNo = get10dPhoneNo(null);
        //   System.out.println(dPhoneNo);

        System.out.println("====================");
        //  System.out.println(isPassValid(null));
        System.out.println(isPhoneValid("+8801775236027"));
        System.out.println(isPhoneValid("8801775236027"));
        System.out.println(isPhoneValid("1775236027"));
        System.out.println(isPhoneValid("01628282828"));

        System.out.println("===========================");

        List<Model> models = Arrays.asList(
                new Model("a"), new Model("b"), new Model("d")
        );
        Integer anInt = getIndexPosition(models, "a");
        System.out.println(anInt);

        System.out.println("------------------ otp --------------------------");
        String msg = "Your otp is 6183. Gas Monkey Team";
        String floor = "99 ";
        System.out.println(getOtpDigitFromStr(msg));
        System.out.println(getDigitFormStr(floor));
     /*   Double a = 10.00;
        boolean b = (a > 0.0);
        System.out.println(b);*/
        System.out.println();
        System.out.println("==========================Celling Number=============================");
        System.out.println();
        System.out.println(getCellingNo(109.9));

        System.out.println();
        System.out.println();
        System.out.println("===========================sumOfDouble=======================================");

        Double sumOfLatOrLng = getSumOfLatOrLng(false, Arrays.asList(
                new GeoPoint(1, 1),
                new GeoPoint(2, 2),
                new GeoPoint(3, 3),
                new GeoPoint(4, 4),
                new GeoPoint(5, 6)
        ));
        System.out.println("sumOfLatOrLng::  "+sumOfLatOrLng);

        System.out.println();
        System.out.println();

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        Password.randomString(6);
    }
}
