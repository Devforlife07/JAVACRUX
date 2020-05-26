#include <iostream>
#include <algorithm>
using namespace std;
int main(int argc, char const *argv[])
{

    int a[] = {32, 53, 5353, 533};
    sort(a, a + 4);
    for (int x : a)
    {
        cout << x << endl;
    }
    cout << "Hello" << endl;
    /* code */
    return 0;
}
