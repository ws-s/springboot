package ��̬����;
/**
 * ���������
 * @author lindy
 * @����ʱ�� 2020��4��14������3:12:58
 */
public class ProxyLand {
	private Landlady land;
	
	public void proxyTenement() {
		if(land == null) {
			land = new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}
}
