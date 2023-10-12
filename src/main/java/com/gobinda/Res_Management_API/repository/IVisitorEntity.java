package com.gobinda.Res_Management_API.repository;

import com.gobinda.Res_Management_API.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitorEntity extends JpaRepository<Visitor,Long> {
}