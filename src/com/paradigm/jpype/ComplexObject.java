package com.paradigm.jpype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexObject {

    private Integer intValue;

    private Long longValue;

    private Double doubleValue;

    private String str;

    private List list;

    private Map map;

    private Data data;

    public void responseInit() {
        intValue = 2;
        longValue = 2L;
        doubleValue = 2.0;
        str = "hello 2";
        list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        map = new HashMap();
        map.put("int", 3);
        map.put("double", 3.0);
        map.put("str", "hello 3");
        data = new Data();
        data.setData("hello data 2");
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "intValue=" + intValue +
                ", longValue=" + longValue +
                ", doubleValue=" + doubleValue +
                ", str='" + str + '\'' +
                ", list=" + list.toString() +
                ", map=" + map.toString() +
                ", data=" + data +
                '}';
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
