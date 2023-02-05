package map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapUtil {
    public static boolean FLAG;

    public static Map<String, String> getMapFromList(List<DropDownData> data) {
        return data.stream().collect(Collectors.toUnmodifiableMap(DropDownData::getTitle, DropDownData::getId));
    }

    public static class DropDownData {
        private String id;
        private String title;

        private String titleBn = "bn";

        public DropDownData(String id, String title) {
            this.id = id;
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
           return titleBn;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
