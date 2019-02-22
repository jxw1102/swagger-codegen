package io.swagger.codegen;

public class ContentFile {

    public String content;
    public String folder;
    public String destinationFilename;

    public ContentFile(String content, String folder, String destinationFilename) {
        this.content = content;
        this.folder = folder;
        this.destinationFilename = destinationFilename;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SupportingFile:").append("\n");
        builder.append("\tfolder: ").append(folder).append("\n");
        builder.append("\tdestinationFilename: ").append(destinationFilename).append("\n");

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentFile that = (ContentFile) o;

        if (content != null ? !content.equals(that.content) : that.content != null)
            return false;
        if (folder != null ? !folder.equals(that.folder) : that.folder != null)
            return false;
        return destinationFilename != null ? destinationFilename.equals(that.destinationFilename) : that.destinationFilename == null;

    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (folder != null ? folder.hashCode() : 0);
        result = 31 * result + (destinationFilename != null ? destinationFilename.hashCode() : 0);
        return result;
    }
}
