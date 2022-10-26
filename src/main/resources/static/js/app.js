$(document).ready(function(){
    cargarUsuarios();
});


async function cargarUsuarios(){

    const requerido=await fetch('account',{
        method:'GET',
        headers:{
            'Accept':'application/json',
            'Content-Type':'application/json'
        }
    });

    const users=await requerido.json();
    
    const element = document.getElementById("user");
    let result='';
    for(let user of Object.keys(users)){
        let element='';
        element='<div class="col-lg-4">'
        +'<div class="down-content">'
        +'<img src="assets/images/client-image.jpg" alt="">'
        +'<div class="right-content">'
            +'<h4>'+users[user].email+'</h4>'
        +'</div>'
        +'</div>'
    +'</div>';

    result+=element;

    }

    element.innerHTML=result;
}