package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dtos.VideoRequest;
import ma.xproce.inventoryservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {
    public VideoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    private ModelMapper modelMapper;


    public VideoRequest convertToDTO(Video video){
        return modelMapper.map(video, VideoRequest.class);
    }

    public Video convertToEntity(VideoRequest videoRequest){
        return modelMapper.map(videoRequest, Video.class);
    }
}
