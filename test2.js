var duplicateZeros = function (arr) {
    var l = arr.length;
    var sum = 0;
    arr.map(value => {
        sum += value
    })

    for (let i = 0; i < arr.length; i++) {
        if (sum === 0) {
            break;
        }
        if (arr[i] === 0) {
            console.log('inserted at : ' + i);
            arr.splice(i, 0, 0)
            i += 1;
        }
    }

    arr.splice(l, (arr.length - l))
    return arr;

};

console.log(duplicateZeros([0, 4, 1, 0, 0, 8, 0, 0, 3]));