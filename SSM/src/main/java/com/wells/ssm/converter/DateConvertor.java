package com.wells.ssm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        try {
            Date parse = sf.parse(source);
            return parse;
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }
}
