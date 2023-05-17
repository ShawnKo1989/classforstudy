package day31;
class Point{
	int x, y;
	Point(int x, int y){this.x = x; this.y = y;}
}
class Line{
	Point p1, p2;
	Line(Point p1, Point p2){this.p1 = p1; this.p2 = p2;}
}
public class Ex3101 {
	public static void main(String[] args) {
		Point point1 = new Point(1,1);
		Point point2 = new Point(5,4);
		Line obj = new Line(point1,point2);
		Line obj2 = new Line();
		System.out.println("값을 변경하기 전..");
		System.out.println(obj);
		System.out.println(obj2);
		
//		obj2.p1 = obj.p1; //shallow copy
//		obj2.p2 = obj.p2;
		
		obj2.p1.x = 11;
		obj2.p1.y = 11;
		obj2.p2.x = 15;
		obj2.p2.y =14;
	}

}
