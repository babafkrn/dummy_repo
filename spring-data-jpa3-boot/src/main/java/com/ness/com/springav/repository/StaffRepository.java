/**
 * 
 */
package com.ness.com.springav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ness.com.springav.model.Staff;

/**
 * @author localadmin
 *
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
