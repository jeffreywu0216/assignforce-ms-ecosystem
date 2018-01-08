package com.revature.unavailableservice;

import com.revature.unavailableservice.dao.UnavailabilityRoomRepository;
import com.revature.unavailableservice.dao.UnavailabilityTrainerRepository;
import com.revature.unavailableservice.domain.UnavailabilityRoom;
import com.revature.unavailableservice.domain.UnavailabilityTrainer;
import com.revature.unavailableservice.service.UnavailabilityRoomService;
import com.revature.unavailableservice.service.UnavailabilityTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.List;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.revature.unavailableservice", "com.revature.assignforcecommon.security"},
        exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@EnableDiscoveryClient
public class AssignforceUnavailableMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignforceUnavailableMsApplication.class, args);
	}

	/*@Autowired
	UnavailabilityTrainerService trainerService;
	@Autowired
	UnavailabilityRoomService roomService;


	@Bean
	public CommandLineRunner demo(UnavailabilityTrainerRepository trainerRepo, UnavailabilityRoomRepository roomRepo) {
//		trainerService.saveItem(new UnavailabilityTrainer(1, "1022", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis())));
//		roomService.saveItem(new UnavailabilityRoom(1, 11, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis())));
		UnavailabilityTrainer uTrainer = new UnavailabilityTrainer();
		UnavailabilityRoom uRoom = new UnavailabilityRoom();
		uTrainer.setTrainerId("12345ab");
		uTrainer.setStartDate(new Timestamp(System.currentTimeMillis()));
		uTrainer.setEndDate(new Timestamp(System.currentTimeMillis()));
		trainerService.saveItem(uTrainer);
		uRoom.setRoomId(999);
		uRoom.setStartDate(new Timestamp(System.currentTimeMillis()));
		uRoom.setEndDate(new Timestamp(System.currentTimeMillis()));
		roomService.saveItem(uRoom);
		return (args) -> {
			// save a couple of customers
			List<UnavailabilityTrainer> trainers = trainerService.getAllItems();
			List<UnavailabilityRoom> rooms = roomService.getAllItems();
			for (UnavailabilityTrainer post : trainers) {
				System.out.println(post.toString());
			}
			for(UnavailabilityRoom room : rooms) {
				System.out.println(room.toString());
			}
		};

	}*/
}
