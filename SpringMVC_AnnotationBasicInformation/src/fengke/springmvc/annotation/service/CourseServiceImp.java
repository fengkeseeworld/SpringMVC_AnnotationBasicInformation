/**
 * 
 */
package fengke.springmvc.annotation.service;

import org.springframework.stereotype.Service;

import fengke.springmvc.annotation.model.Course;

/**
 * @author ���
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
		course.setCname("����");
		course.setCteacher("���");
		return course;
	}

}
