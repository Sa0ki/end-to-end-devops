package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.CreatorRequest;
import ma.xproce.inventoryservice.dtos.VideoRequest;
import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.repository.CreatorRepository;
import ma.xproce.inventoryservice.repository.VideoRepository;
import ma.xproce.inventoryservice.service.CreatorService;
import ma.xproce.inventoryservice.service.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorService creatorService;
    private VideoService videoService;

    public VideoGraphQlController(CreatorService creatorService, VideoService videoService) {
        this.creatorService = creatorService;
        this.videoService = videoService;
    }


    @QueryMapping
    public List<Video> videoList(){
        return videoService.videoList();
    }
    @QueryMapping
    public Creator creatorById(@Argument Long id){
        return creatorService.creatorById(id);
    }
    @MutationMapping
    public Creator saveCreator(@Argument CreatorRequest creatorRequest){
        return creatorService.saveCreator(creatorRequest);
    }
    @MutationMapping
    public Video saveVideo(@Argument VideoRequest videoRequest){
        return videoService.saveVideo(videoRequest);
    }

}
