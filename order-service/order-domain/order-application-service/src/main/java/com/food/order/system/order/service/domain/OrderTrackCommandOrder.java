package com.food.order.system.order.service.domain;

import com.food.order.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.order.system.order.service.domain.dto.track.TrackOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderTrackCommandOrder {
    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        log.info("OrderTrackCommandOrder.trackOrder");
        return null;
    }
}
