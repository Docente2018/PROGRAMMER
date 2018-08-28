# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

from abc import ABCMeta, abstractmethod

class Transporte:
    __metaclass__ = ABCMeta
    
    def __init__(self, medio):
        self.medio = medio
        
    @abstractmethod
    def avanzar(self, frase): pass
    
    def giraIzquierda(self):
        print "Gira a la izquierda"
    
    def giraDerecha(self):
        print "Gira a la derecha"
        
    @abstractmethod
    def detener(self): pass
    
    
class Automovil(Transporte):
        
        def __init__(self, medio):
            Transporte.__init__(self, medio)
            
        def overMedio(self, medio):
            self.medio = medio
            
        def avanzar(self):
            print "Pisa el " + self.medio + " para avanzar"
        
        def detener(self):
            print "Pisa el " + self.medio + " para detener"

class Bicicleta(Transporte):
        
        def __init__(self, medio):
            Transporte.__init__(self, medio)
            
        def overMedio(self, medio):
            self.medio = medio
            
        def avanzar(self):
            print "Mueve los " + self.medio + " para avanzar"
        
        def detener(self):
            print "Con tu mano presiona el " + self.medio + " para detener"
        
automovil = Automovil("Acelerador")
automovil.avanzar()
automovil.giraIzquierda()
automovil.giraDerecha()
automovil.overMedio("Freno")
automovil.detener()

bicicleta = Bicicleta("Pedales")
bicicleta.avanzar()
bicicleta.giraIzquierda()
bicicleta.giraDerecha()
bicicleta.overMedio("Freno")
bicicleta.detener()