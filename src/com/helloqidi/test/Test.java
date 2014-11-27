package com.helloqidi.test;
import java.sql.Date;
import java.util.List;
import com.helloqidi.dao.impl.StudentDaoImpl;
import com.helloqidi.entity.Student;

/**
 * @author xudongwang 2011-12-31
 *
 *         Email:xdwangiflytek@gmail.com
 *
 */
public class Test {
	
	public static void main(String[] args) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		
		System.out.println("���Բ���");
		Student addStudent = new Student();
		addStudent.setName("����");
		addStudent.setBirth(Date.valueOf("2011-09-02"));
		addStudent.setScore(88);
		System.out.println(studentDaoImpl.addStudent(addStudent));
		
		
		System.out.println("���Ը���id��ѯ");
		System.out.println(studentDaoImpl.selectStudentById(1));
		
		
		System.out.println("����ģ����ѯ");
		List<Student> mohuLists = studentDaoImpl.selectStudentByName("��");
		for (Student student : mohuLists) {
			System.out.println(student);
		}
		
		
		System.out.println("���Բ�ѯ����");
		List<Student> students = studentDaoImpl.selectAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
		

		System.out.println("���Ը���ѧ����Ϣ");
		Student updateStudent = new Student();
		updateStudent.setId(1);
		updateStudent.setName("����1");
		updateStudent.setBirth(Date.valueOf("2011-08-07"));
		updateStudent.setScore(21);
		System.out.println(studentDaoImpl.updateStudent(updateStudent));
		
		
		System.out.println("����idɾ��ѧ����Ϣ");
		System.out.println(studentDaoImpl.deleteStudentById(1));
		
	}
}