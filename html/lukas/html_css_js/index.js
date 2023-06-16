//window.onload = () => {
document.getElementById("resultText").innerText = "Sie haben gar nichts geklickt!!!"
let container = document.getElementById("squareContainer")
let counter = 0
//}
function clickListener() {
    window.alert("Hassan was geht ab???")
}

decideListener = () => {
    let result = window.confirm("Hallo Weiter oder abbrechen?")
    console.log("The result is: " + result)
    let text;
    if (result == true) {
        text = "Sie haben ok geklickt"
    } else {
        text = "Sie haben abbrechen geklickt"
    }

    let element = document.getElementById("resultText")
    element.style = "color: green"

    if (element.classList.contains("whiteField")) {
        element.classList.remove("whiteField")
        element.classList.add("blackField")
    } else {
        element.classList.remove("blackField")
        element.classList.add("whiteField")
    }

    element.innerText = text
}

function blackFieldClicked(event) {
    console.log(event.srcElement)
}

function addListener() {
    let square = document.createElement("div")

    square.style = "color: green"
    if (container.childElementCount % 2 == 0) {
        square.classList.add("whiteField")
        square.onclick = () => {
            container.removeChild(square)
        }
    } else {
        square.classList.add("blackField")
        square.onclick = blackFieldClicked
    }
    square.id = "squareItem" + counter

    square.innerText = counter
    container.appendChild(square)
    counter++
}

function removeListener() {
    let lastChild = container.lastChild
    if (lastChild) {
        container.removeChild(lastChild)
    }
}

