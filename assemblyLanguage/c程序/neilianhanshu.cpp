#include<iostream>
#include<cmath>
using namespace std;
class Point{
public:
	void setpoint(int ,int );
	int getx();
	int gety();
private:
	int x,y;
};
void Point::setpoint(int a,int b)
{
	x=a;
	y=b;
}
int Point::getx()
{
	return x;
}
int Point::gety()
{
	return y;
}
int main()
{
	Point a;
	a.setpoint(4,5);
	cout<<"µã×ø±êÊÇ£º"<<"("<<a.getx()<<","<<a.gety()<<")"<<endl;
	return 0;
}
