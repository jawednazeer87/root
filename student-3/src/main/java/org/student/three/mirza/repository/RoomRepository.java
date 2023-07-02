package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Room;

public interface RoomRepository  extends JpaRepository<Room, Long> {
		@Query("SELECT u FROM Room u WHERE u.hotelName = ?1")
			
		
		List <Room> findByHotelName(String hotelName);
			
		Room findByRoomId(int roomId);


}
