package com.cts.demo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.demo.application.entity.ApplicationEntity;


@Repository
public interface SubmitApplicationRepository extends JpaRepository<ApplicationEntity ,Long> {

}