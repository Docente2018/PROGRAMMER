<?
require_once('classOrder.php');

//variable para guardar el resultado en cache
$resultado = '';
//instancia de clase ordenas
$classOrder = new metodosOrder();

//validacion si existe array a ordenar
if (isset($_POST['numero']))
{
    //validacion si el metodo a ejecutar es sort
    if (isset($_POST['vector1'])){
        //utilizamos el metodo sort
        $arraySoft = $classOrder->sort($_POST['numero']);
        //guardamos el resultado resultado
        $resultado = implode(',', $arraySoft);
    }
    //validacion si el metodo a ejecutar es burbuja
    else if(isset($_POST['vector2'])){
        //utilizamos el metodo quick burbuja
        $arrayBurbuja = $classOrder->burbuja($_POST['numero'], sizeof($_POST['numero']) );
        //guardamos el resultado resultado
        $resultado = implode(',', $arrayBurbuja);
    }
    //validacion si el metodo a ejecutar e quick sort
    else if(isset($_POST['vector3'])){
        //utilizamos el metodo quick sort
        $arrayQuick = $classOrder->quicksort($_POST['numero'],0, sizeof($_POST['numero'])-1);
        //guardamos el resultado resultado
        $resultado = implode(',', $arrayQuick);
    }
}
else if(isset($_POST['aleatorio'])){

    $random_number_array = [];
    for ($i = 0; $i <= $_POST['aleatorio']-1; $i++) {
        $random_number_array[$i]  = rand(0, 50);
    }

    $_POST['numero'] = $random_number_array;

    if (isset($_POST['vector1'])){
        //utilizamos el metodo sort
        $arraySoft = $classOrder->sort($_POST['numero']);
        //guardamos el resultado resultado
        $resultado = implode(',', $arraySoft);
    }
    //validacion si el metodo a ejecutar es burbuja
    else if(isset($_POST['vector2'])){
        //utilizamos el metodo quick burbuja
        $arrayBurbuja = $classOrder->burbuja($_POST['numero'], sizeof($_POST['numero']) );
        //guardamos el resultado resultado
        $resultado = implode(',', $arrayBurbuja);
    }
    //validacion si el metodo a ejecutar e quick sort
    else if(isset($_POST['vector3'])){
        //utilizamos el metodo quick sort
        $arrayQuick = $classOrder->quicksort($_POST['numero'],0, sizeof($_POST['numero'])-1);
        //guardamos el resultado resultado
        $resultado = implode(',', $arrayQuick);
    }
    else{

    }
}

?>
<html>
<head>
    <title> Ordenar </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script>
        //funcion para crear los campos aleatoreamente dependiendo la cantidad ingresada
       function dataInput(value) {
           data = $('#limite').val();
           if(data == ''){
               $('#cantidad').append('<input type="number" class="form-control" name="aleatorio" id="aleatorio" placeholder="Ingrese tamaño del array"><br>');
               if (value == 1){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector1" name="vector1" value="Ordenar">')
               }else if (value == 2){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector2" name="vector2" value="Ordenar">')
               }else if (value == 3){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector3" name="vector3" value="Ordenar">')
               }
           }else{
               //titulo del emcabezado
               $('#cantidad').append('<h3>Ingresar orden de los numeros</h3>')
               for (var i=0; i<data; i++) {
                   $('#cantidad').append('<input type="number" class="form-control" name="numero['+i+']" id="numero'+i+'" placeholder="Ingrese numero"><br>');
               }

               if (value == 1){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector1" name="vector1" value="Ordenar">')
               }else if (value == 2){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector2" name="vector2" value="Ordenar">')
               }else if (value == 3){
                   $('#cantidad').append('<input type="submit" class="btn-success" id="vector3" name="vector3" value="Ordenar">')
               }
           }

       }
        //funcion para borrar los campos
       function borrar() {
           $('#cantidad').empty();
       }

    </script>
</head>
    <body>
        <!-- creacion de formualario -->
        <br><br><h1 style="text-align: center">Quick Short</h1>
            <div class="row" class="text-center">
                <div class="col-md-4" >

                </div>
                <div class="col-lg-4">
                    <input type="number" class="form-control" name="limite" id="limite" placeholder="Ingrese tamaño del vector" onchange="validator()"><br>
                    <input type="submit" class="btn-danger" id="vector" value="Sort" onclick="dataInput(1)">
                    <input type="submit" class="btn-danger" id="vector" value="Burbuja" onclick="dataInput(2)">
                    <input type="submit" class="btn-danger" id="vector" value="Quick Sort" onclick="dataInput(3)">
                    <input type="submit" class="btn-success" id="vector" value="Borrar" onclick="borrar()">
                    <input type="hidden" name="serie"><br><br>
                    <!-- formualrio a imprimir resultados y creacion de campos -->
                    <form action="#" method="post" id="cantidad">


                        <div class="row" style="text-align: center">
                            <!-- impresion de resultados -->
                            <div>
                                <h3><?=$resultado?></h3>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="col-md-4" >

                </div>
            </div>
</body>
</html>
