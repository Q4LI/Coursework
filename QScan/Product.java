package QScan;

public class Product {
    private int id;
    private String name;
    private String code;

    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public int getId() {
        return id;
    }
}
