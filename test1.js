var arr = [5, 5, 5, 2, 2, 2, 2, 2, 9, 4];
var counts = {};

for (let i in arr) {
    var num = arr[i];
    counts[num] = counts[num] ? counts[num] + 1 : 1;
}
console.log(counts);