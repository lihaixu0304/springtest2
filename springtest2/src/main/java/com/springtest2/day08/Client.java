package com.springtest2.day08;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:李海旭
 * Date : 2023/8/16 9:27
 */
public class Client {
    public static void main(String[] args) {
        String packName = "com.springtest2.day08";
        Map<String,Object> beanMap = new HashMap<>();
        //替换.为斜杠
        String path = packName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
             String className = packName + "."+ f.getName().split("\\.")[0];
             try {
                 Class<?> clazz = Class.forName(className);
                 if (clazz.isAnnotationPresent(Componet.class)){
                     Componet annotation = clazz.getAnnotation(Componet.class);
                     String beanId = annotation.value();
                     Object bean = clazz.newInstance();
                     beanMap.put(beanId,bean);

                 }
             }catch (Exception e){
                 e.printStackTrace();
             }
        });
        System.out.println(beanMap);
    }
}
