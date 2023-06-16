let count = localStorage.getItem("count") || 0;
function onClick() {
  document.getElementById("clicks").innerHTML = count;
  count++;
  localStorage.setItem("count", count);
}
