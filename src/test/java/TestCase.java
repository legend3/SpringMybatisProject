
import org.legend.springMybatis.entity.Student;
import org.legend.springMybatis.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestCase {
    @Test
    public void case01() {
        //加载spring容器文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //service层操作数据库事务
        IStudentService studentService = (IStudentService)context.getBean("studentService") ;
        Student student = new Student();
        student.setStuAge(18);
        student.setStuName("长沙");
        student.setStuNo(8);
        studentService.add(student);

    }
}
