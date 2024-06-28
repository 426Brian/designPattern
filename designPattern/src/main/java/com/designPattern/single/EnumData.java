package com.designPattern.single;

import lombok.Getter;

import java.util.Arrays;

/**
 * Classname: Test2
 * Pacage: com.designPattern.single
 * Discription:
 *
 * @Author: Brian
 * @Create: 2024/06/28-18:11
 * Version: v1.0
 */
@Getter
public enum EnumData {
    //    1. 举值
    SPRING("1", "春天"),
    SUMMER("2", "夏天"),
    AUTUMN("3", "秋天"),
    WINTER("4", "冬天");
    //    2. 构造
    private final String code;
    private final String msg;

    EnumData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //    3. 遍历
    public static EnumData getEnum(String code) {
        return Arrays.stream(EnumData.values())
                .filter(x -> x.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

}
