let container = document.getElementById("utc");

function timeOfClick() {
  //const utc = new Date().toUTCString();
  //const currentDateItem = document.createElement("li");
  //  currentDateItem.innerText = utc;
  let currentDateItem = document.createElement("li");
  let div = document.createElement("div");
  div.appendChild(document.createTextNode(new Date().toUTCString()));

  let button = document.createElement("button");
  button.onclick = () => {
    deleteDate(currentDateItem);
  };
  button.innerText = "Remove";

  div.appendChild(button);

  currentDateItem.appendChild(div);

  container.appendChild(currentDateItem);

  //document.getElementById("utc").appendChild(currentDateItem);
}

function deleteDate(currentDateItem) {
  container.removeChild(currentDateItem);
}
