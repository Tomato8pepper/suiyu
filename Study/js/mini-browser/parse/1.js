//ab
function fund1(str) {
    let founda = false,
    foundb = false;
    for (let c of str) {
        if (c === 'a') {
            founda = true
        }else if (founda && c === 'b') {
            return true
        }else {
            founda = false
        }
    }
    return false
}

//abc
function find2(str) {
    let founda = false, foundb = false, foundc = false;
    for (let c of str) {
        if(c === 'a') {
            founda = true
        } else if (founda && c === 'b') {
            foundb = true
        } else if ( founda && foundb && c === 'c'){
            return true
        }
        else{
            founda = false
            foundb = false
        }
    }
    return false
}