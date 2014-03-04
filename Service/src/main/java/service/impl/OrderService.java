package service.impl;

import service.beans.*;
import org.apache.log4j.Logger;

/**
 * Created by rajith on 1/7/14.
 */
public class OrderService {
    public static Logger logger = Logger.getLogger(OrderService.class);

    public BuyResponse buyProduct(int requestType, String productName, int quantity) {
        logger.info("OrderService::buyProduct --> process invoked, requestType - " + requestType + " productName - " + productName + " quantity - " + quantity);
        //what ever u need to do with the data anc create the return object


        BuyResponse response = new BuyResponse();
        response.setStatus("success");
        response.setPrice(45);

        return response;
    }


}
