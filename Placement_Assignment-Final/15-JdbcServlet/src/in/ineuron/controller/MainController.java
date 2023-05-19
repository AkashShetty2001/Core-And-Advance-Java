package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.factory.StudentServiceFactory;
import in.ineuron.model.Student;
import in.ineuron.service.IStudentService;

@WebServlet("/controller")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IStudentService service=StudentServiceFactory.getStudentService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Request UI Path : " + request.getRequestURI());
		if (request.getRequestURI().endsWith("controller")) {
			String sname = request.getParameter("name");
			String saddress = request.getParameter("saddress");
			String sage = request.getParameter("sage");

			Student stu = new Student();
			stu.setSname(sname);
			stu.setSage(Integer.parseInt(sage));
			stu.setSaddress(saddress);

			String status = service.addData(stu);
			System.out.println("submitted data");
			RequestDispatcher rd=null;
			request.setAttribute("status", "success");
			rd=request.getRequestDispatcher("./disp.jsp");
			rd.forward(request, response);
			
		}
	}		
}
