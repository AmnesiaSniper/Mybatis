package ssm.java.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ssm.java.bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = "mybatis-config.xml";
		// 读取mybatis配置文件
		try {
			InputStream inputStream = Resources.getResourceAsStream(config);
			// 初始化mybatis，创建SqlSessionFactory的实例
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 创建SqlSession对象的实例
			SqlSession session = sqlSessionFactory.openSession();

//			Student stu = new Student();
//			stu.setStu_id(2);
			// 创建集合
			List<Student> list = null;
			list=session.selectList("getStudentOne",2);
		session.insert("addStudent",new Student(9,"小哈","男",3,null));
			for (Student s : list) {
				System.out.println(s);
				System.out.println(s.getStu_birthday());
			}
			// 执行映射文件方法
			session.selectList("getStudentAll", list);
			System.out.println(session.selectList("getStudentAll", list));
			// 提交会话
			session.commit();
			// 关闭连接
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
