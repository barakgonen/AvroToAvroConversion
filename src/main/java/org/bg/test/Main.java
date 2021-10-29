package org.bg.test;

import com.googlecode.jmapper.JMapper;
import org.bg.test.mapstruct.MapStructConverter;
import org.bg.test.mapstruct.MapStructConverterImpl;
import org.mashov.avro.services.bla.samples.structures.InitializeParametersDt;
import org.mashov.bla.schema.data.entity.AgRecord;
import org.mashov.bla.schema.data.entity.BgRecord;
import org.mashov.bla.schema.data.entity.BgUnion;

import java.util.Random;

public class Main {
    public static final MapStructConverter converter = new MapStructConverterImpl();
    public static final int leftLimit = 97; // letter 'a'
    public static final int rightLimit = 122; // letter 'z'
    public static final int targetStringLength = 10;
    public static final Random random = new Random();
    public static String generateStringInGivenLength(int length) {
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static int generateInt() {
        return (int) ((Math.random() * (10000 - 0)) + 0);
    }
    public static void main(String[] args) {
        //        JMapper<AgRecord, BgRecord> userMapper = new JMapper<>
//                (AgRecord.class, BgRecord.class,"user_jmapper.xml");
//
//        AgRecord result = userMapper.getDestination(bg);
        for (int i = 0; i < 1000000; i++) {
            BgRecord bg = BgRecord.newBuilder()
                    .setFirst(generateStringInGivenLength(7))
                    .setSecond(generateStringInGivenLength(6))
                    .setThird(generateStringInGivenLength(8))
                    .setForth(generateStringInGivenLength(2))
                    .build();

            InitializeParametersDt initializeParametersDt = InitializeParametersDt.newBuilder()
                    .setBlaBla(generateInt())
                    .setBlaBlaSecond(generateInt())
                    .setFormNumber(generateInt())
                    .setGlobalNetworkNumber(generateInt())
                    .setCallSign(generateStringInGivenLength(79))
                    .setPrivateNetworkNumber(generateInt())
                    .setReportingSystemId(generateInt())
                    .build();

            BgUnion union = BgUnion.newBuilder().setFirst(bg).setSecond(initializeParametersDt).build();

            long startMilli = System.currentTimeMillis();
//            long startNano = System.nanoTime();
            AgRecord agResult = converter.sourceToDestination(bg);
            InitializeParametersDt converted = converter.initToUnion(union);
            if (!converted.equals(initializeParametersDt)){
                System.out.println("ERROR!!");
                System.exit(-1);
            }

            long endMilli = System.currentTimeMillis();
//            long endNano = System.nanoTime();
            System.out.println("time: " + i + ", took: " + (endMilli - startMilli));
        }
    }
}
