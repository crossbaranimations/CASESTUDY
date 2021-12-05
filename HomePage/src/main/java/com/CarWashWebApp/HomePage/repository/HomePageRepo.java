package com.CarWashWebApp.HomePage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CarWashWebApp.HomePage.model.HomePageModel;

public interface HomePageRepo extends MongoRepository<HomePageModel, Integer>{

}
