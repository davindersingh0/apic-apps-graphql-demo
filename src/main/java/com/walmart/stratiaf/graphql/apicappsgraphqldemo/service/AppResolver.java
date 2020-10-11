package com.walmart.stratiaf.graphql.apicappsgraphqldemo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.walmart.stratiaf.graphql.apicappsgraphqldemo.model.App;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AppResolver implements GraphQLQueryResolver {

    public App getAppById(String id){

        App app1= new App();
        app1.setId("111");
        app1.setName("APIOne");

        App app2= new App();
        app2.setId("112");
        app2.setName("APTwo");

        Map<String, App> appsMap= new HashMap<String,App>();
        appsMap.put("111",app1);
        appsMap.put("112",app2);
        //return appsMap.get(environment.getArgument("id"));
        return appsMap.get(id);

    }
}
