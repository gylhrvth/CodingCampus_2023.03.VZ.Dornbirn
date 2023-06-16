
let container = document.getElementById("timelist")


function gettime() {

    let currenttime = document.createElement("li")
    let div = document.createElement("div")
    div.appendChild(document.createTextNode("Clicked at: " + new Date))

    // let button = document.createElement("button")
    let button = document.createElement("div")

    button.classList.add("btn")
    button.onclick = () => {
        removechild(currenttime)
    }
    button.innerText = "delete"



    div.appendChild(button)


    currenttime.appendChild(div)

    //currenttime.innerHTML = "clicked at: " + new Date() + "<button onclick=\"removeoutput(event)\"> delete </button>"

    container.appendChild(currenttime)
}

function removefirst() {
    const list = document.getElementById("timelist");
    list.removeChild(list.firstElementChild);
}

function removechild(currentElement) {
    container.removeChild(currentElement)
}