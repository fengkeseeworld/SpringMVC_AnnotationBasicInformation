/**
 * 
 */
package fengke.springmvc.annotation.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fengke.springmvc.annotation.model.Course;
import fengke.springmvc.annotation.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	/**
	 * @param cid
	 * @param model
	 * @return
	 * url形式，查询字符串
	 * 通过注解设置访问的路径：http://127.0.0.1:8080/SpringMVC_AnnotationBasicInformation/courses/view？cid=1
	 * 设置访问的方式为get
	 */
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("cid")int cid,Model model){
		Course course=courseService.getCoursebyId(1);
		model.addAttribute("infor",course.getCname());
		System.out.println("执行了");
		return "courser_overview";
	}
	/**
	 * 
	 * @param cid
	 * @param model
	 * @return
	 * rest风格的url
	 * 设置访问路径：http://127.0.0.1:8080/SpringMVC_AnnotationBasicInformation/courses/view2/345
	 * 
	 */
	@RequestMapping(value="/view2/{cid}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("cid")int cid,Map<String,Object> model){
		Course course=courseService.getCoursebyId(cid);
		model.put("infor", course.getCname());
		return "courser_overview";
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 * 
	 * 设置访问路径：http://127.0.0.1:8080/SpringMVC_AnnotationBasicInformation/courses/view3?cid=3
	 * 
	 */
	@RequestMapping(value="view3")
	public String viewCourse3(HttpServletRequest request){
		int cid=Integer.parseInt(request.getParameter("cid"));
		Course course=courseService.getCoursebyId(cid);
		System.out.println(course);
		request.setAttribute("infor", "request");
		return "courser_overview";
	}
	
	
	//模型
	//@ModelAttribute  可以没有
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String doSave(@ModelAttribute Course course){
		System.out.println(course.getCname());
		return "courser_overview";
	}
	
	/*
	@RequestMapping(value="/doUpload",method=RequestMethod.POST)
	public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException{
		if(!file.isEmpty()){
			System.out.println("正在处理文件！！"+file.getName());
			InputStream in = file.getInputStream();
			File file_temp=new File("d:\\temp"+"temp.text");
			FileOutputStream pw=new FileOutputStream(file_temp);
			pw.write(in.toString().getBytes());
			pw.close();
		}
		return "courser_overview";
	}
	*缺少包： org.apache.commons.fileupload.FileItemFactory
	*/
	
}
