package com.food.order.system.order.service.domain.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
public class TrackOrderQuery {
    @NotNull
    private final UUID orderTrackingId;
}
