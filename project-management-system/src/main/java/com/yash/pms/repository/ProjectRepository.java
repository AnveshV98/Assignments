package com.yash.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.yash.pms.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

	//Project findProjectByIdentifier(String projectidentifier);
	Project findByProjectIdentifier(String projectIdentifier);
	public void deleteByProjectIdentifier(String projectIdentifier);

}
