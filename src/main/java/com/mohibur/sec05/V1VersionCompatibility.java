package com.mohibur.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.mohibur.models.sec05.v1.Television;
import com.mohibur.sec05.parser.V1Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V1VersionCompatibility {
    private static final Logger log = LoggerFactory.getLogger(V1VersionCompatibility.class);

    public static void main(String[] args) throws InvalidProtocolBufferException {
        var tv = Television.newBuilder()
                .setBrand("samsung")
                .setYear(2019)
                .build();

        V1Parser.parse(tv.toByteArray());
    }
}
