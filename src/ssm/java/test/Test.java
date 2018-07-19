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

			// 创建集合
			List<Student> list = null;
			// 执行映射文件方法
			session.selectList("GetAll", list);
			System.out.println(session.selectList("GetAll", list));
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
