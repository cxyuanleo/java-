package Vector��;

import java.util.Vector;

public class VectorMethodDemo {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("a"); //�Զ�װ����ַ�������
	v.add("b");
	v.add("c");
	System.out.println(v);
	
	v.add(0,"will");  //�ײ���������в���  ���ܵ�
	System.out.println(v);

	v.remove("b");// ɾ��
	v.set(1,"wlii");//�滻
	v.get(2);//��ȡָ��λ�õ�Ԫ��
}
}
