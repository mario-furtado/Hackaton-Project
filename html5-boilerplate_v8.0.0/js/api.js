$(document).ready(function() {
    for(var i = 1; i < 9; i++){
    $.ajax({
        url: 'http://192.168.1.123:8080/be-the-rain/api/text/antiVax/' + i,
        type: 'GET',
        async: true,
        success: successCallback,
        error: errorCallback
    });
    }
    for(var i = 1; i < 9; i++){
        $.ajax({
            url: 'http://192.168.1.123:8080/be-the-rain/api/text/discrimination/' + i,
            type: 'GET',
            async: true,
            success: successCallback1,
            error: errorCallback
        });
    }
    for(var i = 1; i < 13; i++){
        $.ajax({
            url: 'http://192.168.1.123:8080/be-the-rain/api/text/fear/' + i,
            type: 'GET',
            async: true,
            success: successCallback2,
            error: errorCallback
        });
    }
    for(var i = 1; i < 7; i++){
        $.ajax({
            url: 'http://192.168.1.123:8080/be-the-rain/api/text/antiMask/' + i,
            type: 'GET',
            async: true,
            success: successCallback3,
            error: errorCallback
        });
        }
        for(var i = 1; i < 9; i++){
            $.ajax({
                url: 'http://192.168.1.123:8080/be-the-rain/api/text/pollution/' + i,
                type: 'GET',
                async: true,
                success: successCallback4,
                error: errorCallback
            });
        }
        for(var i = 1; i < 9; i++){
            $.ajax({
                url: 'http://192.168.1.123:8080/be-the-rain/api/text/social/' + i,
                type: 'GET',
                async: true,
                success: successCallback5,
                error: errorCallback
            });
        }
        for(var i = 1; i < 7; i++){
            $.ajax({
                url: 'http://192.168.1.123:8080/be-the-rain/api/text/institution/' + i,
                type: 'GET',
                async: true,
                success: successCallback6,
                error: errorCallback
            });
        }
        for(var i = 1; i < 7; i++){
            $.ajax({
                url: 'http://192.168.1.123:8080/be-the-rain/api/text/peerReviewed/' + i,
                type: 'GET',
                async: true,
                success: successCallback7,
                error: errorCallback
            });
        }
    
});


function successCallback2(response) {
    populateCustomer2(response);
}

function successCallback(response) {
    populateCustomer(response);
}

function successCallback1(response) {
    populateCustomer1(response);
}

function successCallback3(response) {
    populateCustomer3(response);
}

function successCallback4(response) {
    populateCustomer4(response);
}

function successCallback5(response) {
    populateCustomer5(response);
}
function successCallback6(response) {
    populateCustomer6(response);
}

function successCallback7(response) {
    populateCustomer7(response);
}

function errorCallback(request, status, error) {
    console.log(request+ error + status);
}

function populateCustomer1(discrimination) {

 

        var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white ">' + discrimination.title + '</li> <br>'
        $(element).appendTo('.Dis');
        var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + discrimination.content + '</li>'
        $(element).appendTo('.Dis');
        var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + discrimination.link + '"target = "_blank"</a>' + discrimination.link + '</li> <br> <br>'
        $(element).appendTo('.Dis');
}

function populateCustomer(antiVaxData) {



        var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none;color: white ">' + antiVaxData.title + '</li> <br>'
        $(element).appendTo('.Vax');
        var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + antiVaxData.content + '</li>'
        $(element).appendTo('.Vax');
        var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + antiVaxData.link + '"target = "_blank"</a>' + antiVaxData.link + '</li> <br> <br>'
        $(element).appendTo('.Vax');
}

function populateCustomer2(fearData) {



        var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none;color: white ">' + fearData.title + '</li> <br>'
        $(element).appendTo('.Fear');
        var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + fearData.content + '</li>'
        $(element).appendTo('.Fear');
        var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + fearData.link + '"target = "_blank"</a>' + fearData.link + '</li> <br> <br>'
        $(element).appendTo('.Fear');
}

function populateCustomer3(antiMaskData) {

 

    var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white">' + antiMaskData.title + '</li> <br>'
    $(element).appendTo('.Mask');
    var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + antiMaskData.content + '</li>'
    $(element).appendTo('.Mask');
    var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + antiMaskData.link + '"target = "_blank"</a>' + antiMaskData.link + '</li> <br> <br>'
    $(element).appendTo('.Mask');
}

function populateCustomer4(pollutionData) {



    var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white">' + pollutionData.title + '</li> <br>'
    $(element).appendTo('.Poll');
    var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + pollutionData.content + '</li>'
    $(element).appendTo('.Poll');
    var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + pollutionData.link + '"target = "_blank"</a>' + pollutionData.link + '</li> <br> <br>'
    $(element).appendTo('.Poll');
}

function populateCustomer5(socialImpactData) {



    var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white">' + socialImpactData.title + '</li> <br>'
    $(element).appendTo('.Soc');
    var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + socialImpactData.content + '</li>'
    $(element).appendTo('.Soc');
    var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + socialImpactData.link + '"target = "_blank"</a>' + socialImpactData.link + '</li> <br> <br>'
    $(element).appendTo('.Soc');
}

function populateCustomer6(institutionData) {



    var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white">' + institutionData.title + '</li> <br>'
    $(element).appendTo('.Inst');
    var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + institutionData.content + '</li>'
    $(element).appendTo('.Inst');
    var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + institutionData.link + '"target = "_blank"</a>' + institutionData.link + '</li> <br> <br>'
    $(element).appendTo('.Inst');
}

function populateCustomer7(peerReviewedData) {



    var element = '<li style= "text-align: center; font-size: 30px; list-style-type: none; color: white">' + peerReviewedData.title + '</li> <br>'
    $(element).appendTo('.Peer');
    var element = '<li style= "text-align: justify; font-size: 19px;color: white" >' + peerReviewedData.content + '</li>'
    $(element).appendTo('.Peer');
    var element = '<li><a  style= "text-decoration: none; color: #af761f" href= "' + peerReviewedData.link + '" target = "_blank"</a>' + peerReviewedData.link + '</li> <br> <br>'
    $(element).appendTo('.Peer');
}