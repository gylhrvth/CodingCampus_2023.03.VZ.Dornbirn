function handleClick(){
    const timestamp = document.createElement("p");
    timestamp.textContent = new Date().toLocaleString();

    timestamp.appendChild(getDeleteButton())

    document.getElementById("clickTimestamps").appendChild(timestamp);

}

function getDeleteButton(){
    const deleteButton = document.createElement("button");
    deleteButton.textContent = "Löschen";
    deleteButton.addEventListener("click", function() {
        deletetimestamp(this)
    });
    return deleteButton
}

function deletetimestamp(button){
    const timestampelement = button.parentNode;
    timestampelement.parentNode.removeChild(timestampelement)
}
