package fr.younes.cloud.demo.repository;

import fr.younes.cloud.demo.model.SuperHero;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SuperHeroRepository extends MongoRepository<SuperHero, String> {

}
