# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Animal:
    def __init__(self):
        print "Ha nacido un animal"
    
    def rugir(self):
        print self.sonido
        
class Gato(Animal):
    def __init__(self, sonido):
        Animal.__init__(self)
        self.sonido = sonido

class Perro(Animal):
    def __init__(self, sonido):
        Animal.__init__(self)
        self.sonido = sonido


gato = Gato("Miau")
gato.rugir()

perro = Perro("Guau")
perro.rugir()