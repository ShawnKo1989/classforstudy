package web1;

public class Point {
	int x;
	int y;
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	// Line 은 두개의 Point로 구성되어 있다.
	// Line 은 두개의 Point를 가지고 있다.
	int[] xyArr = new int[2];
	int getX() {return 0;}
	void setX(int x) {}
	int getY() {return 0;}
	void setY(int y) {}
	
	public String toString() {
		//(x,y)
		return "("+x+","+y+")";
		}
	int[] getXY() {
		// Return a 2-element int array of {x,y}
		xyArr[0] = x;
		xyArr[1] = y;
		return xyArr;
		}
	void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	double distance(int x, int y) {
		// Return the distance from this instance to the given (x,y)
		int dist = (int) Math.sqrt((this.x - x)*(this.x - x) +(this.y -y)*(this.y -y));
		return dist;
		}
	double distance(Point another) {
		//Return the distance from this instance to the given Point instance another
		int dist = (int)Math.sqrt((another.x - x)*(another.x - x)+(another.y-y)*(another.y-y));
		return dist;
		}
	double distance() {
		//Return the distance from this to (0,0)
		int dist = (int)Math.sqrt((this.x)*(this.x)+(this.y)*(this.y));
		return dist;
		}
}