package sia.tacocloud.messaging;

import sia.tacocloud.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
