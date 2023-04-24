#include <iostream>
using std::cout;
using std::endl;

int main(const int argc, const char *argv[])
{
	const int numElems = 5;
	int arr[numElems] = {20, -9, 100, 14, 12};
	cout << "Subscript Operator:\n";
	for (int i = 0; i < numElems; i++)
	{
		cout << "Element #" << i + 1 << ": " << arr[i] << "\n";
	}
	cout << "\nDereference Operator:\n";
	for (int i = 0; i < numElems; i++)
	{
		cout << "Element #" << i + 1 << ": " << *(arr + i) << "\n";
	}
	return 0;
}
