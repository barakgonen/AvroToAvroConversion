package org.bg.test;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import org.bg.test.jmapper.BgToAgConverter;
import org.mashov.bla.schema.data.entity.AgRecord;
import org.mashov.bla.schema.data.entity.BgRecord;

import static com.googlecode.jmapper.api.JMapperAPI.attribute;
import static com.googlecode.jmapper.api.JMapperAPI.mappedClass;

public class Main {
    public static void main(String[] args) {
        BgRecord bg = BgRecord.newBuilder()
                        .setFirst("FIRST")
                        .setSecond("SECOND")
                        .setThird("THIRD")
                        .setForth("FORTH")
                        .build();

        JMapper<AgRecord, BgRecord> userMapper = new JMapper<>
                (AgRecord.class, BgRecord.class,"user_jmapper.xml");

        AgRecord result = userMapper.getDestination(bg);

        System.out.println("Ag is: " + result);
    }
}
