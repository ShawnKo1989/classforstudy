package web1;

public class Line {
	Point begin;
	Point end;
//	int[] beginEnd = new int[2];
	Line(int x1, int y1, int x2,int y2){}
	Point getBegin() {}
	void setBegin(Point begin) {}
	Point getEnd(){}
	void setEnd(Point end) {}
	int getBeginX() {}
	void setBeginX(int x) {}
	int getBeginY() {}
	void setBeginY(int y) {}
	int[] getBeginXY(){}
	void setBeginXY(int x, int y){}
	int getEndX(){}
	void setEndX(int x) {}
	int getEndY() {}
	void setEndY(int y) {}
	int[] getEndXY(){}
	void setEndXY(int x, int y) {}
	public String toString() {
		//Line[begin=(x1,y1),end = (x2,y2)]
		return"";
	}
	double getLength() {}
}