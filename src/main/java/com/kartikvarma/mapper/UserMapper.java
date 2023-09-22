package com.kartikvarma.mapper;

import com.kartikvarma.dto.ContractorDTO;
import com.kartikvarma.dto.EmployeeDTO;
import com.kartikvarma.dto.UserDTO;
import com.kartikvarma.entity.Contractor;
import com.kartikvarma.entity.Employee;
import com.kartikvarma.entity.User;
import com.kartikvarma.mapper.config.MapStructConfig;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassMapping;

import java.util.List;


@Mapper(config = MapStructConfig.class)
public interface UserMapper {

    @BeanMapping(ignoreByDefault = true)
    @SubclassMapping(source = Employee.class, target = EmployeeDTO.class)
    @SubclassMapping(source = Contractor.class, target = ContractorDTO.class)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    UserDTO map(User user);

    EmployeeDTO mapEmployee(Employee user);

    ContractorDTO mapContractor(Contractor user);

    List<UserDTO> mapUsers(List<User> users);


}
