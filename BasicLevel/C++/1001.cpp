#include <iostream> 
using std::cin;
using std::cout;

int main() {
	int num, cnt = 0; //记录需要的步数
	cin >> num;
	while (num != 1) {
		if (num % 2 != 0) {//是奇数
			num = 3*num + 1; 
		}
		num /= 2;
		cnt++;
	} 
	cout << cnt;
	return 0;
}
