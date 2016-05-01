package com.sgrillon;

public class Flags {

    private final long id;
    private final String content;

    public Flags(long id, String content) {
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
