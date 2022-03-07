package com.ead.repositories;

import com.ead.model.Reply;
import com.ead.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
