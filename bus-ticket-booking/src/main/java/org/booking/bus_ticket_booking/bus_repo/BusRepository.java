package org.booking.bus_ticket_booking.bus_repo;

import org.booking.bus_ticket_booking.bus_entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<BusEntity, Long> {

}
