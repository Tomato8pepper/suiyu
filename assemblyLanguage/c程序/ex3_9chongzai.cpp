#include<iostream>
using namespace std;
class Date
{
public:
	Date();
	Date(int y,int m,int d);;
	void showDate();
private:
	int year;
	int month;
	int day;
};
Date::Date()
{
	year=2018;
	month=11;
	day=22;
}
Date::Date(int y,int m,int d)
{
	year=y;
	month=m;
	day=d;
}
void Date::showDate()
{
	cout<<year<<"."<<month<<"."<<day<<endl;
}
int main()
{
	Date c;
	cout<<"时间是："<<endl;
	c.showDate();
	cout<<"时间是："<<endl;
	Date c1(2019,8,15);
	c1.showDate();
	return 0;
}

