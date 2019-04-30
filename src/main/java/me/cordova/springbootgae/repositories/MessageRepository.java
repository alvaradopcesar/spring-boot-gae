package me.cordova.springbootgae.repositories;

import me.cordova.springbootgae.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
