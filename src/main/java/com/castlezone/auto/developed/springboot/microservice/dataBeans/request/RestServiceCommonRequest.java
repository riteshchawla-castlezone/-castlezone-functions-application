package com.castlezone.auto.developed.springboot.microservice.dataBeans.request;

@Data
public class RestServiceCommonRequest {

    private StringBean dataString = new StringBean();

    private DecimalBean dataDecimal = new DecimalBean();

    private LongBean dataLong = new LongBean();

    private IntegerBean dataInteger = new IntegerBean();

    private BooleanBean dataBoolean = new BooleanBean();

}
