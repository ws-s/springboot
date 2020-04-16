import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		// 1������ApplicationContext����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
		// 2��ͨ��getBean����������õ�bean��Ϣ���������������
		Printer p = (Printer) ctx.getBean("printer");
		// 3�����ö���ķ�����ʵ�ֲ���
		p.print();
	}

}
