package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dtos.CreatorRequest;
import ma.xproce.inventoryservice.entities.Creator;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    public CreatorMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    private ModelMapper modelMapper;

    public CreatorRequest convertToDTO(Creator creator){
        return modelMapper.map(creator, CreatorRequest.class);
    }

    public Creator convertToEntity(CreatorRequest creatorRequest){
        return modelMapper.map(creatorRequest, Creator.class);
    }
}
