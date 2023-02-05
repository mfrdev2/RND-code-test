package attachment;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AthMain {
    public static void main(String[] args) {
        List<Attach> attaches = getAttachList();

        System.out.println(getAlreadyUploadedFile(attaches, "12"));
        System.out.println();

    }

    private static List<Attach> getAttachList() {
        return Arrays.asList(
                new Attach("1245", "http://x", "photo"),
                new Attach("1246", "http://y", "pdf"),
                new Attach("1247", "http://z", "doc")
        );
    }

    public static Attach getAlreadyUploadedFile(List<Attach> attachmentList, String attachmentTypeId) {
        if (attachmentList == null || attachmentList.isEmpty()) {
            return null;
        }
        return attachmentList.stream().filter(f ->
                        Objects.equals(f.getAttachmentTypeId(), attachmentTypeId))
                .findAny().orElse(null);
    }


}
