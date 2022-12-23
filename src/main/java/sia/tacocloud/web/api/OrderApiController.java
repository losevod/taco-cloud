package sia.tacocloud.web.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sia.tacocloud.TacoOrder;
import sia.tacocloud.data.OrderRepository;
import sia.tacocloud.messaging.KafkaOrderMessagingService;

@RestController
@RequestMapping(path = "/api/orders", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class OrderApiController {

    private OrderRepository orderRepo;

    public OrderApiController(
            OrderRepository orderRepo,
            KafkaOrderMessagingService messageService
    ) {
        this.orderRepo = orderRepo;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TacoOrder postOrder(@RequestBody TacoOrder order) {
        return orderRepo.save(order);
    }

}
