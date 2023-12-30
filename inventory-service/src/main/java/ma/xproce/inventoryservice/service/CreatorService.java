package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.CreatorRequest;
import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.mappers.CreatorMapper;
import ma.xproce.inventoryservice.repository.CreatorRepository;
import org.springframework.stereotype.Component;

@Component
public class CreatorService {
    private final CreatorMapper creatorMapper;
    private CreatorRepository creatorRepository;

    public CreatorService(CreatorMapper creatorMapper) {
        this.creatorMapper = creatorMapper;
    }
    public Creator saveCreator(CreatorRequest creatorRequest){
        return creatorRepository.save(creatorMapper.convertToEntity(creatorRequest));
    }
    public Creator creatorById(Long id){
        return creatorRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }
}
