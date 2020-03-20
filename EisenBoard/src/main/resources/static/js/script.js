var taskTitle = "New Task";
var firstLine = "Description";
var secondLine = "More";
var day = "MondayContainer";
var completion = "Preferred Completion: Monday"
var due = "Due: Monday"

function addCard(){
    var newHtml = "<h3>" + taskTitle + "</h3><p>" + firstLine + "</p><p>" + secondLine + "</p>";
    var crd = document.createElement("div");
    crd.classList.add("card");
    crd.innerHTML = newHtml;
    document.getElementById(day).appendChild(crd);
    //addExpandedCard()
}
function addExpandedCard(){
    var newHtml = "<h4>" + taskTitle + "</h4><p>" + completion + "</p><p>" + due + "</p>";
    var crd = document.createElement("div");
    crd.classList.add("expandedCard");
    crd.innerHTML = newHtml;
    document.getElementById("expandedCards").appendChild(crd);
}