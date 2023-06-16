var button = document.getElementById("myButton");
var counter = document.getElementById("counter");
var countButton = 0;
button.addEventListener("click", function () {
    countButton++;
    counter.textContent = countButton.toString();
});
