package domain;

/**
 *
 * @author Bo Henriksen
 */
public class LineItem {
    
    private int invoiceId;
    private double pricePrCc;
    private double totalPrice;
    private int quantity;
    private String cupcakeName;

    public LineItem(int invoiceId, double pricePrCc, double totalPrice, int quantity) {
        this.invoiceId = invoiceId;
        this.pricePrCc = pricePrCc;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public LineItem(int invoiceId, double pricePrCc, double totalPrice, int quantity, String cupcakeName) {
        this.invoiceId = invoiceId;
        this.pricePrCc = pricePrCc;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.cupcakeName = cupcakeName;
    }

    public LineItem(int quantity, String cupcakeName, double pricePrCc, double totalPrice ) {
        this.pricePrCc = pricePrCc;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.cupcakeName = cupcakeName;
    }
    
    
    
    
    public LineItem(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public LineItem(String cupcakeName) {
        this.cupcakeName = cupcakeName;
    }
    
    public LineItem () {
        
    }

    public double getPricePrCc() {
        return pricePrCc;
    }

    public void setPricePrCc(double pricePrCc) {
        this.pricePrCc = pricePrCc;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCupcakeName() {
        return cupcakeName;
    }

    public void setCupcakeName(String cupcakeName) {
        this.cupcakeName = cupcakeName;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public String toString() {
        return "InfoToAdmin{" + "invoiceId=" + invoiceId + ", pricePrCc=" + pricePrCc + ", totalPrice=" + totalPrice + ", quantity=" + quantity + ", cupcakeName=" + cupcakeName + '}';
    }

}
