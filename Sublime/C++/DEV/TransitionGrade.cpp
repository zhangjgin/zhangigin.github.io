#include<iostream>
using namespace std;
int main(){
	int old_grade,new_grade;
	cin>>old_grade;
	//第一种方法： 
//	if(old_grade>=90&&old_grade<=100)
//		new_grade=5;
//	if(old_grade>=80&&old_grade<=89)
//		new_grade=4;
//	if(old_grade>=70&&old_grade<=79)
//		new_grade=3;
//	if(old_grade>=60&&old_grade<=69)
//		new_grade=2;
//	if(old_grade<=59)
//		new_grade=1;
	//第二种方法：
//	switch(old_grade/10){
//		case 10:new_grade = 5;break;
//		case 9:new_grade = 5;break;
//		case 8:new_grade = 4;break;
//		case 7:new_grade = 3;break;
//		case 6:new_grade = 2;break;
//		default:new_grade = 1;
//	} 
	//第三种：
	switch(old_grade/10){
		case 10:
		case 9:new_grade = 5;break;
		case 8:new_grade = 4;break;
		case 7:new_grade = 3;break;
		case 6:new_grade = 2;break;
		default:new_grade = 1;
	}  
	cout<<new_grade<<endl;
	return 0;
}
