package com.kartikvarma.mapper;

import com.kartikvarma.dto.HeadOfficeDTO;
import com.kartikvarma.entity.HeadOffice;
import com.kartikvarma.mapper.config.MapStructConfig;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class, uses = {UserMapper.class})
public interface HeadOfficeMapper {

    HeadOfficeDTO mapToDTO(HeadOffice headOffice);
}