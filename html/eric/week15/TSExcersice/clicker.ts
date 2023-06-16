const button = document.getElementById("myButton")!
const counter = document.getElementById("counter")!

let countButton = 0;

button.addEventListener("click", () => {

    countButton++
    counter.textContent = countButton.toString()
})