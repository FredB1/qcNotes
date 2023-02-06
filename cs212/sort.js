function sSort(n) {
    for (let i = 0; i < n.length - 1; i++) {
        let min = i;
        for (let j = i + 1; j < n.length; j++) {
            if (n[min] > n[j]) {
                min = j
            }
        }
        let temp = n[i];
        n[i] = n[min];
        n[min] = temp;
    }
    console.log(n)
}
sSort([21, 32, 13, 24, 35, 16, 37, 28])