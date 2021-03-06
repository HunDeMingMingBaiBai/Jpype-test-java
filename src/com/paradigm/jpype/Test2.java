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

    public Map testMap2(Map param) {
        Map innerMap = (Map)param.get("map");
        List list = (List)param.get("list");
        ComplexObject object = (ComplexObject)param.get("object");
        System.out.println("java console map = " + param.toString());
        System.out.println("java console innerMap = " + innerMap.toString());
        System.out.println("java console list = " + list.toString());
        System.out.println("java console object = " + object.toString());
        Map result = new HashMap();
        Map innerMap2 = new HashMap();
        innerMap2.put("javaReturn", "javaReturnInnerMap");
        List newList = new ArrayList();
        newList.add(2);
        newList.add(4);
        newList.add(6);
        ComplexObject complexObject = new ComplexObject();
        complexObject.responseInit();
        result.put("map", innerMap2);
        result.put("list", newList);
        result.put("object", complexObject);
        return result;
    }

    public List testList2(List param) {
        Map innerMap = (Map)param.get(0);
        List innerList = (List)param.get(1);
        ComplexObject object = (ComplexObject)param.get(2);
        System.out.println("java console param = " + param.toString());
        System.out.println("java console innerMap = " + innerMap.toString());
        System.out.println("java console innerList = " + innerList.toString());
        System.out.println("java console object = " + object.toString());

        List result = new ArrayList();
        Map innerMap2 = new HashMap();
        innerMap2.put("javaReturn", "javaReturnInnerMap");
        List newList = new ArrayList();
        newList.add(2);
        newList.add(4);
        newList.add(6);
        ComplexObject complexObject = new ComplexObject();
        complexObject.responseInit();
        result.add(innerMap2);
        result.add(newList);
        result.add(complexObject);
        return result;
    }

    public Map testMap3(Map param) {
        System.out.println("java console param.size() = " + param.size());
        Map result = new HashMap();
        int num = 2;
        for (int i = 0; i < 10000; ++i) {
            result.put(num, num);
            num = num + 2;
        }
        return result;
    }


    public List testList3(List param){
        System.out.println("java console param.size() = " + param.size());
        List result = new ArrayList();
        int num = 2;
        for (int i = 0; i < 10000; ++i) {
            result.add(num);
            num = num + 2;
        }
        return result;
    }

    public Map testMap4(Map param){
        System.out.println("java console param.size() = " + param.size());
        Map result = new HashMap();
        int num = 2;
        for (int i = 0; i < 100; ++i) {
            ComplexObject object = new ComplexObject();
            object.responseInit();
            result.put(num, object);
            num = num + 2;
        }
        return result;
    }

    public List testList4(List param){
        System.out.println("java console param.size() = " + param.size());
        List result = new ArrayList();
        for (int i = 0; i < 100; ++i) {
            ComplexObject object = new ComplexObject();
            object.responseInit();
            result.add(object);
        }
        return result;
    }

}
