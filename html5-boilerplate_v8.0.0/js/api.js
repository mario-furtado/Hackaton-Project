
var urlApi = 'http://127.0.0.1:8080/be-the-rain/api/text/';
let divs = ['.Vax', '.Dis', '.Fear', '.Mask', '.Poll', '.Soc', '.Inst', '.Peer'];
const protestStudies = ["antiVax", "discrimination", "fear", "antiMask", "pollution", "social", "institution", "peerReviewed"];

$(document).ready(function() {

    for(let i = 0; i < protestStudies.length; i++ ){
   
    $.ajax({
        url: urlApi + protestStudies[i],
        type: 'GET',
        async: true,
        success: successCallback,
        error: errorCallback
    });
}
});

function successCallback(response) {
    populateCustomer(response);
}


function errorCallback(request, status, error) {
    console.log(request+ error + status);
}


function populateCustomer(data) {

    for(let i = 0; i< data.length; i++){
        var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white ">' + data[i].title + '</li> <br>'
        $(element).appendTo(divs[0]);
        var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + data[i].content + '</li>'
        $(element).appendTo(divs[0]);
        var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + data[i].link + '"target = "_blank"</a>' + data[i].link + '</li> <br> <br>'
        $(element).appendTo(divs[0]);
    }
    
    divs.shift();
}
