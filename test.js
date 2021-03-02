const rev = (str) => {
    if (str === "") {
        return "";
    }
    else {
        return rev(str.substr(1)) + str.charAt(0);
    }
}

console.log(rev("Hello"));