package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.VideoRequest;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.mappers.VideoMapper;
import ma.xproce.inventoryservice.repository.VideoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoService {
    private VideoMapper videoMapper;
    private VideoRepository videoRepository;

    public VideoService(VideoMapper videoMapper, VideoRepository videoRepository) {
        this.videoMapper = videoMapper;
        this.videoRepository = videoRepository;
    }


    public Video saveVideo(VideoRequest videoRequest){
        return videoRepository.save(videoMapper.convertToEntity(videoRequest));
    }

    public List<Video> videoList(){
        return videoRepository.findAll();
    }
}
