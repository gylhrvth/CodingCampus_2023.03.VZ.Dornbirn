var clickCount = 0;
function countClick() {
    if (localStorage.getItem("clickCount")) {
        clickCount = parseInt(localStorage.getItem("clickCount"));
        document.getElementById("count").textContent = clickCount.toString();
    }
    clickCount++;
    document.getElementById("count").textContent = clickCount.toString();
    localStorage.setItem("clickCount", clickCount.toString());
}
