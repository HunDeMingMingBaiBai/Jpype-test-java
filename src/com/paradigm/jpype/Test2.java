package com.paradigm.jpype;

import java.util.*;

public class Test2 {

    public Map testMap(Map map){
        Map result = new HashMap();
        Integer intValue = (Integer)map.get("int");
        Double doubleValue = (Double)map.get("double");
        String strValue = (String)map.get("str");
        List list = (List)map.get("list");
        Data data = (Data) map.get("data");

        System.out.println("java console intValue = " + intValue);
        System.out.println("java console doubleValue = " + doubleValue);
        System.out.println("java console list = " + Arrays.toString(list.toArray()));
        System.out.println("java console strValue = " + strValue);
        System.out.println("java console data = " + data);

        result.put("int", 2);
        result.put("double", 2.0);
        List newList = new ArrayList();
        newList.add(2);
        newList.add(4);
        newList.add(6);
        result.put("list", newList);
        result.put("str", "hello2");
        Data newData = new Data();
        newData.setData("hello data 2");
        result.put("data", newData);
        return result;
    }

    public List testList(List list) {
        List result = new ArrayList();
        Integer intValue = (Integer) list.get(0);
        Double doubleValue = (Double) list.get(1);
        String strValue = (String) list.get(2);
        List listInParam = (List) list.get(3);
        Map map = (Map) list.get(4);
        Data data = (Data) list.get(5);

        System.out.println("java console intValue = " + intValue);
        System.out.println("java console doubleValue = " + doubleValue);
        System.out.println("java console list = " + Arrays.toString(listInParam.toArray()));
        System.out.println("java console strValue = " + strValue);
        System.out.println("java console map = " + map.toString());
        System.out.println("java console data = " + data);

        Data newData = new Data();
        newData.setData("hello data 2");
        Data newNewData = new Data();
        newNewData.setData("hello data 3");

        result.add(2);
        result.add(2.0);
        result.add("hello 2");
        List newList = new ArrayList();
        newList.add(2);
        newList.add(4);
        newList.add(6);
        result.add(newList);
        Map newMap = new HashMap();
        newMap.put("int", 3);
        newMap.put("double", 3.0);
        newMap.put("str", "hello 3");
        newMap.put("newNewData", newNewData);
        result.add(newMap);
        result.add(newData);

        return result;
    }

    public ComplexObject testComplexObject(ComplexObject param) {
        System.out.println("java console intValue = " + param.getIntValue());
        System.out.println("java console longValue = " + param.getLongValue());
        System.out.println("java console doubleValue = " + param.getDoubleValue());
        System.out.println("java console strValue = " + param.getStr());
        System.out.println("java console list = " + param.getList().toString());
        System.out.println("java console map = " + param.getMap().toString());
        System.out.println("java console data = " + param.getData().toString());
        ComplexObject result = new ComplexObject();
        result.responseInit();
        return result;
    }

}
