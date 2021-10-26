#include<iostream>
using namespace std;
class Coordinate
{
public:
	Coordinate(int x1,int y1)
	{
		x=x1;
		y=y1;
		cout<<"constructor is called.\n";
	}
	Coordinate(Coordinate &p);	
	~Coordinate()
	{
		cout<<"析构函数被调用\n";
	}
	int getX()
	{
		return x;
	}
	int getY()
	{ 
		return y;
	}
private:
	int x,y;
};
Coordinate::Coordinate(Coordinate &p)
{
	x=p.x;
	y=p.y;
	cout<<"copy-initialization Constructor is called\n";

}
int main()
{
	Coordinate p1(2,3);
	Coordinate p2(p1);
	Coordinate p3=p2;
	cout<<"p3=("<<p3.getX()<<","<<p3.getY()<<")"<<endl;
	//Coordinate p4;
//	Coordinate p5(2);
	return 0;
}
