package com.digifreneur.logiman.backendsvc.repository;

import com.digifreneur.logiman.backendsvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
