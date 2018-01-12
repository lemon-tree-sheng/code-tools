package org.sheng.codetools.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author shengxingyue, created on 2018/1/12
 */
public class TimeFormat {

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * joda-time
     * <p>
     * 获取现在时间，格式：yyyy-MM-dd
     */
    public static String getDate() {
        return org.joda.time.LocalDate.now().toString(DEFAULT_DATE_FORMAT);
    }

    /**
     * java8
     * <p>
     * 获取现在时间，格式：yyyy-MM-dd
     *
     * @return
     */
    public static String getDateJava8() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT));
    }
}
