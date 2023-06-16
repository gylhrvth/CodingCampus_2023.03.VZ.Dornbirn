
let clicks = localStorage.getItem("clicks")


function clickcounterSub() {
    clicks--;
    localStorage.setItem("clicks", clicks)
    document.getElementById("clicks").innerHTML = "You have clicked: " + clicks + " times";
};

function clickcounterAdd() {
    clicks++;
    localStorage.setItem("clicks", clicks)
    document.getElementById("clicks").innerHTML = "You have clicked: " + clicks + " times";
};

function resetcounter() {
    clicks = 0;
    localStorage.setItem("clicks", clicks)
    document.getElementById("clicks").innerHTML = "You have clicked: " + clicks + " times";
};

