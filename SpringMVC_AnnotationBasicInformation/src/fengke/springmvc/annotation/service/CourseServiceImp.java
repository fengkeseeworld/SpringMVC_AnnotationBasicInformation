/**
 * 
 */
package fengke.springmvc.annotation.service;

import org.springframework.stereotype.Service;

import fengke.springmvc.annotation.model.Course;

/**
 * @author 锋客
 *
 */
@Service("courseService")
public class CourseServiceImp implements CourseService {

	/* (non-Javadoc)
	 * @see fengke.springmvc.annotation.service.CourseService#getCoursebyId(int)
	 */
	@Override
	public Course getCoursebyId(int cid) {
		Course course=new Course();
		course.setCid(1);
		course.setCname("语文");
		course.setCteacher("李光");
		return course;
	}

}
