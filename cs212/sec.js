function second(digitString) {
    digitString=digitString.replaceAll(/\D/g,"")
    digitString=digitString.split("").sort()
    let digitSet = new Set(digitString)
    digitString= [...digitSet]
    if (digitSet.size>1) {
        console.log(digitString[1])
    } else {
        console.log(-1)
    }
    
}
second("sjhtz8344")