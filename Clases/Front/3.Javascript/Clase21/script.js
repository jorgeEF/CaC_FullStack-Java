const boton = document.getElementById('llamar');
boton.addEventListener('click', llamarAPI);

function llamarAPI(){
    const json =
        fetch('https://reqres.in/api/users?page=2')
            .then(response => response.json())
            .then(data => console.log(data));

    console.log(json);
}