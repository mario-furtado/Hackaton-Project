var API_URL_antiVax = 'http://192.168.1.123:8080/be-the-rain/api/text/antiVax';

window.onload = function() {
    fetchCustomers();
};

function fetchCustomers(){

    var antiVax;
    var httpRequest;

    if (window.XMLHttpRequest) {
        // Mozilla, Safari, IE7+ ...
        httpRequest = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        // IE 6 and older
        /* jshint -W117 */
        httpRequest = new ActiveXObject('Microsoft.XMLHTTP');
        /* jshint +W117 */
    }

    // set http request callback function
    httpRequest.onreadystatechange = function() {
      if (httpRequest.readyState === 4 && httpRequest.status === 200) {
        antiVax = httpRequest.responseText;
        populateCustomers(JSON.parse(antiVaxData));
      }
    };

    if(API_URL_antiVax)
    // sending an HTTP GET request
    httpRequest.open('GET', API_URL_antiVax, true);
    httpRequest.setRequestHeader('Content-type', 'application/json');
    httpRequest.send();

}

function populateCustomers(antiVaxData) {

    var list = document.getElementById("#antiVax");
    var entry;

    antiVaxData.forEach(function(element) {
          /*elementStr =
            "<li>" + 
            element.content +
            "</li>" 

          "<td>" +
            element.firstName +
            "</td>" +

            "<td>" +
            element.lastName +
            "</td>" +

            "<td>" +
            element.email +
            "</td>" +

            "<td>" +
            element.phone +
            "</td>" +

            '<td><button type="button" id="edit-btn-' +
            element.id +
            '" class="edit-btn btn btn-success">edit</button></td>' +
            '<td><button type="button" id="remove-btn-' +
            element.id +
            '" class="remove-btn btn btn-danger">delete</button></td>';*/

            entry = document.createElement('li');
            entry.appendChild(document.createTextNode(element));
            list.appendChild(entry);

        row.setAttribute("class", "antiVax");
    });
}
