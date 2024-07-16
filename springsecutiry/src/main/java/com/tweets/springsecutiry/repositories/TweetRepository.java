package com.tweets.springsecutiry.repositories;

import com.tweets.springsecutiry.models.TweetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long> {
}
