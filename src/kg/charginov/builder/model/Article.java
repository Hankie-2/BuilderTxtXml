package kg.charginov.builder.model;

import java.util.List;

public class Article {

    private String title;

    private List<String> authors;

    private String text;

    private int hash;

    private FileType type;

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", text='" + text + '\'' +
                ", hash=" + hash +
                ", type=" + type +
                '}';
    }
}
