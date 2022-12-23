package sia.tacocloud.messaging;

import sia.tacocloud.TacoOrder;

public interface OrderReceiver {

    public TacoOrder receiveOrder();

}
