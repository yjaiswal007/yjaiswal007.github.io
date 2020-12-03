
function myFunction() {
  var x = document.getElementById("myheader");
  if (x.className === "header-right") {
    x.className += " responsive";
  } else {
    x.className = "header-right";
  }
}