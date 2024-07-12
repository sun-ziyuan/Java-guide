package org.ziyuan.uml.bidirectional;

/**
 * @author szy
 * @description
 * @date 2024/7/12 10:21
 */
public class Person {
    private IDCard idCard;
}
class IDCard {
    private Person person;
}