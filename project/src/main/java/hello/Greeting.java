package hello;

public class flags {

    private final long id;
    private final String content;

    public flags(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
