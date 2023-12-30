package ma.xproce.inventoryservice.repository;

import ma.xproce.inventoryservice.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
