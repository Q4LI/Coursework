package QScan;

import java.util.ArrayList;

public class Document {
    public enum DocStatus{
        IN_PROCESS,
        COMPLETED
    }
    public enum DocType{
        RECEPTION,
        SENDING,
        INVENTORY
    }

    private int id;
    private String name;
    private String date;
    private DocStatus status;
    private DocType type;
    private ArrayList<Product> productsList = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setStatus(DocStatus status) {
        this.status = status;
    }
    public void setType(DocType type) {
        this.type = type;
    }

    public void addProduct(Product product) {
        this.productsList.add(product);
    }
    public void clearProducts() {
        this.productsList.clear();
    }
    public void removeProduct(int index) {
        this.productsList.remove(index);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public DocStatus getStatus() {
        return status;
    }
    public DocType getType() {
        return type;
    }
    public ArrayList<Product> getProductsList() {
        return productsList;
    }
}
