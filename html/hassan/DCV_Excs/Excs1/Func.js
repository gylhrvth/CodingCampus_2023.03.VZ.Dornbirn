let clickCount= 0;
 if(localStorage.getItem("clickCount")){
    clickCount = parseInt(localStorage.getItem("clickCount"))
    if(isNaN(clickCount)) {
        clickCount = 0
    }
    document.getElementById("count").textContent = clickCount
 }


function handleClick(){

    clickCount ++;

    document.getElementById("count").textContent = clickCount;
    localStorage.setItem("clickCount", clickCount.toString())
}
