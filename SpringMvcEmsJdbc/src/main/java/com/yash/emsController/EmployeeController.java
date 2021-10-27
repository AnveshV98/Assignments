package com.yash.emsController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.emsDao.EmployeeDao;
import com.yash.emsDaoImpl.EmployeeDaoImpl;
import com.yash.model.Employee;

@Controller
public class EmployeeController {
	
//	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(value="view", method=RequestMethod.GET)
	public ModelAndView listEmployee(ModelAndView model) throws IOException, ClassNotFoundException, SQLException {
        List<Employee> listEmployee = employeeDao.getAllEmployees();
        model.addObject("listEmployee", listEmployee);
        model.setViewName("result.jsp");
        return model;
    }
}
