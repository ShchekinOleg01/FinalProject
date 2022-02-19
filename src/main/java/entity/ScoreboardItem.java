package entity;

public class ScoreboardItem {
    private String content;

    public ScoreboardItem(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TabloItem{" +
                "content='" + content + '\'' +
                '}';
    }
}
