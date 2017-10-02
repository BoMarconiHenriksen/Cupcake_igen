package domain;

/**
 *
 * @author Bo Henriksen
 */
public class LineItem {
    
    private int invoiceId;
    private int pricePrCc;
    private int totalPrice;
    private int quantity;
    private String cupcakeName;

    public LineItem(int invoiceId, int pricePrCc, int totalPrice, int quantity) {
        this.invoiceId = invoiceId;
        this.pricePrCc = pricePrCc;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public LineItem(int invoiceId, int pricePrCc, int totalPrice, int quantity, String cupcakeName) {
        this.invoiceId = invoiceId;
        this.pricePrCc = pricePrCc;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.cupcakeName = cupcakeName;
    }

    public LineItem(int pricePrCc, int totalPrice, int quantity, String cupcakeName) {
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

    public int getPricePrCc() {
        return pricePrCc;
    }

    public void setPricePrCc(int pricePrCc) {
        this.pricePrCc = pricePrCc;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
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
