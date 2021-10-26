#include<iostream>
#include<string>
using namespace std;
class Student
{
public:
	Student(int n,string na,double d)
	{
		no=n;
		deg=d;
		name=na;
		sum+=d;
		num++;
	}
	static double avg()
	{
		return sum/num;
	}
	static int total()
	{
		return sum;
	}
	void disp()
	{
		cout<<no<<"         "<<name<<"         "<<deg<<endl;
	}
private:
	int no;
	string name;
	double deg;
	static double sum;
	static int num;
};
double Student::avg=0;
int Student::num=0;
int main()
{
	Student s1(101,"查明国",97),s2(102,"如梦",98),s3(103,"明龙",99);
	cout<<"学号         姓名         成绩\n";
	s1.disp();
	s2.disp();
	s3.disp();
    cout<<"学生人数="<<Student::total()<<endl;
	cout<<"平均成绩="<<Student::avg();
	return 0;
}