<?

//creacion de la clase ordenar
class metodosOrder
{

    //constructor de la clase
    function __construct()
    {

    }

    //creacion del metodo sort
    public function sort(array $array)
    {
          sort($array);
          $count = 0;
          foreach ($array as $key => $valor)
          {
              $arrayOrderecha[$key] =  $valor;
              $count ++;
          }
          //retorno del resultado a la vista
          return $arrayOrderecha;
    }

    //creacion del metodo burbuja
    public function burbuja($array, $cantidad)
    {
        for($i=1;$i<$cantidad;$i++)
        {
            for($j=0;$j<$cantidad-$i;$j++)
            {
                if($array[$j]>$array[$j+1])
                {$k=$array[$j+1]; $array[$j+1]=$array[$j]; $array[$j]=$k;}
            }
        }
        //retorno del resultado a la vista
        return $array;

    }

    //creacion del metodo quick sort
    public function quicksort($array, $izquierda, $derecha )
    {
        $i = $izquierda;
        $j = $derecha;
        $x = $array[ ($izquierda + $derecha) /2 ];
        do{
            while( ($array[$i] < $x) && ($j <= $derecha) )
            {
                $i++;
            }

            while( ($x < $array[$j]) && ($j > $izquierda) )
            {
                $j--;
            }

            if( $i <= $j )
            {
                $aux = $array[$i]; $array[$i] = $array[$j]; $array[$j] = $aux;
                $i++;  $j--;
            }

        }while( $i <= $j );

        if( $izquierda < $j )
            $this->quicksort( $array, $izquierda, $j );
        if( $i < $derecha )
            $this->quicksort( $array, $i, $derecha );
        //retorno del resultado a la vista
        return $array;

    }

}

?>