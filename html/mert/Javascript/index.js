let clickcount = 0

if (localStorage.getItem("clickcount")) {
    clickcount = parseInt(localStorage.getItem("clickcount"))
    document.getElementById("count").textContent = clickcount
}

function count(){
    
    clickcount ++

    document.getElementById("count").textContent = clickcount 
    localStorage.setItem("clickcount", clickcount.toString())
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