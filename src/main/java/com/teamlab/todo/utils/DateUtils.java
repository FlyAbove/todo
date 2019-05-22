package com.teamlab.todo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 日付関連ユーティリティ
 *
 * @author noda.
 */
public class DateUtils {
    /**
     * Date型をString型に変換する
     * @param date 日付
     * @return String
     */
    public static String dateToString(Date date) {
        if (Objects.isNull(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(date);
    }
}
