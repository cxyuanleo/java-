package 泛型;

public class PointDemo {
public static void main(String[] args) {
	//使用String类型
	Point<String> p1 = new Point<String>();//T=String T此时是String类型  就把Point类中的所有的T转换成string类型
	String x1 = p1.getX(); 
	//使用Integer类型
	Point<Integer> p2 = new Point<Integer>();
	Integer x2 = p2.getX();
	
	
}
public static <T>T doWork(T val) {  //这个尖括号的T就是返回类型 类型由参数类型决定
	return null;
}
}
