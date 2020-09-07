package behavioural.command.example1;

import java.util.ArrayList;
import java.util.List;
/*
* This is the Invoker Class
* Command interface member variable (Ex: ordersList) which can be a list also.
* Method to set the Concrete Implementation of the Command (Ex: addNewOrder())
* Method to execute the command (Ex: placeAllOrders())
 */


public class StockBroker {
    private List<OrderCommand> ordersList = new ArrayList<>();
    public void addNewOrder(OrderCommand order){
        ordersList.add(order);
    }

    public void placeAllOrders(){
        for(OrderCommand order: ordersList){
            order.execute();
        }
        ordersList.clear();
    }
}
