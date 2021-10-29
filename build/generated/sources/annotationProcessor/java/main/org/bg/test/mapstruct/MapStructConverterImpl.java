package org.bg.test.mapstruct;

import javax.annotation.processing.Generated;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDt;
import org.mashov.bla.schema.data.entity.AgRecord;
import org.mashov.bla.schema.data.entity.AgRecord.Builder;
import org.mashov.bla.schema.data.entity.BgRecord;
import org.mashov.bla.schema.data.entity.BgUnion;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-29T18:15:05+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.jar, environment: Java 11.0.12 (Oracle Corporation)"
)
public class MapStructConverterImpl implements MapStructConverter {

    @Override
    public AgRecord sourceToDestination(BgRecord source) {
        if ( source == null ) {
            return null;
        }

        Builder agRecord = AgRecord.newBuilder();

        agRecord.setFirstT( source.getFirst() );
        agRecord.setSecondD( source.getSecond() );
        agRecord.setThirdT( source.getThird() );
        agRecord.setForthH( source.getForth() );

        return agRecord.build();
    }

    @Override
    public InitializeParametersDt initToUnion(BgUnion source) {
        if ( source == null ) {
            return null;
        }

        org.mashov.avro.services.bla.samples.structures.InitializeParametersDt.Builder initializeParametersDt = InitializeParametersDt.newBuilder();

        initializeParametersDt.setReportingSystemId( sourceSecondReportingSystemId( source ) );
        initializeParametersDt.setCallSign( sourceSecondCallSign( source ) );
        initializeParametersDt.setPrivateNetworkNumber( sourceSecondPrivateNetworkNumber( source ) );
        initializeParametersDt.setGlobalNetworkNumber( sourceSecondGlobalNetworkNumber( source ) );
        initializeParametersDt.setBlaBlaSecond( sourceSecondBlaBlaSecond( source ) );
        initializeParametersDt.setFormNumber( sourceSecondFormNumber( source ) );
        initializeParametersDt.setBlaBla( sourceSecondBlaBla( source ) );

        return initializeParametersDt.build();
    }

    private long sourceSecondReportingSystemId(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return 0L;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return 0L;
        }
        long reportingSystemId = second.getReportingSystemId();
        return reportingSystemId;
    }

    private String sourceSecondCallSign(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return null;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return null;
        }
        String callSign = second.getCallSign();
        if ( callSign == null ) {
            return null;
        }
        return callSign;
    }

    private long sourceSecondPrivateNetworkNumber(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return 0L;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return 0L;
        }
        long privateNetworkNumber = second.getPrivateNetworkNumber();
        return privateNetworkNumber;
    }

    private long sourceSecondGlobalNetworkNumber(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return 0L;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return 0L;
        }
        long globalNetworkNumber = second.getGlobalNetworkNumber();
        return globalNetworkNumber;
    }

    private Integer sourceSecondBlaBlaSecond(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return null;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return null;
        }
        Integer blaBlaSecond = second.getBlaBlaSecond();
        if ( blaBlaSecond == null ) {
            return null;
        }
        return blaBlaSecond;
    }

    private int sourceSecondFormNumber(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return 0;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return 0;
        }
        int formNumber = second.getFormNumber();
        return formNumber;
    }

    private Integer sourceSecondBlaBla(BgUnion bgUnion) {
        if ( bgUnion == null ) {
            return null;
        }
        InitializeParametersDt second = bgUnion.getSecond();
        if ( second == null ) {
            return null;
        }
        Integer blaBla = second.getBlaBla();
        if ( blaBla == null ) {
            return null;
        }
        return blaBla;
    }
}
