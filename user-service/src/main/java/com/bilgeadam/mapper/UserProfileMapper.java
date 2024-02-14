package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.CreateUserRequestDto;
import com.bilgeadam.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserProfileMapper {

    UserProfileMapper INSTANCE = Mappers.getMapper(UserProfileMapper.class);
    UserProfile fromCreateRequestToUserProfile(final CreateUserRequestDto dto);

}
