package attachment;

public class Attach {
    private String attachmentTypeId;
    private String attachmentLink;
    transient private String fileName;

    public Attach(String attachmentTypeId, String attachmentLink, String fileName) {
        this.attachmentTypeId = attachmentTypeId;
        this.attachmentLink = attachmentLink;
        this.fileName = fileName;
    }

    public String getAttachmentTypeId() {
        return attachmentTypeId;
    }

    public String getAttachmentLink() {
        return attachmentLink;
    }

    public String getFileName() {
        return fileName;
    }

    public void setAttachmentTypeId(String attachmentTypeId) {
        this.attachmentTypeId = attachmentTypeId;
    }

    public void setAttachmentLink(String attachmentLink) {
        this.attachmentLink = attachmentLink;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Attach{" +
                "attachmentTypeId='" + attachmentTypeId + '\'' +
                ", attachmentLink='" + attachmentLink + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
