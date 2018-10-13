package com.projectSinatra.repository;
import org.springframework.data.repository.CrudRepository;
import com.projectSinatra.domain.Message;

import java.util.List;

public interface MessageRepos extends  CrudRepository<Message,Long>{
    List<Message> findByTag(String tag);
}
