package ����;

public class PointDemo {
public static void main(String[] args) {
	//ʹ��String����
	Point<String> p1 = new Point<String>();//T=String T��ʱ��String����  �Ͱ�Point���е����е�Tת����string����
	String x1 = p1.getX(); 
	//ʹ��Integer����
	Point<Integer> p2 = new Point<Integer>();
	Integer x2 = p2.getX();
	
	
}
public static <T>T doWork(T val) {  //��������ŵ�T���Ƿ������� �����ɲ������;���
	return null;
}
}
