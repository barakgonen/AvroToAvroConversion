package org.bg.test.jmapper;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import org.bg.test.Converter;
import org.mashov.bla.schema.data.entity.AgRecord;
import org.mashov.bla.schema.data.entity.BgRecord;

public class BgToAgConverter {
    private static JMapper realLifeMapper;
    private static JMapper simpleMapper;
    private static BgToAgConverter instance = null;
    private BgToAgConverter() {
        JMapperAPI api = new JMapperAPI().add(JMapperAPI.mappedClass(BgRecord.class));
        realLifeMapper = new JMapper(BgRecord.class, BgRecord.class, api);
        JMapperAPI simpleApi = new JMapperAPI().add(JMapperAPI.mappedClass(AgRecord.class));
        simpleMapper = new JMapper(AgRecord.class, BgRecord.class, simpleApi);
    }

    public static BgToAgConverter getInstance() {
        if (instance == null)
            instance = new BgToAgConverter();
        return instance;
    }
//    @Override
//    public Order convert(SourceOrder sourceOrder) {
//        return (Order) realLifeMapper.getDestination(sourceOrder);
//    }
//
//    @Override
//    public DestinationCode convert(SourceCode sourceCode) {
//        return (DestinationCode) simpleMapper.getDestination(sourceCode);
//    }
    public AgRecord convert(BgRecord sourceOrder) {
        return (AgRecord) simpleMapper.getDestination(sourceOrder);
    }
}
