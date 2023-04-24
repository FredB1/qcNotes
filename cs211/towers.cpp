#include <iostream>
#include <vector>
using std::cin;
using std::cout;
using std::endl;
using std::vector;

int find_candidate(vector<int> towers[3], int last);

int main() {
    vector<int> towers[3];
    int n, last_moved_ring = -1, candidate;
    cout << "How many rings will we be using?\n";
    cin >> n;
    for (int i = n; i > 0; i--) {
        towers[0].push_back(i);
    }

    candidate = find_candidate(towers, last_moved_ring);
    while (towers[1].size() < n) {
        int direction = (n % 2 == 0) ? -1 : 1;
        int current_tower, destination_tower;
        for (int i = 0; i < 3; i++) {
            if (!towers[i].empty() && towers[i].back() == candidate) {
                current_tower = i;
                destination_tower = (i + direction + 3) % 3;
                if (towers[destination_tower].empty() || towers[destination_tower].back() > candidate) {
                    break;
                } else {
                    destination_tower = (destination_tower + direction + 3) % 3;
                }
            }
        }
        towers[current_tower].pop_back();
        towers[destination_tower].push_back(candidate);
        cout << "Move ring " << candidate << " from tower " << current_tower + 1 << " to tower " << destination_tower + 1 << endl;

        last_moved_ring = candidate;
        candidate = find_candidate(towers, last_moved_ring);
    }

    return 0;
}

int find_candidate(vector<int> towers[3], int last) {
    int candidate = -1;
    for (int i = 0; i < 3; i++) {
        if (!towers[i].empty() && towers[i].back() != last) {
            if (candidate == -1 || towers[i].back() < candidate) {
                candidate = towers[i].back();
            }
        }
    }
    return candidate;
}
