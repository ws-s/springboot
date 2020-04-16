import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		// 1��ͨ��spring�������ļ�������һ������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2��ͨ��applicationContext����ķ���ȥ��������ļ���bean
		SpringTest test = (SpringTest) ctx.getBean("test");
		// 3�������������ķ�����ʵ�����
		test.print();
	}

}