package com.example.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HRMS.entities.concretes.SystemJobPosition;

public interface SystemJobPositionDao  extends JpaRepository<SystemJobPosition, Integer>
{

}
