package org.bg.test.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDt;
import org.mashov.bla.schema.data.entity.AgRecord;
import org.mashov.bla.schema.data.entity.BgRecord;
import org.mashov.bla.schema.data.entity.BgUnion;

@Mapper
public interface MapStructConverter {
    @Mapping(source = "first", target = "firstT")
    @Mapping(source = "second", target = "secondD")
    @Mapping(source = "third", target = "thirdT")
    @Mapping(source = "forth", target = "forthH")
    AgRecord sourceToDestination(BgRecord source);

    @Mapping(source = "second.reportingSystemId", target = "reportingSystemId")
    @Mapping(source = "second.callSign", target = "callSign")
    @Mapping(source = "second.privateNetworkNumber", target = "privateNetworkNumber")
    @Mapping(source = "second.globalNetworkNumber", target = "globalNetworkNumber")
    @Mapping(source = "second.blaBlaSecond", target = "blaBlaSecond")
    @Mapping(source = "second.formNumber", target = "formNumber")
    @Mapping(source = "second.blaBla", target = "blaBla")
    InitializeParametersDt initToUnion(BgUnion source);
}