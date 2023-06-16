let clickcount = 0

if (localStorage.getItem("clickcount")) {
    clickCount = parseInt(localStorage.getItem("clickcount"))
    document.getElementById("count").textContent = clickCount
}

function count(){
    
    clickCount ++

    document.getElementById("count").textContent = clickCount 
    localStorage.setItem("clickcount", clickCount.toString())
}
function addDatum(){
    const timestamp = document.createElement("div")
    timestamp.textContent = new Date().toLocaleString()
    document.getElementById("datum").appendChild(timestamp)
    timestamp.appendChild(deleteDatum())

}
function deleteDatum(){
    const deleteButton = document.createElement("button")
    deleteButton.textContent = "löschen"
    deleteButton.addEventListener("click", function(){
        deleteTimestamp(this)
    })
    return deleteButton
}
function deleteTimestamp(button){
    const timestampelement = button.parentNode
    timestampelement.parentNode.removeChild(timestampelement)
}