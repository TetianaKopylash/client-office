package ua.com.tsa.data.service;

import ua.com.tsa.data.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface User1Repository extends JpaRepository<User1, Long>, JpaSpecificationExecutor<User1> {

}
