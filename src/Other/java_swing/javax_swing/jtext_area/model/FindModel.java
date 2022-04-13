package javax_swing.jtext_area.model;

public class FindModel {
    private String document, key, result;

    public FindModel() {
        this.document = "";
        this.key = "";
        this.result = "";
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void finding() {
        int count = 0;
        int index = 0;
        while (true) {
            int i = this.document.indexOf(this.key, index);
            if (i == -1) {
                break;
            } else {
                count++;
                index = i + 1;
            }
        }
        this.result = "Kết quả: có " + count + " " + this.key;
        System.out.println(result);
    }
}
