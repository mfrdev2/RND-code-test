import map.MapUtil;
import re.util.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Integer cellingNo = Utility.getCellingNo(12.1);
        System.out.println(cellingNo);

        List<MapUtil.DropDownData> dataList = new ArrayList<>();
        MapUtil.DropDownData dropDownData = new MapUtil.DropDownData("xAcsflksffjsl", "Dha");
        dataList.add(dropDownData);

        MapUtil.DropDownData dropDownData1 = new MapUtil.DropDownData("xAcsflksffjsl", "Dha");
       // dataList.add(dropDownData1);

        Map mapFromList = MapUtil.getMapFromList(dataList);


        Object dhaka = mapFromList.get("bn");

        System.out.println(dhaka);


    }
}