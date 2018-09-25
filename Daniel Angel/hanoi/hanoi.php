<!DOCTYPE html>
<html>
<head>
    <title>Torres de Hanoi</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <style>
        body,pre{
            font-family: monospace;
            font-size: 20px;
            line-height: 1em;
        }
        pre{
            font-weight: bold;
            margin: 0;
            overflow-x:hidden;
            overflow-y:hidden;
        }
        <?php if(!isset($_GET["mostrar"])){?>
        .solucion{
            display: none;
        }
        <?php }?>
        #paso_0{
            display: block;
        }
    </style>
</head>
<body>
<?php
##validamos si viene el numero de cubos a mostrar si no validamos 3
if(isset($_GET["n"])){
    $N=$_GET["n"];
}else{
    $N=3;
}
#margen entre cada balso
define("CHARMAX",2*$N+8);
#imagen a mostrar para los cubos
define("DISC_CHAR","•");
##definimos variable paso para empezar siempre desde 0
$paso=0;
#definimos array de los postes#
$postes=array(
    1=>array(),
    2=>array(),
    3=>array()
);
#color para los cubos#
$colores=array(
    "red","blue","green","magenta","purple","cyan","#006699",
    "orange"
);

#recorremos de cubos y los asignamos aun poste#
for($i=1;$i<=$N;$i++){
    $postes[1][]=$N-$i;
}


function hanoi($n,$desde,$hasta,$aux){
    if($n>0){
        hanoi($n-1,$desde,$aux,$hasta);
        mover($desde,$hasta);
        mostrar();
        hanoi($n-1,$aux,$hasta,$desde);
    }
}
##funcion para mover entre postes##
function mover($desde,$hasta){
    global $postes;
    $elemento=array_pop($postes[$desde]);
    $postes[$hasta][]=$elemento;
}
##mostramos los cubos y les asignamos un color aletorio##
function mostrarDisco($n){
    global $colores;
    $espacios=(CHARMAX-(2*$n+1))/2;
    $color=$colores[$n%count($colores)];
    $str ="<span style='color: ".$color."'>".str_repeat("&nbsp;",$espacios);
    $str.=str_repeat(DISC_CHAR,$n*2+1);
    $str.=str_repeat("&nbsp;",$espacios)."</span>";
    return $str;
}

#mostramos los postes y le asigmanos una columna#
function mostrarPoste($poste){
    global $postes;
    global $N;
    $espacios=(CHARMAX-1)/2;
    $columna=str_repeat("&nbsp;",$espacios);
    $columna.="|".str_repeat("&nbsp;",$espacios);
    $str=$columna."\n";
    $n_discos=count($postes[$poste]);
    if($n_discos){
        if($n_discos<$N){
            $n_aux=$N-$n_discos;
            while($n_aux--!=0){
                $str.=$columna."\n";
            }
        }
        for($i=$n_discos-1;$i>=0;$i--){
            $str.=mostrarDisco($postes[$poste][$i])."\n";
        }
    }else{
        for($i=0;$i<$N;$i++){
            $str.=$columna."\n";
        }
    }
    return $str;
}

#mostramos contador y asigna,os los movimientos de los cubos#
function mostrar(){
    global $paso;
    $str="<div class='solucion' id='paso_".$paso."' style='text-aling: center'><h3 name='paso_".$paso."'>".$paso++."</h3>";
    $str.="<table border='0' cellpadding='0' cellspacing='0' style='margin-left: 28%'>";
    $str.="<tr>";
    for($i=1;$i<=3;$i++){
        $str.="<td><pre>";
        $str.=mostrarPoste($i);
        $str.="</pre></td>";
    }
    $str.="</tr>";
    $str.="</table></div>";
    echo $str;
}?>

<div class="row" style="margin-top: 3%">
    <div class="col-md-4">

    </div>
    <div class="col-md-4">
        <form method="get" action="hanoi.php">
            <h3>N&ordm; de discos: </h3>
            <input class="form-control" type="text" name="n" value="<?php echo $N?>" onFocus="pausa=true"><br>
            <label for="mostrar" class="checkbox-inline">
                <input type="checkbox" value="1" id="mostrar" name="mostrar" <?php if(isset($_GET["mostrar"]) && $_GET["mostrar"]){echo "checked";}?>>
                Mostrar TODOS los pasos
            </label>&nbsp;
            <input class="form-control btn-danger" type="submit" value="Aceptar">
        </form>
    </div>
    <div class="col-md-4">

    </div>
</div>
<br><br>
<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8" style="text-align: center">
        <?php
        if(isset($_GET["n"])){
        mostrar();
        hanoi($N,1,3,2);
        }
        ?>
        <br><br>
        <?php if(!isset($_GET["mostrar"])){?>
            <a href="javascript:void(0)" onClick="anterior()" id="anterior">Anterior</a>
            <a href="javascript:void(0)" onClick="pausaf()" id="pausa_link"><span id="pausa_span">Pausa</span><span id="play_span" style="display: none">Continuar</span></a>
            <a href="javascript:void(0)" id="reiniciar_link" style="display: none" onClick="reiniciar()">Reiniciar</a>
            <a href="javascript:void(0)" onClick="siguiente()" id="siguiente">Siguiente</a>
        <?php }?>
    </div>
    <div class="col-md-2"></div>
</div>
</body>
<script>
    var paso=0;
    var pausa=false;
    //mostramos paso a paso la secuencia del cubo
    <?php if(!isset($_GET["mostrar"])){?>
    setInterval(function(){
        if(paso<<?php echo pow(2,$N)-1?> && !pausa){
            siguiente();
        }else{
            pausa=true;
        }
        if(paso==<?php echo pow(2,$N)-1?>){
            document.getElementById("pausa_link").style.display="none";
            document.getElementById("reiniciar_link").style.display="inline";
        }
    },500);
    <?php }?>
    //funcion en javascript para reiniciar el hanoi
    function reiniciar(){
        document.getElementById("paso_"+paso).style.display="none";
        paso=0;
        document.getElementById("paso_"+paso).style.display="block";
        document.getElementById("pausa_link").style.display="inline";
        document.getElementById("reiniciar_link").style.display="none";
        document.getElementById("pausa_span").style.display="none";
        document.getElementById("play_span").style.display="inline";
    }
    //funcion en javascript para pausar el hanoi
    function pausaf(){
        pausa=!pausa;
        if(pausa){
            document.getElementById("pausa_span").style.display="none";
            document.getElementById("play_span").style.display="inline";
        }else{
            document.getElementById("pausa_span").style.display="inline";
            document.getElementById("play_span").style.display="none";
        }
    }
    //funcion en javascript para pasar al siguiente paso
    function siguiente(){
        if (paso<<?php echo pow(2,$N)-1?>){
            document.getElementById("paso_"+paso).style.display="none";
            paso++;
            document.getElementById("paso_"+paso).style.display="block";
        }
    }
    //funcion en javascript para ir al anterior paso
    function anterior(){
        if(paso>0){
            document.getElementById("paso_"+paso).style.display="none";
            paso--;
            document.getElementById("paso_"+paso).style.display="block";
        }
    }
</script>
</html>