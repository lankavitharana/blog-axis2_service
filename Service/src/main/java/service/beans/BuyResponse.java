package service.beans;

/**
 * Created by rajith on 1/8/14.
 */
public class BuyResponse {
    private String status;
    private double price;

    /**
     * get status of the buy response
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status of the buy response
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get price of the buy response
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * set price of the buy response
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
