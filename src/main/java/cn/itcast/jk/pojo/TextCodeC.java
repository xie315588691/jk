package cn.itcast.jk.pojo;

public class TextCodeC {
    private String textCodeId;

    private String classCodeId;

    private String name;

    public String getTextCodeId() {
        return textCodeId;
    }

    public void setTextCodeId(String textCodeId) {
        this.textCodeId = textCodeId == null ? null : textCodeId.trim();
    }

    public String getClassCodeId() {
        return classCodeId;
    }

    public void setClassCodeId(String classCodeId) {
        this.classCodeId = classCodeId == null ? null : classCodeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}