package com.yash.pms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.yash.pms.domain.Project;
import com.yash.pms.exceptions.ProjectIDException;
import com.yash.pms.repository.ProjectRepository;

@SpringBootTest
class ProjectServiceTest {

	@Mock
	ProjectRepository repository;
	
	@InjectMocks
	ProjectService service;
	
	@Test
    public void testGetAllProjects() {
        Project p1 =new Project(2,"EMS","EMS007","Employee Management System","2021-09-23","2021-09-30","2021-09-20","2021-10-02");
        Project p = new Project(1, "MMS", "MMS007", "Movies Management System", "2021-08-30", "2021-10-02","2021-09-29","2021-10-05");
    List<Project> list = new ArrayList<>();
    list.add(p);
    list.add(p1);

    when(service.getAllProjects()).thenReturn(list);
    assertEquals(2, service.getAllProjects().size());
    }
	
	@Test
	public void createProjectTest()
	{
	Project project = new Project(3,"HMS", "HMS221", "Hospital management system", "2020-12-1","2020-12-31", "2021-01-12", "2022-05-30");
	when(service.saveOrUpdateProject(project)).thenReturn(project);
	assertEquals(project, service.saveOrUpdateProject(project));
	}
	
	@Test
	public void  testGetProjectByIdentifier() throws ProjectIDException {
		
		Project project = new Project(3,"HMS", "HMS221", "Hospital management system", "2020-12-1","2020-12-31", "2021-01-12", "2022-05-30");
		when(repository.findByProjectIdentifier("HMS221")).thenReturn(project);
		assertEquals(project, service.getProjectByIdentifier("HMS221"));
	}
	
	@Test
	public void testDeleteProjectByIdentifier() throws ProjectIDException{
		Project project = new Project(3,"HMS", "HMS221", "Hospital management system", "2020-12-1","2020-12-31", "2021-01-12", "2022-05-30");
		when(repository.findByProjectIdentifier("HMS221")).thenReturn(project);
		//assertEquals(project, service.deleteProjectByIdentifier("HMS221"));
		
	
	}
	
	
}


