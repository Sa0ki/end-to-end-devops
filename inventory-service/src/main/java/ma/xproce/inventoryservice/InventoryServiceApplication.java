package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.repository.CreatorRepository;
import ma.xproce.inventoryservice.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository){
		return args -> {
			Creator creator1 = Creator.builder()
					.name("John Doe")
					.email("john.doe@example.com")
					.build();

			Creator creator2 = Creator.builder()
					.name("Jane Smith")
					.email("jane.smith@example.com")
					.build();

			Video video1 = Video.builder()
					.name("Introduction to Spring Boot")
					.url("https://example.com/intro-spring-boot")
					.description("A brief introduction to Spring Boot")
					.datePublication(new Date())
					.creator(creator1)
					.build();

			Video video2 = Video.builder()
					.name("RESTful APIs with Spring")
					.url("https://example.com/restful-apis-spring")
					.description("Building RESTful APIs using Spring Framework")
					.datePublication(new Date())
					.creator(creator2)
					.build();

// Save entities using repositories
			creatorRepository.save(creator1);
			creatorRepository.save(creator2);
			videoRepository.save(video1);
			videoRepository.save(video2);
		};
	}


}
