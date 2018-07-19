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
		// ��ȡmybatis�����ļ�

		try {
			InputStream inputStream = Resources.getResourceAsStream(config);
			// ��ʼ��mybatis������SqlSessionFactory��ʵ��
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// ����SqlSession�����ʵ��
			SqlSession session = sqlSessionFactory.openSession();

			// ��������
			List<Student> list = null;
			// ִ��ӳ���ļ�����
			session.selectList("GetAll", list);
			System.out.println(session.selectList("GetAll", list));
			// �ύ�Ự
			session.commit();
			// �ر�����
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
