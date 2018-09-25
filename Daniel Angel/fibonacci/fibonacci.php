<?

    //valida si las variables existen para realizar la operacion
    if(isset($_POST['serie']) && $_POST['limite'] > 0){
        $n1 = 0;
        $n2 = 1;
        $suma = 0;
        echo $n1.'-'.$n2.'-';
        for ($i = 0; $i < $_POST['limite']-2; $i++)
        {
            $suma = $n1+$n2;
            $n1 = $n2;
            $n2 = $suma;
            echo $suma.'-';
        }
        echo '<br>'.'resultado serie de fibonacci '.$suma;
    }
?>
<html>
<head>
    <title> area de un cuadrado </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <script>
        function  validarNumber()
        {
            var limite = $('#limite').val();
            if (limite < 0){
                alert('valor no valido');
                window.location.href('pruebas.php');
            }
        }
    </script>
</head>
    <body>
        <br><br><h1 style="text-align: center"> Serie de Fibonacci</h1>
        <form action="#" method="post">
            <div class="row" class="text-center">
                <div class="col-md-4">

                </div>
                <div class="col-lg-4">
                    <input type="number" class="form-control" name="limite" id="limite" ><br>
                    <input type="submit" class="btn-danger" value="Envia" onclick="validarNumber()">
                    <input type="hidden" name="serie">
                </div>
                <div class="col-md-4">

                </div>
            </div>
        </form>
</body>
</html>
