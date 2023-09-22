package com.kartikvarma.mapper.config;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.SubclassExhaustiveStrategy;

@MapperConfig(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        subclassExhaustiveStrategy = SubclassExhaustiveStrategy.RUNTIME_EXCEPTION
)
public interface MapStructConfig {
}
