package com.walmart.stratiaf.graphql.apicappsgraphqldemo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.oembedler.moon.graphiql.boot.GraphiQLController;
import com.walmart.stratiaf.graphql.apicappsgraphqldemo.model.App;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Query implements GraphQLQueryResolver {


    public List<App> getAllApps(){

        App app1= new App();
        app1.setId("111");
        app1.setName("APIOne");

        App app2= new App();
        app2.setId("112");
        app2.setName("APTwo");

        List<App> appsList= new ArrayList<App>();

        appsList.add(app1);
        appsList.add(app2);
        return appsList;

    }

}
